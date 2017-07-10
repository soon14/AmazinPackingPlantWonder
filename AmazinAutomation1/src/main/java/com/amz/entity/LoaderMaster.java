package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="loader_master")
@Entity
public class LoaderMaster implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "loader_no")
	private String loader_no;

	@Column(name = "is_active")
	private String isActive;
	
	@Column(name = "added_by")
	private String added_by;
	@Column(name = "loader_code")
	private String loader_code;
	
	
	@Column(name = "updated_by")
	private String updated_by;

	@Column(name = "last_updated")
	private String last_updated;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoader_no() {
		return loader_no;
	}

	public void setLoader_no(String loader_no) {
		this.loader_no = loader_no;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
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

	public String getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}

	public String getLoader_code() {
		return loader_code;
	}

	public void setLoader_code(String loader_code) {
		this.loader_code = loader_code;
	}
	
	
}
	
	
	