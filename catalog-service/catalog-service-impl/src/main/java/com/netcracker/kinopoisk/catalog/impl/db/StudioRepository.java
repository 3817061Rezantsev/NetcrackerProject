package com.netcracker.kinopoisk.catalog.impl.db;

import org.springframework.data.jpa.repository.JpaRepository;


import com.netcracker.kinopoisk.catalog.model.Studio;


public interface StudioRepository extends JpaRepository<Studio, String> {

}
