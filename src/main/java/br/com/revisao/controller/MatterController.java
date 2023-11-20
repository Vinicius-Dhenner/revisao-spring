package br.com.revisao.controller;

import br.com.revisao.entities.MatterEntity;
import br.com.revisao.repositories.MatterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //indica que eh um controller
@RequestMapping("matters")
public class MatterController {

    final
    MatterRepository matterRepository;

    public MatterController(MatterRepository matterRepository) {
        this.matterRepository = matterRepository;
    }

    @GetMapping
    public List<MatterEntity> getAll(){
        List<MatterEntity> matterList = matterRepository.findAll();
        return matterList;
    }
}