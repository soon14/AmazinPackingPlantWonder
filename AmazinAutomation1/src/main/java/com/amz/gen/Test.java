package com.amz.gen;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args)
	{
		
		//Calendar cal = Calendar.getInstance();
		
//		cal.se
//		System.out.println(dateFormat.format(cal));
//		
//		
//		Calendar calendar =  new Calendar(new Date());
		
		
		
		java.util.Date date= new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.WEEK_OF_YEAR);
		
		
		
		
		System.out.println(month);

	}

}
