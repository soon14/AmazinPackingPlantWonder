package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the config_bidding database table.
 * 
 */
@Entity
@Table(name="config_bidding")
@NamedQuery(name="ConfigBidding.findAll", query="SELECT c FROM ConfigBidding c")
public class ConfigBidding implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String customer;

	@Column(name="destination_qty")
	private String destinationQty;

	@Column(name="is_so")
	private String isSo;

	@Column(name="is_sto")
	private String isSto;

	@Column(name="sales_office")
	private String salesOffice;

	@Column(name="time_period")
	private Timestamp timePeriod;

	@Column(name="transporter_wise")
	private String transporterWise;

	public ConfigBidding() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer() {
		return this.customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getDestinationQty() {
		return this.destinationQty;
	}

	public void setDestinationQty(String destinationQty) {
		this.destinationQty = destinationQty;
	}

	public String getIsSo() {
		return this.isSo;
	}

	public void setIsSo(String isSo) {
		this.isSo = isSo;
	}

	public String getIsSto() {
		return this.isSto;
	}

	public void setIsSto(String isSto) {
		this.isSto = isSto;
	}

	public String getSalesOffice() {
		return this.salesOffice;
	}

	public void setSalesOffice(String salesOffice) {
		this.salesOffice = salesOffice;
	}

	public Timestamp getTimePeriod() {
		return this.timePeriod;
	}

	public void setTimePeriod(Timestamp timePeriod) {
		this.timePeriod = timePeriod;
	}

	public String getTransporterWise() {
		return this.transporterWise;
	}

	public void setTransporterWise(String transporterWise) {
		this.transporterWise = transporterWise;
	}

}