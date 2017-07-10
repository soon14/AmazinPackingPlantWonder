package com.amz.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import com.amz.entity.UserDetails;
import com.amz.entity.VerifiedBustedBags;
import com.amz.entity.userRoleMaster;
import com.amz.gen.ServiceContainer;
import com.amz.services.AdminService;
import com.amz.services.LoaderProductSalesService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/loaderProductSales")
public class LoaderProductSalesController
{
	@Autowired
	LoaderProductSalesService loaderProductSalesService;
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/getPackerLoaderSales", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String getPackerLoaderSales()
	
	{
		
		ServiceContainer serviceContainer = new ServiceContainer();
    	serviceContainer.setStatus("Done");
    	serviceContainer.setData(loaderProductSalesService.getProductLoaderSales());
    	Gson gson= new Gson();
  		String json=gson.toJson(serviceContainer);
  		return json;
	}
	
	
	  @CrossOrigin(origins = "*")
	  	@RequestMapping(value = "/updateLoader", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	  	public String  updateLoader (@RequestBody LoaderMaster loaderMaster) 
	  	{
	    	
		  loaderProductSalesService.updateLoader(loaderMaster);
	  		ServiceContainer serviceContainer = new ServiceContainer();
	    	serviceContainer.setStatus("Done");
	    	Gson gson= new Gson();
	  		String json=gson.toJson(serviceContainer);
	  		return json;
	  		
	  	}
	  
	  @CrossOrigin(origins = "*")
		@RequestMapping(value = "/addLoader", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
		public String addLoader(@RequestBody LoaderMaster loaderMaster) 
		{
			List<LoaderMaster> list= loaderProductSalesService.addLoader(loaderMaster);
			ServiceContainer serviceContainer = new ServiceContainer(); 
			serviceContainer.setStatus("success");
			serviceContainer.setData(list);
			
			Gson gson = new Gson();
			
			String json = gson.toJson(serviceContainer);
			return json;
		}
	    
	  
	  @CrossOrigin(origins = "*")
	  	@RequestMapping(value = "/getLoaderList", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	  	public String getLoaderList() 
	  	{
	    	ServiceContainer serviceContainer = new ServiceContainer();
	    	serviceContainer.setData(loaderProductSalesService.getLoaderList());
	    	Gson gson= new Gson();
	  		 String json=gson.toJson(serviceContainer);
	  		return json;
	  		
	  	}
	
}
