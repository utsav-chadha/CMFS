/*
SQLyog Community Edition- MySQL GUI v5.22a
Host - 5.0.19-nt : Database - suspicious_words
*********************************************************************
Server version : 5.0.19-nt
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `suspicious_words`;

USE `suspicious_words`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `blocks` */

DROP TABLE IF EXISTS `blocks`;

CREATE TABLE `blocks` (
  `id` int(4) NOT NULL auto_increment,
  `uname` char(50) default NULL,
  `byuname` char(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `blocks` */

/*Table structure for table `dataset` */

DROP TABLE IF EXISTS `dataset`;

CREATE TABLE `dataset` (
  `id` int(4) NOT NULL auto_increment,
  `words` char(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dataset` */

insert  into `dataset`(`id`,`words`) values (1,'police'),(2,'cops'),(3,'Al Qaeda'),(4,'assassination'),(5,'attack'),(6,'domestic security'),(7,'drill'),(8,'authorities'),(9,'mitigation'),(10,'prevention'),(11,'response'),(12,'recovery'),(13,'dirty bomb'),(14,'bomb'),(15,'nuclear'),(16,'detection'),(17,'emergency'),(18,'initiative'),(19,'shooting'),(20,'shots fired'),(21,'evacuation'),(22,'deaths'),(23,'hostage'),(24,'disaster medical assistance'),(25,'crime'),(26,'gangs'),(27,'national security'),(28,'security'),(29,'breach'),(30,'threat'),(31,'swat'),(32,'standoff'),(33,'screening'),(34,'lockdown'),(35,'crash'),(36,'looting'),(37,'loot'),(38,'riot'),(39,'pipe bomb'),(40,'incident'),(41,'facility'),(42,'hazmat'),(43,'nuclear'),(44,'chemical spill'),(45,'toxic'),(46,'suspicious device'),(47,'nuclear facility'),(48,'nuclear threat'),(49,'cloud'),(50,'plume'),(51,'radiation'),(52,'radioactive'),(53,'leak'),(54,'chemical'),(55,'biological'),(56,'epidemic'),(57,'hazardous'),(58,'industrial spill'),(59,'infection'),(60,'powder'),(61,'white powder'),(62,'black powder'),(63,'gas'),(64,'spillover'),(65,'anthrax'),(66,'blister agent'),(67,'chemical agent'),(68,'exposure'),(69,'burn'),(70,'nerve agent'),(71,'ricin'),(72,'sarin'),(73,'terrorism'),(74,'terror'),(75,'iraq'),(76,'pakistan'),(77,'afganistan'),(78,'target'),(79,'weapons'),(80,'hathiyar'),(81,'car bomb'),(82,'suicide bomber'),(83,'suicide attack'),(84,'pirates'),(85,'extremism'),(86,'somalia'),(87,'nigeria'),(88,'radicals'),(89,'plot'),(90,'nationalist'),(91,'recruitment'),(92,'islam'),(93,'islamist'),(94,'salaam'),(95,'phishing'),(96,'virus'),(97,'trojan'),(98,'pork'),(99,'mexico'),(100,'pistol');

/*Table structure for table `forum` */

DROP TABLE IF EXISTS `forum`;

CREATE TABLE `forum` (
  `id` int(4) NOT NULL auto_increment,
  `msg` varchar(500) default NULL,
  `uname` char(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `forum` */

insert  into `forum`(`id`,`msg`,`uname`) values (1,'hello friends from amit','amit'),(2,'hello friends from sumit','sumit'),(3,'hello from ramesh','ramesh'),(4,'women','umesh');

/*Table structure for table `forum_comments` */

DROP TABLE IF EXISTS `forum_comments`;

CREATE TABLE `forum_comments` (
  `id` int(4) NOT NULL auto_increment,
  `msg_id` int(11) default NULL,
  `uname` char(50) default NULL,
  `comment1` varchar(500) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `forum_comments` */

insert  into `forum_comments`(`id`,`msg_id`,`uname`,`comment1`) values (1,1,'sumit','nice thought from sumit'),(2,2,'ramesh','nice'),(3,1,'ramesh','nice one yaar'),(4,3,'umesh','nice'),(5,4,'umesh','go to hell');

/*Table structure for table `forum_likes` */

DROP TABLE IF EXISTS `forum_likes`;

CREATE TABLE `forum_likes` (
  `id` int(4) NOT NULL auto_increment,
  `msg_id` int(11) default NULL,
  `uname` char(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `forum_likes` */

insert  into `forum_likes`(`id`,`msg_id`,`uname`) values (1,1,'sumit'),(2,1,'ramesh'),(3,2,'sumit'),(4,3,'amit'),(5,4,'umesh');

/*Table structure for table `mails` */

DROP TABLE IF EXISTS `mails`;

CREATE TABLE `mails` (
  `id` int(4) NOT NULL auto_increment,
  `sub` char(100) default NULL,
  `msg` varchar(500) default NULL,
  `touname` char(50) default NULL,
  `fromuname` char(50) default NULL,
  `status` char(50) default NULL,
  `key1` char(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mails` */

insert  into `mails`(`id`,`sub`,`msg`,`touname`,`fromuname`,`status`,`key1`) values (1,'hello message','hello sumit how are you\ni am amit \ncontact me','sumit','amit','normal',NULL),(2,'terrorist attack','bomb formula is sent to you','ramesh','amit','suspicious',NULL),(3,'aGVsbG8gbWVzc2FnZQ==','aGVsbG8gYW1pdCBmcm9tIGFkbWlu','amit','admin','normal','123456'),(6,'aGVsbG8=','c2FkZmFzZGY=','amit','admin','normal','1234'),(7,'aHcgcmUgeW91','aHcgcmUgeW91IGFsZXJ0','umesh','admin','normal','1234'),(8,'aGVsbG8=','ZHNmZ3NkZmdkZmc=','umesh','admin','normal','12345'),(11,'hello','sadfs cops dfsdf attack sfsd authorities dgdfg','ramesh','umesh','suspicious',NULL);

/*Table structure for table `spam` */

DROP TABLE IF EXISTS `spam`;

CREATE TABLE `spam` (
  `id` int(4) NOT NULL auto_increment,
  `sub` char(100) default NULL,
  `msg` varchar(500) default NULL,
  `touname` char(50) default NULL,
  `fromuname` char(50) default NULL,
  `status` char(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `spam` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(4) NOT NULL auto_increment,
  `uname` char(50) default NULL,
  `passw` char(50) default NULL,
  `addr` char(50) default NULL,
  `email` char(50) default NULL,
  `mobile` char(50) default NULL,
  `ans` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`id`,`uname`,`passw`,`addr`,`email`,`mobile`,`ans`) values (1,'admin','admin',NULL,NULL,NULL,NULL),(2,'amit','amit','hno-12','amit@mail.com','9876543234','blue'),(4,'sumit','sumit','hno-12','sumit@gmail.com','9876765432','red'),(5,'shyam','shyam','hno-12','shyam@gmail.com','9876543234','red'),(6,'ramesh','ramesh','hno-12','ramesh@gmail.com','9878767654','blue'),(7,'umesh','12345','asdfas','laxminarayan.mca@gmail.com','9876543212','red');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
