package com.amz.bean;


import java.util.ArrayList;

import com.amz.entity.DeviceTypeMaster;
import com.amz.entity.LoaderMaster;
import com.amz.entity.PlantMaster;
import com.amz.entity.ProductMaster;
import com.amz.entity.SalesChannelMaster;

public class PlantWiseDeviceMaster 

{
	
	private ArrayList<PlantMaster> plantMaster;

	private ArrayList<DeviceTypeMaster> deviceTypeMaster;

	public ArrayList<PlantMaster> getPlantMaster() {
		return plantMaster;
	}

	public void setPlantMaster(ArrayList<PlantMaster> plantMaster) {
		this.plantMaster = plantMaster;
	}

	public ArrayList<DeviceTypeMaster> getDeviceTypeMaster() {
		return deviceTypeMaster;
	}

	public void setDeviceTypeMaster(ArrayList<DeviceTypeMaster> deviceTypeMaster) {
		this.deviceTypeMaster = deviceTypeMaster;
	}
	
	
	
	
	
		
}
	
	
	