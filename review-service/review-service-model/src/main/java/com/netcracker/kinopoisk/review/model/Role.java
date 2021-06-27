package com.netcracker.kinopoisk.review.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(catalog = "review", name = "roles")
public class Role {
	@Id
	private String id;
	@NotBlank
	@Size(min = 1, max = 45)
	private String role;
}
