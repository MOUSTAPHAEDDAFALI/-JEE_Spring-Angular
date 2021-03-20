package com.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue
	private long id;
	private String nom;
	private String prénom;
	@OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
	private List<Reclamation> reclamations;
     
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(String nom, String prénom) {
		super();
		this.nom = nom;
		this.prénom = prénom;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

	public List<Reclamation> getReclamations() {
		return reclamations;
	}

	public void setReclamations(List<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}

}
