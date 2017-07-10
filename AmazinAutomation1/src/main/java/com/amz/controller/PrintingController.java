package com.amz.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amz.entity.PrinterFormat;
import com.amz.entity.UserDetails;
import com.amz.gen.ServiceContainer;
import com.amz.services.AdminService;
import com.amz.services.PrinterService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/printer")
public class PrintingController
{
	@Autowired
	PrinterService printerService;
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/printerFormat", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public String  putPrintingFormat(@RequestBody ArrayList<PrinterFormat> printerformat) 
	{
		printerService.putPrintingFormat(printerformat);
		return ""+printerformat.size();
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/getprinterFormat", method = RequestMethod.POST, headers = "Accept=application/json",consumes = {"application/json"})
	public void  getPrintingFormat() 
	{
		System.out.println(printerService.getPrintingFormat());
		
	}
}
