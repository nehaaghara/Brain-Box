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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `admintopic` */

insert  into `admintopic`(`id`,`topicname`,`discription`) values 
(3,'.@science','gregregregerg'),
(4,'.@hingu','vdsvdsvggdvdfbdbbdfdf'),
(5,'.@general','all types of question'),
(8,'.@mohit','ccewsc1234565'),
(9,'.@ashu','boring man');

/*Table structure for table `answertable` */

DROP TABLE IF EXISTS `answertable`;

CREATE TABLE `answertable` (
  `Aid` bigint(10) NOT NULL AUTO_INCREMENT,
  `answer` varchar(200) DEFAULT NULL,
  `no_of_like` int(200) DEFAULT NULL,
  `id` bigint(20) DEFAULT NULL,
  `uid` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`Aid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `answertable` */

insert  into `answertable`(`Aid`,`answer`,`no_of_like`,`id`,`uid`) values 
(1,'dont want to say\r\n',0,2,8),
(2,'first import the library consists of Big Integer as import java.math.*;',0,2,7);

/*Table structure for table `like_track_ans` */

DROP TABLE IF EXISTS `like_track_ans`;

CREATE TABLE `like_track_ans` (
  `ans_like_id` bigint(10) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(10) DEFAULT NULL,
  `ans_id` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`ans_like_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `like_track_ans` */

insert  into `like_track_ans`(`ans_like_id`,`user_id`,`ans_id`) values 
(1,9,1),
(2,4,1);

/*Table structure for table `like_track_question` */

DROP TABLE IF EXISTS `like_track_question`;

CREATE TABLE `like_track_question` (
  `que_like_id` bigint(10) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(10) DEFAULT NULL,
  `que_id` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`que_like_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `like_track_question` */

insert  into `like_track_question`(`que_like_id`,`user_id`,`que_id`) values 
(1,4,2),
(2,2,2),
(3,7,2),
(4,8,2),
(5,9,2);

/*Table structure for table `postquestion` */

DROP TABLE IF EXISTS `postquestion`;

CREATE TABLE `postquestion` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `question_title` varchar(100) DEFAULT NULL,
  `selected_topic` bigint(50) DEFAULT NULL,
  `question_discription` varchar(200) DEFAULT NULL,
  `uid` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `postquestion` */

insert  into `postquestion`(`id`,`question_title`,`selected_topic`,`question_discription`,`uid`) values 
(2,'what is margin?',5,'dcdcdc',5);

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
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `user_signup_table` */

insert  into `user_signup_table`(`username`,`password`,`conformpassword`,`email`,`rolefk`,`uid`) values 
('hardik','123','123','bhbhjhbhbh@gmail.com',2,1),
('mohit','123456',NULL,NULL,2,2),
('parth','1234567',NULL,NULL,2,3),
('hemal','12345678','12345678','bhbhjhbhbh@gmail.com',2,4),
('admin','admin','admin',NULL,1,5),
('Harsh Bhatt','1234','1234','hbhatt543@gmail.com',2,6),
('kaps','kaps','kaps','hbhatt543@gmail.com',2,7),
('kapsi','kapsi','kapsi','hbh543@gmail.com',2,8),
('ashu','ashu','ashu','hbhatt543@gmail.com',2,9);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
