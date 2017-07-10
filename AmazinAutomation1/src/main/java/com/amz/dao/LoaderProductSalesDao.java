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

import com.amz.bean.LoaderProductSalesMasterData;
import com.amz.entity.BustedDetail;
import com.amz.entity.DiMaster;
import com.amz.entity.FlyashMaster;
import com.amz.entity.LoaderMaster;
import com.amz.entity.PackerMaster;
import com.amz.entity.PlantMaster;
import com.amz.entity.ProductMaster;
import com.amz.entity.ReusabelBagsMaster;
import com.amz.entity.SalesChannelMaster;
import com.amz.entity.UserDetails;
import com.amz.entity.VerifiedBustedBags;
import com.amz.entity.userRoleMaster;

import com.amz.gen.AmazinUrl;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
@Repository
public class LoaderProductSalesDao
{
	@Autowired
	private SessionFactory sessionFactory;
	//Session session =this.sessionFactory.getCurrentSession();
	public void setSessionFactory(SessionFactory sf) 
	{
		this.sessionFactory = sf;
	}


	public LoaderProductSalesMasterData getProductLoaderSales() 
	{
		Session session =this.sessionFactory.getCurrentSession();	
		String hqlgetLoader="FROM LoaderMaster";
		String hqlgetProduct="FROM ProductMaster";
		String hqlgetSales="FROM SalesChannelMaster";
		
		Query query = session.createQuery(hqlgetSales);
		ArrayList<SalesChannelMaster> salesList=(ArrayList<SalesChannelMaster>)query.list();
		
		query=session.createQuery(hqlgetProduct);
		ArrayList<ProductMaster> productList=(ArrayList<ProductMaster>)query.list();
		
		query=session.createQuery(hqlgetLoader);
		ArrayList<LoaderMaster> loaderList=(ArrayList<LoaderMaster>)query.list();
		
		LoaderProductSalesMasterData loaderProductSalesMasterData = new LoaderProductSalesMasterData();
		
		loaderProductSalesMasterData.setLoaderList(loaderList);
		loaderProductSalesMasterData.setProductMasterList(productList);
		loaderProductSalesMasterData.setSalesChannelList(salesList);
		
		return loaderProductSalesMasterData;
	}
	
	
// Loader Dao Starts from Here 	
	
	public List<LoaderMaster>  addLoader(LoaderMaster loaderMaster) 
	{
		Session session =this.sessionFactory.getCurrentSession();
		loaderMaster.setAdded_by(AmazinUrl.usertype);
		loaderMaster.setIsActive("A");
		session.persist(loaderMaster);
		String hqlQuery="FROM LoaderMaster";
		Query query= session.createQuery(hqlQuery);
		List<LoaderMaster> list=query.list();
		return list;
		
	}
	public void updateLoader (LoaderMaster loaderMaster) 
	{
	
		Session session =this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(loaderMaster);
		
		
		
	}
	
	public  List<LoaderMaster> getLoaderList() 
	{
	
		
		Session session =this.sessionFactory.getCurrentSession();
		
		String hqlQuery="From LoaderMaster"; 
		
		Query query = session.createQuery(hqlQuery);
		List<LoaderMaster> list=  query.list();		
		return list;
	}
	
	
	
	//Loader  Dao Ends Here--------
	
	
	
	
	
	
	
}
