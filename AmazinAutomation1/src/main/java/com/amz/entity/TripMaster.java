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
import javax.persistence.Table;

@Table(name = "trip_master")
@Entity
public class TripMaster implements Serializable
{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "trip_id")
	private String trip_id;
	
	@Column(name = "vehicle_number")
	private String vehicle_number;
	@Column(name = "tag_number")
	private String tag_number;
	@Column(name = "is_active")
	private String is_active;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTrip_id() {
		return trip_id;
	}
	public void setTrip_id(String trip_id) {
		this.trip_id = trip_id;
	}

	public String getTag_number() {
		return tag_number;
	}
	public void setTag_number(String tag_number) {
		this.tag_number = tag_number;
	}
	public String getVehicle_number() {
		return vehicle_number;
	}
	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="id",cascade = CascadeType.ALL)
	private List<DiMaster> diMaster;
	public List<DiMaster> getDiMaster() {
		return diMaster;
	}
	public void setDiMaster(List<DiMaster> diMaster) {
		this.diMaster = diMaster;
	}
	
}
