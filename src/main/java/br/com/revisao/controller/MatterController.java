package br.com.revisao.controller;

import br.com.revisao.entities.FlashcardEntity;
import br.com.revisao.entities.MatterEntity;
import br.com.revisao.repositories.FlashcardRepository;
import br.com.revisao.repositories.MatterRepository;
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
@RequestMapping("matters")
public class MatterController {

    final MatterRepository matterRepository;
    final FlashcardRepository flashcardRepository;

    public MatterController(MatterRepository matterRepository, FlashcardRepository flashcardRepository) {
        this.matterRepository = matterRepository;
        this.flashcardRepository = flashcardRepository;
    }

    @GetMapping
    public List<MatterEntity> getAll() {
        List<MatterEntity> matterList = matterRepository.findAll();
        return matterList;
    }

    @GetMapping("/{matterId}/flashcards")
    public ResponseEntity<List<FlashcardEntity>> getFlashcardsByMatterId(@PathVariable Long matterId) {
        Optional<MatterEntity> matterOptional = matterRepository.findById(matterId);

        if (matterOptional.isPresent()) {
            MatterEntity matter = matterOptional.get();
            List<FlashcardEntity> flashcards = flashcardRepository.findByMatterEntity(matter);

            return new ResponseEntity<>(flashcards, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

