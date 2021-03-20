package com.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Utilisateur;
import com.metier.UtilisateurMetier;

@RestController
public class UtilisateurController {
	@Autowired
	private UtilisateurMetier UtilisateurMetier;

	@PostMapping("/utilisateur")
	public Utilisateur addUtilisateur(@RequestBody Utilisateur utilisateur) {
		return UtilisateurMetier.addUtilisateur(utilisateur);
	}

	@PutMapping("/utilisateur")
	public Utilisateur updateUtilisateur(@RequestBody Utilisateur utilisateur) {
		return UtilisateurMetier.updateUtilisateur(utilisateur);
	}

	@GetMapping("/utilisateur/{id}")
	public Utilisateur findUtilisateur(@PathVariable Long id) {
		return UtilisateurMetier.findUtilisateur(id);
	}

	@GetMapping("/utilisateur")
	public List<Utilisateur> findAllUtilisateur() {
		return UtilisateurMetier.findAllUtilisateur();
	}

	@DeleteMapping("/utilisateur/{id}")
	public void deleteUtilisateur(@PathVariable Long id) {
		UtilisateurMetier.deleteUtilisateur(id);
	}

}
