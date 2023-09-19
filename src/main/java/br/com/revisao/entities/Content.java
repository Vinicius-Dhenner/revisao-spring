/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.revisao.entities;

import java.util.Objects;

/**
 *
 * @author 08217630160
 */
public class Content extends Subject{
    private Subject parentSubject;

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
