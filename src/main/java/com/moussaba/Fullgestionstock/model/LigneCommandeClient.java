package com.moussaba.Fullgestionstock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table
public class LigneCommandeClient extends AbstractEntity{

    @ManyToOne()
    @JoinColumn(name = "idarticle")
    private Article article;

    @ManyToOne()
    @JoinColumn(name = "idcommandeclient")
    private CommandeClient commandeClient;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;


}
