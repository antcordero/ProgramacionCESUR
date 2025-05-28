CREATE DATABASE  IF NOT EXISTS `museo_tiempo_perdido` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `museo_tiempo_perdido`;
-- MySQL dump 10.13  Distrib 8.0.36, for macos14 (arm64)
--
-- Host: 127.0.0.1    Database: museo_tiempo_perdido
-- ------------------------------------------------------
-- Server version	8.4.0

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
-- Table structure for table `artefactos`
--

DROP TABLE IF EXISTS `artefactos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `artefactos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `anho_descubrimiento` int NOT NULL,
  `nivel_acceso` varchar(50) NOT NULL,
  `ubicacion_actual` varchar(100) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `extra` varchar(100) DEFAULT NULL,
  `extra2` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artefactos`
--

LOCK TABLES `artefactos` WRITE;
/*!40000 ALTER TABLE `artefactos` DISABLE KEYS */;
INSERT INTO `artefactos` VALUES (1,'Reloj de Waterloo',1815,'bajo','Sala 1','RelojSignificativo','Batalla de Waterloo',''),(2,'Amuleto Atlante',1923,'medio','Sala 3','ObjetoPerdido','Atlántida','Alta'),(3,'Esfera del Tiempo',1987,'alto','Sala 5','ArtefactoPercepcion','30 minutos','ralentizacion'),(4,'Fragmento Dimensional X',2020,'alto','Almacen','FragmentoAlternativo','75%','No'),(5,'Reloj del Eclipse Lunar',1901,'bajo','Sala 2','RelojSignificativo','Eclipse Lunar Total',''),(6,'Máscara Maya',1950,'medio','Sala 4','ObjetoPerdido','Civilización Maya','Media'),(7,'Cristal Crono',2003,'alto','Sala 6','ArtefactoPercepcion','45 minutos','aceleracion'),(8,'Fragmento Temporal Alfa',2018,'alto','Almacen','FragmentoAlternativo','60%','Sí'),(9,'Reloj de la Caída del Muro',1989,'bajo','Sala 1','RelojSignificativo','Caída del Muro de Berlín',''),(10,'Daga de los Vikingos',1002,'medio','Sala 3','ObjetoPerdido','Vikingos','Alta'),(11,'Esfera Ilusoria',2010,'alto','Sala 5','ArtefactoPercepcion','15 minutos','bucle'),(12,'Fragmento Temporal Beta',2022,'alto','Almacen','FragmentoAlternativo','90%','No');
/*!40000 ALTER TABLE `artefactos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-19 19:10:08

select * from artefactos;
