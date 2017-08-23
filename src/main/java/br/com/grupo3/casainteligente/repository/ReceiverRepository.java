package br.com.grupo3.casainteligente.repository;

import br.com.grupo3.casainteligente.model.Receiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by lpegoraro on 22/08/17.
 */
@EnableSwagger2
@RepositoryRestResource
public interface ReceiverRepository extends JpaRepository<Receiver, Long> {


}
