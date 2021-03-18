package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity

public class Note {

	public Note(String code_apoge, String nom, String prenom, String resultat, String cne) {
		super();
		this.code_apoge = code_apoge;
		this.nom = nom;
		this.prenom = prenom;
		this.resultat = resultat;
		this.cne = cne;
		
		
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	@ManyToOne
	private Utilisateur utilisateur;
	
	
	
	public Note() {
		
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCode_apoge() {
		return code_apoge;
	}

	@Override
	public String toString() {
		return "Note [code_apoge=" + code_apoge + ", nom=" + nom + ", prenom=" + prenom + ", resultat=" + resultat
				+ ", cne=" + cne + "]";
	}

	public void setCode_apoge(String code_apoge) {
		this.code_apoge = code_apoge;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}
	@Id
	@GeneratedValue
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String code_apoge;
	private String nom;
	private String prenom;
	private String resultat;
	private String cne;

}
