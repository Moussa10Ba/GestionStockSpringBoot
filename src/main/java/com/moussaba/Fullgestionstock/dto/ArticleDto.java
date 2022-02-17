package com.moussaba.Fullgestionstock.dto;
import com.moussaba.Fullgestionstock.model.Article;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {

    private Integer id;

    private String codeArticle;

    private String designation;

    private BigDecimal prixunitaireht;

    private BigDecimal tauxTva;

    private BigDecimal prixunitaireTtc;

    private String photo;

    private Integer idEntreprise;

    private CategorieDto categorie;

    public  static Article toEntity(ArticleDto articleDto){
        if (articleDto == null){
            return null;
        }
        Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setPrixunitaireht(articleDto.getPrixunitaireht());
        article.setTauxTva(articleDto.getTauxTva());
        article.setPhoto(articleDto.getPhoto());
        article.setIdEntreprise(articleDto.getIdEntreprise());
        article.setCategorie(CategorieDto.toEntity(articleDto.getCategorie()));
        return article;
    }

    public static ArticleDto fromEntity(Article article){
        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixunitaireht(article.getPrixunitaireht())
                .prixunitaireTtc(article.getPrixunitaireTtc())
                .photo(article.getPhoto())
                .idEntreprise(article.getIdEntreprise())
                .tauxTva(article.getTauxTva())
                .categorie(CategorieDto.fromEntity(article.getCategorie()))
                .build();
    }
}
