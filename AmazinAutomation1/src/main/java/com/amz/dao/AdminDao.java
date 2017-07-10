package com.amz.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import com.amz.entity.BustedDetail;
import com.amz.entity.DiMaster;
import com.amz.entity.FlyashMaster;
import com.amz.entity.LoaderMaster;
import com.amz.entity.PackerMaster;
import com.amz.entity.PlantMaster;
import com.amz.entity.ReusabelBagsMaster;
import com.amz.entity.UserDetails;
import com.amz.entity.VerifiedBustedBags;
import com.amz.entity.userRoleMaster;

import com.amz.gen.AmazinUrl;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
@Repository
public class AdminDao
{
	@Autowired
	private SessionFactory sessionFactory;
	//Session session =this.sessionFactory.getCurrentSession();
	public void setSessionFactory(SessionFactory sf) 
	{
		this.sessionFactory = sf;
	}


	public List<UserDetails> login(UserDetails user) 
	{
		
		String hqlQueryString = "FROM UserDetails users WHERE users.username = :user and users.userPassword=:pass";
		Session session =this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(hqlQueryString);
		query.setParameter("user",user.getUsername());
		query.setParameter("pass",user.getuserPassword());
		List<UserDetails> userList = query.list();
		if(userList.size()>0)
		{
		AmazinUrl.usertype=userList.get(0).getUsername();
		System.out.println(AmazinUrl.usertype);
		}return userList;
	}
	public UserDetails logout(UserDetails user) 
	{
		Session session = this.sessionFactory.getCurrentSession();
		
		return user;
	}
	public int  changePassword(UserDetails user) 
	{
		String hqlQueryString = "UPDATE UserDetails users SET users.userPassword = :pass Where users.username=:user";
		Session session =this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(hqlQueryString);
		query.setParameter("user",user.getUsername());
		query.setParameter("pass",user.getuserPassword());
		int result = query.executeUpdate();
		
		return result;
	}

	public String  createUser(UserDetails user) 
	{

		Session session =this.sessionFactory.getCurrentSession();
		session.persist(user);
		String result="done";
		return result;
		
	}

	public List<PackerMaster>  createPacker(PackerMaster packerMaster) 
	{
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Session session =this.sessionFactory.getCurrentSession();
		packerMaster.setAdded_by(AmazinUrl.usertype);
		packerMaster.setPlant_master_id("3"); 
		packerMaster.setIsActive("A");
		packerMaster.setCreated_date(timestamp.toString());
		
		
		session.persist(packerMaster);
		String hqlQuery="FROM PackerMaster";
		Query query= session.createQuery(hqlQuery);
		List<PackerMaster> list=query.list();
		return list;
		
	}

	public List<PackerMaster>  getPacker() 
	{
		Session session =this.sessionFactory.getCurrentSession();
		String hqlQuery="FROM PackerMaster";
		Query query= session.createQuery(hqlQuery);
		List<PackerMaster> list=query.list();
		return list;
		
	}
	public void  updatePacker(PackerMaster packerMaster) 
	{
		Session session =this.sessionFactory.getCurrentSession();
		String hqlQuery="UPDATE PackerMaster master SET master.packer_no =:number , master.target_capacity =:capacity where master.id =:id"; 
		System.out.println(""+packerMaster.getId());
		
		Query query = session.createQuery(hqlQuery);
		query.setParameter("number",packerMaster.getPacker_no());
		query.setParameter("capacity",packerMaster.getTarget_capacity());
		query.setParameter("id",packerMaster.getId());
		int result = query.executeUpdate();
		
		
		
	}
	
	
	
	public List<userRoleMaster> getUserRoles () 
	{
	
		Session session =this.sessionFactory.getCurrentSession();
		String hqlQuery="From userRoleMaster"; 
		
		Query query = session.createQuery(hqlQuery);
		List<userRoleMaster> list=  query.list();		
		return list;
	}
	
	
	
	
	
	
	public  void  submitBags(BustedDetail bustedDetail)
	{
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		bustedDetail.setBustedBagTime(timestamp.toString());
		bustedDetail.setIsActive("A");
		Session session =this.sessionFactory.getCurrentSession();
		session.persist(bustedDetail);
		
	}
	
	

	public List<BustedDetail>getsubmitActiveBags()
	{
		Session session =this.sessionFactory.getCurrentSession();
		String hqlQuery="From BustedDetail detail where detail.isActive=:status"; 
		Query query = session.createQuery(hqlQuery);
		query.setParameter("status", "A");
		List<BustedDetail> list=query.list();
		return list;
		
	}
	
	public void getBagsVarified(BustedDetail bustedDetail)
	{	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Session session =this.sessionFactory.getCurrentSession();
		bustedDetail.setIsActive("V");
		bustedDetail.setVerifiedTime(timestamp.toString());
		session.saveOrUpdate(bustedDetail);
	}
	public List<FlyashMaster>  submitFlyash(FlyashMaster flyashMaster)
	{
		
		Session session =this.sessionFactory.getCurrentSession();
		if(flyashMaster.getIsActive().equals("A"))
		{
			String hqlupdateQuery="UPDATE FlyashMaster fly SET fly.isActive=:status"; 
			Query query1=session.createQuery(hqlupdateQuery);
			query1.setParameter("status", "D");
			int a=query1.executeUpdate();
		}
		session.saveOrUpdate(flyashMaster);
		String hqlQuery="From FlyashMaster"; 
		Query query = session.createQuery(hqlQuery);
		List<FlyashMaster> list=query.list();
		return list;
		
	}
	public List<FlyashMaster> getFlyash()
	{
		
		Session session =this.sessionFactory.getCurrentSession();
		
		String hqlQuery="From FlyashMaster"; 
		Query query = session.createQuery(hqlQuery);
		List<FlyashMaster> list=query.list();
		return list;
		
	}
	
	
	public void  varifybags(VerifiedBustedBags verifiedbags)
	{
		
		Session session =this.sessionFactory.getCurrentSession();
		
		String hqlQuery="SELECT DiMaster.id From DiMaster WHERE DiMaster.sales_channel=:salesChannel and DiMaster.id IN"+
		" (SELECT BustedDetail.di_master_id FROM BustedDetail WHERE ButedDetail.loader_master_id=:loaderid AND BustedDetail.isActive=:status AND )"; 
		Query query = session.createQuery(hqlQuery);
		query.setParameter("loaderid", verifiedbags.getLoader_master_id());
		query.setParameter("status","A");
		List<Object> list = query.list();
		
		
		for(int i=0;i<list.size();i++)
		{
			Object [] object=(Object[])list.get(i);
			hqlQuery ="UPDATE BustedDetail SET isActive=:status WHERE BustedDetail.di_master_id=:id";
			query = session.createQuery(hqlQuery);
			query.setParameter("status", "V");
			query.setParameter("id",object[0].toString());
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
			ReusabelBagsMaster bagsMaster= reusablelist.get(0);
			bagsMaster.setReusable_bags(String.valueOf(Integer.parseInt(reusablelist.get(0).getReusable_bags() ) + Integer.parseInt(verifiedbags.getTotal_reusable_bag()))  );
			session.update(bagsMaster);
		}
		else
		{
			ReusabelBagsMaster bagsMaster= new ReusabelBagsMaster();
			bagsMaster.setLoader_master_id(verifiedbags.getLoader_master_id());
			bagsMaster.setProduct_master_id(verifiedbags.getProduct_id());
			bagsMaster.setSales_channel_master_id(verifiedbags.getSales_channel());
			session.persist(bagsMaster);
		}
		
		session.persist(verifiedbags);
		
		
		
		
		
	}
}
