package br.com.grupo3.casainteligente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.grupo3.casainteligente.model.Residence;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RepositoryRestResource
@EnableSwagger2
public interface ResidenceRepository extends JpaRepository<Residence, Long>{
}
