package com.example.InheritanceAndAssociationJPA.repository.inheritance.mapped;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

/*
Mapped Super class is used when we do not need the mapped entity to be created as a separate table instead it is use
instead we create child class with additional attributes of parent class
 */

@Data
@MappedSuperclass
public class User {
    @Id
    @GeneratedValue
    UUID id;
    String name;
    @Column(unique = true)
    String email;
}
