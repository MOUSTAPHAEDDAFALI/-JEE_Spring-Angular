package REC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class etudiant extends user implements Serializable{
	@Id @GeneratedValue
	private long code_apoger;
	private String nom;
	private String prenom;
	private long cne;
	private long cni;
	private String email;
	@OneToMany(mappedBy="etudiant",fetch=FetchType.LAZY)
	private Collection<reclamation> reclamation;
	public etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public etudiant(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	public long getCode_apoger() {
		return code_apoger;
	}
	public void setCode_apoger(long code_apoger) {
		this.code_apoger = code_apoger;
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
	public long getCne() {
		return cne;
	}
	public void setCne(long cne) {
		this.cne = cne;
	}
	public long getCni() {
		return cni;
	}
	public void setCni(long cni) {
		this.cni = cni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Collection<reclamation> getReclamation() {
		return reclamation;
	}
	public void setReclamation(Collection<reclamation> reclamation) {
		this.reclamation = reclamation;
	}

}
