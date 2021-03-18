package com.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Repository.utilisateurRepository;
import com.entities.Utilisateur;
@Component
public class UtilistaeurMetierImp implements UtilisateurMetier{

	@Autowired
	private utilisateurRepository utilisateurRepositorye;
	//fonction qui permet le sauvgarde d'un Utilisateur
	@Override
	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		
		return utilisateurRepositorye.save(utilisateur);
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepositorye.save(utilisateur);
	}

	@Override
	public Object findUtilisateu(long id) {
		return utilisateurRepositorye.findById(id);
	}

	@Override
	public List<Utilisateur> findAllUtilisateur() {
		
		return utilisateurRepositorye.findAll();
	}

	@Override
	public void deleteUtilisateur(long id) {
		utilisateurRepositorye.deleteById(id);
		
	}

}
