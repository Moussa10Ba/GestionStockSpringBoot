package com.moussaba.Fullgestionstock.dto;

import com.moussaba.Fullgestionstock.model.Article;
import com.moussaba.Fullgestionstock.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeFournisseurDto {

    private Integer id;

    private ArticleDto article;

    private CommandeFournisseurDto commandeFournisseurs;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
