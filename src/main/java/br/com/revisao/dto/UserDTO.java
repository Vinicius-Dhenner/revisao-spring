/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.revisao.dto;

import java.io.Serializable;

/**
 *
 * @author Administrador
 */
public class UserDto implements Serializable{
    private Long id;
    private String name;
    private String email;
    private String passoword;

    public UserDto() {
    }

    public UserDto(Long id, String name, String email, String passoword) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passoword = passoword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassoword() {
        return passoword;
    }

    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }
    
    
}
