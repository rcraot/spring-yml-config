package com.spring.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLogYmlApplication implements CommandLineRunner {

    private static final Logger LOGGER = LogManager.getLogger(SpringLogYmlApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringLogYmlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
    	LOGGER.info("Info level log message");
        LOGGER.debug("Debug level log message");
        LOGGER.warn("Warn level log message");
        LOGGER.error("Error level log message");
        
    }
}
