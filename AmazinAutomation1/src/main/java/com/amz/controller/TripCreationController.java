package com.amz.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amz.entity.TripCreation;
import com.amz.entity.TripMaster;
import com.amz.gen.ServiceContainer;

import com.amz.services.TripCreationService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/transportal")
public class TripCreationController
{
	@Autowired
	TripCreationService tripService;
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/tripCreation", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String tripCreation(@RequestBody TripCreation tripdetial ) 
	{
		TripCreation tripCreation = tripService.tripCreation(tripdetial);
		ServiceContainer serviceContainer = new ServiceContainer();
		if(tripCreation==null)
		{
			serviceContainer.setStatus("fail");
			serviceContainer.setMsg("Data Already Exist ");
		}
		else{
		 
		serviceContainer.setStatus("success");
		serviceContainer.setData(tripCreation);}
		Gson gson = new Gson();
		String json = gson.toJson(serviceContainer);
		return json;
	}
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/tripReCreation", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	
	public String tripReCreation(@RequestBody TripCreation tripdetial ) 
	{
		TripCreation tripCreation = tripService.tripReCreations(tripdetial);
		ServiceContainer serviceContainer = new ServiceContainer(); 
		serviceContainer.setStatus("success");
		serviceContainer.setData(tripCreation);
		Gson gson = new Gson();
		String json = gson.toJson(serviceContainer);
		return json;
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/getAllTripInformation", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	
	public String getAllTripInformation() 
	{
		ArrayList<TripMaster> list= tripService.getAllTripInformation();
		 
		
		Gson gson = new Gson();
		String json = gson.toJson(list);
		return json;
	}
	
	
	
}
