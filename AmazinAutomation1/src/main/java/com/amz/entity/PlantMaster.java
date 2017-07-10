package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="plant_master")
@Entity
public class PlantMaster implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "plant_code")
	private String plant_code;
	
	@Column(name = "plant_name")
	private String plant_name;
	
	@Column(name = "unit")
	private String unit;
	
	@Column(name = "is_active")
	private String is_active;
	
	@Column(name = "created_date")
	private String created_date;

	@Column(name = "updated_by")
	private String updated_by;



	@Column(name = "added_by")
	private String added_by;


	@Column(name = "update_date")
	private String update_date;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPlant_code() {
		return plant_code;
	}


	public void setPlant_code(String plant_code) {
		this.plant_code = plant_code;
	}


	public String getPlant_name() {
		return plant_name;
	}


	public void setPlant_name(String plant_name) {
		this.plant_name = plant_name;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


	public String getIs_active() {
		return is_active;
	}


	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}


	public String getCreated_date() {
		return created_date;
	}


	public void setCreated_date(String created_date) {
		this.created_date = created_date;
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


	public String getUpdate_date() {
		return update_date;
	}


	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}


	
}	