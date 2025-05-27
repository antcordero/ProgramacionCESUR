CREATE DATABASE  IF NOT EXISTS `biblioteca_municipal` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `biblioteca_municipal`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: biblioteca_municipal
-- ------------------------------------------------------
-- Server version	9.3.0

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
-- Table structure for table `libros`
--

DROP TABLE IF EXISTS `libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libros` (
  `idlibros` int NOT NULL AUTO_INCREMENT,
  `isbn` varchar(10) NOT NULL,
  `titulo` varchar(80) NOT NULL,
  `autor` varchar(80) NOT NULL,
  `prestamo` tinyint NOT NULL DEFAULT '1',
  PRIMARY KEY (`idlibros`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libros`
--

LOCK TABLES `libros` WRITE;
/*!40000 ALTER TABLE `libros` DISABLE KEYS */;
INSERT INTO `libros` VALUES (1,'0000000001','1984','George Orwell',1),(2,'0000000001','1984','George Orwell',1),(3,'0000000002','Rebelión en la granja','George Orwell',1),(4,'0000000003','Cien años de soledad','Gabriel García Márquez',1),(5,'0000000003','Cien años de soledad','Gabriel García Márquez',1),(6,'0000000004','Rayuela','Julio Cortázar',1),(7,'0000000004','Rayuela','Julio Cortázar',1),(8,'0000000005','Don Quijote','Miguel de Cervantes',1),(9,'0000000006','Ficciones','Jorge Luis Borges',1),(10,'0000000007','La sombra del viento','Carlos Ruiz Zafón',1),(11,'0000000008','El nombre de la rosa','Umberto Eco',1),(12,'0000000009','Los pilares de la Tierra','Ken Follett',1),(13,'0000000010','El código Da Vinci','Dan Brown',1),(14,'0000000011','La chica del tren','Paula Hawkins',1),(15,'0000000012','El alquimista','Paulo Coelho',1),(16,'0000000013','Juego de tronos','George R. R. Martin',1),(17,'0000000014','La carretera','Cormac McCarthy',1),(18,'0000000015','Ensayo sobre la ceguera','José Saramago',1),(19,'0000000016','Tokio Blues','Haruki Murakami',1),(20,'0000000017','El extranjero','Albert Camus',1),(21,'0000000018','Crónica de una muerte anunciada','Gabriel García Márquez',1),(22,'0000000019','El viejo y el mar','Ernest Hemingway',1),(23,'0000000020','El guardián entre el centeno','J.D. Salinger',1),(24,'0000000021','Matar a un ruiseñor','Harper Lee',1),(25,'0000000022','El señor de las moscas','William Golding',1),(26,'0000000023','Un mundo feliz','Aldous Huxley',1);
/*!40000 ALTER TABLE `libros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamos`
--

DROP TABLE IF EXISTS `prestamos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamos` (
  `dni` varchar(9) NOT NULL,
  `codigo` varchar(16) NOT NULL,
  `fechaprestamo` datetime NOT NULL,
  `fechadevolucion` datetime NOT NULL,
  PRIMARY KEY (`dni`,`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamos`
--

LOCK TABLES `prestamos` WRITE;
/*!40000 ALTER TABLE `prestamos` DISABLE KEYS */;
/*!40000 ALTER TABLE `prestamos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('11111111A','Ana','ana@correo.com'),('22222222B','Luis','luis@correo.com'),('33333333C','Marta','marta@correo.com'),('44444444D','Pedro','pedro@correo.com'),('55555555E','Lucía','lucia@correo.com'),('66666666Z','Pepito','pepito@correo.com');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-20 12:26:22
