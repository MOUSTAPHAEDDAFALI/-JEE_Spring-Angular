package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Reclamation {
	@Id @GeneratedValue
 private long id;
 private String nom;
 private String description;
 @ManyToOne
 private Utilisateur utilisateur;
 public Reclamation() {
	super();
	// TODO Auto-generated constructor stub
}


	public Reclamation( String nom, String description, Utilisateur utilisateur) {
		super();
		
		this.nom = nom;
		this.description = description;
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Reclamation [id=" + id + ", nom=" + nom + ", description=" + description + "]";
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
@JsonIgnore
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
