package br.com.grupo3.casainteligente;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("smarthouse")
public class SmartHouseApplication {
	
	private static Logger log = LoggerFactory.getLogger(SmartHouseApplication.class);

	public static void main(String[] args) {
		log.info("Booting...");
		SpringApplication.run(SmartHouseApplication.class, args);
		log.info("Boot finished");
	}
}
