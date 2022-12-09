-- MySQL dump 10.13  Distrib 8.0.31, for macos12 (x86_64)
--
-- Host: localhost    Database: final_project
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `customer_directory`
--

DROP TABLE IF EXISTS `customer_directory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_directory` (
  `customer_id` varchar(45) NOT NULL,
  `person_id` varchar(45) DEFAULT NULL,
  `photo_path` varchar(45) DEFAULT NULL,
  `is_valid` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`customer_id`),
  KEY `person_id_idx` (`person_id`),
  CONSTRAINT `person_id` FOREIGN KEY (`person_id`) REFERENCES `person_directory` (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_directory`
--

LOCK TABLES `customer_directory` WRITE;
/*!40000 ALTER TABLE `customer_directory` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer_directory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dealer_order_collection`
--

DROP TABLE IF EXISTS `dealer_order_collection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dealer_order_collection` (
  `order_id` varchar(45) NOT NULL,
  `weapon_id` varchar(45) DEFAULT NULL,
  `serial_no` varchar(45) DEFAULT NULL,
  `customer_id` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `weapon_3_idx` (`weapon_id`),
  KEY `serial_no_idx` (`serial_no`),
  KEY `customer_id_idx` (`customer_id`),
  CONSTRAINT `customer_id` FOREIGN KEY (`customer_id`) REFERENCES `customer_directory` (`customer_id`),
  CONSTRAINT `serial_no` FOREIGN KEY (`serial_no`) REFERENCES `weapon_serial_directory` (`serial_no`),
  CONSTRAINT `weapon_3` FOREIGN KEY (`weapon_id`) REFERENCES `weapon_type_directory` (`weapon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dealer_order_collection`
--

LOCK TABLES `dealer_order_collection` WRITE;
/*!40000 ALTER TABLE `dealer_order_collection` DISABLE KEYS */;
/*!40000 ALTER TABLE `dealer_order_collection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department_directory`
--

DROP TABLE IF EXISTS `department_directory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department_directory` (
  `dept_id` varchar(45) NOT NULL,
  `dept_name` varchar(45) DEFAULT NULL,
  `enterprise_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`dept_id`),
  KEY `enterprise_id_idx` (`enterprise_id`),
  CONSTRAINT `enterprise_id` FOREIGN KEY (`enterprise_id`) REFERENCES `enterprise_directory` (`enterprise_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department_directory`
--

LOCK TABLES `department_directory` WRITE;
/*!40000 ALTER TABLE `department_directory` DISABLE KEYS */;
/*!40000 ALTER TABLE `department_directory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_directory`
--

DROP TABLE IF EXISTS `employee_directory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_directory` (
  `emp_id` varchar(45) NOT NULL,
  `person_id` varchar(45) DEFAULT NULL,
  `enterprise_id` varchar(45) DEFAULT NULL,
  `dept_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  KEY `dept_id_idx` (`dept_id`),
  KEY `enterprise_id_idx` (`enterprise_id`),
  KEY `person_id_idx` (`person_id`),
  CONSTRAINT `dept_id` FOREIGN KEY (`dept_id`) REFERENCES `department_directory` (`dept_id`),
  CONSTRAINT `id_enterprise` FOREIGN KEY (`enterprise_id`) REFERENCES `enterprise_directory` (`enterprise_id`),
  CONSTRAINT `id_person` FOREIGN KEY (`person_id`) REFERENCES `person_directory` (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_directory`
--

LOCK TABLES `employee_directory` WRITE;
/*!40000 ALTER TABLE `employee_directory` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_directory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enterprise_directory`
--

DROP TABLE IF EXISTS `enterprise_directory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enterprise_directory` (
  `enterprise_id` varchar(45) NOT NULL,
  `enterprise_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`enterprise_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enterprise_directory`
--

LOCK TABLES `enterprise_directory` WRITE;
/*!40000 ALTER TABLE `enterprise_directory` DISABLE KEYS */;
/*!40000 ALTER TABLE `enterprise_directory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory_collection`
--

DROP TABLE IF EXISTS `inventory_collection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory_collection` (
  `inventory_id` varchar(45) NOT NULL,
  `enterprise_id` varchar(45) DEFAULT NULL,
  `weapon_id` varchar(45) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`inventory_id`),
  KEY `weapon_id_4_idx` (`weapon_id`),
  KEY `enterprise_id_1_idx` (`enterprise_id`),
  CONSTRAINT `enterprise_id_3` FOREIGN KEY (`enterprise_id`) REFERENCES `enterprise_directory` (`enterprise_id`),
  CONSTRAINT `weapon_id_4` FOREIGN KEY (`weapon_id`) REFERENCES `weapon_type_directory` (`weapon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory_collection`
--

LOCK TABLES `inventory_collection` WRITE;
/*!40000 ALTER TABLE `inventory_collection` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventory_collection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_collection`
--

DROP TABLE IF EXISTS `order_collection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_collection` (
  `order_id` varchar(45) NOT NULL,
  `weapon_id` varchar(45) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `source_id` varchar(45) DEFAULT NULL,
  `reciever_id` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `id_weapon_idx` (`weapon_id`),
  KEY `code_enterprise_idx` (`source_id`),
  KEY `code_enterprise_1_idx` (`reciever_id`),
  CONSTRAINT `code_enterprise` FOREIGN KEY (`source_id`) REFERENCES `enterprise_directory` (`enterprise_id`),
  CONSTRAINT `code_enterprise_1` FOREIGN KEY (`reciever_id`) REFERENCES `enterprise_directory` (`enterprise_id`),
  CONSTRAINT `id_weapon` FOREIGN KEY (`weapon_id`) REFERENCES `weapon_type_directory` (`weapon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_collection`
--

LOCK TABLES `order_collection` WRITE;
/*!40000 ALTER TABLE `order_collection` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_collection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person_directory`
--

DROP TABLE IF EXISTS `person_directory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person_directory` (
  `person_id` varchar(45) NOT NULL,
  `ssn` varchar(45) DEFAULT NULL,
  `person_name` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `phone_no` bigint DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person_directory`
--

LOCK TABLES `person_directory` WRITE;
/*!40000 ALTER TABLE `person_directory` DISABLE KEYS */;
/*!40000 ALTER TABLE `person_directory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `report_collection`
--

DROP TABLE IF EXISTS `report_collection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `report_collection` (
  `report_id` varchar(45) NOT NULL,
  `report_date` date DEFAULT NULL,
  `weapon_id` varchar(45) DEFAULT NULL,
  `approver_id` varchar(45) DEFAULT NULL,
  `tester_id` varchar(45) DEFAULT NULL,
  `safety` tinyint(1) DEFAULT NULL,
  `muzzle` tinyint(1) DEFAULT NULL,
  `barrel` tinyint(1) DEFAULT NULL,
  `gmode` tinyint(1) DEFAULT NULL,
  `iron_align` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`report_id`),
  KEY `weapon_id_1_idx` (`weapon_id`),
  KEY `emp_id_idx` (`approver_id`),
  KEY `emp_id_1_idx` (`tester_id`),
  CONSTRAINT `emp_id` FOREIGN KEY (`approver_id`) REFERENCES `employee_directory` (`emp_id`),
  CONSTRAINT `emp_id_1` FOREIGN KEY (`tester_id`) REFERENCES `employee_directory` (`emp_id`),
  CONSTRAINT `weapon_id_2` FOREIGN KEY (`weapon_id`) REFERENCES `weapon_type_directory` (`weapon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `report_collection`
--

LOCK TABLES `report_collection` WRITE;
/*!40000 ALTER TABLE `report_collection` DISABLE KEYS */;
/*!40000 ALTER TABLE `report_collection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weapon_serial_directory`
--

DROP TABLE IF EXISTS `weapon_serial_directory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `weapon_serial_directory` (
  `weapon_id` varchar(45) DEFAULT NULL,
  `serial_no` varchar(45) NOT NULL,
  `person_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`serial_no`),
  KEY `person_id_1_idx` (`person_id`),
  KEY `weapon_id_1` (`weapon_id`),
  CONSTRAINT `person_id_1` FOREIGN KEY (`person_id`) REFERENCES `person_directory` (`person_id`),
  CONSTRAINT `weapon_id_1` FOREIGN KEY (`weapon_id`) REFERENCES `weapon_type_directory` (`weapon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weapon_serial_directory`
--

LOCK TABLES `weapon_serial_directory` WRITE;
/*!40000 ALTER TABLE `weapon_serial_directory` DISABLE KEYS */;
/*!40000 ALTER TABLE `weapon_serial_directory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weapon_type_directory`
--

DROP TABLE IF EXISTS `weapon_type_directory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `weapon_type_directory` (
  `weapon_id` varchar(45) NOT NULL,
  `weapon_name` varchar(45) DEFAULT NULL,
  `weapon_type` varchar(45) DEFAULT NULL,
  `weapon_price` float DEFAULT NULL,
  `weapon_report_id` varchar(45) DEFAULT NULL,
  `enterprise_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`weapon_id`),
  KEY `enterprise_id_1_idx` (`enterprise_id`),
  KEY `report_id_idx` (`weapon_report_id`),
  CONSTRAINT `enterprise_id_1` FOREIGN KEY (`enterprise_id`) REFERENCES `enterprise_directory` (`enterprise_id`),
  CONSTRAINT `report_id` FOREIGN KEY (`weapon_report_id`) REFERENCES `report_collection` (`report_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weapon_type_directory`
--

LOCK TABLES `weapon_type_directory` WRITE;
/*!40000 ALTER TABLE `weapon_type_directory` DISABLE KEYS */;
/*!40000 ALTER TABLE `weapon_type_directory` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-09 18:38:48
