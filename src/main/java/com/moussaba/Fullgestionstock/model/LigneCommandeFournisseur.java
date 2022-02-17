package com.moussaba.Fullgestionstock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table
public class LigneCommandeFournisseur extends AbstractEntity{

    @ManyToOne()
    @JoinColumn(name = "idarticle")
    private Article article;

    @ManyToOne()
    @JoinColumn(name = "idcommandefournisseurs")
    private CommandeFournisseur commandeFournisseurs;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;
}
