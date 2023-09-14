/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.revisao.entities;

import javax.persistence.Table;

/**
 *
 * @author 08217630160
 */

@Table (name = "flashcard")
public class Flashcard {
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
