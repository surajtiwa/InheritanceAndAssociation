package com.example.InheritanceAndAssociationJPA.repository.association.onetomany;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Batch {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer strength;
    @ManyToOne
    Instructors instructor;
}
