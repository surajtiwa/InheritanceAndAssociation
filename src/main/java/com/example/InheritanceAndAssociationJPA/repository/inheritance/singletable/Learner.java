package com.example.InheritanceAndAssociationJPA.repository.inheritance.singletable;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="Learner_single")
public class Learner extends User {
    private String university;
    private Double psp;
}
