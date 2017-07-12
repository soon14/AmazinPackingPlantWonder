package com.amz.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amz.entity.BustedDetail;
import com.amz.entity.DiMaster;
import com.amz.entity.TripCreation;
import com.amz.entity.TripMaster;
@Repository
public class TripCreationDao
{
	@Autowired
	private SessionFactory sessionFactory;
	//Session session =this.sessionFactory.getCurrentSession();
	public void setSessionFactory(SessionFactory sf) 
	{
		this.sessionFactory = sf;
	}


	public TripCreation  tripCreation(TripCreation tripdetial) 
	{
		Session session =this.sessionFactory.getCurrentSession();
		String hqlQueryString = "FROM TripCreation trip WHERE trip.tripId = :id ";
		Query query = session.createQuery(hqlQueryString);
		query.setParameter("id",tripdetial.getTripId());
		List<TripCreation> tripList = query.list();
		if(tripList.size()>0)
		
		{
		return null;
		
		}
		tripdetial.setIsActive("A");
		session.persist(tripdetial);
		return tripdetial;
	}
	public TripCreation tripReCreations(TripCreation trip) 
	{
		Session session = this.sessionFactory.getCurrentSession();
		String hqlQueryString = "UPDATE TripCreation trip SET trip.isActive ='D' Where trip.tripId=:id";
		Query query = session.createQuery(hqlQueryString);
		query.setParameter("id",trip.getTripId());
		int result = query.executeUpdate();
		trip.setIsActive("A");
		session.persist(trip);
		
		return trip;
	}
	public ArrayList<TripMaster> getAllTripInformation()
	{
		
		//ArrayList<DeviceTypeMaster> deviceTypeMasterList = new ArrayList<DeviceTypeMaster>();
		
		Session session =this.sessionFactory.getCurrentSession();
		String hqlQueryString = "FROM TripMaster trip where trip.is_active=:status";
		Query query = session.createQuery(hqlQueryString);
		query.setParameter("status", "A");
		ArrayList<TripMaster> tripMasterList = (ArrayList<TripMaster>)query.list();
		
		for(int i=0; i<tripMasterList.size(); i++)
		{
			TripMaster tripMaster = tripMasterList.get(i);
			String  diMasterHQL= "FROM DiMaster di WHERE di.trip_id=:id";
			Query diMasterQuery = session.createQuery(diMasterHQL);
			
			diMasterQuery.setLong("id",tripMaster.getId());
			ArrayList<DiMaster> dimasterList = (ArrayList<DiMaster>)diMasterQuery.list();
			
			for(int j=0; j<dimasterList.size(); j++)
			{
				DiMaster diMaster = dimasterList.get(j);
				
				String  bustedDetailrHQL= "FROM  BustedDetail detail where detail.di_master_id=:id";
				
				Query bustedDetailQuery = session.createQuery(bustedDetailrHQL);
				bustedDetailQuery.setLong("id", diMaster.getId());
				
				
				ArrayList<BustedDetail> list = (ArrayList<BustedDetail>)bustedDetailQuery.list();
				
				diMaster.setBustedDetail(list);
				
				
			}
			
			
			
			
			
			tripMaster.setDiMaster(dimasterList);
		}
		
		
		
		return tripMasterList;
	}


}
