 package com.metier;

import java.util.List;

import com.entities.Reclamation;
import com.entities.Utilisateur;

public interface ReclamationMetier {
	public Reclamation addReclamation(Reclamation reclamation);

	public Reclamation updateReclamation(Reclamation reclamation);

	public Reclamation findReclamation(Long id);

	public List<Reclamation> findAllReclamation();

	public void deleteReclamation(Long id);
}
