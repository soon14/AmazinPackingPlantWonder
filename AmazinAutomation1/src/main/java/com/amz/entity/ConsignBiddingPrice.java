package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="consign_bidding_price")
@Entity
public class ConsignBiddingPrice implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "consignclubbing_id")
	private String consignClunbId;
	@Column(name = "transportermaster_id")
	private String transporterMasterId;
	
	@Column(name = "price")
	private String price;
	@Column(name = "is_active")
	private String isActive;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConsignClunbId() {
		return consignClunbId;
	}
	public void setConsignClunbId(String consignClunbId) {
		this.consignClunbId = consignClunbId;
	}
	public String getTransporterMasterId() {
		return transporterMasterId;
	}
	public void setTransporterMasterId(String transporterMasterId) {
		this.transporterMasterId = transporterMasterId;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	
	
	
}	