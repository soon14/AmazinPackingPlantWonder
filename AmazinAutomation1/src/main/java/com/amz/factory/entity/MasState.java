package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_state database table.
 * 
 */
@Entity
@Table(name="mas_state")
@NamedQuery(name="MasState.findAll", query="SELECT m FROM MasState m")
public class MasState implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String is_active;

	@Column(name="state_code")
	private String stateCode;

	@Column(name="state_name")
	private String stateName;

	//bi-directional many-to-one association to MapStateDistrict
	@OneToMany(mappedBy="masState")
	private List<MapStateDistrict> mapStateDistricts;

	public MasState() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIs_active() {
		return this.is_active;
	}

	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}

	public String getStateCode() {
		return this.stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<MapStateDistrict> getMapStateDistricts() {
		return this.mapStateDistricts;
	}

	public void setMapStateDistricts(List<MapStateDistrict> mapStateDistricts) {
		this.mapStateDistricts = mapStateDistricts;
	}

	public MapStateDistrict addMapStateDistrict(MapStateDistrict mapStateDistrict) {
		getMapStateDistricts().add(mapStateDistrict);
		mapStateDistrict.setMasState(this);

		return mapStateDistrict;
	}

	public MapStateDistrict removeMapStateDistrict(MapStateDistrict mapStateDistrict) {
		getMapStateDistricts().remove(mapStateDistrict);
		mapStateDistrict.setMasState(null);

		return mapStateDistrict;
	}

}