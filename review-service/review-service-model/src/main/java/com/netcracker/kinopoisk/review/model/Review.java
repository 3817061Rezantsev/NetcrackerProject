package com.netcracker.kinopoisk.review.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	private Integer likes;
	private Integer dislikes;
}
