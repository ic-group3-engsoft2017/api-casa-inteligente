package br.com.grupo3.casainteligente;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

@SpringBootApplication
@ComponentScan("smarthouse")
public class SmartHouseApplication {
	
	private static Logger log = LoggerFactory.getLogger(SmartHouseApplication.class);

	public static void main(String[] args) {
		
		log.info("Booting...");
		SpringApplication.run(SmartHouseApplication.class, args);
	}
}
