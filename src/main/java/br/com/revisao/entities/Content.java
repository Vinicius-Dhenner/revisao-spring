/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.revisao.entities;

import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author 08217630160
 */
@Entity
@Table(name="contets")
public class Content extends Subject {
    
    @OneToOne
    private Subject parentSubject;
    
    @OneToMany
    private List<Flashcard> flashcards;

    @Override
    public List<Flashcard> getFlashcards() {
        return flashcards;
    }

    @Override
    public void addFlashcard(Flashcard flashcard) {
        flashcards.add(flashcard);
    }
    
    @Override
    public void removeFlashcard(Flashcard flashcard) {
        flashcards.remove(flashcard);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.parentSubject);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Content other = (Content) obj;
        return Objects.equals(this.parentSubject, other.parentSubject);
    }

    public Subject getParentSubject() {
        return parentSubject;
    }

    public void setParentSubject(Subject parentSubject) {
        this.parentSubject = parentSubject;
    }
    
    
    
}
