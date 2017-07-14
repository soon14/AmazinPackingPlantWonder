package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mas_customer database table.
 * 
 */
@Entity
@Table(name="mas_customer")
@NamedQuery(name="MasCustomer.findAll", query="SELECT m FROM MasCustomer m")
public class MasCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String address;

	@Column(name="bidding_cust_is_active")
	private String biddingCustIsActive;

	@Column(name="customer_code")
	private String customerCode;

	@Column(name="customer_name")
	private String customerName;

	@Column(name="is_active")
	private String isActive;

	public MasCustomer() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBiddingCustIsActive() {
		return this.biddingCustIsActive;
	}

	public void setBiddingCustIsActive(String biddingCustIsActive) {
		this.biddingCustIsActive = biddingCustIsActive;
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}