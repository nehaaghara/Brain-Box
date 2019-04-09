/*
SQLyog Community v13.0.1 (64 bit)
MySQL - 5.7.19 : Database - brainbox
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`brainbox` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `brainbox`;

/*Table structure for table `admintopic` */

DROP TABLE IF EXISTS `admintopic`;

CREATE TABLE `admintopic` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `topicname` varchar(20) DEFAULT NULL,
  `discription` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `admintopic` */

insert  into `admintopic`(`id`,`topicname`,`discription`) values 
(4,'.@hingu','vdsvdsvggdvdfbdbbdfdf'),
(8,'.@Java','Programing Language');

/*Table structure for table `answertable` */

DROP TABLE IF EXISTS `answertable`;

CREATE TABLE `answertable` (
  `Aid` bigint(10) NOT NULL AUTO_INCREMENT,
  `answer` varchar(200) DEFAULT NULL,
  `no_of_like` int(200) DEFAULT NULL,
  `id` bigint(20) DEFAULT NULL,
  `uid` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`Aid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `answertable` */

insert  into `answertable`(`Aid`,`answer`,`no_of_like`,`id`,`uid`) values 
(1,'JavaScript is a client-side as well as server side scripting language that can be inserted into HTML pages and is understood by web browsers. JavaScript is also an Object based Programming language',0,1,6),
(2,'Java is a complete programming language',0,2,6),
(3,'isNan function returns true if the argument is not a number otherwise it is false.',0,3,6),
(6,'JavaScript is faster.',0,5,6),
(7,'JavaScript is faster between both.',0,5,4),
(8,'Singleton class is a class whose only one instance can be created at any given time, in one JVM. A class can be made singleton by making its constructor private.',0,10,6),
(9,'Java is not 100% Object-oriented because it makes use of eight primitive datatypes such as boolean, byte, char, int, float, double, long, short which are not objects.',0,7,6),
(11,'Hobby is a minor pursuit (especially for relaxation/fun) outside one\'s regular occupation or day-to-day activity.',0,12,2),
(12,'The rhythm of the soul. The beat of the heart. The movement of the body. All these embody the term - \'dance\'. Dancing is the beauty of harmonizing emotions to movements.',0,11,3),
(13,'Australia smashed the then world record for the highest innings total in an ODI, 434, only to watch in horror as South Africa chased that down with 1 ball to spare.',0,13,4),
(14,'klvlcfldmvklfmdklvm',0,6,6);

/*Table structure for table `like_track_ans` */

DROP TABLE IF EXISTS `like_track_ans`;

CREATE TABLE `like_track_ans` (
  `ans_like_id` bigint(10) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(10) DEFAULT NULL,
  `ans_id` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`ans_like_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;

/*Data for the table `like_track_ans` */

insert  into `like_track_ans`(`ans_like_id`,`user_id`,`ans_id`) values 
(4,7,1),
(9,4,1),
(16,1,1),
(17,2,1),
(22,6,1),
(24,6,7);

/*Table structure for table `like_track_question` */

DROP TABLE IF EXISTS `like_track_question`;

CREATE TABLE `like_track_question` (
  `que_like_id` bigint(10) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(10) DEFAULT NULL,
  `que_id` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`que_like_id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=latin1;

/*Data for the table `like_track_question` */

insert  into `like_track_question`(`que_like_id`,`user_id`,`que_id`) values 
(2,2,2),
(3,7,2),
(4,8,2),
(5,9,2),
(6,7,4),
(7,7,4),
(32,6,4),
(36,6,3),
(38,6,2),
(41,6,1),
(42,6,5),
(43,6,6),
(44,4,9);

/*Table structure for table `postquestion` */

DROP TABLE IF EXISTS `postquestion`;

CREATE TABLE `postquestion` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `question_title` varchar(500) DEFAULT NULL,
  `selected_topic` bigint(50) DEFAULT NULL,
  `question_discription` varchar(200) DEFAULT NULL,
  `uid` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

/*Data for the table `postquestion` */

insert  into `postquestion`(`id`,`question_title`,`selected_topic`,`question_discription`,`uid`) values 
(1,'What is JavaScript?',9,NULL,1),
(2,'Enumerate the differences between Java and JavaScript?',9,NULL,1),
(3,'What are JavaScript Data Types?',9,NULL,2),
(4,'What is the use of isNaN function?',9,NULL,3),
(5,'Between JavaScript and an ASP script, which is faster?',9,NULL,6),
(6,'Why Java is platform independent?',8,NULL,2),
(7,'Why java is not 100% Object-oriented?',8,NULL,3),
(8,'What are wrapper classes?',8,NULL,4),
(9,'What are constructors in Java?',8,NULL,5),
(10,' What is singleton class and how can we make a class singleton?',8,NULL,7),
(11,'What is Dance?',5,NULL,4),
(12,'What is the meaning of \"hobby\"?',5,NULL,4),
(13,'Why is the chase of 438 by South Africa against Australia considered so legendary?',5,NULL,3),
(14,'fkjnkjdfnjkdn',8,'fgrm;lgf;lr,g;l,r;lg',6),
(15,'fkjnkjdfnjkdn',8,'vdfv',5);

/*Table structure for table `tbl_role` */

DROP TABLE IF EXISTS `tbl_role`;

CREATE TABLE `tbl_role` (
  `Rolepk` bigint(20) DEFAULT NULL,
  `Rolename` varchar(15) DEFAULT NULL,
  `Isactive` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_role` */

insert  into `tbl_role`(`Rolepk`,`Rolename`,`Isactive`) values 
(1,'admin',1),
(2,'user',1),
(3,'expert',1);

/*Table structure for table `user_signup_table` */

DROP TABLE IF EXISTS `user_signup_table`;

CREATE TABLE `user_signup_table` (
  `username` varchar(15) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL,
  `conformpassword` varchar(15) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `rolefk` bigint(20) DEFAULT NULL,
  `uid` bigint(20) NOT NULL AUTO_INCREMENT,
  `queAskLevel` bigint(20) DEFAULT NULL,
  `expAnsLevel` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `user_signup_table` */

insert  into `user_signup_table`(`username`,`password`,`conformpassword`,`email`,`rolefk`,`uid`,`queAskLevel`,`expAnsLevel`) values 
('hardik','123','123','bhbhjhbhbh@gmail.com',2,1,0,0),
('mohit','123456','123456','mohit123@gmail.com',2,2,0,0),
('parth','1234567',NULL,NULL,2,3,0,0),
('hemal','12345678','12345678','bhbhjhbhbh@gmail.com',2,4,1,0),
('admin','admin','admin',NULL,1,5,0,0),
('Harsh Bhatt','1234','1234','hbhatt543@gmail.com',2,6,1,1),
('kaps','kaps','kaps','hbhatt543@gmail.com',2,7,0,0),
('kapsi','kapsi','kapsi','hbh543@gmail.com',2,8,0,0),
('ashu','ashu','ashu','hbhatt543@gmail.com',2,9,0,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
