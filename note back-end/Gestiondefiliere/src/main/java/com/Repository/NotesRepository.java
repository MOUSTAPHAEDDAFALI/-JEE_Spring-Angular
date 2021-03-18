package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Note;

public interface NotesRepository extends JpaRepository<Note, Long> {

}
