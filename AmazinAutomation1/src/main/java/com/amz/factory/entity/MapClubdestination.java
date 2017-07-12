package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the map_clubdestination database table.
 * 
 */
@Entity
@Table(name="map_clubdestination")
@NamedQuery(name="MapClubdestination.findAll", query="SELECT m FROM MapClubdestination m")
public class MapClubdestination implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="destinationclub_id")
	private int destinationclubId;

	private String is_Active;

	//bi-directional many-to-one association to MasCity
	@ManyToOne
	@JoinColumn(name="citymaster_id")
	private MasCity masCity;

	//bi-directional many-to-one association to MapStateDistrict
	@ManyToOne
	@JoinColumn(name="map_state_district_id")
	private MapStateDistrict mapStateDistrict;

	public MapClubdestination() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDestinationclubId() {
		return this.destinationclubId;
	}

	public void setDestinationclubId(int destinationclubId) {
		this.destinationclubId = destinationclubId;
	}

	public String getIs_Active() {
		return this.is_Active;
	}

	public void setIs_Active(String is_Active) {
		this.is_Active = is_Active;
	}

	public MasCity getMasCity() {
		return this.masCity;
	}

	public void setMasCity(MasCity masCity) {
		this.masCity = masCity;
	}

	public MapStateDistrict getMapStateDistrict() {
		return this.mapStateDistrict;
	}

	public void setMapStateDistrict(MapStateDistrict mapStateDistrict) {
		this.mapStateDistrict = mapStateDistrict;
	}

}