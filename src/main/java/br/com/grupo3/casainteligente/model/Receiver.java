package br.com.grupo3.casainteligente.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Builder
@Entity
public class Receiver {
    @Id
    private Long id;
    private String name;

    @OneToMany(fetch= FetchType.LAZY)
    private Set<Actuator> actuator;
}
