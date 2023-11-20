package br.com.revisao.controller;

import br.com.revisao.entities.FlashcardEntity;
import br.com.revisao.repositories.FlashcardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //indica que eh um controller
@RequestMapping("flashcards")
public class FlashcardController {

    @Autowired
    FlashcardRepository flashcardRepository;
    @GetMapping
    public List<FlashcardEntity> getAll(){
        List<FlashcardEntity> flashcardList = flashcardRepository.findAll();
        return flashcardList;
    }
}