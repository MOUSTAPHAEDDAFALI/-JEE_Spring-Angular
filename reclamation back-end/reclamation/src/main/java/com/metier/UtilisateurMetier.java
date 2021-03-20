package com.metier;

import java.util.List;

import com.entities.Utilisateur;

public interface UtilisateurMetier {
	public Utilisateur addUtilisateur(Utilisateur utilisateur);

	public Utilisateur updateUtilisateur(Utilisateur utilisateur);

	public Utilisateur findUtilisateur(Long id);

	public List<Utilisateur> findAllUtilisateur();

	public void deleteUtilisateur(Long id);
}
