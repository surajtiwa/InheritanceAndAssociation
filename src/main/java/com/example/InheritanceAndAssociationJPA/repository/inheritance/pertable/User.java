package com.example.InheritanceAndAssociationJPA.repository.inheritance.pertable;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;


/*
A seprate table are created for each of child and parent class without any relation between them
 */
@Data
@Entity(name="user_table_per_class")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
    @GeneratedValue
    UUID id;
    String name;
    @Column(unique = true)
    String email;
}
