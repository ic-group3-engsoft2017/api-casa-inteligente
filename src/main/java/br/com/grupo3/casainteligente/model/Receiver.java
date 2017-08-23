package br.com.grupo3.casainteligente.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Set;

@Getter
@Setter
@Builder
@Entity
public class Receiver {
    @Id
    private Long id;
    private String name;

    @ManyToOne(fetch= FetchType.LAZY)
    private Set<Actuator> actuator;
}
