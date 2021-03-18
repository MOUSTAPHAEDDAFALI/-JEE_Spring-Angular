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
public class UtilisateurConttroler {
	@Autowired
	private UtilisateurMetier utilisateurmetieree;
	@PostMapping("/utilisateurs")
	public Utilisateur addUtilisateur(@RequestBody Utilisateur utilisateur) {
		return utilisateurmetieree.addUtilisateur(utilisateur);
	}
	@PutMapping("/utilisateurs")
	public Utilisateur updateUtilisateur(@RequestBody Utilisateur utilisateur) {
		return utilisateurmetieree.updateUtilisateur(utilisateur);
	}
	@GetMapping("/utilisateurs/{id}")
	public Object findUtilisateu(@PathVariable long id) {
		return utilisateurmetieree.findUtilisateu(id);
	}
	@GetMapping("/utilisateurs")
	public List<Utilisateur> findAllUtilisateur() {
		return utilisateurmetieree.findAllUtilisateur();
	}
	@DeleteMapping("/utilisateurs/{id}")
	public void deleteUtilisateur(@PathVariable long id) {
		utilisateurmetieree.deleteUtilisateur(id);
	}
}
