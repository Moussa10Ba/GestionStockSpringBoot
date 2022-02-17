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
public class CommandeFournisseur extends AbstractEntity{

    @Column(name = "code")
    private String code;

    @Column(name = "datecommande")
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name = "idfournisseur")
    private Fournisseur fournisseur;
    
    @Column(name = "identreprise")
    private Integer idEntreprise;

    @OneToMany(mappedBy = "commandeFournisseurs")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
}
