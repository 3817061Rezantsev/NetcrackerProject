package com.netcracker.kinopoisk.catalog;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class CatalogServiceApplication {
	public static void main(String[] args) {
		log.info("Application is working in timezone[{}]", TimeZone.getDefault().getID());
		SpringApplication.run(CatalogServiceApplication.class, args);
	}
}
