package com.amz.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amz.dao.DeviceDao;
import com.amz.dao.PrintingDao;
import com.amz.entity.DeviceMaster;
import com.amz.entity.DeviceTypeMaster;
import com.amz.entity.DeviceTypeQty;
import com.amz.entity.PrinterFormat;
import com.amz.entity.UserDetails;


@Service("printerService")
public class PrinterService 
{
	@Autowired
	PrintingDao printingDao;
	
	@Transactional
	public  void putPrintingFormat (ArrayList<PrinterFormat> printerformat) 
	{
		printingDao.putPrintingFormat(printerformat);
	}
	@Transactional
	public  String getPrintingFormat () 
	{
		return printingDao.getPrintingFormat("400","PPC","25");
		
	}
}
