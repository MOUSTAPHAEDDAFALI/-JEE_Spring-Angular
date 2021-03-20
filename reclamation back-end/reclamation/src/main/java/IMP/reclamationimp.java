package IMP;

import java.util.ArrayList;
import java.util.List;

import DAO.RECLAMATION;
import REC.reclamation;

public class reclamationimp implements RECLAMATION  {
	
	ArrayList<reclamation> reclamations=new ArrayList<>();

	@Override
	public void Ajouter_rec(reclamation rec) {
		
		reclamations.add(rec);
		 
	 }
		
	@Override
	public void Suprremier_rec(reclamation rec) {
		// TODO Auto-generated method stub
		
		reclamations.remove(rec);

	}

	@Override
	public void modifier_rec(long  code_apoger) {
		// TODO Auto-generated method stub

       for(int i=0;i<reclamations.size();i++) {
			
			if(reclamations.get(i).getcodeapoger() ==code_apoger ) {
				
				
				reclamations.remove(reclamations);
		     
				reclamations.add(reclamations.get(i));
			
	       }   
		} 
       }

	@Override
	public reclamation getreclamatioin(long code_apoger) {
		// TODO Auto-generated method stub
		for(int i=0;i<reclamations.size();i++) {
			
			if(reclamations.get(i).getcodeapoger()==code_apoger)
		      return reclamations.get(i);
			
			}
		return null;
	}

	@Override
	public List<reclamation> gettoutReclamation() {
		// TODO Auto-generated method stub
		return  reclamations;
	}

}
