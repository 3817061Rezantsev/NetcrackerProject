package com.netcracker.kinopoisk.review;

import java.util.Locale;
import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ReviewServiceApplication {
	public static void main(String[] args) {
		log.info("Application is working in timezone[{}]", TimeZone.getDefault().getID());
		Locale locale = new Locale("en"); 
	    Locale.setDefault(locale);
		SpringApplication.run(ReviewServiceApplication.class, args);
	}
}
