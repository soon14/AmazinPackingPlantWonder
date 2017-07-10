package com.amz.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amz.entity.ReusabelBagsMaster;
import com.amz.entity.TripCreation;
import com.amz.entity.TripMaster;
import com.amz.entity.VerifiedBustedBags;
import com.amz.gen.ServiceContainer;
import com.amz.services.BustedBagsService;
import com.amz.services.TripCreationService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/bustedbags")
public class BustedBagController
{
	@Autowired
	BustedBagsService bustedBagsService;
	
	@CrossOrigin(origins = "*")
  	@RequestMapping(value = "/tobeverifiedbags", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public String tobeverifiedbags(@RequestBody VerifiedBustedBags verifiedbags) 
  	{
		
		
    	ServiceContainer serviceContainer = new ServiceContainer();
    	serviceContainer.setStatus("Done");
    	serviceContainer.setData(bustedBagsService.tobeVarified());
    	Gson gson= new Gson();
  		String json=gson.toJson(serviceContainer);
  		return json;
    	
  	}
	@CrossOrigin(origins = "*")
  	@RequestMapping(value = "/getreusableBags", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public String  getreusableBags(@RequestBody ReusabelBagsMaster reusabelBagsMaster) 
  	{

    	ServiceContainer serviceContainer = new ServiceContainer();
    	//bustedBagsService.verifybags(verifiedbags);
    	serviceContainer.setStatus("Done");
    	serviceContainer.setData(bustedBagsService.getreusableBags(reusabelBagsMaster));
    	Gson gson= new Gson();
  		String json=gson.toJson(serviceContainer);
  		return json;
    	
  	}
	@CrossOrigin(origins = "*")
  	@RequestMapping(value = "/updatereusableBags", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public String  updatereusableBags(@RequestBody ReusabelBagsMaster reusabelBagsMaster) 
  	{

    	ServiceContainer serviceContainer = new ServiceContainer();
    	//bustedBagsService.verifybags(verifiedbags);
    	serviceContainer.setStatus("Done");
    	//serviceContainer.setData(bustedBagsService.getreusableBags(reusabelBagsMaster));
    	Gson gson= new Gson();
  		String json=gson.toJson(serviceContainer);
  		return json;
    	
  	}
	
	
	
}
