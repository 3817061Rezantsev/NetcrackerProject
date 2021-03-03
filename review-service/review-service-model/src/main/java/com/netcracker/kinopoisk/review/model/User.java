package com.netcracker.kinopoisk.review.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(catalog = "review", name = "users")
public class User {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String passwordHash;
	private Boolean locked;
	@ManyToOne
	@JoinColumn(name = "role")
	private Role role;
}
