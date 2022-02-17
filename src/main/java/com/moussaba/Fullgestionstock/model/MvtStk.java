package com.moussaba.Fullgestionstock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table
public class MvtStk extends AbstractEntity{

    @ManyToOne()
    @JoinColumn(name = "idarticle")
    private Article article;

    @Column(name = "datemvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "typemvt")
    private TypeMvtStk typeMvtStk;

}
