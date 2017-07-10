package com.amz.bean;


import java.util.ArrayList;


import com.amz.entity.LoaderMaster;
import com.amz.entity.ProductMaster;
import com.amz.entity.SalesChannelMaster;

public class LoaderProductSalesMasterData 

{
	
	private ArrayList<LoaderMaster> loaderList;

	private ArrayList<ProductMaster> productMasterList;
	
	private ArrayList<SalesChannelMaster> salesChannelList;

	public ArrayList<LoaderMaster> getLoaderList() {
		return loaderList;
	}

	public void setLoaderList(ArrayList<LoaderMaster> loaderList) {
		this.loaderList = loaderList;
	}

	public ArrayList<ProductMaster> getProductMasterList() {
		return productMasterList;
	}

	public void setProductMasterList(ArrayList<ProductMaster> productMasterList) {
		this.productMasterList = productMasterList;
	}

	public ArrayList<SalesChannelMaster> getSalesChannelList() {
		return salesChannelList;
	}

	public void setSalesChannelList(ArrayList<SalesChannelMaster> salesChannelList) {
		this.salesChannelList = salesChannelList;
	}
	
	
	
	
		
}
	
	
	