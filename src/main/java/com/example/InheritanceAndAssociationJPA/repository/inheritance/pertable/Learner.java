package com.example.InheritanceAndAssociationJPA.repository.inheritance.pertable;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="Learner_table_per_class")
public class Learner extends User {
    private String university;
    private Double psp;
}
