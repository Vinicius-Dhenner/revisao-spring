package br.com.revisao.entities;
import jakarta.persistence.*;
@Table(name = "matters")
@Entity(name = "matters")
public class MatterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}