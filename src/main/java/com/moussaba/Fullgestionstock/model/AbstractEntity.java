package com.moussaba.Fullgestionstock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;


@Data // generate getters and setters methods
@MappedSuperclass // La persistance ne se fera qu'a partir des classes filles
@EntityListeners(AuditingEntityListener.class) // Pose un ecouteur d'evenement sur la classe
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @CreatedDate // specifie un champs de Date de creation
    @Column(name = "creationDate", nullable = false)
    @JsonIgnore
    private Instant creationDate;

    @LastModifiedDate // specifie un champs de Date de Modification
    @Column(name = "lastModifiedDate")
    @JsonIgnore // Ignore le champs lors de la recuperation des données
    private Instant lastUpdateDate;
}
