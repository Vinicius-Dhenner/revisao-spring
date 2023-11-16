package br.com.revisao.repositories;

import br.com.revisao.entities.MatterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatterRepository extends JpaRepository<MatterEntity, Long> {
}
