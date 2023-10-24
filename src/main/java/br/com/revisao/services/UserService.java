/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.revisao.services;

import br.com.revisao.repositories.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Administrador
 */


@Service
public class UserService {
    private final UserRepository userRepository;
    
    @Autowired
    private UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    private Optional getUserById(Long id) {
        return userRepository.findById(id);
    }
}
