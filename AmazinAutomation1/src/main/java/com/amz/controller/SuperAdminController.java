package com.amz.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amz.entity.BustedDetail;
import com.amz.entity.FlyashMaster;
import com.amz.entity.LoaderMaster;
import com.amz.entity.PackerMaster;
import com.amz.entity.PlantMaster;
import com.amz.entity.StageMaster;
import com.amz.entity.UserDetails;
import com.amz.entity.VerifiedBustedBags;
import com.amz.entity.userRoleMaster;
import com.amz.gen.ServiceContainer;
import com.amz.services.AdminService;
import com.amz.services.SuperAdminService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/superadmin")
public class SuperAdminController
{
	@Autowired
	SuperAdminService superAdminService;
	    
	    
    //Plant Starts From Here ----------
    
    @CrossOrigin(origins = "*")
  	@RequestMapping(value = "/getPlantList", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public String getPlantList() 
  	{
    	ServiceContainer serviceContainer = new ServiceContainer();
    	serviceContainer.setData(superAdminService.getPlantList());
    	Gson gson= new Gson();
  		 String json=gson.toJson(serviceContainer);
  		return json;
  		
  	}

   
    @CrossOrigin(origins = "*")
  	@RequestMapping(value = "/addPlant", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public String addPlant(@RequestBody PlantMaster plantMaster) 
  	{
    	ServiceContainer serviceContainer = new ServiceContainer();
    	serviceContainer.setData(superAdminService.addPlant(plantMaster));
    	Gson gson= new Gson();
  		 String json=gson.toJson(serviceContainer);
  		return json;
  	}
    @CrossOrigin(origins = "*")
  	@RequestMapping(value = "/getPlantWiseDeviceList", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public String getPlantWiseDeviceList() 
  	{
    	ServiceContainer serviceContainer = new ServiceContainer();
    	serviceContainer.setData(superAdminService.getPlantWiseDeviceList());
    	Gson gson= new Gson();
  		 String json=gson.toJson(serviceContainer);
  		return json;
  		
  	}
    @CrossOrigin(origins = "*")
  	@RequestMapping(value = "/addStage", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public String addStage (@RequestBody StageMaster stageMaster) 
  	{
    	
    	ServiceContainer serviceContainer = new ServiceContainer();
    	serviceContainer.setStatus("Success");
    	serviceContainer.setData(superAdminService.addStage(stageMaster));
    	Gson gson= new Gson();
  		 String json=gson.toJson(serviceContainer);
    	
    
  		return json;
  	}
    
    @CrossOrigin(origins = "*")
  	@RequestMapping(value = "/updateStage", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public String updateStage (@RequestBody StageMaster stageMaster)
  	{
    	
    	ServiceContainer serviceContainer = new ServiceContainer();
    	superAdminService.updateStage(stageMaster);
    	serviceContainer.setStatus("Success");
    	
    	Gson gson= new Gson();
  		 String json=gson.toJson(serviceContainer);
  		return json;
  	} 
    
    
   
    
    
    
    
    
    
    @CrossOrigin(origins = "*")
  	@RequestMapping(value = "/getStageList", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public String getStageList() 
  	{
    	
    	ServiceContainer serviceContainer = new ServiceContainer();
    	serviceContainer.setStatus("Success");
    	serviceContainer.setData(superAdminService.getStageList());
    	Gson gson= new Gson();
  		 String json=gson.toJson(serviceContainer);
  		return json;
  	}
       
}
