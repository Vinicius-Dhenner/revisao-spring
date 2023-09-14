/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.revisao.repositories;

import br.com.revisao.entities.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 08217630160
 */
public interface FlashcardRepository extends JpaRepository<Flashcard, Long>{
    
}
