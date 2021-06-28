insert into review.roles (id, role) values ('id-3', 'User');

insert into review.users (id, first_name, email, role, password_hash) values ('id-3', 'User', 'email123@gmail.com', 'id-3', '$2y$12$yMerqZb6D2OnB5cHvK78LuohCGwmtJ/laQEoXdkdKzl.zvFgHEH02');

insert into review.reviews (id, user_id, film_id, text) values ('id-3', 'id-3', 'e6626026-cd68-4938-87a6-61b194e137e0', 'This film is bad');

insert into review.ratings (id, film_id, score) values ('id-3', 'e6626026-cd68-4938-87a6-61b194e137e0', 0);

update films set third_party_id = '0b4aa119-a0f6-4c3a-95b3-7d4ba81b9ff9' where id = 'e6626026-cd68-4938-87a6-61b194e137e0'