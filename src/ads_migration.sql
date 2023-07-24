CREATE DATABASE IF NOT EXISTS adlister_db;

USE adlister_db;

DROP TABLE IF EXISTS users;


CREATE TABLE users (
        id int UNSIGNED NOT NULL AUTO_INCREMENT,
        username VARCHAR(50) NOT NULL,
        email VARCHAR(75) NOT NULL,
        password VARCHAR(25) not null,
        primary key (id)
);

CREATE TABLE ads (
        id int UNSIGNED NOT NULL AUTO_INCREMENT,
        user_id int UNSIGNED NOT NULL,
        title VARCHAR(75) NOT NULL,
        description TEXT NOT NULL ,
        primary key (id),
        FOREIGN KEY (user_id) REFERENCES users (id)
);

INSERT INTO users (username, email, password)
VALUES ('Bill', 'Bill@bill.com', 'password');