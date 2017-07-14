package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_district database table.
 * 
 */
@Entity
@Table(name="mas_district")
@NamedQuery(name="MasDistrict.findAll", query="SELECT m FROM MasDistrict m")
public class MasDistrict implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="district_code")
	private String districtCode;

	@Column(name="district_name")
	private String districtName;

	private String is_Active;

	//bi-directional many-to-one association to MapDistrictCity
	@OneToMany(mappedBy="masDistrict")
	private List<MapDistrictCity> mapDistrictCities;

	public MasDistrict() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getIs_Active() {
		return this.is_Active;
	}

	public void setIs_Active(String is_Active) {
		this.is_Active = is_Active;
	}

	public List<MapDistrictCity> getMapDistrictCities() {
		return this.mapDistrictCities;
	}

	public void setMapDistrictCities(List<MapDistrictCity> mapDistrictCities) {
		this.mapDistrictCities = mapDistrictCities;
	}

	public MapDistrictCity addMapDistrictCity(MapDistrictCity mapDistrictCity) {
		getMapDistrictCities().add(mapDistrictCity);
		mapDistrictCity.setMasDistrict(this);

		return mapDistrictCity;
	}

	public MapDistrictCity removeMapDistrictCity(MapDistrictCity mapDistrictCity) {
		getMapDistrictCities().remove(mapDistrictCity);
		mapDistrictCity.setMasDistrict(null);

		return mapDistrictCity;
	}

}