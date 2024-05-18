package com.example.InheritanceAndAssociationJPA.repository.inheritance.singletable;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "Instructors_single")
public class Instructors  extends User {
    Double salary;
    String skills;
}
