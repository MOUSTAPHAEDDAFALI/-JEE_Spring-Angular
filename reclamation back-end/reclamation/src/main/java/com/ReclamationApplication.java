package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entities.Reclamation;
import com.entities.Utilisateur;
import com.metier.ReclamationMetier;
import com.metier.UtilisateurMetier;

@SpringBootApplication
public class ReclamationApplication implements CommandLineRunner{
	@Autowired
	private UtilisateurMetier utilisaturMetier;
	@Autowired
	private ReclamationMetier reclamatonMetier;
	public static void main(String[] args) {
		SpringApplication.run(ReclamationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Utilisateur u=new Utilisateur();
		u.setNom("toto");
		u.setPrénom("namir");
		utilisaturMetier.addUtilisateur(u);
		
		//Reclamation r=new Reclamation();
		//r.setNom("corection");
		//r.setDescription("la somme de note");
		Reclamation r=new Reclamation("fmohamed","lhow",u);
		reclamatonMetier.updateReclamation(r);
		utilisaturMetier.findAllUtilisateur().forEach(utilisateur->{System.out.println(utilisateur.getNom());});
	}

}
