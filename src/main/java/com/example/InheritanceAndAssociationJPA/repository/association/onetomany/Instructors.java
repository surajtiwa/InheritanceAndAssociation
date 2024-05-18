package com.example.InheritanceAndAssociationJPA.repository.association.onetomany;


import com.example.InheritanceAndAssociationJPA.repository.inheritance.joined.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
/*
one-to-many association if only annotation is used it create a separate mapping table
we need to use mappedBy attribute
 */
@Data
@Entity(name = "Instructors_association")
public class Instructors extends User {
    Double salary;
    String skills;
    @OneToMany(mappedBy = "instructor" ,cascade= CascadeType.DETACH)
    List<Batch> batches;
}
