package com.example.InheritanceAndAssociationJPA.repository.association.onetomany;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

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
