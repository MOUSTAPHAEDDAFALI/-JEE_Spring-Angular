package REC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_CPTE",
discriminatorType=DiscriminatorType.STRING,length=2)
public class reclamation implements Serializable{
	@Id @GeneratedValue
        private String module;
	private int note;
	private long code_apoger;
	private Date datecreation;
	private String semetre;
	@ManyToOne
	@JoinColumn(name="CODE_CLI")
	private etudiant etudiant;
	@OneToMany(mappedBy="etudiant")
	public long getcodeapoger() {
		return code_apoger;
	}
	public void setCodeapoger(long code_apoger) {
		this.code_apoger = code_apoger;
	}
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	public etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public String getSemetre() {
		return semetre;
	}
	public void setSemetre(String semetre) {
		this.semetre = semetre;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public reclamation(String codepoger, Date datecreation, REC.etudiant etudiant, String semetre, String module,
			int note) {
		super();
		this.code_apoger = code_apoger;
		this.datecreation = datecreation;
		this.etudiant = etudiant;
		this.semetre = semetre;
		this.module = module;
		this.note = note;
	}
	
	public reclamation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
