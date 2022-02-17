package com.moussaba.Fullgestionstock.dto;
import com.moussaba.Fullgestionstock.model.Client;
import com.moussaba.Fullgestionstock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;


@Builder
@Data
public class CommandeClientDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private Integer idEntreprise;

    private ClientDto client;

    private List<LigneCommandeClientDto> ligneCommandeClients;


    public static CommandeClientDto fromEntity(CommandeClient commandeClient) {

        if (commandeClient == null) {
            return null;
        }
        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .dateCommande(commandeClient.getDateCommande())
                .client(ClientDto.fromEntity(commandeClient.getClient()))
                .idEntreprise(commandeClient.getIdEntreprise())
                .build();

    }

    public static CommandeClient toEntity(CommandeClientDto commandeClientDto){
        if (commandeClientDto == null){
            return null;
        }
        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setDateCommande(commandeClientDto.getDateCommande());
        commandeClient.setCode(commandeClientDto.getCode());
        commandeClient.setIdEntreprise(commandeClientDto.getIdEntreprise());
        commandeClient.setCode(commandeClient.getCode());
        commandeClient.setClient(ClientDto.toEntity(commandeClientDto.getClient()));
        return commandeClient;
    }
}