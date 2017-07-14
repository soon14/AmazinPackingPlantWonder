package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the adm_super database table.
 * 
 */
@Entity
@Table(name="adm_super")
@NamedQuery(name="AdmSuper.findAll", query="SELECT a FROM AdmSuper a")
public class AdmSuper implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String password;

	@Column(name="user_name")
	private String userName;

	public AdmSuper() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}