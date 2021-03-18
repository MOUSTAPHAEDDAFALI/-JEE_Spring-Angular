package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entities.Note;
import com.entities.Utilisateur;
import com.metier.NotesMetier;
import com.metier.UtilisateurMetier;

@SpringBootApplication
public class GestiondefiliereApplication implements CommandLineRunner{

	@Autowired
	private UtilisateurMetier utilisateurMetier;
	
	@Autowired
	private NotesMetier noteMetier;
	
	public static void main(String[] args) {
		SpringApplication.run(GestiondefiliereApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Utilisateur u = new Utilisateur();	
		u.setNom("Momo");
		u.setPrenom("Chakibe");
		
		utilisateurMetier.addUtilisateur(u);
		
		Note e=new Note();
		e.setNom("Momo");
		e.setCode_apoge("19552001");
		e.setCne("1513366847");
		noteMetier.addNote(e);
		
		utilisateurMetier.findAllUtilisateur().forEach(utilisateur->System.out.println(utilisateur.getNom()));
	}

}
