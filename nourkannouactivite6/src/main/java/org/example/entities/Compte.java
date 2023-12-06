package org.example.entities;
// Compte.java


import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table
@Entity
// The Compte class represents a bank account entity.
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indicates that the ID should
                                                        // be generated automatically.
    @Column(name = "id") // Specify the column name in the database.
    private Long Id;

    @Column(name = "solde") // Specify the column name in the database.
    private double solde;

    @Column(name = "date_creation") // Specify the column name in the database.
    private Date dateCreation;

    @Column(name = "type_compte") // Specify the column name in the database.
    @Enumerated(EnumType.STRING) // Specify that the type is stored as a string in the database.
    private TypeCompte type;

    @Column(name = "etat_compte") // Specify the column name in the database.
    @Enumerated(EnumType.STRING) // Specify that the state is stored as a string in the database.
    private EtatCompte etat;
}