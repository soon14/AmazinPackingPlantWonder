package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="verified_busted_bags")
@Entity

public class VerifiedBustedBags implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "loader_master_id")
	private String loader_master_id;
	
	
	@Column(name = "product_code_id")
	private String product_id;
	
	@Column(name = "sales_channel_id")
	private String sales_channel;
	
	@Column(name = "total_reusable_bag")
	private String total_reusable_bag;
	
	@Column(name = "mrp")
	private String mrp;

	@Column(name = "busted_bags")
	private String busted_bags;
	
	@Column(name = "verified_busted_bags")
	private String verified_busted_bags;

	@Column(name = "varified_by")
	private String varified_by;
	@Column(name = "varified_time")
	private String varified_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoader_master_id() {
		return loader_master_id;
	}
	public void setLoader_master_id(String loader_master_id) {
		this.loader_master_id = loader_master_id;
	}
	
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getSales_channel() {
		return sales_channel;
	}
	public void setSales_channel(String sales_channel) {
		this.sales_channel = sales_channel;
	}
	public String getTotal_reusable_bag() {
		return total_reusable_bag;
	}
	public void setTotal_reusable_bag(String total_reusable_bag) {
		this.total_reusable_bag = total_reusable_bag;
	}
	public String getMrp() {
		return mrp;
	}
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}
	public String getBusted_bags() {
		return busted_bags;
	}
	public void setBusted_bags(String busted_bags) {
		this.busted_bags = busted_bags;
	}
	public String getVerified_busted_bags() {
		return verified_busted_bags;
	}
	public void setVerified_busted_bags(String verified_busted_bags) {
		this.verified_busted_bags = verified_busted_bags;
	}
	public String getVarified_by() {
		return varified_by;
	}
	public void setVarified_by(String varified_by) {
		this.varified_by = varified_by;
	}
	public String getVarified_time() {
		return varified_time;
	}
	public void setVarified_time(String varified_time) {
		this.varified_time = varified_time;
	}
	
	
	
	
}	