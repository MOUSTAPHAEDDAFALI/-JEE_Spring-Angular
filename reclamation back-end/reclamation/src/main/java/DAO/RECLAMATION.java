package DAO;

import java.util.List;

import REC.reclamation;

public interface RECLAMATION {
	
	public void Ajouter_rec(reclamation rec) ;
	
	public void Suprremier_rec(reclamation rec);
	
	public void modifier_rec(long rec);
	
	
	public List<reclamation> gettoutReclamation();

	public reclamation getreclamatioin(long codeapoger);

}
