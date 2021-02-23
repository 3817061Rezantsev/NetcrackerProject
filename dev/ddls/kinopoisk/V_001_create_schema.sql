CREATE TABLE `roles` (
	`id` varchar(36) NOT NULL,
  	`role` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
 	 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `films` (
	`id` varchar(36) NOT NULL,
	`third_party_id` varchar(36) DEFAULT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `users` (
	`id` varchar(36) NOT NULL,
  	`first_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  	`last_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  	`email` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  	`password_hash` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
 	`locked` tinyint(4) DEFAULT NULL,
  	`role` varchar(36) DEFAULT NULL,
  	PRIMARY KEY (`id`),
  	KEY `roles_idx` (`role`),
  	CONSTRAINT `roles_key` FOREIGN KEY (`role`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `reviews` (
	`id` varchar(36) NOT NULL,
  	`user_id` varchar(36) DEFAULT NULL,
  	`likes` int(11) DEFAULT NULL,
  	`dislikes` int(11) DEFAULT NULL,
  	`film_id` varchar(36) DEFAULT NULL,
  	`text` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  	`status` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  	PRIMARY KEY (`id`),
  	KEY `film_key_idx` (`film_id`),
  	KEY `user_key_idx` (`user_id`),
  	CONSTRAINT `film_key` FOREIGN KEY (`film_id`) REFERENCES `films` (`id`),
  	CONSTRAINT `user_key` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `ratings` (
	`id` varchar(36) NOT NULL,
  	`film_id` varchar(36) DEFAULT NULL,
  	`score` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  	PRIMARY KEY (`id`),
  	KEY `films_key_idx` (`film_id`),
  	CONSTRAINT `films_key` FOREIGN KEY (`film_id`) REFERENCES `films` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `comments` (
	`id` varchar(36) NOT NULL,
  	`user_id` varchar(36) DEFAULT NULL,
  	`review_id` varchar(36) DEFAULT NULL,
  	`text` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  	PRIMARY KEY (`id`),
  	KEY `user_key_idx` (`user_id`),
  	KEY `review_key_idx` (`review_id`),
  	CONSTRAINT `review_key` FOREIGN KEY (`review_id`) REFERENCES `reviews` (`id`),
  	CONSTRAINT `users_key` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;