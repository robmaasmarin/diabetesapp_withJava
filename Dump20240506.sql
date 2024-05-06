-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: alimentos_nueva
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `bebidas`
--

DROP TABLE IF EXISTS `bebidas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bebidas` (
  `nombre_alimento` varchar(40) NOT NULL,
  `raciones_hc` float(2,1) DEFAULT NULL,
  `indiceg` int DEFAULT NULL,
  UNIQUE KEY `nombre_alimento` (`nombre_alimento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bebidas`
--

LOCK TABLES `bebidas` WRITE;
/*!40000 ALTER TABLE `bebidas` DISABLE KEYS */;
INSERT INTO `bebidas` VALUES ('Bebida de almendra',0.5,35),('Bebida de arroz',0.5,85),('Bebida de avena',0.5,35),('Bebida de cacao',1.0,34),('Bebida de soja',0.4,30),('Bebida isotónica',0.7,78),('Bitter',1.0,70),('Cava seco o semiseco',0.4,NULL),('Cerveza',0.4,110),('Cerveza light',0.3,110),('Cerveza sin alcohol',0.4,110),('Horchata',1.3,NULL),('Horchata light',0.3,NULL),('Licor de melocotón',3.3,NULL),('Mosto',1.4,NULL),('Refresco cola (10% hidratos de carbono)',1.0,70),('Refresco sabores (4.5% hidratos carbono)',0.5,70),('Sangría',1.0,NULL),('Sidra',0.5,NULL),('Tónica',1.0,70),('Vermut',1.3,NULL),('Zumo de fruta sin azúcares añadidos',0.5,45),('Zumo de fruta, natural o comercial',1.0,60),('Zumo de tomate',0.5,35);
/*!40000 ALTER TABLE `bebidas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cereales_y_derivados`
--

DROP TABLE IF EXISTS `cereales_y_derivados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cereales_y_derivados` (
  `nombre_alimento` varchar(40) NOT NULL,
  `raciones_hc` float(2,1) DEFAULT NULL,
  `indiceg` int DEFAULT NULL,
  UNIQUE KEY `nombre_alimento` (`nombre_alimento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cereales_y_derivados`
--

LOCK TABLES `cereales_y_derivados` WRITE;
/*!40000 ALTER TABLE `cereales_y_derivados` DISABLE KEYS */;
INSERT INTO `cereales_y_derivados` VALUES ('Altramuz',2.0,15),('Arroz blanco crudo',7.7,NULL),('Arroz blanco hervido',2.5,70),('Arroz hinchado para desayuno',8.3,85),('Arroz integral crudo',7.7,NULL),('Avena cruda',6.7,NULL),('Avena hervida',2.9,40),('Boniato',2.0,50),('Cebada cruda',7.1,NULL),('Cebada hervida',2.4,45),('Centeno crudo',6.7,45),('Centeno hervido',2.6,NULL),('Cereales desayuno (trigo)',6.7,77),('Cereales desayuno ricos en fibra (>10%)',5.0,50),('Cereales tipo muesli',6.7,65),('Cuscús cocido',2.2,65),('Cuscús crudo',6.7,NULL),('Fideos de arroz hervidos',2.0,50),('Fideos de soja hervidos',2.2,NULL),('Galleta sin azúcar',5.5,50),('Galleta tipo digestiva',6.2,65),('Galleta tipo María',6.6,70),('Galleta tipo Príncipe',7.1,70),('Garbanzo crudo',5.0,NULL),('Garbanzo en conserva',1.4,35),('Garbanzo hervido',1.8,35),('Gofio',8.3,NULL),('Guisantes congelados, frescos, de lata',1.0,35),('Harina de avena',5.5,NULL),('Harina de cebada o centeno',5.9,45),('Harina de maíz',6.7,70),('Harina de soja',1.4,25),('Harina de trigo',6.7,78),('Hojaldre crudo',3.3,NULL),('Hojaldre horneado',4.1,56),('Hummus',1.0,NULL),('Judías blancas crudas',4.0,NULL),('Judías blancas en conserva',1.4,35),('Judías blancas hervidas',1.8,35),('Legumbres en conserva',1.4,NULL),('Lentejas en conserva',1.4,35),('Lentejas en crudo',5.0,NULL),('Lentejas hervidas',2.0,35),('Maíz en lata',2.0,65),('Maíz en lata sin azúcares añadidos',1.0,NULL),('Maíz tostado',5.0,NULL),('Mijo cocido',1.9,70),('Mijo crudo',6.7,NULL),('Pan blanco de trigo',5.0,70),('Pan de centeno',5.0,70),('Pan de hamburguesa o Frankfurt',5.5,85),('Pan de molde',5.0,85),('Pan integral',4.3,40),('Pan rallado',6.7,70),('Pan tostado',6.7,70),('Pasta al huevo, cruda',6.2,NULL),('Pasta cruda',7.1,NULL),('Pasta fresca rellena',3.3,NULL),('Pasta hervida',2.0,50),('Pasta sin gluten',7.7,73),('Patata al horno o asada',3.2,62),('Patata cruda',1.5,NULL),('Patata hervida',1.5,65),('Patatas chips',5.0,95),('Patatas fritas',3.3,70),('Puré de patatas elaborado con leche',1.2,90),('Puré de patatas en copos',6.7,90),('Quinoa cruda',5.0,NULL),('Quinoa hervida',2.1,35),('Sémola de trigo cruda',7.1,NULL),('Sémola de trigo hervida',1.2,67),('Soja seca cruda',3.3,NULL),('Soja seca hervida',1.0,15),('Sushi',2.2,42),('Tapioca cruda',8.3,NULL),('Tapioca hervida',3.0,84),('Trigo sarraceno crudo',7.1,NULL),('Trigo sarraceno hervido',2.4,40),('Trigo tierno crudo',6.2,NULL),('Trigo tierno hervido',2.5,54),('Yuca cruda',4.0,NULL),('Yuca hervida',3.0,55);
/*!40000 ALTER TABLE `cereales_y_derivados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `frutas`
--

DROP TABLE IF EXISTS `frutas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `frutas` (
  `nombre_alimento` varchar(40) NOT NULL,
  `raciones_hc` float(2,1) DEFAULT NULL,
  `indiceg` int DEFAULT NULL,
  UNIQUE KEY `nombre_alimento` (`nombre_alimento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `frutas`
--

LOCK TABLES `frutas` WRITE;
/*!40000 ALTER TABLE `frutas` DISABLE KEYS */;
INSERT INTO `frutas` VALUES ('Aguacate',0.6,10),('Albaricoque',0.6,30),('Arándano',1.2,25),('Caqui',1.7,NULL),('Cerezas',1.0,25),('Chirimoya',2.0,35),('Ciruela',1.0,35),('Coco fresco',1.4,45),('Dátil',6.7,70),('Frambuesa',1.0,25),('Fresas',0.5,25),('Granada',1.4,35),('Grosella',0.5,25),('Grosella negra',1.0,15),('Higos',1.0,35),('Kiwi',1.0,50),('Litchi',1.4,50),('Mandarina',1.0,30),('Mango',1.0,50),('Manzana',1.0,35),('Manzana asada',2.0,35),('Melocotón',1.0,35),('Melocotón en conserva',2.0,35),('Melón',0.5,60),('Membrillo',0.7,35),('Membrillo dulce',5.0,65),('Moras',0.7,25),('Naranja',1.0,35),('Nectarina',1.0,35),('Níspero',1.0,55),('Papaya',0.8,55),('Paragüayo',1.0,35),('Pera',1.0,30),('Piña',1.0,45),('Piña en conserva',0.8,53),('Piña en su jugo',1.7,50),('Plátano',2.0,50),('Sandía',0.5,75),('Uva',1.0,45);
/*!40000 ALTER TABLE `frutas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `frutos_secos`
--

DROP TABLE IF EXISTS `frutos_secos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `frutos_secos` (
  `nombre_alimento` varchar(40) NOT NULL,
  `raciones_hc` float(2,1) DEFAULT NULL,
  `indiceg` int DEFAULT NULL,
  UNIQUE KEY `nombre_alimento` (`nombre_alimento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `frutos_secos`
--

LOCK TABLES `frutos_secos` WRITE;
/*!40000 ALTER TABLE `frutos_secos` DISABLE KEYS */;
INSERT INTO `frutos_secos` VALUES ('Aceituna',0.4,15),('Albaricoque seco',6.7,35),('Almendra',0.7,15),('Almendra tostada',0.6,15),('Avellana',0.7,15),('Cacahuete',1.0,15),('Castaña cruda',3.0,65),('Castaña tostada',4.0,65),('Ciruela pasa',6.7,40),('Dátil seco',6.7,70),('Higo seco',6.7,40),('Nuez',0.3,15),('Piñón',0.3,15),('Pipas',1.2,35),('Pistacho',1.2,15),('Sésamo',1.0,NULL),('Uvas pasas',6.7,65);
/*!40000 ALTER TABLE `frutos_secos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hortalizas`
--

DROP TABLE IF EXISTS `hortalizas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hortalizas` (
  `nombre_alimento` varchar(40) NOT NULL,
  `raciones_hc` float(2,1) DEFAULT NULL,
  `indiceg` int DEFAULT NULL,
  UNIQUE KEY `nombre_alimento` (`nombre_alimento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hortalizas`
--

LOCK TABLES `hortalizas` WRITE;
/*!40000 ALTER TABLE `hortalizas` DISABLE KEYS */;
INSERT INTO `hortalizas` VALUES ('Acelga',0.3,15),('Ajo',2.4,30),('Alcachofa',0.3,20),('Algas',0.5,NULL),('Apio',0.2,15),('Apio-nabo',0.2,NULL),('Berenjena',0.3,20),('Borraja',0.3,15),('Brócoli',0.3,15),('Calabacín',0.3,15),('Calabaza',0.5,75),('Cardo',0.3,15),('Cebolla',0.6,15),('Cebolla frita en aros',1.0,NULL),('Col de bruselas',0.1,15),('Edamame',1.0,35),('Endibia',0.3,15),('Espárrago blanco en conserva',0.3,15),('Espárrago verde',0.2,15),('Judía verde',0.4,30),('Lechuga',0.3,15),('Nabo',0.3,30),('Palmitos',0.4,20),('Pepino',0.3,15),('Pimiento rojo/verde',0.3,15),('Puerro',0.3,15),('Rábano',0.3,15),('Remolacha',0.6,30),('Repollo',0.3,15),('Setas',0.2,15),('Soja en brotes',0.3,15),('Tomate',0.3,30),('Zanahoria',0.7,30),('Zanahoria en conserva',0.4,NULL),('Zanahoria hervida',0.7,85);
/*!40000 ALTER TABLE `hortalizas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lacteos`
--

DROP TABLE IF EXISTS `lacteos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lacteos` (
  `nombre_alimento` varchar(40) NOT NULL,
  `raciones_hc` float(2,1) DEFAULT NULL,
  `indiceg` int DEFAULT NULL,
  UNIQUE KEY `nombre_alimento` (`nombre_alimento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lacteos`
--

LOCK TABLES `lacteos` WRITE;
/*!40000 ALTER TABLE `lacteos` DISABLE KEYS */;
INSERT INTO `lacteos` VALUES ('Cuajada',0.6,35),('Flan',2.5,NULL),('Helado de crema',2.0,60),('Helado de hielo',2.0,65),('Helado sin azúcares añadidos',1.0,35),('Kéfir',4.0,35),('Leche condensada',5.0,61),('Leche desnatada',0.5,32),('Leche en polvo',4.0,30),('Leche entera',0.5,27),('Leche semidesnatada',0.5,30),('Nata líquida',0.4,NULL),('Natillas',2.0,NULL),('Petit Suisse',1.2,40),('Queso fresco',0.4,35),('Yogur desnatado, de sabores o fruta',0.6,35),('Yogur entero, de sabores o fruta',1.2,35),('Yogur líquido',1.5,40),('Yogur natural, entero o desnatado',0.4,33),('Yogur tipo Actimel',1.0,35),('Yogur tipo Actimel 0%',0.5,35);
/*!40000 ALTER TABLE `lacteos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `otros`
--

DROP TABLE IF EXISTS `otros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `otros` (
  `nombre_alimento` varchar(40) NOT NULL,
  `raciones_hc` float(10,2) DEFAULT NULL,
  `indiceg` int DEFAULT NULL,
  UNIQUE KEY `nombre_alimento` (`nombre_alimento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `otros`
--

LOCK TABLES `otros` WRITE;
/*!40000 ALTER TABLE `otros` DISABLE KEYS */;
INSERT INTO `otros` VALUES ('Arepa',4.00,72),('Azúcar blanco',10.00,70),('Azúcar moreno',10.00,70),('Barrita energética(de cereales)',5.00,70),('Bizcocho',5.00,65),('Bollería en general',5.00,70),('Cacao en polvo',8.50,NULL),('Cacao en polvo sin azúcar',4.50,NULL),('Calamares a la romana',0.80,NULL),('Canelones con bechamel',1.00,NULL),('Caramelo',8.00,70),('Carne rebozada',0.60,NULL),('Chocolate > 90% cacao',1.30,NULL),('Chocolate blanco o con leche',5.00,70),('Chocolate negro',3.60,20),('Churros',4.00,NULL),('Crema de cacahuete',1.00,40),('Crema de cacao',4.00,55),('Crema pastelera',2.20,NULL),('Crepe',2.20,NULL),('Croquetas',2.00,NULL),('Cruasán',5.00,70),('Döner kevab',1.70,NULL),('Donut',4.30,70),('Durum',1.00,NULL),('Empanadilla de carne',2.00,NULL),('Ensaimada',4.80,70),('Ensaladilla rusa',1.00,NULL),('Fajita, tortilla mexicana',5.00,NULL),('Fructosa (edulcorante)',10.00,20),('Gazpacho comercial',0.60,NULL),('Gelatina 0%',0.20,NULL),('Gelatina comercial',1.80,NULL),('Glucosa (líquida o en pastillas)',10.00,100),('Golosinas',5.00,70),('Ketchup',2.00,55),('Lasaña',1.00,53),('Levadura',0.80,NULL),('Magdalena',4.00,70),('Mazapán',4.00,NULL),('Merengue',9.10,0),('Mermelada',5.00,65),('Mermelada light',1.00,30),('Miel',7.70,85),('Palomitas',5.00,85),('Pastel de chocolate',4.00,NULL),('Pastel de crema',2.80,NULL),('Pastel o tarta de manzana',4.00,NULL),('Pizza',2.80,45),('Regaliz',6.70,NULL),('Rollito de primavera',2.00,NULL),('Salsa barbacoa',1.00,NULL),('Salsa bechamel',1.00,NULL),('Salsa boloñesa',0.70,NULL),('Salsa de soja',0.50,NULL),('Salsa de tomate comercial',1.00,NULL),('Seitán',0.30,NULL),('Surimi(palitos de cangrejo)',1.00,NULL),('Tofu',0.30,NULL),('Tortilla de patatas',0.80,NULL),('Turrón tipo Alicante',4.00,NULL),('Turrón tipo chocolate',5.00,NULL),('Turrón tipo Jijona',4.00,NULL),('Vinagre tipo Módena',6.70,NULL);
/*!40000 ALTER TABLE `otros` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-06 13:59:26
