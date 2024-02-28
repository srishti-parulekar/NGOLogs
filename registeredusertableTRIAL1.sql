CREATE DATABASE NGOLogs;
USE NGOLogs;

CREATE TABLE registered_user (
registered_userID int PRIMARY KEY,
registered_userName varchar(100),
username varchar(30) NOT NULL, 
user_password varchar(30) NOT NULL,
gender varchar(5), 
phone varchar(12), 
user_email varchar(50));

DESC registered_user;
