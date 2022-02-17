package com.moussaba.Fullgestionstock.dto;

import com.moussaba.Fullgestionstock.model.Article;
import com.moussaba.Fullgestionstock.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDto {

    private Integer id;

    private ArticleDto article;

    private Instant dateMvt;

    private BigDecimal quantite;

    private TypeMvtStk typeMvtStk;
}
