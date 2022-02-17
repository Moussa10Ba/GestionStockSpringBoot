package com.moussaba.Fullgestionstock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.moussaba.Fullgestionstock.model.Article;
import com.moussaba.Fullgestionstock.model.Categorie;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Builder
@Data
public class CategorieDto {

    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore
    private List<ArticleDto> articles;

    public static CategorieDto fromEntity(Categorie categorie){
        if (categorie == null){
            System.out.println("NO Categorie Found");
        }
      return   CategorieDto.builder()
                .id(categorie.getId())
                .code(categorie.getCode())
                .designation(categorie.getDesignation())
                .build();

    }

    public static Categorie toEntity(CategorieDto categorieDto){
        if (categorieDto == null){
            return null;
        }
       Categorie categorie = new Categorie();
        categorie.setId(categorieDto.getId());
        categorie.setCode(categorie.getCode());
        categorie.setDesignation(categorieDto.getDesignation());
        return categorie;

    }


}
