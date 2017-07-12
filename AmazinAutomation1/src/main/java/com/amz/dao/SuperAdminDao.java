package com.amz.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amz.bean.PlantWiseDeviceMaster;
import com.amz.entity.DeviceMaster;
import com.amz.entity.DeviceTypeMaster;
import com.amz.entity.DeviceTypeQty;
import com.amz.entity.PlantMaster;
import com.amz.entity.StageMaster;
@Repository
public class SuperAdminDao
{
	@Autowired
	private SessionFactory sessionFactory;
	//Session session =this.sessionFactory.getCurrentSession();
	public void setSessionFactory(SessionFactory sf) 
	{
		this.sessionFactory = sf;
	}

	//Stage Dao
	
	public List<StageMaster> addStage (StageMaster stageMaster) 
	{
	
		
		Session session =this.sessionFactory.getCurrentSession();
		session.persist(stageMaster);
		String hqlQuery="From StageMaster"; 
		
		Query query = session.createQuery(hqlQuery);
		List<StageMaster> list=  query.list();		
		return list;
	}
	
	public List<StageMaster> getStageList () 
	{
	
		Session session =this.sessionFactory.getCurrentSession();
		String hqlQuery="From StageMaster"; 
		
		Query query = session.createQuery(hqlQuery);
		List<StageMaster> list=  query.list();		
		return list;
	}

	public void updateStage (StageMaster stageMaster) 
	{
	
		Session session =this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(stageMaster);
		
		
		
	}
	
	// Stage Dao Ends Here
	
	
	
	//plant Controller
	
	public List<PlantMaster> addPlant (PlantMaster plantMaster) 
	{
	
		
		Session session =this.sessionFactory.getCurrentSession();
		session.persist(plantMaster);
		String hqlQuery="From PlantMaster"; 
		
		Query query = session.createQuery(hqlQuery);
		List<PlantMaster> list=  query.list();		
		return list;
	}
	
	public List<PlantMaster> getPlantList () 
	{
	
		Session session =this.sessionFactory.getCurrentSession();
		String hqlQuery="From PlantMaster"; 
		
		Query query = session.createQuery(hqlQuery);
		List<PlantMaster> list=  query.list();		
		return list;
	}
	public PlantWiseDeviceMaster getPlantWiseDeviceList () 
	{
	
		
	
			
			//ArrayList<DeviceTypeMaster> deviceTypeMasterList = new ArrayList<DeviceTypeMaster>();
			PlantWiseDeviceMaster plantWiseDeviceMaster = new PlantWiseDeviceMaster();
			
			Session session =this.sessionFactory.getCurrentSession();
			
			String hqlQueryString = "FROM PlantMaster";
			Query query = session.createQuery(hqlQueryString);
			ArrayList<PlantMaster> plantMaster = (ArrayList<PlantMaster>)query.list();
			plantWiseDeviceMaster.setPlantMaster(plantMaster);
			
			hqlQueryString = "FROM DeviceTypeMaster";
			 query = session.createQuery(hqlQueryString);
			ArrayList<DeviceTypeMaster> deviceTypeMasterList = (ArrayList<DeviceTypeMaster>)query.list();
			
			for(int i=0; i<deviceTypeMasterList.size(); i++)
			{
				DeviceTypeMaster deviceTypeMasterObject = deviceTypeMasterList.get(i);
				String  deviceTypeQtyHQL= "FROM DeviceTypeQty dtQty WHERE dtQty.device_type_master_id = :id";
				Query deviceTypeQtyQuery = session.createQuery(deviceTypeQtyHQL);
				
				deviceTypeQtyQuery.setParameter("id",deviceTypeMasterObject.getId());
				ArrayList<DeviceTypeQty> deviceTypeQtyList = (ArrayList<DeviceTypeQty>)deviceTypeQtyQuery.list();
				
				
				for(int j=0; j<deviceTypeQtyList.size(); j++)
				{
					DeviceTypeQty deviceTypeQtyObject = deviceTypeQtyList.get(j);
					
					String  deviceMasterHQL= "FROM DeviceMaster devMas WHERE devMas.deviceTypeQtyId = :id";
					Query deviceMasterQuery = session.createQuery(deviceMasterHQL);
					
					deviceMasterQuery.setParameter("id",deviceTypeQtyObject.getId());
					ArrayList<DeviceMaster> deviceMasterList = (ArrayList<DeviceMaster>)deviceMasterQuery.list();
					
					deviceTypeQtyObject.setDeviceMasterList(deviceMasterList);
					
				}
				
				deviceTypeMasterObject.setDeviceTypeQtyList(deviceTypeQtyList);
			}
			
			plantWiseDeviceMaster.setDeviceTypeMaster(deviceTypeMasterList);
			return plantWiseDeviceMaster;
	}
						
}
