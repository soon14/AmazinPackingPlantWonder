package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="bidding_config")
@Entity
public class BiddingConfig implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "is_sto")
	private String isSto;
	@Column(name = "is_so")
	private String isSo;
	
	@Column(name = "sales_office")
	private String salesOffice;
	@Column(name = "customer")
	private String customer;
	
	@Column(name = " destination_qty")
	private String destinationQty;
	@Column(name = "transporter_wise")
	private String transporterWise;
	
	@Column(name = "time_period")
	private String timePeriod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsSto() {
		return isSto;
	}

	public void setIsSto(String isSto) {
		this.isSto = isSto;
	}

	public String getIsSo() {
		return isSo;
	}

	public void setIsSo(String isSo) {
		this.isSo = isSo;
	}

	public String getSalesOffice() {
		return salesOffice;
	}

	public void setSalesOffice(String salesOffice) {
		this.salesOffice = salesOffice;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getDestinationQty() {
		return destinationQty;
	}

	public void setDestinationQty(String destinationQty) {
		this.destinationQty = destinationQty;
	}

	public String getTransporterWise() {
		return transporterWise;
	}

	public void setTransporterWise(String transporterWise) {
		this.transporterWise = transporterWise;
	}

	public String getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}
	
	
}
	
	
	