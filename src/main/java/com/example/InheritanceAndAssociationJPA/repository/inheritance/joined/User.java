package com.example.InheritanceAndAssociationJPA.repository.inheritance.joined;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity(name="user_joined")//will not create new table for this it is abstract class
@Inheritance(strategy = InheritanceType.JOINED )
public class User {
    @Id
    @GeneratedValue
    UUID id;
    String name;
    @Column(unique = true)
    String email;
}
/*
Joined is used to create a one to one mapping with child
class having foreign key associated with it.It is expensive as to fetch every instructor or
learner we need a join

 */