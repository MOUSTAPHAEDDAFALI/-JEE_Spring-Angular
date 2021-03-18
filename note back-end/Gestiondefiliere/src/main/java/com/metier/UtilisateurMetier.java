package com.metier;

import java.util.List;

import com.entities.Utilisateur;

public interface UtilisateurMetier {

	public Utilisateur addUtilisateur(Utilisateur utilisateur);

	public Utilisateur updateUtilisateur(Utilisateur utilisateur);

	public Object findUtilisateu(long id);

	public List<Utilisateur> findAllUtilisateur();

	public void deleteUtilisateur(long id);

}
