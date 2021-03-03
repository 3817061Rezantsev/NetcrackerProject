package com.netcracker.kinopoisk.catalog.impl.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netcracker.kinopoisk.catalog.model.Person;

public interface PeopleRepository extends JpaRepository<Person, String> {

}
