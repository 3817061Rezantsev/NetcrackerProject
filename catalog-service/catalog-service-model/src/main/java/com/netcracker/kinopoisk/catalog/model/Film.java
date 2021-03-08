package com.netcracker.kinopoisk.catalog.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(catalog = "catalog", name = "films")
public class Film {
	@Id
	private String id;
	private String name;
	@ManyToMany
	@JoinTable(name = "film_actors", joinColumns = @JoinColumn(name = "film_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "id"))
	private List<Person> actors;
	@ManyToOne
	@JoinColumn(name = "producer_id")
	private Person producer;
	@ManyToOne
	@JoinColumn(name = "studio_id")
	private Studio studio;
	private Integer score;
	private Integer views;
}