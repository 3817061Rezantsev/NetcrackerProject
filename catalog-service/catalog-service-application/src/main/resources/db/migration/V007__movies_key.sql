ALTER TABLE movies ADD COLUMN film_id varchar(36) DEFAULT NULL;
ALTER TABLE movies ADD CONSTRAINT `film_movie__film_key` FOREIGN KEY (`film_id`) REFERENCES `films` (`id`);