package com.moussaba.Fullgestionstock.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table
public class Utilisateur extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "datenaissance")
    private Instant dateNaissance;

    @Column(name = "email")
    private String email;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;


    @Column(name = "motDePasse")
    private String motDePasse;

    @ManyToOne
    @JoinColumn(name = "identreprise")
    private Entreprise entreprise;

    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles;
}
