package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="product_master")
@Entity
public class ProductMaster implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "plantmaster_id")
	private String plantmaster_id;
	
	@Column(name = "product_code")
	private String product_code;
	
	@Column(name = "product_name")
	private String product_name;
	
	@Column(name = "is_active")
	private String isActive;
	
	@Column(name = "created_date")
	private String createdDate;

	@Column(name = "updated_by")
	private String updated_by;



	@Column(name = "added_by")
	private String added_by;


	@Column(name = "updated_date")
	private String updated_date;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPlantmaster_id() {
		return plantmaster_id;
	}


	public void setPlantmaster_id(String plantmaster_id) {
		this.plantmaster_id = plantmaster_id;
	}


	public String getProduct_code() {
		return product_code;
	}


	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public String getIsActive() {
		return isActive;
	}


	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}


	public String getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}


	public String getUpdated_by() {
		return updated_by;
	}


	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}


	public String getAdded_by() {
		return added_by;
	}


	public void setAdded_by(String added_by) {
		this.added_by = added_by;
	}


	public String getUpdated_date() {
		return updated_date;
	}


	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}


	
}