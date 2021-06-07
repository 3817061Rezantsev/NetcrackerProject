ALTER TABLE users DROP COLUMN password_hash;
ALTER TABLE users ADD COLUMN password_hash varchar(70) DEFAULT NULL;