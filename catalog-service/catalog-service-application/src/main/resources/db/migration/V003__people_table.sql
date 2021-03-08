RENAME TABLE actors TO people;
ALTER TABLE people DROP FOREIGN KEY film_key;
ALTER TABLE people DROP COLUMN film_id;
ALTER TABLE people DROP COLUMN is_main_actor;

ALTER TABLE films DROP COLUMN produser;
ALTER TABLE films ADD COLUMN producer_id varchar(36) DEFAULT NULL;
ALTER TABLE films ADD CONSTRAINT `producer_key` FOREIGN KEY (`producer_id`) REFERENCES `people` (`id`);
ALTER TABLE films DROP COLUMN box_office;

CREATE TABLE `film_actors` (
	`film_id` varchar(36) NOT NULL,
	`actor_id` varchar(36) NOT NULL,
	CONSTRAINT `film_actors__film_key` FOREIGN KEY (`film_id`) REFERENCES `films` (`id`),
	CONSTRAINT `film_actors__actor_key` FOREIGN KEY (`actor_id`) REFERENCES `people` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


insert into people (id, first_name, last_name) values ('1f591ef1-6b4c-4c8f-8010-9d775c82a113', 'Arnold', 'Schwarzenegger');
insert into people (id, first_name, last_name) values ('fd51519e-9d4d-4116-81e3-bbb43cf6581e', 'Johnny', 'Depp');
insert into people (id, first_name, last_name) values ('8afcc2c0-b11e-4057-b282-3abea2a73bb2', 'Steven', 'Spielberg');

insert into films (id, name, producer_id, studio_id, score, views) values ('a165e35c-595b-4fe3-ac9d-a4bb51431a1a', 'Back to the Future', '8afcc2c0-b11e-4057-b282-3abea2a73bb2', '5ce24c6e-da27-40e7-ae46-6cd2558e08e6', 8, 350000);
insert into film_actors (film_id, actor_id) values ('a165e35c-595b-4fe3-ac9d-a4bb51431a1a', '1f591ef1-6b4c-4c8f-8010-9d775c82a113');
insert into film_actors (film_id, actor_id) values ('a165e35c-595b-4fe3-ac9d-a4bb51431a1a', 'fd51519e-9d4d-4116-81e3-bbb43cf6581e');


