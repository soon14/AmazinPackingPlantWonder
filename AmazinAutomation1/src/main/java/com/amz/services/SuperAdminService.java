package com.amz.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amz.bean.PlantWiseDeviceMaster;
import com.amz.dao.SuperAdminDao;
import com.amz.entity.PlantMaster;
import com.amz.entity.StageMaster;


@Service("superAdminService")

public class SuperAdminService

{
	@Autowired
	SuperAdminDao superAdminDao;
	
	
	@Transactional
	public List<PlantMaster> getPlantList() 
	{
			return superAdminDao.getPlantList();
	}

	@Transactional
	public List<PlantMaster> addPlant(PlantMaster plantMaster) 
	{
			return superAdminDao.addPlant(plantMaster);
	}
	
	@Transactional
	public PlantWiseDeviceMaster getPlantWiseDeviceList() 
	{
			return superAdminDao.getPlantWiseDeviceList();
	}

	@Transactional
	public List<StageMaster> addStage (StageMaster stageMaster)  
	{
			return superAdminDao.addStage (stageMaster);
	}
	@Transactional
	public List<StageMaster> getStageList()  
	{
			return superAdminDao.getStageList();
	}
	@Transactional
	public void updateStage (StageMaster stageMaster)  
	{
			 superAdminDao.updateStage(stageMaster);
	}
}
