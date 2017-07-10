package com.amz.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amz.bean.LoaderProductSalesMasterData;
import com.amz.dao.AdminDao;
import com.amz.dao.LoaderProductSalesDao;
import com.amz.entity.BustedDetail;
import com.amz.entity.DiMaster;
import com.amz.entity.FlyashMaster;
import com.amz.entity.LoaderMaster;
import com.amz.entity.PackerMaster;
import com.amz.entity.PlantMaster;
import com.amz.entity.UserDetails;
import com.amz.entity.userRoleMaster;
import com.amz.entity.VerifiedBustedBags;

import javassist.Loader;


@Service("loaderPackerMasterService")

public class LoaderProductSalesService

{
	@Autowired
	LoaderProductSalesDao loaderPackerSalesDao;
	@Transactional
	public LoaderProductSalesMasterData getProductLoaderSales() 
	{
		return loaderPackerSalesDao.getProductLoaderSales();
	}
	
	
	@Transactional
	public void updateLoader(LoaderMaster loaderMaster) 
	{
		loaderPackerSalesDao.updateLoader(loaderMaster);
	}
	@Transactional
	public List<LoaderMaster> addLoader(LoaderMaster loaderMaster) 
	{
			return loaderPackerSalesDao.addLoader(loaderMaster);
	}

	@Transactional
	public List<LoaderMaster> getLoaderList() 
	{
			return loaderPackerSalesDao.getLoaderList();
	}
}

