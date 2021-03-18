package com.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Repository.NotesRepository;
import com.entities.Note;
@Component
public class NotesMetierImpl implements NotesMetier {
	@Autowired
	private NotesRepository NotesRepositorye;
	@Override
	public Note addNote(Note note) {

		return NotesRepositorye.save(note);
	}

}
