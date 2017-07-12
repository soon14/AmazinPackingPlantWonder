package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the map_district_city database table.
 * 
 */
@Entity
@Table(name="map_district_city")
@NamedQuery(name="MapDistrictCity.findAll", query="SELECT m FROM MapDistrictCity m")
public class MapDistrictCity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String is_active;

	//bi-directional many-to-one association to MasCity
	@ManyToOne
	@JoinColumn(name="city_master_id")
	private MasCity masCity;

	//bi-directional many-to-one association to MasDistrict
	@ManyToOne
	@JoinColumn(name="state_district_id")
	private MasDistrict masDistrict;

	public MapDistrictCity() {
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

	public MasCity getMasCity() {
		return this.masCity;
	}

	public void setMasCity(MasCity masCity) {
		this.masCity = masCity;
	}

	public MasDistrict getMasDistrict() {
		return this.masDistrict;
	}

	public void setMasDistrict(MasDistrict masDistrict) {
		this.masDistrict = masDistrict;
	}

}