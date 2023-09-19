/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.revisao.controllers;
import br.com.revisao.exceptions.ResourceNotFoundException;

import br.com.revisao.entities.Flashcard;
import br.com.revisao.repositories.FlashcardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 *
 * @author Administrador
 */

@RestController
@RequestMapping("/api/flashcards")
public class FlashcardController {

    private final FlashcardRepository flashcardRepository;

    @Autowired
    public FlashcardController(FlashcardRepository flashcardRepository) {
        this.flashcardRepository = flashcardRepository;
    }

    @GetMapping
    public List<Flashcard> getAllFlashcards() {
        return flashcardRepository.findAll();
    }

    @GetMapping("/{id}")
    public Flashcard getFlashcardById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public Flashcard createFlashcard(@RequestBody Flashcard flashcard) {
        return flashcardRepository.save(flashcard);
    }

    @PutMapping("/{id}")
    public Flashcard updateFlashcard(@PathVariable Long id, @RequestBody Flashcard flashcardDetails) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteFlashcard(@PathVariable Long id) {
        flashcardRepository.deleteById(id);
    }
}
