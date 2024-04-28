CREATE DATABASE  IF NOT EXISTS `ngologs2` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ngologs2`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: ngologs2
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categories_ngo`
--

DROP TABLE IF EXISTS `categories_ngo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categories_ngo` (
  `cat_ID` int NOT NULL,
  `programs` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`cat_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories_ngo`
--

LOCK TABLES `categories_ngo` WRITE;
/*!40000 ALTER TABLE `categories_ngo` DISABLE KEYS */;
INSERT INTO `categories_ngo` (`cat_ID`, `programs`) VALUES (1,'Poverty'),(2,'Education'),(3,'Hunger'),(4,'Human Trafficking'),(5,'Health');
/*!40000 ALTER TABLE `categories_ngo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deletedpersons`
--

DROP TABLE IF EXISTS `deletedpersons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `deletedpersons` (
  `userID` int NOT NULL AUTO_INCREMENT,
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `dob` varchar(30) DEFAULT NULL,
  `address` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL,
  `userpassword` varchar(50) NOT NULL,
  `userrole` enum('User','Admin','NGO') DEFAULT 'User',
  `timeOfDeletion` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=2024023 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deletedpersons`
--

LOCK TABLES `deletedpersons` WRITE;
/*!40000 ALTER TABLE `deletedpersons` DISABLE KEYS */;
INSERT INTO `deletedpersons` (`userID`, `fname`, `lname`, `email`, `phone`, `dob`, `address`, `username`, `userpassword`, `userrole`, `timeOfDeletion`) VALUES (2024017,'mimi','gini','mimi@gmail.com','9998886668','02-04-2020','Address','mimi1','mimi1','User','2024-04-28 10:23:45'),(2024019,'butterfly','parker','butterfly123@gmail.com','9988776655','16-04-2000','21, Pune','butterfly1','butterfly123','User','2024-04-28 10:33:35'),(2024022,'Bloomy','Bubblegum','bloomy123@gmail.com','9876789876','19-11-2000','45, Fatasia','bloomy1','bloomy123','User','2024-04-28 11:02:09');
/*!40000 ALTER TABLE `deletedpersons` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donor`
--

DROP TABLE IF EXISTS `donor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donor` (
  `donorID` int NOT NULL AUTO_INCREMENT,
  `ngo_id` int DEFAULT NULL,
  `user_ID` int DEFAULT NULL,
  `amountContributed` int DEFAULT NULL,
  `timeOfDonation` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `bank` enum('ICICI','SBI','HDFC') NOT NULL DEFAULT 'ICICI',
  PRIMARY KEY (`donorID`),
  KEY `ngo_id` (`ngo_id`),
  KEY `user_ID` (`user_ID`),
  CONSTRAINT `donor_ibfk_1` FOREIGN KEY (`ngo_id`) REFERENCES `ngo` (`ngoId`),
  CONSTRAINT `donor_ibfk_2` FOREIGN KEY (`user_ID`) REFERENCES `person` (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donor`
--

LOCK TABLES `donor` WRITE;
/*!40000 ALTER TABLE `donor` DISABLE KEYS */;
INSERT INTO `donor` (`donorID`, `ngo_id`, `user_ID`, `amountContributed`, `timeOfDonation`, `bank`) VALUES (11,1424009,2024009,2345,'2024-04-21 00:12:10','ICICI'),(13,1424010,2024007,6000,'2024-04-21 13:40:49','HDFC'),(14,1424007,2024009,4500,'2024-04-21 18:59:50','SBI'),(15,1424007,2024014,2000,'2024-04-22 06:15:06','ICICI'),(16,1424005,2024014,20000,'2024-04-22 07:04:28','ICICI'),(17,1424005,2024009,876,'2024-04-22 08:07:11','SBI'),(18,1424005,2024009,1500,'2024-04-22 11:23:05','SBI'),(19,1424003,2024015,6790,'2024-04-23 09:34:11','HDFC'),(20,1424009,2024015,900,'2024-04-28 13:10:02','ICICI');
/*!40000 ALTER TABLE `donor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ngo`
--

DROP TABLE IF EXISTS `ngo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ngo` (
  `ngoId` int NOT NULL AUTO_INCREMENT,
  `ngoName` varchar(70) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `about` varchar(450) DEFAULT NULL,
  PRIMARY KEY (`ngoId`)
) ENGINE=InnoDB AUTO_INCREMENT=1424012 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ngo`
--

LOCK TABLES `ngo` WRITE;
/*!40000 ALTER TABLE `ngo` DISABLE KEYS */;
INSERT INTO `ngo` (`ngoId`, `ngoName`, `city`, `email`, `about`) VALUES (1424001,'Aaradhya Foundation','Mumbai','aaradhyaFoundation@gmail.com','The Narayan Foundation is dedicated to providing accessible healthcare solutions to communities in need. Our mission is to ensure that every individual receives the care they deserve, promoting well-being and vitality for all'),(1424002,'Aayushman Foundation','Chennai','aayushmanFoundation@gmail.com','The Aayushman Foundation is committed to child and maternal health, focusing on reducing mortality rates. Specializing in pediatric healthcare, they provide vital medical aid and preventive care. Additionally, they address educational disparities by offering resources and scholarships to support mothers, ensuring a brighter future for families in need.'),(1424003,'EmpowerEd Education','Pune','empowerEducation@gmail.com','EmpowerEd Foundation: Igniting Minds, Transforming Futures. Our mission is to provide quality education to underprivileged children, empowering them to break the cycle of poverty and reach their full potential. Through innovative teaching methods and community engagement, we\'re shaping tomorrow\'s leaders, one student at a time.'),(1424004,'Bachapanshala','Kathua','bachpanShala@gmail.com','Illuminating Futures. Committed to breaking barriers and nurturing talents in underserved areas. Our passion lies in fostering a love for learning and empowering individuals to thrive academically, ensuring no dream goes unfulfilled.'),(1424005,'Sevadeep','Pune','sevadeep@gmail.com','Sevadeep is on a mission to eliminate food insecurity by rescuing surplus food and redistributing it to those in need. Our efforts not only reduce food waste but also nourish individuals and families, fostering healthier and more resilient communities.'),(1424006,'Annamrita Foundation','Pune','amritaFoundation@gmail.com','Annamrita Foundation cultivates a more equitable and sustainable food system. We support small-scale farmers practicing sustainable agriculture, providing them with resources and market access. We also educate consumers about the importance of local food systems and empower them to make informed choices about the food they eat.'),(1424007,'Polaris Project','Pune','polarisProject@gmail.com','The Polaris Project is committed to combating human trafficking, offering hope to victims through rescue and rehabilitation. Through partnerships with law enforcement and community outreach, we work to raise awareness, prevent trafficking, and prosecute perpetrators. Our goal: a world free from exploitation and oppression'),(1424008,'International Justice Mission','Mumbai','IJM@gmail.com','The International Justice Mission is a grassroots movement dedicated to raising awareness about human trafficking and advocating for stronger legislation to combat this modern-day slavery. We educate communities, empower survivors, and work with policymakers to create a world free from exploitation.'),(1424009,'Narayan Foundation','Hyderabad','narayanFoundation@gmail.com','The Narayan Foundation is dedicated to providing accessible healthcare solutions to communities in need. Our mission is to ensure that every individual receives the care they deserve, promoting well-being and vitality for all'),(1424010,'Wellness Initiative','Pune','wellnessInitiative@gmail.com','The Wellness Initiativeaims to uplift communities through holistic healthcare services. Our holistic approach encompasses physical, mental, and emotional well-being, ensuring a balanced and thriving society.');
/*!40000 ALTER TABLE `ngo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ngocattable`
--

DROP TABLE IF EXISTS `ngocattable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ngocattable` (
  `ngoId` int DEFAULT NULL,
  `catID` int DEFAULT NULL,
  KEY `catID` (`catID`),
  KEY `ngoId` (`ngoId`),
  CONSTRAINT `ngocattable_ibfk_1` FOREIGN KEY (`catID`) REFERENCES `categories_ngo` (`cat_ID`),
  CONSTRAINT `ngocattable_ibfk_2` FOREIGN KEY (`ngoId`) REFERENCES `ngo` (`ngoId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ngocattable`
--

LOCK TABLES `ngocattable` WRITE;
/*!40000 ALTER TABLE `ngocattable` DISABLE KEYS */;
INSERT INTO `ngocattable` (`ngoId`, `catID`) VALUES (1424001,1),(1424004,2),(1424006,3),(1424008,4),(1424010,5);
/*!40000 ALTER TABLE `ngocattable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ngologintables`
--

DROP TABLE IF EXISTS `ngologintables`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ngologintables` (
  `userId` int DEFAULT NULL,
  `ngoId` int DEFAULT NULL,
  KEY `userId` (`userId`),
  KEY `ngoId` (`ngoId`),
  CONSTRAINT `ngologintables_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `person` (`userID`),
  CONSTRAINT `ngologintables_ibfk_2` FOREIGN KEY (`ngoId`) REFERENCES `ngo` (`ngoId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ngologintables`
--

LOCK TABLES `ngologintables` WRITE;
/*!40000 ALTER TABLE `ngologintables` DISABLE KEYS */;
INSERT INTO `ngologintables` (`userId`, `ngoId`) VALUES (2024011,1424003),(2024012,1424004),(2024013,1424010);
/*!40000 ALTER TABLE `ngologintables` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person` (
  `userID` int NOT NULL AUTO_INCREMENT,
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `address` varchar(100) NOT NULL,
  `username` varchar(20) NOT NULL,
  `userpassword` varchar(50) NOT NULL,
  `userrole` enum('User','Admin','NGO') NOT NULL DEFAULT 'User',
  `dob` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=2024023 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` (`userID`, `fname`, `lname`, `email`, `phone`, `address`, `username`, `userpassword`, `userrole`, `dob`) VALUES (2024004,'Srishti','Parulekar','srishtiparulekar@gmail.com','90990123','Thane','root','@Lofi','Admin','17-04-2004'),(2024005,'Tanvi','Sontakke','tanvi@gmail.com','904234567','Nagpur','tanvivi','pass123','Admin','24-03-2004'),(2024006,'Soumili','Biswas','soumili@gmail.com','423415654','Kolkata','soumilili','pass123','Admin','31-08-2003'),(2024007,'Hermoine','Granger','hermoine123@gmail.com','9876543210','Gryffindor, common room','hermoine1','hermoine123&','User','19-09-1979'),(2024008,'Harry','Potter','hary123@gmail.com','9876543200','Griffindor, Common Room','harry1','harry123','User','31-07-1980'),(2024009,'Luna','Lovegood','lune123@gmail.com','9876543210','Ravenclaw, Common Room','luna1&','luna1&&','User','13-02-1981'),(2024011,'Rina','Lahiri','rina123@gmail.com','9876543456','12,Pune','rina1','rina123','NGO','12-03-1999'),(2024012,'Rini','Lahiri','rini123@gmail.com','9876543457','12,Pune','rini1','rini123','NGO','12-03-1999'),(2024013,'Raj','Shah','raj123@gmail.com','9876543458','13,Pune','raj1','raj123','NGO','14-08-2000'),(2024014,'pintu','patel','pintu@gmail.com','9876543210','12, pune','pintu1','pintu123','User','09-04-2003'),(2024015,'Swayam','Khatri','swayam@gmail.com','9876543450','12,Pune','swayam1','swayam123&','User','02-08-2004'),(2024016,'Jeremy','Frost','jeremy@gmail.com','9998887770','Address','jeremy','jeremy1','User','12-04-2000'),(2024018,'Clara','Dawson','clara@gmail.com','9876565434','23, pune','clara1','clara123','User','18-04-2001'),(2024020,'lily','parker','lily123@gmail.com','9988776677','12, Mumbai','lily1','lily123','User','16-08-1999'),(2024021,'Neville','Longbottom','neville123@gmail.com','9876567800','Hogwarts School of Witchcraft and Wizardry','neville1','neville123','User','02-04-1978');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `remove_whitespace_before_insert` BEFORE INSERT ON `person` FOR EACH ROW BEGIN
SET NEW.fname = TRIM(NEW.fname);
    SET NEW.lname = TRIM(NEW.lname);
    SET NEW.address = TRIM(NEW.address);
    SET NEW.username = TRIM(NEW.username);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `add_to_deletedPersons_trigger` AFTER DELETE ON `person` FOR EACH ROW BEGIN
INSERT INTO deletedPersons 
(userID, fname, lname, email, phone, dob,
 address, username, userpassword, userrole, timeOfDeletion)
    VALUES (OLD.userID, OLD.fname, OLD.lname, OLD.email, OLD.phone, OLD.dob,
    OLD.address, OLD.username, OLD.userpassword, OLD.userrole, NOW());
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `volunteer`
--

DROP TABLE IF EXISTS `volunteer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `volunteer` (
  `volunteerId` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `ngoID` int DEFAULT NULL,
  `skills` varchar(255) DEFAULT NULL,
  `interests` varchar(255) DEFAULT NULL,
  `availability` enum('Morning','Afternoon','Evening') DEFAULT NULL,
  PRIMARY KEY (`volunteerId`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `volunteer`
--

LOCK TABLES `volunteer` WRITE;
/*!40000 ALTER TABLE `volunteer` DISABLE KEYS */;
INSERT INTO `volunteer` (`volunteerId`, `user_id`, `ngoID`, `skills`, `interests`, `availability`) VALUES (1,2024002,1424002,'Problem Solving','Teaching','Evening'),(2,2024001,1424001,'Social media handling','Cooking','Evening'),(3,2024001,1424001,'Article Writing','Writing','Afternoon'),(4,2024001,1424009,'web development','Singing','Morning'),(5,2024001,1424008,'Data Analysis','Reading','Afternoon'),(6,2024001,1424003,'Communication','Reading','Morning'),(12,2024014,1424002,'dbms','swimming','Morning'),(13,2024009,1424001,'Research','baking','Morning'),(14,2024018,1424003,'Marketing','travelling','Morning');
/*!40000 ALTER TABLE `volunteer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'ngologs2'
--

--
-- Dumping routines for database 'ngologs2'
--
/*!50003 DROP FUNCTION IF EXISTS `generate_new_userid` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `generate_new_userid`() RETURNS int
    DETERMINISTIC
BEGIN
    DECLARE new_userid INT;
    DECLARE max_userid INT;
    
    -- Get the maximum userId from the person table
    SELECT MAX(userId) INTO max_userid FROM person;
    
    -- Set new_userid to the next available userId
    SET new_userid = COALESCE(max_userid + 1, 1);
    
    -- Check if the generated userId exists in deletedpersons
    WHILE EXISTS (SELECT 1 FROM deletedpersons WHERE deletedpersons.userId = new_userid) DO
        SET new_userid = new_userid + 1; -- Increment new_userid until unique
    END WHILE;

    RETURN new_userid;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `count_donors` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `count_donors`(
	IN userId INTEGER,
    OUT numDonors INTEGER
)
BEGIN
 SELECT COUNT(donor.donorid) AS donor_count
    INTO numDonors
    FROM donor
    INNER JOIN ngo ON ngo.ngoid = donor.ngo_id
    WHERE ngo.ngoid = (SELECT ngoid FROM ngologintables WHERE userid = userId LIMIT 1);
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `count_volunteers` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `count_volunteers`(
IN userId INTEGER,
    OUT numVolunteers INTEGER
)
BEGIN
 SELECT COUNT(volunteer.volunteerid) AS volunteer_count
    INTO numVolunteers
    FROM volunteer
    INNER JOIN ngo ON ngo.ngoid = volunteer.ngoid
    WHERE ngo.ngoid = (SELECT ngoid FROM ngologintables WHERE userid = userId LIMIT 1);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ngo_about` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ngo_about`(
IN userId INTEGER, 
OUT about VARCHAR(1000))
BEGIN
 select ngo.about 
 into about
 from ngo inner join ngologintables on
 ngo.ngoid = ngologintables.ngoId inner join person on 
 ngologintables.userId = person.userID where person.userID=userId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ngo_revenue` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ngo_revenue`(
	IN userID INTEGER,
    OUT totalAmount INTEGER
)
BEGIN
    SELECT COALESCE(SUM(d.amountContributed), 0)
    INTO totalAmount
    FROM ngo n
    INNER JOIN donor d ON n.ngoID = d.ngo_id
    WHERE n.ngoID = (SELECT ngoid FROM ngologintables WHERE userid = userID LIMIT 1);

    IF totalAmount IS NULL THEN
        SET totalAmount = 0;
    END IF;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-28 19:01:06
