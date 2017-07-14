package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the map_discharged_side database table.
 * 
 */
@Entity
@Table(name="map_discharged_side")
@NamedQuery(name="MapDischargedSide.findAll", query="SELECT m FROM MapDischargedSide m")
public class MapDischargedSide implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="discharged_side_group")
	private String dischargedSideGroup;

	@Column(name="discharged_side_name")
	private String dischargedSideName;

	@Column(name="is_active")
	private String isActive;

	//bi-directional many-to-one association to MasPacker
	@ManyToOne
	@JoinColumn(name="packer_master_id")
	private MasPacker masPacker;

	public MapDischargedSide() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDischargedSideGroup() {
		return this.dischargedSideGroup;
	}

	public void setDischargedSideGroup(String dischargedSideGroup) {
		this.dischargedSideGroup = dischargedSideGroup;
	}

	public String getDischargedSideName() {
		return this.dischargedSideName;
	}

	public void setDischargedSideName(String dischargedSideName) {
		this.dischargedSideName = dischargedSideName;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public MasPacker getMasPacker() {
		return this.masPacker;
	}

	public void setMasPacker(MasPacker masPacker) {
		this.masPacker = masPacker;
	}

}