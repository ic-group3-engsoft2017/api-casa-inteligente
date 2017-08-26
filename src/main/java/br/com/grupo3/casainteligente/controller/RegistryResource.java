package br.com.grupo3.casainteligente.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.grupo3.casainteligente.model.Registry;

@RestController("/registry")
public class RegistryResource {


	@RequestMapping(method = RequestMethod.GET, value = "/token")
	public String getRegistryObject() {
		return new Registry().getApiKey();
	}

}
