package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_stage database table.
 * 
 */
@Entity
@Table(name="mas_stage")
@NamedQuery(name="MasStage.findAll", query="SELECT m FROM MasStage m")
public class MasStage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="stage_code")
	private String stageCode;

	@Column(name="stage_name")
	private String stageName;

	//bi-directional many-to-one association to MapStageMovement
	@OneToMany(mappedBy="masStage")
	private List<MapStageMovement> mapStageMovements;

	//bi-directional many-to-one association to MasDeviceMaster
	@OneToMany(mappedBy="masStage")
	private List<MasDeviceMaster> masDeviceMasters;

	//bi-directional many-to-one association to MasStageMovement
	@OneToMany(mappedBy="masStage")
	private List<MasStageMovement> masStageMovements;

	public MasStage() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStageCode() {
		return this.stageCode;
	}

	public void setStageCode(String stageCode) {
		this.stageCode = stageCode;
	}

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public List<MapStageMovement> getMapStageMovements() {
		return this.mapStageMovements;
	}

	public void setMapStageMovements(List<MapStageMovement> mapStageMovements) {
		this.mapStageMovements = mapStageMovements;
	}

	public MapStageMovement addMapStageMovement(MapStageMovement mapStageMovement) {
		getMapStageMovements().add(mapStageMovement);
		mapStageMovement.setMasStage(this);

		return mapStageMovement;
	}

	public MapStageMovement removeMapStageMovement(MapStageMovement mapStageMovement) {
		getMapStageMovements().remove(mapStageMovement);
		mapStageMovement.setMasStage(null);

		return mapStageMovement;
	}

	public List<MasDeviceMaster> getMasDeviceMasters() {
		return this.masDeviceMasters;
	}

	public void setMasDeviceMasters(List<MasDeviceMaster> masDeviceMasters) {
		this.masDeviceMasters = masDeviceMasters;
	}

	public MasDeviceMaster addMasDeviceMaster(MasDeviceMaster masDeviceMaster) {
		getMasDeviceMasters().add(masDeviceMaster);
		masDeviceMaster.setMasStage(this);

		return masDeviceMaster;
	}

	public MasDeviceMaster removeMasDeviceMaster(MasDeviceMaster masDeviceMaster) {
		getMasDeviceMasters().remove(masDeviceMaster);
		masDeviceMaster.setMasStage(null);

		return masDeviceMaster;
	}

	public List<MasStageMovement> getMasStageMovements() {
		return this.masStageMovements;
	}

	public void setMasStageMovements(List<MasStageMovement> masStageMovements) {
		this.masStageMovements = masStageMovements;
	}

	public MasStageMovement addMasStageMovement(MasStageMovement masStageMovement) {
		getMasStageMovements().add(masStageMovement);
		masStageMovement.setMasStage(this);

		return masStageMovement;
	}

	public MasStageMovement removeMasStageMovement(MasStageMovement masStageMovement) {
		getMasStageMovements().remove(masStageMovement);
		masStageMovement.setMasStage(null);

		return masStageMovement;
	}

}