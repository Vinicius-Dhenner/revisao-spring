package br.com.revisao.repositories;

import br.com.revisao.entities.FlashcardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashcardRepository extends JpaRepository<FlashcardEntity, Long> {
}
