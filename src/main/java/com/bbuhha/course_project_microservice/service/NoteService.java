package com.bbuhha.course_project_microservice.service;

import com.bbuhha.course_project_microservice.model.Note;

import java.util.List;

public interface NoteService {
    public void save(Note note);
    public void update(Long ownerId,Long noteId, Note note);
    public List<Note> findAll(Long ownerId);
    public Note findNoteByOwnerIdAndId(Long ownerId, Long noteId);
    public void deleteNoteByOwnerIdAndId(Long ownerId, Long noteId);
}
