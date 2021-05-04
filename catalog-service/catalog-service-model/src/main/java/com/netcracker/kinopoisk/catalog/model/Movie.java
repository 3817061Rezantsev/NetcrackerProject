package com.netcracker.kinopoisk.catalog.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.Session;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(catalog = "catalog", name = "movies")
public class Movie {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	@Lob
	@Column(name = "movie")
	private Blob movie;
	
	@Column(name = "film_id")
	private String filmId;
	
	@PersistenceContext
	@Transient
	private EntityManager entityManager;

	public Session getSession() {
	Session session = entityManager.unwrap(Session.class);
	return session;
	}

	public void saveFile(File file) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(file);
		movie = getSession().getLobHelper().createBlob(fis, file.length());
	}

	public InputStream getFile() throws SQLException {
		InputStream is = movie.getBinaryStream();
		return is;
	}
	
}
