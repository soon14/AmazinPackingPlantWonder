package com.amz.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amz.bean.LoaderProductSalesMasterData;
import com.amz.dao.LoaderProductSalesDao;
import com.amz.entity.LoaderMaster;


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

