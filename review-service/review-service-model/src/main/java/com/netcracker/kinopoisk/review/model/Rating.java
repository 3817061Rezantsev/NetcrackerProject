package com.netcracker.kinopoisk.review.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(catalog = "review", name = "ratings")
public class Rating {
	@Id
	private String id;
	@ManyToOne
	@JoinColumn(name = "film_id")
	private Film filmId;
	private String score;
}
