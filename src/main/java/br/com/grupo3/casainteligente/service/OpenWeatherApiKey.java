package br.com.grupo3.casainteligente.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Retains the API key 
 */
@Component
public class OpenWeatherApiKey {

    private static Logger log = LoggerFactory.getLogger(OpenWeatherApiKey.class);

    private final String key;

    /**
     * Constructor
     * @param key
     */
    public OpenWeatherApiKey(@Value("${openweathermap.api.key}") String key) {
        log.info("Using Openwaethermap API key: {}", key);
        this.key = key;
    }

    /**
     * Value of the API key
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return key;
    }

}
