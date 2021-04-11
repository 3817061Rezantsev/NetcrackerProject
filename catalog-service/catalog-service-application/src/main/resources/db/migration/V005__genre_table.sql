ALTER TABLE films ADD COLUMN genres_id varchar(36) DEFAULT NULL;
ALTER TABLE films ADD INDEX `films__genres_id_index` (`genres_id`);

CREATE TABLE `genres` (
	`id` varchar(36) NOT NULL,
	`genre_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `film_genres` (
	`film_genre_id` varchar(36) NOT NULL,
	`genre_id` varchar(36) NOT NULL,
	CONSTRAINT `film_genres__film_key` FOREIGN KEY (`film_genre_id`) REFERENCES `films` (`id`),
	CONSTRAINT `film_genres__genre_key` FOREIGN KEY (`genre_id`) REFERENCES `genres` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

