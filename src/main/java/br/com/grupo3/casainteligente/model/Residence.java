package br.com.grupo3.casainteligente.model;

import java.util.List;
import java.util.Set;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Getter
@Setter
@Builder
@Entity
public class Residence {

    @Id
    private Long id;
    private String name;
    private String address;
    private Localization localization;
    
    @OneToMany(mappedBy = "residence")
    private Set<Actuator> actuators;

}
