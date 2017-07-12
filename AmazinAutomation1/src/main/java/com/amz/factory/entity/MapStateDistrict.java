package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the map_state_district database table.
 * 
 */
@Entity
@Table(name="map_state_district")
@NamedQuery(name="MapStateDistrict.findAll", query="SELECT m FROM MapStateDistrict m")
public class MapStateDistrict implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="district_name")
	private String districtName;

	private String is_Active;

	//bi-directional many-to-one association to MapClubdestination
	@OneToMany(mappedBy="mapStateDistrict")
	private List<MapClubdestination> mapClubdestinations;

	//bi-directional many-to-one association to MapStateDistrict
	@ManyToOne
	@JoinColumn(name="district_id")
	private MapStateDistrict mapStateDistrict;

	//bi-directional many-to-one association to MapStateDistrict
	@OneToMany(mappedBy="mapStateDistrict")
	private List<MapStateDistrict> mapStateDistricts;

	//bi-directional many-to-one association to MasState
	@ManyToOne
	@JoinColumn(name="state_id")
	private MasState masState;

	public MapStateDistrict() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<MapClubdestination> getMapClubdestinations() {
		return this.mapClubdestinations;
	}

	public void setMapClubdestinations(List<MapClubdestination> mapClubdestinations) {
		this.mapClubdestinations = mapClubdestinations;
	}

	public MapClubdestination addMapClubdestination(MapClubdestination mapClubdestination) {
		getMapClubdestinations().add(mapClubdestination);
		mapClubdestination.setMapStateDistrict(this);

		return mapClubdestination;
	}

	public MapClubdestination removeMapClubdestination(MapClubdestination mapClubdestination) {
		getMapClubdestinations().remove(mapClubdestination);
		mapClubdestination.setMapStateDistrict(null);

		return mapClubdestination;
	}

	public MapStateDistrict getMapStateDistrict() {
		return this.mapStateDistrict;
	}

	public void setMapStateDistrict(MapStateDistrict mapStateDistrict) {
		this.mapStateDistrict = mapStateDistrict;
	}

	public List<MapStateDistrict> getMapStateDistricts() {
		return this.mapStateDistricts;
	}

	public void setMapStateDistricts(List<MapStateDistrict> mapStateDistricts) {
		this.mapStateDistricts = mapStateDistricts;
	}

	public MapStateDistrict addMapStateDistrict(MapStateDistrict mapStateDistrict) {
		getMapStateDistricts().add(mapStateDistrict);
		mapStateDistrict.setMapStateDistrict(this);

		return mapStateDistrict;
	}

	public MapStateDistrict removeMapStateDistrict(MapStateDistrict mapStateDistrict) {
		getMapStateDistricts().remove(mapStateDistrict);
		mapStateDistrict.setMapStateDistrict(null);

		return mapStateDistrict;
	}

	public MasState getMasState() {
		return this.masState;
	}

	public void setMasState(MasState masState) {
		this.masState = masState;
	}

}