package com.netcracker.kinopoisk.review.impl.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netcracker.kinopoisk.review.model.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
