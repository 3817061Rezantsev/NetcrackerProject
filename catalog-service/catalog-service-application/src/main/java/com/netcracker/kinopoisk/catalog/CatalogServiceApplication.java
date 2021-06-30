package com.netcracker.kinopoisk.catalog;

import java.util.Locale;
import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@EnableScheduling
public class CatalogServiceApplication {
	public static void main(String[] args) {
		log.info("Application is working in timezone[{}]", TimeZone.getDefault().getID());
		Locale locale = new Locale("en"); 
	    Locale.setDefault(locale);
		SpringApplication.run(CatalogServiceApplication.class, args);
		
	}
}
