package com.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entities.Utilisateur;
import com.repository.UtilisateurRepository;
@Component
public class UtilisateurMetierImp implements UtilisateurMetier{
    @Autowired
    private UtilisateurRepository utilisateurRepository;
	//fonction qui permet l'ajouter d'un utilisateur 
    @Override
	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		
		return utilisateurRepository.save(utilisateur);
	}
  //fonction qui permet modifier un utilisateur
	@Override
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
		
		return utilisateurRepository.save(utilisateur);
	}
	//fonction qui permet rechercher  d'un utilisateur
	@Override
	public Utilisateur findUtilisateur(Long id) {
		
		return utilisateurRepository.getOne(id);
	}
	//fonction qui permet recherche list les utilisateur
	@Override
	public List<Utilisateur> findAllUtilisateur() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
	}
	//fonction qui permet suppression d'un utilisateur
	@Override
	public void deleteUtilisateur(Long id) {
		// TODO Auto-generated method stub
		utilisateurRepository.deleteById(id);;
	}

}
