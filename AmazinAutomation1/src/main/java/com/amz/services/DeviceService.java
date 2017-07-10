package com.amz.services;

import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amz.dao.DeviceDao;
import com.amz.entity.DeviceMaster;
import com.amz.entity.DeviceTypeMaster;
import com.amz.entity.DeviceTypeQty;


@Service("deviceService")
public class DeviceService 
{
	@Autowired
	DeviceDao deviceDao;
	@Transactional
	public ArrayList<DeviceTypeMaster> getAllDeviceList()
	{
		return deviceDao.getAllDeviceList();
	}
	
	@Transactional
	public DeviceTypeMaster addDeviceTypeMaster(DeviceTypeMaster DeviceTypeMaster)
	{
		return deviceDao.addDeviceTypeMaster(DeviceTypeMaster);
	}

	@Transactional
	public DeviceTypeQty adddeviceTypeQty (DeviceTypeQty deviceTypeQty)
	{
		return deviceDao.adddeviceTypeQty(deviceTypeQty);
	}

	@Transactional
	public DeviceTypeQty updatedeviceTypeQty (DeviceTypeQty deviceTypeQty)
	{
		return deviceDao.updatedeviceTypeQty(deviceTypeQty);
	}
	
	
	@Transactional
	public DeviceMaster addDevieMaster (DeviceMaster deviceMaster)
	{
		return deviceDao.addDevieMaster(deviceMaster);
	}
	
	@Transactional
	public DeviceMaster updateDeviceMaster (DeviceMaster deviceMaster)
	{
		return deviceDao.updateDeviceMaster(deviceMaster);
	}
}
