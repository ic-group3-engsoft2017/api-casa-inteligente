package br.com.grupo3.casainteligente.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Registry {

	@Id
	private String apiKey;
	
	public Registry() {
		apiKey = "c6e83a3f-9197-441b-9744-14b28b98118c";
	}

	public String getApiKey() {
		return apiKey;
	}

}
