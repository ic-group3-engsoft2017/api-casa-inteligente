package br.com.grupo3.casainteligente.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
public class Actuator {

    @Id
    private Long id;
    private String name;

    @ManyToOne(fetch=FetchType.LAZY)
    private Residence residence;
}
