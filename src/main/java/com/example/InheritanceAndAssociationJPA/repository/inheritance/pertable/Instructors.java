package com.example.InheritanceAndAssociationJPA.repository.inheritance.pertable;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "Instructors_table_per_class")
public class Instructors  extends User {
    Double salary;
    String skills;
}
