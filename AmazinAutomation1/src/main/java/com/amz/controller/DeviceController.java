package com.amz.controller;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amz.entity.DeviceMaster;
import com.amz.entity.DeviceTypeMaster;
import com.amz.entity.DeviceTypeQty;
import com.amz.entity.UserDetails;
import com.amz.gen.ServiceContainer;
import com.amz.services.DeviceService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/device")
public class DeviceController 
{
	@Autowired
	DeviceService deviceService;
	
	

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/allDeviceList", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String getallDeviceList() 
	{
		ArrayList<DeviceTypeMaster> list= deviceService.getAllDeviceList();
//		ServiceContainer serviceContainer = new ServiceContainer(); 
//		if(list.size()>0)
//		{
//			request.getSession().setAttribute("user", list.get(0).getUsername());
//			serviceContainer.setStatus("success");
//		}
//		else
//		{
//			serviceContainer.setStatus("fail");
//		}
//		
//		serviceContainer.setData(list);
		Gson gson = new Gson();
		String json = gson.toJson(list);
		return json;
	}
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/addDeviceType", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String addDeviceType(@RequestBody DeviceTypeMaster deviceMaster) 
	{
		DeviceTypeMaster deviceTypeMaster= deviceService.addDeviceTypeMaster(deviceMaster);
		ServiceContainer serviceContainer = new ServiceContainer();
		serviceContainer.setStatus("success");
		serviceContainer.setData(deviceMaster);
		Gson gson = new Gson();
		String json = gson.toJson(serviceContainer);
		return json;
	}
	/*@CrossOrigin(origins = "*")
	@RequestMapping(value = "/editDeviceType", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String editDeviceType(@RequestBody DeviceTypeMaster deviceMaster) 
	{
		DeviceTypeMaster deviceTypeMaster= deviceService.editDeviceTypeMaster(deviceMaster);
		ServiceContainer serviceContainer = new ServiceContainer();
		serviceContainer.setStatus("success");
		serviceContainer.setData(deviceMaster);
		Gson gson = new Gson();
		String json = gson.toJson(serviceContainer);
		return json;
	}*/
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/addDeviceTypeQty", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String editDeviceType(@RequestBody DeviceTypeQty deviceTypeQty) 
	{
		DeviceTypeQty deviceTypeqty= deviceService.adddeviceTypeQty(deviceTypeQty);
		
		ServiceContainer serviceContainer = new ServiceContainer();
		serviceContainer.setStatus("success");
		serviceContainer.setData(deviceTypeqty);
		Gson gson = new Gson();
		String json = gson.toJson(serviceContainer);
		return json;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/updateDeviceTypeQty", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String updatetDeviceType(@RequestBody DeviceTypeQty deviceTypeQty) 
	{
		DeviceTypeQty deviceTypeqty= deviceService.updatedeviceTypeQty(deviceTypeQty);
		
		ServiceContainer serviceContainer = new ServiceContainer();
		serviceContainer.setStatus("success");
		serviceContainer.setData(deviceTypeqty);
		Gson gson = new Gson();
		String json = gson.toJson(serviceContainer);
		return json;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/addDeviceMaster", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String addDevieMaster(@RequestBody DeviceMaster deviceMaster) 
	{
		DeviceMaster addDevieMaster= deviceService.addDevieMaster(deviceMaster);
		
		ServiceContainer serviceContainer = new ServiceContainer();
		serviceContainer.setStatus("success");
		serviceContainer.setData(addDevieMaster);
		Gson gson = new Gson();
		String json = gson.toJson(serviceContainer);
		return json;
	}
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/updateDeviceMaster", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String updateDeviceMaster(@RequestBody DeviceMaster deviceMaster) 
	{
		DeviceMaster updateDeviceMaster= deviceService.updateDeviceMaster(deviceMaster);
		
		ServiceContainer serviceContainer = new ServiceContainer();
		serviceContainer.setStatus("success");
		serviceContainer.setData(updateDeviceMaster);
		Gson gson = new Gson();
		String json = gson.toJson(serviceContainer);
		return json;
	}
	
	
	
}
