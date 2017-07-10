package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="packer_master")
@Entity
public class PackerMaster implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "packer_no")
	private String packer_no;
	
	@Column(name = "plant_master_id")
	private String plant_master_id;
	
	@Column(name = "target_capacity")
	private String target_capacity;
	
	@Column(name = "is_active")
	private String isActive;
	
	@Column(name = "created_date")
	private String created_date;

	@Column(name = "last_updated")
	private String last_updated;



	@Column(name = "added_by")
	private String added_by;


	@Column(name = "updated_by")
	private String updated_by;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPacker_no() {
		return packer_no;
	}


	public void setPacker_no(String packer_no) {
		this.packer_no = packer_no;
	}


	public String getPlant_master_id() {
		return plant_master_id;
	}


	public void setPlant_master_id(String plant_master_id) {
		this.plant_master_id = plant_master_id;
	}


	public String getTarget_capacity() {
		return target_capacity;
	}


	public void setTarget_capacity(String target_capacity) {
		this.target_capacity = target_capacity;
	}


	public String getIsActive() {
		return isActive;
	}


	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}


	public String getCreated_date() {
		return created_date;
	}


	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}


	public String getLast_updated() {
		return last_updated;
	}


	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}


	public String getAdded_by() {
		return added_by;
	}


	public void setAdded_by(String added_by) {
		this.added_by = added_by;
	}


	public String getUpdated_by() {
		return updated_by;
	}


	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	
}	