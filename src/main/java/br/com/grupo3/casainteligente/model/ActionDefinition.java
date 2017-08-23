package br.com.grupo3.casainteligente.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
public class ActionDefinition {
    @Id
    private Long id;

    private String action;

}
