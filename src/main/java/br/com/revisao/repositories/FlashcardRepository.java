package br.com.revisao.repositories;

import br.com.revisao.entities.FlashcardEntity;
import br.com.revisao.entities.MatterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlashcardRepository extends JpaRepository<FlashcardEntity, Long> {
    List<FlashcardEntity> findByMatterEntity(MatterEntity matter);
}
