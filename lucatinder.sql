CREATE DATABASE  IF NOT EXISTS `lucatinder` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `lucatinder`;
-- MySQL dump 10.13  Distrib 5.7.24, for Win64 (x86_64)
--
-- Host: 10.90.36.103    Database: lucatinder
-- ------------------------------------------------------
-- Server version	5.7.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `contacto`
--

DROP TABLE IF EXISTS `contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contacto` (
  `id_contacto` int(11) NOT NULL AUTO_INCREMENT,
  `id_perfil` int(10) unsigned NOT NULL,
  `id_otro_perfil` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id_contacto`)
) ENGINE=InnoDB AUTO_INCREMENT=130 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contacto`
--

LOCK TABLES `contacto` WRITE;
/*!40000 ALTER TABLE `contacto` DISABLE KEYS */;
INSERT INTO `contacto` VALUES (1,1,2),(2,1,5),(3,1,7),(4,1,9),(5,2,5),(6,5,7),(7,5,8),(8,5,57),(9,5,28),(10,5,1),(11,5,23),(12,4,53),(13,5,10),(15,5,18),(16,5,76),(17,5,40),(18,5,26),(19,5,82),(20,5,23),(22,4,89),(23,5,81),(24,5,41),(25,5,40),(36,5,13),(37,5,71),(38,5,19),(55,5,77),(56,5,40),(57,5,49),(58,5,46),(69,5,50),(70,1,35),(71,1,18),(72,1,22),(73,1,89),(74,1,3),(78,6,49),(79,6,59),(80,6,26),(81,6,29),(83,6,12),(84,6,81),(85,6,76),(86,6,9),(87,6,84),(88,6,77),(89,6,50),(90,6,16),(91,6,27),(92,6,13),(93,6,49),(94,6,28),(95,6,44),(96,6,41),(97,6,47),(98,6,29),(99,6,28),(100,6,71),(103,8,7),(104,8,76),(105,8,48),(106,8,77),(107,8,91),(108,8,56),(109,8,82),(110,8,81),(111,8,36),(112,8,9),(113,8,59),(114,8,62),(115,8,16),(117,6,28),(118,6,20),(119,6,48),(120,6,7),(121,3,11),(122,3,70),(123,3,64),(125,3,39),(127,3,15),(128,3,92),(129,1,38);
/*!40000 ALTER TABLE `contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dercarte`
--

DROP TABLE IF EXISTS `dercarte`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dercarte` (
  `id_perfil` int(10) unsigned zerofill NOT NULL,
  `id_dislike` int(10) unsigned zerofill NOT NULL,
  `id_descarte` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_descarte`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dercarte`
--

LOCK TABLES `dercarte` WRITE;
/*!40000 ALTER TABLE `dercarte` DISABLE KEYS */;
/*!40000 ALTER TABLE `dercarte` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `match`
--

DROP TABLE IF EXISTS `match`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `match` (
  `id_perfil` int(10) unsigned zerofill NOT NULL,
  `id_otro_perfil` int(10) unsigned zerofill NOT NULL,
  `id_match` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_match`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `match`
--

LOCK TABLES `match` WRITE;
/*!40000 ALTER TABLE `match` DISABLE KEYS */;
/*!40000 ALTER TABLE `match` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materia`
--

DROP TABLE IF EXISTS `materia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `materia` (
  `id_materia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(128) NOT NULL,
  PRIMARY KEY (`id_materia`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materia`
--

LOCK TABLES `materia` WRITE;
/*!40000 ALTER TABLE `materia` DISABLE KEYS */;
/*!40000 ALTER TABLE `materia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfil`
--

DROP TABLE IF EXISTS `perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `perfil` (
  `id_perfil` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(128) NOT NULL,
  `genero` varchar(45) DEFAULT NULL,
  `edad` int(11) NOT NULL,
  `descripcion` varchar(128) DEFAULT NULL,
  `poblacion` varchar(45) NOT NULL,
  `genero_interes` varchar(45) NOT NULL,
  `edad_minima` int(11) NOT NULL,
  `edad_maxima` int(11) NOT NULL,
  PRIMARY KEY (`id_perfil`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfil`
--

LOCK TABLES `perfil` WRITE;
/*!40000 ALTER TABLE `perfil` DISABLE KEYS */;
INSERT INTO `perfil` VALUES (1,'Brooke','Female',24,'Soy super cool y super fake','Priceshire','Male',3,0),(2,'Eugenia','Male',23,'Soy super cool y super fake','Haneville','Male',4,2),(3,'Gabriel','Male',21,'Soy super cool y super fake','South Nola','Male',8,5),(4,'Everett','Male',33,'Soy super cool y super fake','Heathcotemouth','Male',1,5),(5,'Liza','Male',41,'Soy super cool y super fake','Thomasport','Female',25,1),(6,'Douglas','Male',18,'Soy super cool y super fake','New Kelley','Female',44,5),(7,'Dolores','Female',40,'Soy super cool y super fake','South Coleburgh','Male',1,3),(8,'Fae','Male',19,'Soy super cool y super fake','Ansleyborough','Female',31,3),(9,'Ayden','Female',25,'Soy super cool y super fake','Dustintown','Male',2,5),(10,'Dena','Female',35,'Soy super cool y super fake','Uptontown','Male',9,1),(11,'Winnifred','Male',32,'Soy super cool y super fake','East Macieland','Female',28,7),(12,'Clay','Female',16,'Soy super cool y super fake','New Chazfurt','Female',19,7),(13,'Mckenzie','Female',24,'Soy super cool y super fake','West Maximo','Female',56,0),(14,'Lia','Male',35,'Soy super cool y super fake','Keelingport','Male',1,9),(15,'Adella','Male',20,'Soy super cool y super fake','Farrellborough','Male',4,6),(16,'Evert','Female',33,'Soy super cool y super fake','Port Fanny','Female',55,0),(17,'Juanita','Male',21,'Soy super cool y super fake','Kassulkestad','Male',0,8),(18,'Sonya','Male',36,'Soy super cool y super fake','North Lindseyport','Male',1,2),(19,'Ernestina','Female',30,'Soy super cool y super fake','Port Eusebioland','Male',2,6),(20,'Jarod','Female',18,'Soy super cool y super fake','Mayerville','Male',6,3),(21,'josemi','Male',37,'soy dios','Sevilla','Mesas',18,19),(22,'Javier','Male',22,'Me cago en tó','graná','Male',18,99),(23,'asder','Female',19,'dsfa','er','Male',1,99),(24,'Javier','Male',23,'yo','Albolote','Male',19,25),(25,'Adrienne','Male',38,'Soy super cool y super fake','Ryleeport','Male',3,2),(26,'Ludwig','Female',54,'Soy super cool y super fake','Port Malika','Female',45,0),(27,'Angelina','Female',56,'Soy super cool y super fake','Jadefurt','Male',7,3),(28,'Otto','Female',21,'Soy super cool y super fake','Maryseton','Female',24,4),(29,'Oral','Female',28,'Soy super cool y super fake','South Aniya','Female',17,5),(30,'Juliet','Male',39,'Soy super cool y super fake','Damienfort','Female',25,5),(31,'Winnifred','Female',35,'Soy super cool y super fake','Pascaleshire','Male',1,8),(32,'Christelle','Male',24,'Soy super cool y super fake','Eribertomouth','Female',39,3),(33,'Seamus','Male',25,'Soy super cool y super fake','New Johnpaulfort','Male',6,6),(34,'Josh','Female',37,'Soy super cool y super fake','North Hectorburgh','Male',7,1),(35,'Berenice','Male',40,'Soy super cool y super fake','Caterinaland','Male',3,8),(36,'Gabriella','Female',22,'Soy super cool y super fake','Jennietown','Male',4,2),(37,'Hilda','Male',41,'Soy super cool y super fake','Tinachester','Male',9,5),(38,'Elmer','Male',26,'Soy super cool y super fake','Yoshikofurt','Female',18,3),(39,'Matteo','Male',27,'Soy super cool y super fake','Romagueraview','Male',1,2),(40,'Abe','Female',27,'Soy super cool y super fake','Harrishaven','Male',3,6),(41,'Zander','Female',36,'Soy super cool y super fake','South Joanny','Male',6,9),(42,'Faustino','Male',42,'Soy super cool y super fake','Kaitlinfurt','Male',7,0),(43,'Armand','Male',43,'Soy super cool y super fake','Moenmouth','Male',1,8),(44,'Louisa','Female',45,'Soy super cool y super fake','New Lia','Female',23,4),(45,'Jordi','Male',28,'Soy super cool y super fake','Torpton','Female',48,9),(46,'Deon','Female',18,'Soy super cool y super fake','Kiarraberg','Female',35,3),(47,'Malcolm','Female',29,'Soy super cool y super fake','Hellerton','Male',0,3),(48,'Jeanie','Female',45,'Soy super cool y super fake','West Hildafort','Female',20,3),(49,'Florence','Female',47,'Soy super cool y super fake','Lake Kory','Male',0,5),(50,'Rocio','Female',27,'Soy super cool y super fake','South Deetown','Male',5,4),(51,'Nasir','Male',18,'Soy super cool y super fake','North Aniyahmouth','Female',20,5),(52,'Lawrence','Male',54,'Soy super cool y super fake','West Myleneshire','Male',0,2),(53,'Jacynthe','Male',60,'Soy super cool y super fake','Domenicabury','Male',4,7),(54,'Davin','Male',20,'Soy super cool y super fake','Jenkinsview','Female',29,1),(55,'Rosalyn','Male',50,'Soy super cool y super fake','New Meaghanberg','Female',35,9),(56,'Imelda','Female',20,'Soy super cool y super fake','Kubside','Male',6,0),(57,'Marguerite','Female',33,'Soy super cool y super fake','Hammesberg','Female',44,3),(58,'Carli','Female',39,'Soy super cool y super fake','Emiliemouth','Male',5,6),(59,'Colby','Female',24,'Soy super cool y super fake','Konopelskifurt','Female',23,8),(60,'Elouise','Female',21,'Soy super cool y super fake','Nedshire','Male',0,5),(61,'Evan','Male',57,'Soy super cool y super fake','New Kolbyburgh','Female',28,7),(62,'Imogene','Female',35,'Soy super cool y super fake','Prohaskashire','Male',8,3),(63,'Braulio','Female',36,'Soy super cool y super fake','Westfort','Male',5,9),(64,'Naomie','Male',59,'Soy super cool y super fake','Port Geoview','Female',38,9),(65,'Deven','Male',29,'Soy super cool y super fake','Caspermouth','Male',1,1),(66,'Nicklaus','Female',19,'Soy super cool y super fake','Kemmermouth','Female',40,0),(67,'Erin','Male',18,'Soy super cool y super fake','Violetshire','Male',8,9),(68,'Eva','Male',36,'Soy super cool y super fake','Port Elmiraport','Male',0,1),(69,'Tommie','Male',34,'Soy super cool y super fake','Harberburgh','Male',0,1),(70,'Marley','Male',22,'Soy super cool y super fake','Port Brendonbury','Female',20,0),(71,'Ressie','Female',20,'Soy super cool y super fake','Makenziechester','Male',1,1),(72,'Major','Male',27,'Soy super cool y super fake','Schmidtland','Male',0,2),(73,'Nona','Female',42,'Soy super cool y super fake','Port Annamae','Female',29,3),(74,'Loyal','Female',50,'Soy super cool y super fake','Lehnerburgh','Female',42,6),(75,'Ima','Male',55,'Soy super cool y super fake','West Jackson','Female',59,3),(76,'Crystel','Female',28,'Soy super cool y super fake','Kuphalville','Male',1,7),(77,'Oda','Female',19,'Soy super cool y super fake','Port Leta','Female',25,1),(78,'Gilda','Male',25,'Soy super cool y super fake','West Travonborough','Female',21,0),(79,'George','Male',56,'Soy super cool y super fake','Tressatown','Male',6,9),(80,'Ed','Female',27,'Soy super cool y super fake','Lubowitzland','Male',1,9),(81,'Kip','Female',58,'Soy super cool y super fake','Gutmannstad','Female',37,0),(82,'Jennings','Female',23,'Soy super cool y super fake','New Tobin','Female',47,3),(83,'Brianne','Male',58,'Soy super cool y super fake','Roselynborough','Female',24,7),(84,'Lupe','Female',59,'Soy super cool y super fake','North Friedaland','Male',3,5),(85,'juan','Male',33,'lucatinder la mejor pagina','reyes','Male',18,36),(86,'jweor','Male',23,'asdfsadf','ertert','Male',12,45),(87,'dfdff','Male',29,'ffsfsfsf','fsfsdfdf','Female',20,30),(88,'rtrtr','Male',30,'rtrtr','fsfsdfdf','Female',20,30),(89,'rere','Male',46,'ffsfsfsf','fsfsdfdf','Female',30,30),(90,'Jose Miguel','Male',47,'sevillita','Sevilla','Female',40,40),(91,'dsfaef','Female',24,'sdfe ñopfej paoñweira aeirjpafasñlek sieprnasldk ','serasgfadat','Female',48,66),(92,'zxdfsdfa','Male',18,'sdfsadf','feree','Male',12,16),(93,'reterteqwr','Male',23,'sdfe4 r4w fr 5rt fh gtrw qwf weq asf4we','esrstyrdas','Male',1,99),(94,'dsdfdf','Male',35,'htyyrty','tytyryr','Female',50,30),(95,'Josemi','Male',36,'dewfwefwef','Sevilla','Female',69,10),(96,'josemi2','Male',20,'dwedwe','wedwedwe','Male',3,10),(97,'josemi3','Male',22,'ddwedwed','wedwedwedewd','Male',1,2),(98,'Angular','Male',39,'Ususario de angular','Albolote','Female',22,17),(99,'erer','Male',40,'asjdfñ','Male','Male',12,19),(100,'erer','Male',18,'asjdfñ','Male','Male',12,19),(101,'Fº Javier','Male',23,'sdfe ñopfej paoñweira aeirjpafasñlek sieprnasldk ','Albolote','Male',12,66),(102,'Jose Miguel','Male',48,'sdfe ñopfej paoñweira aeirjpafasñlek sieprnasldk ','Albolote','Female',19,29),(103,'dwedw','Male',12,'wdewdwe','Sevilla','Mesas',3,19),(104,'Vladimir','Male',27,'Soy ruso, que más quieres','Madriz','Female',18,19),(105,'Vladimir','Male',27,'Soy ruso, que más quieres','Madriz','Female',18,19),(106,'ejirso','Female',69,'eoeri pseior spoerks foerdjfi woeir','jero','Male',25,35),(107,'juan','Male',25,'hola amigos','ss reyes','Female',19,20);
/*!40000 ALTER TABLE `perfil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-05 14:59:39
