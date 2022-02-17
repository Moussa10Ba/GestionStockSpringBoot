package com.moussaba.Fullgestionstock.dto;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;


@Data
@Builder
public class UtilisateurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private Instant dateNaissance;

    private String email;

    private AdresseDto adresse;

    private String photo;

    private String motDePasse;

    private EntrepriseDto entreprise;

    private List<RolesDto> roles;
}
