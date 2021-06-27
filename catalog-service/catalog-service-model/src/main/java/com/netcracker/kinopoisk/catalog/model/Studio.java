package com.netcracker.kinopoisk.catalog.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(catalog = "catalog", name = "studios")
public class Studio {
	@Id
	private String id;
	@Size(min = 1, max = 45)
	private String name;
	@Size(min = 1, max = 45)
	private String owner;
	@Size(min = 1, max = 45)
	private String location;
}
