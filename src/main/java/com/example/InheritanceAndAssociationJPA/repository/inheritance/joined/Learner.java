package com.example.InheritanceAndAssociationJPA.repository.inheritance.joined;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="Learner_joined")
public class Learner extends User {
    private String university;
    private Double psp;
}
