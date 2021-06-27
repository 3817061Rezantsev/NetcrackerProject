package com.netcracker.kinopoisk.review.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.PositiveOrZero;

import lombok.Data;

@Entity
@Data
@Table(catalog = "review", name = "reviews")
public class Review {
	@Id
	private String id;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	@ManyToOne
	@JoinColumn(name = "film_id")
	private Film film;
	private String text;
	private String status;
	@PositiveOrZero
	private Integer likes;
	@PositiveOrZero
	private Integer dislikes;
}
