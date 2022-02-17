package com.moussaba.Fullgestionstock.dto;

import com.moussaba.Fullgestionstock.model.Adresse;
import com.moussaba.Fullgestionstock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private String description;

    private AdresseDto adresse;

    private String codeFiscal;

    private String photo;

    private String email;

    private String numTel;

    private String siteWeb;

    private List<UtilisateurDto> utilisateurs;
}
