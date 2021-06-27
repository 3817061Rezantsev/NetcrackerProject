package com.netcracker.kinopoisk.review.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(catalog = "review", name = "users")
public class User {
	@Id
	private String id;
	@NotBlank
	@Size(min = 1, max = 45)
	private String firstName;
	@Size(min = 1, max = 45)
	private String lastName;
	@Email
	private String email;
	private String passwordHash;
	private Boolean locked;
	@ManyToOne
	@JoinColumn(name = "role")
	private Role role;
}
