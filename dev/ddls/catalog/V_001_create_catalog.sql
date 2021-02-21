CREATE TABLE `studios` (
  `id` int(11) NOT NULL,
  `name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `owner` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `location` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `films` (
  `id` int(11) NOT NULL,
  `studio_id` int(11) DEFAULT NULL,
  `name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `views` int(11) DEFAULT NULL,
  `produser` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `box_office` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `studio_key_idx` (`studio_id`),
  CONSTRAINT `studio_key` FOREIGN KEY (`studio_id`) REFERENCES `studios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `actors` (
  `id` int(11) NOT NULL,
  `film_id` int(11) DEFAULT NULL,
  `first_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_main_actor` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `film_key_idx` (`film_id`),
  CONSTRAINT `film_key` FOREIGN KEY (`film_id`) REFERENCES `films` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

