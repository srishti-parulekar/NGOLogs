create database ngologs2;
use ngologs2;
CREATE TABLE person (
    userID INT PRIMARY KEY AUTO_INCREMENT,
    fname VARCHAR(50) NOT NULL,  
    lname VARCHAR(50) NOT NULL,  
    email VARCHAR(100) NOT NULL, 
    phone VARCHAR(15),            
    dob DATE,                     
    address VARCHAR(100) NOT NULL,
    username VARCHAR(20) NOT NULL,
    userpassword VARCHAR(50) NOT NULL, 
    userrole ENUM('User', 'Admin') DEFAULT 'User' 
);


INSERT INTO person VALUES (2024001, 'Priya', 'Patel', 'priya123@gmail.com', '9912345671', '1997-01-12', '123 MG Road, Pune', 'PP@19', 'pass123', 'user');
INSERT INTO person VALUES (2024002, 'Rahul', 'Sharma', 'rahul456@gmail.com', '9912345672', '1997-02-12', '123 MG Road, Pune', 'RS@19', 'pass123', 'user');
INSERT INTO person VALUES (2024003, 'Seema', 'Bharati', 'seema342@gmail.com', '9912345673', '1997-03-12', '123 MG Road, Pune', 'SB@19', 'pass123', 'user');
