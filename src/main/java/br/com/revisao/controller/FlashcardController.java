package br.com.revisao.controller;

import br.com.revisao.entities.FlashcardEntity;
import br.com.revisao.repositories.FlashcardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController //indica que eh um controller
@RequestMapping("flashcards")
public class FlashcardController {

    @Autowired
    FlashcardRepository flashcardRepository;

    @GetMapping
    public List<FlashcardEntity> getAll() {
        List<FlashcardEntity> flashcardList = flashcardRepository.findAll();
        return flashcardList;
    }

    @GetMapping("/{id}")
    public ResponseEntity<FlashcardEntity> getById(@PathVariable Long id) {
        Optional<FlashcardEntity> flashcardOptional = flashcardRepository.findById(id);

        return flashcardOptional.map(flashcard -> new ResponseEntity<>(flashcard, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
