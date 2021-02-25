package com.netcracker.kinopoisk.catalog.impl.db;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(catalog = "catalog", name = "studios")
public class Studio {
	@Id
	private String id;
	private String name;
	private String owner;
	private String location;
}
