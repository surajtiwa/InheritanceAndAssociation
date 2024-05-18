package com.example.InheritanceAndAssociationJPA.repository.inheritance.joined;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "Instructors_joined")
public class Instructors  extends User {
    Double salary;
    String skills;
}
