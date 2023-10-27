/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.revisao.controllers;

import br.com.revisao.repositories.SubjectRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 08217630160
 */

@RestController
@RequestMapping("'/subject")
public class SubjectController {
    private SubjectRepository subjectRepository;

    public SubjectController() {
    }

    public SubjectController(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public SubjectRepository getSubjectByID(Long id) {
        return null;
    }

    public void deleteSubjectByID(Long id) {
        subjectRepository.deleteByID(id);
    }
    
    
}
