package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_city database table.
 * 
 */
@Entity
@Table(name="mas_city")
@NamedQuery(name="MasCity.findAll", query="SELECT m FROM MasCity m")
public class MasCity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="city_code")
	private String cityCode;

	@Column(name="city_name")
	private String cityName;

	private String is_Active;

	private String SAP_city_code;

	//bi-directional many-to-one association to MapClubdestination
	@OneToMany(mappedBy="masCity")
	private List<MapClubdestination> mapClubdestinations;

	//bi-directional many-to-one association to MapDistrictCity
	@OneToMany(mappedBy="masCity")
	private List<MapDistrictCity> mapDistrictCities;

	public MasCity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getIs_Active() {
		return this.is_Active;
	}

	public void setIs_Active(String is_Active) {
		this.is_Active = is_Active;
	}

	public String getSAP_city_code() {
		return this.SAP_city_code;
	}

	public void setSAP_city_code(String SAP_city_code) {
		this.SAP_city_code = SAP_city_code;
	}

	public List<MapClubdestination> getMapClubdestinations() {
		return this.mapClubdestinations;
	}

	public void setMapClubdestinations(List<MapClubdestination> mapClubdestinations) {
		this.mapClubdestinations = mapClubdestinations;
	}

	public MapClubdestination addMapClubdestination(MapClubdestination mapClubdestination) {
		getMapClubdestinations().add(mapClubdestination);
		mapClubdestination.setMasCity(this);

		return mapClubdestination;
	}

	public MapClubdestination removeMapClubdestination(MapClubdestination mapClubdestination) {
		getMapClubdestinations().remove(mapClubdestination);
		mapClubdestination.setMasCity(null);

		return mapClubdestination;
	}

	public List<MapDistrictCity> getMapDistrictCities() {
		return this.mapDistrictCities;
	}

	public void setMapDistrictCities(List<MapDistrictCity> mapDistrictCities) {
		this.mapDistrictCities = mapDistrictCities;
	}

	public MapDistrictCity addMapDistrictCity(MapDistrictCity mapDistrictCity) {
		getMapDistrictCities().add(mapDistrictCity);
		mapDistrictCity.setMasCity(this);

		return mapDistrictCity;
	}

	public MapDistrictCity removeMapDistrictCity(MapDistrictCity mapDistrictCity) {
		getMapDistrictCities().remove(mapDistrictCity);
		mapDistrictCity.setMasCity(null);

		return mapDistrictCity;
	}

}