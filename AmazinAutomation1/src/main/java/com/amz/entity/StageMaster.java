package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="stagemaster")
@Entity
public class StageMaster implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "stage_name")
	private String stage_name;
	
	@Column(name = "sequence_number")
	private String sequence_number;
	
	
	@Column(name = "is_active")
	private String is_active;
	
	@Column(name = "updated_date")
	private String updated_date;

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



	public String getStage_name() {
		return stage_name;
	}



	public void setStage_name(String stage_name) {
		this.stage_name = stage_name;
	}



	public String getSequence_number() {
		return sequence_number;
	}



	public void setSequence_number(String sequence_number) {
		this.sequence_number = sequence_number;
	}



	



	public String getIs_active() {
		return is_active;
	}



	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}



	public String getUpdated_date() {
		return updated_date;
	}



	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
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