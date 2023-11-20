package br.com.revisao.entities;

import jakarta.persistence.*;

import java.util.Date;

@Table(name = "flashcards")
@Entity(name = "flashcards")
public class FlashcardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String front;
    private String back;

    @ManyToOne
    @JoinColumn(name = "id_matter", nullable = false)
    private MatterEntity matterEntity;

    private Date dateshow;
    private Integer daysshow;

    public Integer getDaysshow() {
        return daysshow;
    }

    public void setDaysshow(Integer daysshow) {
        this.daysshow = daysshow;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public MatterEntity getMatterEntity() {
        return matterEntity;
    }

    public void setMatterEntity(MatterEntity matterEntity) {
        this.matterEntity = matterEntity;
    }

    public Date getDateshow() {
        return dateshow;
    }

    public void setDateshow(Date datashow) {
        this.dateshow = datashow;
    }

    // Outros getters e setters

}
