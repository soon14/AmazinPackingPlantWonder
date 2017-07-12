package com.amz.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amz.entity.ReusabelBagsMaster;
import com.amz.entity.VerifiedBustedBags;
@Repository
public class BustedBagDao
{
	@Autowired
	private SessionFactory sessionFactory;
	//Session session =this.sessionFactory.getCurrentSession();
	public void setSessionFactory(SessionFactory sf) 
	{
		this.sessionFactory = sf;
	}

	public List<VerifiedBustedBags> tobeVerified()
	{
				Session session =this.sessionFactory.getCurrentSession();
				String hqlQuery="SELECT SUM(busted.bustedBag) as busted_bags,di.mrp,"+
						"busted.loader_master_id,di.sales_channel,di.product_id "+
						"FROM DiMaster di,BustedDetail busted where di.id= busted.di_master_id"+
						" and busted.isActive=:status "+
						"GROUP BY busted.loader_master_id,di.sales_channel,di.product_id";
				Query query = session.createQuery(hqlQuery);
				query.setParameter("status", "A");
	
				List<Object> list=query.list();
				ArrayList<VerifiedBustedBags> list1= new ArrayList<VerifiedBustedBags>();
				for(int i=0;i<list.size();i++)
				{
					VerifiedBustedBags bags= new VerifiedBustedBags();
					Object[] object= (Object[])list.get(i);
					bags.setBusted_bags(object[0].toString());
					bags.setMrp(object[1].toString());
					bags.setLoader_master_id(object[2].toString());
					bags.setSales_channel(object[3].toString());
					bags.setProduct_id(object[4].toString());
					list1.add(bags);		
				}
	

				return list1;
	}
	
	
	
	
	public void  varifybags(VerifiedBustedBags verifiedbags)
	{
		
		Session session =this.sessionFactory.getCurrentSession();
		
		String hqlQuery="SELECT di.id From DiMaster di WHERE di.sales_channel=:salesChannel and di.id IN"+
		" (SELECT busted.di_master_id FROM BustedDetail busted WHERE busted.loader_master_id=:loaderid AND busted.isActive=:status)"; 
		Query query = session.createQuery(hqlQuery);
		query.setParameter("loaderid", verifiedbags.getLoader_master_id());
		query.setParameter("status","A");
		query.setParameter("salesChannel", verifiedbags.getSales_channel());
		List<Object> list = query.list();
		
		
		for(int i=0;i<list.size();i++)
		{
			
			Long id=(Long.valueOf(list.get(i).toString()));
			hqlQuery ="UPDATE BustedDetail busted SET busted.isActive=:status WHERE busted.di_master_id=:id";
			query = session.createQuery(hqlQuery);
			query.setParameter("status", "V");
			query.setLong("id",id);
			int result= query.executeUpdate();
		}
		String hqlquery="FROM ReusabelBagsMaster bags WHERE bags.sales_channel_master_id=:sales and bags.product_master_id=:product and bags.loader_master_id=:loader ";
		Query query1=session.createQuery(hqlquery);
		query1.setParameter("sales", verifiedbags.getSales_channel());
		query1.setParameter("product", verifiedbags.getProduct_id());
		query1.setParameter("loader", verifiedbags.getLoader_master_id());
		
		List<ReusabelBagsMaster> reusablelist=query1.list();
		if(reusablelist.size()>0)
		{
			int newvalue=Integer.parseInt(verifiedbags.getTotal_reusable_bag());
			int current=Integer.parseInt(reusablelist.get(0).getReusable_bags());
			
					
			ReusabelBagsMaster bagsMaster= reusablelist.get(0);
			bagsMaster.setReusable_bags(String.valueOf(current + newvalue));
			session.update(bagsMaster);
		}
		else
		{
			ReusabelBagsMaster bagsMaster= new ReusabelBagsMaster();
			bagsMaster.setLoader_master_id(verifiedbags.getLoader_master_id());
			bagsMaster.setProduct_master_id(verifiedbags.getProduct_id());
			bagsMaster.setSales_channel_master_id(verifiedbags.getSales_channel());
			bagsMaster.setReusable_bags(verifiedbags.getBusted_bags());
			session.persist(bagsMaster);
		}
		
		session.persist(verifiedbags);
			
	}
	
	public ReusabelBagsMaster  getreusableBags(ReusabelBagsMaster reusabelBagsMaster)
	{
		ReusabelBagsMaster object= reusabelBagsMaster;
		Session session= sessionFactory.getCurrentSession();
		
		String hqlquery="FROM ReusabelBagsMaster bags WHERE bags.sales_channel_master_id=:sales and bags.product_master_id=:product and bags.loader_master_id=:loader ";
		Query query1=session.createQuery(hqlquery);
		query1.setParameter("sales", reusabelBagsMaster.getSales_channel_master_id());
		query1.setParameter("product", reusabelBagsMaster.getProduct_master_id());
		query1.setParameter("loader", reusabelBagsMaster.getLoader_master_id());
		
		List<ReusabelBagsMaster> reusablelist=query1.list();
		if(reusablelist.size()>0)
		{
			object= reusablelist.get(0);			
		}
		return object; 
	}
	
	public void  updatereusableBags(ReusabelBagsMaster reusabelBagsMaster)
	{
		ReusabelBagsMaster object= new ReusabelBagsMaster();
		Session session =sessionFactory.getCurrentSession();
		String hqlquery1="FROM ReusabelBagsMaster bags WHERE bags.id=:id ";
		Query query1=session.createQuery(hqlquery1);
		query1.setParameter("id", reusabelBagsMaster.getId());
		
		List<ReusabelBagsMaster> reusablelist=query1.list();
		if(reusablelist.size()>0)
		{
			object= reusablelist.get(0);		
			
		} 
		String hqlquery="UPDATE ReusabelBagsMaster bags Set bags.reusable_bags=:qty bags.id=:id ";
		query1=session.createQuery(hqlquery);
		query1.setParameter("id", reusabelBagsMaster.getId());
		query1.setParameter("qty",( Integer.parseInt(object.getReusable_bags())-Integer.parseInt(reusabelBagsMaster.getReusable_bags())));
		int result= query1.executeUpdate();
		
		
	}
}
