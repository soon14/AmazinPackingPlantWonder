package com.amz.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "reusabel_bags_master")
@Entity
public class ReusabelBagsMaster implements Serializable
{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "loader_master_id")
	private String loader_master_id;
	
	@Column(name = "product_master_id")
	private String product_master_id;
	@Column(name = "sales_channel_master_id")
	private String sales_channel_master_id;
	@Column(name = "reusable_bags")
	private String reusable_bags;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLoader_master_id() {
		return loader_master_id;
	}
	public void setLoader_master_id(String loader_master_id) {
		this.loader_master_id = loader_master_id;
	}
	public String getProduct_master_id() {
		return product_master_id;
	}
	public void setProduct_master_id(String product_master_id) {
		this.product_master_id = product_master_id;
	}
	public String getSales_channel_master_id() {
		return sales_channel_master_id;
	}
	public void setSales_channel_master_id(String sales_channel_master_id) {
		this.sales_channel_master_id = sales_channel_master_id;
	}
	public String getReusable_bags() {
		return reusable_bags;
	}
	public void setReusable_bags(String reusable_bags) {
		this.reusable_bags = reusable_bags;
	}
	
	

	
	
	
}
