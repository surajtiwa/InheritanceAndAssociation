package com.example.InheritanceAndAssociationJPA.repository.inheritance.mapped;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="Learner_mapped")
public class Learner extends  User{
    private String university;
    private Double psp;
}
