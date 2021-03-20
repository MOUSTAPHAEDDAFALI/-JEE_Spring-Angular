package com.repository;

import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
