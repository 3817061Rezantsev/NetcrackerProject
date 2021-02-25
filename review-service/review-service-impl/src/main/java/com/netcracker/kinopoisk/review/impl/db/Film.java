package com.netcracker.kinopoisk.review.impl.db;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(catalog = "review", name = "films")
public class Film {
	@Id
	private String id;
	private String third_party_id;
}
