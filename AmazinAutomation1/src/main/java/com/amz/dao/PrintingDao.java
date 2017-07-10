package com.amz.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amz.entity.PrinterFormat;
import com.amz.entity.UserDetails;
import com.amz.gen.AmazinUrl;
@Repository
public class PrintingDao
{
	@Autowired
	private SessionFactory sessionFactory;
	//Session session =this.sessionFactory.getCurrentSession();
	public void setSessionFactory(SessionFactory sf) 
	{
		this.sessionFactory = sf;
	}


	public void putPrintingFormat (ArrayList<PrinterFormat> printerformat) 
	
	{
			String date[]= java.time.LocalDate.now().toString().split("-");
			String day=date[2];
			String month=date[1];
			String year=date[0].substring(2);
			//int  week= Calendar.WEEK_OF_YEAR;
			java.util.Date date1= new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(date1);
			int week = cal.get(Calendar.WEEK_OF_YEAR);
			
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			
			for(int i=0;i<printerformat.size();i++)
			{
				/*switch(""+printerformat.get(i).getKey())
				{
						case "Day":
							printerformat.get(i).setValue(day);
							break;
						case "Week":
							printerformat.get(i).setValue(String.valueOf(week));
							break;
						case "Year":
							printerformat.get(i).setValue(year);
							break;
						case "Month":
							printerformat.get(i).setValue(month);
							break;

				}*/
				
				printerformat.get(i).setIs_active("A");
				printerformat.get(i).setUpdated_on(timestamp.toString());
				Session session =this.sessionFactory.getCurrentSession();
				session.persist(printerformat.get(i));
				
				
			}
	}
	
			
public String getPrintingFormat (String Mrp,String ppc,String flyash) 
			
			{
					
				
				String hqlQueryString = "FROM PrinterFormat";
				Session session =this.sessionFactory.getCurrentSession();
				Query query= session.createQuery(hqlQueryString);
				List<PrinterFormat> list = query.list();
				
					String date[]= java.time.LocalDate.now().toString().split("-");
					String day=date[2];
					String month=date[1];
					String year=date[0].substring(2);
					java.util.Date date1= new Date();
					Calendar cal = Calendar.getInstance();
					cal.setTime(date1);
					int week = cal.get(Calendar.WEEK_OF_YEAR);
					
					
					Timestamp timestamp = new Timestamp(System.currentTimeMillis());
					String command="";
					for(int i=0;i<list.size();i++)
					{
						System.out.println(i);
						if(list.get(i).getSequence_number().equals(String.valueOf(i+1)))
						{
							switch(""+list.get(i).getKeyvalue())
							{
									case "Day":
											if(list.get(i).getIs_prefix_applied().equals("Y"))
											{
												command+= " "+list.get(i).getPrefix()+day;
											}
											else{
												command+= " "+day;
											}
										break;
									case "Week":
										if(list.get(i).getIs_prefix_applied().equals("Y"))
										{
											command+= " "+list.get(i).getPrefix()+week;
										}
										else{
											command+= " "+String.valueOf(week);
										}
										break;
									case "Year":
										if(list.get(i).getIs_prefix_applied().equals("Y"))
										{
											command+= " "+list.get(i).getPrefix()+year;
										}
										else{
											command+= " "+year;
										}
										break;
									case "Month":
										if(list.get(i).getIs_prefix_applied().equals("Y"))
										{
											command+= " "+list.get(i).getPrefix()+month;
										}
										else{
											command+= " "+month;
										}
									break;
									case "Flyash %":
										if(list.get(i).getIs_prefix_applied().equals("Y"))
										{
											command+= " "+list.get(i).getPrefix()+flyash;
										}
										else{
											command+= " "+String.valueOf(week);
										}
										break;
									case "Mrp":
										if(list.get(i).getIs_prefix_applied().equals("Y"))
										{
											command+= " "+list.get(i).getPrefix()+Mrp;
										}
										else{
											command+= " "+year;
										}
										break;
									case "Product Code":
										if(list.get(i).getIs_prefix_applied().equals("Y"))
										{
											command+= " "+list.get(i).getPrefix()+ppc;
										}
										else{
											command+= " "+month;
										}
									break;
							}
			
						}
		
					}
					return command;
				}
	
	


}
