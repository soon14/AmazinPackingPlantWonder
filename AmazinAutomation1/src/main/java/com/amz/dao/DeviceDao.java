package com.amz.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amz.entity.DeviceMaster;
import com.amz.entity.DeviceTypeMaster;
import com.amz.entity.DeviceTypeQty;

@Repository
public class DeviceDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) 
	{
		this.sessionFactory = sf;
	}
	
	public ArrayList<DeviceTypeMaster> getAllDeviceList()
	{
		
		//ArrayList<DeviceTypeMaster> deviceTypeMasterList = new ArrayList<DeviceTypeMaster>();
		
		Session session =this.sessionFactory.getCurrentSession();
		String hqlQueryString = "FROM DeviceTypeMaster";
		Query query = session.createQuery(hqlQueryString);
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
		
		
		
		return deviceTypeMasterList;
	}
	
	public DeviceTypeMaster  addDeviceTypeMaster(DeviceTypeMaster deviceTypeMaster)
	{
		
		//ArrayList<DeviceTypeMaster> deviceTypeMasterList = new ArrayList<DeviceTypeMaster>();
		
		Session session =this.sessionFactory.getCurrentSession();
		session.persist(deviceTypeMaster);
		return deviceTypeMaster;
	}

	public DeviceTypeQty  adddeviceTypeQty(DeviceTypeQty deviceTypeQty)	{
		
		//ArrayList<DeviceTypeMaster> deviceTypeMasterList = new ArrayList<DeviceTypeMaster>();
		deviceTypeQty.setInstalled_qty("0");
		Session session =this.sessionFactory.getCurrentSession();
		session.persist(deviceTypeQty);
		return deviceTypeQty;
	}
public DeviceTypeQty  updatedeviceTypeQty (DeviceTypeQty deviceTypeQty)	
{
		
		//String hqlQueryString = "UPDATE DeviceTypeQty qty SET qty.total_qty =:Qty Where qty.device_type_master_id=:id";
		Session session =this.sessionFactory.getCurrentSession();
//		Query query = session.createQuery(hqlQueryString);
//		query.setParameter("Qty",deviceTypeQty.getTotal_qty());
//		query.setParameter("id",deviceTypeQty.getDevice_type_master_id());
//		int result = query.executeUpdate();
		
		session.update(deviceTypeQty);
		return deviceTypeQty;
	

}

public DeviceMaster  addDevieMaster (DeviceMaster deviceMaster)	
{
		
		//String hqlQueryString = "UPDATE DeviceTypeQty qty SET qty.total_qty =:Qty Where qty.device_type_master_id=:id";
		Session session =this.sessionFactory.getCurrentSession();
//		Query query = session.createQuery(hqlQueryString);
//		query.setParameter("Qty",deviceTypeQty.getTotal_qty());
//		query.setParameter("id",deviceTypeQty.getDevice_type_master_id());
//		int result = query.executeUpdate();
		
		session.persist(deviceMaster);
		String  hQuery= "UPDATE DeviceTypeQty dtQty SET dtQty.installed_qty = dtQty.installed_qty + 1  WHERE dtQty.id = :id";
		Query query = session.createQuery(hQuery);
		query.setParameter("id",deviceMaster.getDeviceTypeQtyId());
		int result = query.executeUpdate();

		
		return deviceMaster;
	

}


public DeviceMaster  updateDeviceMaster (DeviceMaster deviceMaster)	
{
		
		//String hqlQueryString = "UPDATE DeviceTypeQty qty SET qty.total_qty =:Qty Where qty.device_type_master_id=:id";
		Session session =this.sessionFactory.getCurrentSession();
//		Query query = session.createQuery(hqlQueryString);
//		query.setParameter("Qty",deviceTypeQty.getTotal_qty());
//		query.setParameter("id",deviceTypeQty.getDevice_type_master_id());
//		int result = query.executeUpdate();
		
		session.saveOrUpdate(deviceMaster);
		
		
		return deviceMaster;
	

}


}
