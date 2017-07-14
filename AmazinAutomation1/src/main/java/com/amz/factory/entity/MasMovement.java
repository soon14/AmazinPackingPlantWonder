package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_movement database table.
 * 
 */
@Entity
@Table(name="mas_movement")
@NamedQuery(name="MasMovement.findAll", query="SELECT m FROM MasMovement m")
public class MasMovement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="`Movement Description`")
	private String movement_Description;

	@Column(name="movement_code")
	private String movementCode;

	//bi-directional many-to-one association to MapStageMovement
	@OneToMany(mappedBy="masMovement")
	private List<MapStageMovement> mapStageMovements;

	//bi-directional many-to-one association to MasStageMovement
	@OneToMany(mappedBy="masMovement")
	private List<MasStageMovement> masStageMovements;

	public MasMovement() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovement_Description() {
		return this.movement_Description;
	}

	public void setMovement_Description(String movement_Description) {
		this.movement_Description = movement_Description;
	}

	public String getMovementCode() {
		return this.movementCode;
	}

	public void setMovementCode(String movementCode) {
		this.movementCode = movementCode;
	}

	public List<MapStageMovement> getMapStageMovements() {
		return this.mapStageMovements;
	}

	public void setMapStageMovements(List<MapStageMovement> mapStageMovements) {
		this.mapStageMovements = mapStageMovements;
	}

	public MapStageMovement addMapStageMovement(MapStageMovement mapStageMovement) {
		getMapStageMovements().add(mapStageMovement);
		mapStageMovement.setMasMovement(this);

		return mapStageMovement;
	}

	public MapStageMovement removeMapStageMovement(MapStageMovement mapStageMovement) {
		getMapStageMovements().remove(mapStageMovement);
		mapStageMovement.setMasMovement(null);

		return mapStageMovement;
	}

	public List<MasStageMovement> getMasStageMovements() {
		return this.masStageMovements;
	}

	public void setMasStageMovements(List<MasStageMovement> masStageMovements) {
		this.masStageMovements = masStageMovements;
	}

	public MasStageMovement addMasStageMovement(MasStageMovement masStageMovement) {
		getMasStageMovements().add(masStageMovement);
		masStageMovement.setMasMovement(this);

		return masStageMovement;
	}

	public MasStageMovement removeMasStageMovement(MasStageMovement masStageMovement) {
		getMasStageMovements().remove(masStageMovement);
		masStageMovement.setMasMovement(null);

		return masStageMovement;
	}

}