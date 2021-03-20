package com.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entities.Reclamation;
import com.repository.ReclamationRepository;
@Component
public class ReclamationMetierImp implements ReclamationMetier{
    @Autowired
    private ReclamationRepository reclamationRepository;
	@Override
	public Reclamation addReclamation(Reclamation reclamation) {
		
		return reclamationRepository.save(reclamation);
	}

	@Override
	public Reclamation updateReclamation(Reclamation reclamation) {
		
		return reclamationRepository.save(reclamation);
	}

	@Override
	public Reclamation findReclamation(Long id) {
		
		return reclamationRepository.getOne(id);
	}

	@Override
	public List<Reclamation> findAllReclamation() {
		
		return reclamationRepository.findAll();
	}

	@Override
	public void deleteReclamation(Long id) {
		reclamationRepository.deleteById(id);;

		
	}

}
