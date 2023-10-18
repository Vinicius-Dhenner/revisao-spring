/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.revisao.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 08217630160
 */
@Entity
@Table (name = "flashcards")
public class Flashcard implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String front;
    private String back;
    private Integer term;

public Flashcard(Long id, String front, String back, Integer term) {
    this.id = id;
    this.front = front;
    this.back = back;
    this.term = term;
}

    public Flashcard() {
    }



@Override
public int hashCode() {
    int hash = 3;
    hash = 89 * hash + Objects.hashCode(this.id);
    hash = 89 * hash + Objects.hashCode(this.front);
    hash = 89 * hash + Objects.hashCode(this.back);
    hash = 89 * hash + Objects.hashCode(this.term);
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
    final Flashcard other = (Flashcard) obj;
    return Objects.equals(this.id, other.id);
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getFront() {
    return front;
}

public void setFront(String front) {
    this.front = front;
}

public String getBack() {
    return back;
}

public void setBack(String back) {
    this.back = back;
}

public Integer getTerm() {
    return term;
}

public void setTerm(Integer term) {
    this.term = term;
}
}
