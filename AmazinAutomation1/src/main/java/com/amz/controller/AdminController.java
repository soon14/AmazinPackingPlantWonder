package com.amz.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amz.entity.BustedDetail;
import com.amz.entity.FlyashMaster;
import com.amz.entity.PackerMaster;
import com.amz.entity.VerifiedBustedBags;
import com.amz.factory.entity.UserDetail;
import com.amz.gen.ServiceContainer;
import com.amz.services.AdminService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/admin")
public class AdminController
{
	@Autowired
	AdminService adminService;
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/login", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String login(@RequestBody UserDetail userDetails,HttpServletRequest request) 
	{
		List<UserDetail> list= adminService.login(userDetails);
		ServiceContainer serviceContainer = new ServiceContainer(); 
		if(list.size()>0)
		{
			request.getSession().setAttribute("user", list.get(0).getUsername());
			serviceContainer.setStatus("success");
		}
		else
		{
			serviceContainer.setStatus("fail");
		}
		
		serviceContainer.setData(list);
		Gson gson = new Gson();
		String json = gson.toJson(serviceContainer);
		return json;
	}
	
	
	
	/*@CrossOrigin(origins = "*")
	@RequestMapping(value = "/logout", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String logout(@RequestBody ComUserpany companyInfo) 
	{
		adminService.addCompany(companyInfo);

		ServiceContainer serviceContainer = new ServiceContainer(); 
		serviceContainer.setStatus("success");
		serviceContainer.setData(companyInfo);
		
		Gson gson = new Gson();
		
		String json = gson.toJson(serviceContainer);
		return json;
	}*/

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/changePassword", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String changepassword(@RequestBody UserDetail users) 
	{
		adminService.changePassword(users);

		ServiceContainer serviceContainer = new ServiceContainer(); 
		serviceContainer.setStatus("success");
		serviceContainer.setData(users);
		
		Gson gson = new Gson();
		
		String json = gson.toJson(serviceContainer);
		return json;
	}
	
	
	 @CrossOrigin(origins = "*")
	  	@RequestMapping(value = "/createUser", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	  	public String createUser (@RequestBody UserDetail userDetails) 
	  	{
	    	String result=adminService.createUser(userDetails);
	    	
	  		return result;
	  		
	  	}
	    @CrossOrigin(origins = "*")
	  	@RequestMapping(value = "/getUserRoles", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	  	public String getUserRoles () 
	  	{
	    	
	    	
	    	ServiceContainer serviceContainer = new ServiceContainer();
	    	serviceContainer.setData(adminService.getUserRoles());
	    	Gson gson= new Gson();
	  		 String json=gson.toJson(serviceContainer);
	  		return json;
	  		
	  	}
	    
	
	
	
	// Packer Controller Url Starts from Here--------------
	
	
	
    @CrossOrigin(origins = "*")
	@RequestMapping(value = "/addPacker", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String createPacker(@RequestBody PackerMaster packerMaster) 
	{
		List<PackerMaster> list= adminService.createPacker(packerMaster);
		ServiceContainer serviceContainer = new ServiceContainer(); 
		serviceContainer.setStatus("success");
		serviceContainer.setData(list);
		
		Gson gson = new Gson();
		
		String json = gson.toJson(serviceContainer);
		return json;
	}
    @CrossOrigin(origins = "*")
	@RequestMapping(value = "/getPackerList", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String getPackerList() 
	{
		List<PackerMaster> list= adminService.getPacker();
		ServiceContainer serviceContainer = new ServiceContainer(); 
		serviceContainer.setStatus("success");
		serviceContainer.setData(list);
		
		Gson gson = new Gson();
		
		String json = gson.toJson(serviceContainer);
		return json;
	}

    @CrossOrigin(origins = "*")
  	@RequestMapping(value = "/updatePacker", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public void getPackerList(@RequestBody PackerMaster packerMaster) 
  	{
    	System.out.println(packerMaster.getId());
    	System.out.println(packerMaster.getTarget_capacity());
  		adminService.updatePacker(packerMaster);
  		
  	}

  
    // End Here -------
    
    
    //Plant Starts From Herer ----------
    
   

   
    //Bags Starts From Here----------
    
    @CrossOrigin(origins = "*")
  	@RequestMapping(value = "/submitBags", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public void submitBags(@RequestBody BustedDetail bustedDetail) 
  	{
    	ServiceContainer serviceContainer = new ServiceContainer();
    	adminService.submitBags(bustedDetail);
    	
  	}
    @CrossOrigin(origins = "*")
  	@RequestMapping(value = "/getBagsVarified", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public void getBagsVarified(@RequestBody BustedDetail bustedDetail) 
  	{
    	ServiceContainer serviceContainer = new ServiceContainer();
    	adminService.getBagsVarified(bustedDetail);
    	
  	}
    @CrossOrigin(origins = "*")
  	@RequestMapping(value = "/getsubmitActiveBags", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public String getsubmitActiveBags() 
  	{
    	ServiceContainer serviceContainer = new ServiceContainer();
    	serviceContainer.setData(adminService.getsubmitActiveBags());
    	Gson gson= new Gson();
  		String json=gson.toJson(serviceContainer);
  		return json;
    	
  	}
    
    
  
    @CrossOrigin(origins = "*")
  	@RequestMapping(value = "/varifybags", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public String varifybags(@RequestBody VerifiedBustedBags verifiedbags) 
  	{
    	ServiceContainer serviceContainer = new ServiceContainer();
    	serviceContainer.setStatus("Done");
    	Gson gson= new Gson();
  		String json=gson.toJson(serviceContainer);
  		return json;
    	
  	}
    
    // Bags End Here ----------
    
    
    //Flyash Starts From Here---------
    
    @CrossOrigin(origins = "*")
  	@RequestMapping(value = "/getFlyash", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public String updateFlyash(@RequestBody FlyashMaster flyashMaster) 
  	{
    	ServiceContainer serviceContainer = new ServiceContainer();
    	serviceContainer.setData(adminService.getFlyash());
    	Gson gson= new Gson();
  		String json=gson.toJson(serviceContainer);
  		return json;
    	
  	}
    @CrossOrigin(origins = "*")
  	@RequestMapping(value = "/submitFlyash", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
  	public String submitFlyash(@RequestBody FlyashMaster flyashMaster) 
  	{
    	ServiceContainer serviceContainer = new ServiceContainer();
    	serviceContainer.setData(adminService.submitFlyash(flyashMaster));
    	Gson gson= new Gson();
  		String json=gson.toJson(serviceContainer);
  		return json;
    	
  	}
    
    //Flyash Ends  Here---------
    
   
}
