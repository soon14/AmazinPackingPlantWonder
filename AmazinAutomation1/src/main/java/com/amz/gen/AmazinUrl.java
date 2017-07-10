package com.amz.gen;

public class AmazinUrl
{
//	public static String service = "http://192.168.43.107:8080/AmazinAutomation1/";
	//public String url = "http://192.168.101.171:8080/AmazinAutomation1/";
	//public String url = "http://192.168.43.13:8089/AmazinAutomation1/";
	//public static String url = "http://192.168.43.13:8089/AmazinAutomation1/";
	public static String url = "";//http://192.168.43.13:8089/AmazinAutomation1/";
	public String packerDashboard=url+"PackerDashboard.jsp";
	public String plant=url+"PlantMaster.jsp";
	public String login=url+"admin/login";
	public String logout=url+"admin/changePassword";
	public String changePassword=url+"admin/changePassword";
	public String addDeviceType=url+"device/addDeviceType";
	public String getAllDeviceList=url+"device/allDeviceList";
	public String addDeviceTypeQty=url+"device/addDeviceTypeQty";
	public String updateDeviceTypeQty=url+"device/updateDeviceTypeQty";
	public String updateDeviceMaster=url+"device/updateDeviceMaster";
	
	public String AddDeviceTypeMaster=url+"device/addDeviceMaster";
	public static String addPacker=url+"admin/addPacker";
	public static String  getPacker=url+"admin/getPackerList";
	public static boolean isadded =true;
	public static String usertype ="";
	public String updateMrp =url+"printer/printerFormat";
	public static String updatepacker =url+"admin/updatePacker";
	public static String getPlantList =url+"superadmin/getPlantList";
	public static String createUser =url+"admin/createUser";
	public static String getUserRoles =url+"admin/getUserRoles";
	public static String addLoader =url+"loaderProductSales/addLoader";
	public static String  getLoader=url+"loaderProductSales/getLoaderLaist";
	public static String updateLoader =url+"loaderProductSales/updateLoader";
	public static String updateStage =url+"superadmin/updateStage";
	public static String submitBags =url+"admin/submitBags";
	public static String allTripinfo =url+"transportal/getAllTripInformation";
	public static String getBagsVarified =url+"admin/getBagsVarified";
	public static String getsubmitActiveBags =url+"admin/getsubmitActiveBags";
	public static String submitFlyash =url+"admin/submitFlyash";
	public static String getFlyash =url+"admin/getFlyash";
	public static String toBeVerifiedBags =url+"bustedbags/tobeverifiedbags";
	public static String submitVerifiedBags =url+"bustedbags/submitVerifiedBags";
	public static String getreusableBags =url+"bustedbags/getreusableBags";
	public static String getProductLoaderSales =url+"loaderProductSales/getPackerLoaderSales";
	public static String getPlantWiseDeviceList =url+"superadmin/getPlantWiseDeviceList";
	public static String addPlant =url+"superadmin/addPlant";
	public static String getStageList =url+"superadmin/getStageList";
	public static String addStage =url+"superadmin/addStage";
}
