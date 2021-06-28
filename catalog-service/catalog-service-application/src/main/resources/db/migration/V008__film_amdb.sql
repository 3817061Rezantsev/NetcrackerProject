ALTER TABLE films ADD COLUMN popularity DOUBLE DEFAULT NULL;
ALTER TABLE films ADD COLUMN imdb_id varchar(36) DEFAULT NULL;
ALTER TABLE films DROP COLUMN genres_id;

insert into catalog.genres (id, genre_name) values ('e6626026-cd68-4938-87a6-61b194e137e0', 'Horror');
insert into catalog.genres (id, genre_name) values ('25206c1a-bc46-4645-a4b6-3267d6dc6825', 'Action');
insert into catalog.genres (id, genre_name) values ('914538c8-06cb-4abb-87c8-2d080f9bff96', 'Drama');
insert into catalog.genres (id, genre_name) values ('5ce24c6e-da27-40e7-ae46-6cd2558e08e6', 'Comedy');

insert into catalog.film_genres (film_genre_id, genre_id) values ('0b4aa119-a0f6-4c3a-95b3-7d4ba81b9ff9', 'e6626026-cd68-4938-87a6-61b194e137e0');
insert into catalog.film_genres (film_genre_id, genre_id) values ('0b4aa119-a0f6-4c3a-95b3-7d4ba81b9ff9', '914538c8-06cb-4abb-87c8-2d080f9bff96');


insert into catalog.film_genres (film_genre_id, genre_id) values ('0b92e118-4a82-44fd-ad56-98c9cdcbd5c7', '914538c8-06cb-4abb-87c8-2d080f9bff96');


insert into catalog.film_genres (film_genre_id, genre_id) values ('131adc32-ab02-4f3f-a625-691164c587cc', '5ce24c6e-da27-40e7-ae46-6cd2558e08e6');
insert into catalog.film_genres (film_genre_id, genre_id) values ('131adc32-ab02-4f3f-a625-691164c587cc', '25206c1a-bc46-4645-a4b6-3267d6dc6825');