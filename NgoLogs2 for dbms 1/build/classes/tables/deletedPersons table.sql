 use ngologs;

create table deletedPersons(
userID int PRIMARY KEY AUTO_INCREMENT,
fname varchar(50) NOT NULL,
lname varchar(50) NOT NULL,
email varchar(100) NOT NULL,
phono varchar(40),
dob varchar(30), 
address varchar(100) NOT NULL,
username varchar(50) NOT NULL,
userpassword varchar(50) NOT NULL,
userrole ENUM('User', 'Admin','NGO') DEFAULT 'User',
timeOfDeletion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
-- drop table deletedPersons;
