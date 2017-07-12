package com.amz.services;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amz.dao.PrintingDao;
import com.amz.entity.PrinterFormat;


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
