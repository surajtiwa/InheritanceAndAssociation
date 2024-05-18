package com.example.InheritanceAndAssociationJPA.repository.inheritance.singletable;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;
/*
A single table is created with all the attributes of parent child class and an extra key is created to query with in
case of different child
 */
@Data
@Entity(name="user_single")//will not create new table for this it is abstract class
public class User {
    @Id
    @GeneratedValue
    UUID id;
    String name;
    @Column(unique = true)
    String email;
}
