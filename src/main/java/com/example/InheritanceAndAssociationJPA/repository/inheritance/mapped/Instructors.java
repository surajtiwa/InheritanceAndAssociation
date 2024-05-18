package com.example.InheritanceAndAssociationJPA.repository.inheritance.mapped;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "Instructors_mapped")
public class Instructors  extends User{
    Double salary;
    String skills;
}
