package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Utilisateur;

public interface utilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
