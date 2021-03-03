package com.netcracker.kinopoisk.catalog.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(catalog = "catalog", name = "people")
public class Person {
	@Id
	private String id;
	private String firstName;
	private String lastName;
}
