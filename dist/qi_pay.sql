/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.27 : Database - qi_pay
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`qi_pay` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `qi_pay`;

/*Table structure for table `pay_ta` */

DROP TABLE IF EXISTS `pay_ta`;

CREATE TABLE `pay_ta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL,
  `sn` varchar(4) NOT NULL,
  `forward_url` varchar(64) DEFAULT NULL,
  `notify_url` varchar(64) DEFAULT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `pay_ta` */

insert  into `pay_ta`(`id`,`name`,`sn`,`forward_url`,`notify_url`,`timestamp`,`description`) values (1,'111','1A2B','111','111','2012-10-15 15:35:32','111');

/*Table structure for table `pay_ta_pay` */

DROP TABLE IF EXISTS `pay_ta_pay`;

CREATE TABLE `pay_ta_pay` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL,
  `index` varchar(15) NOT NULL,
  `logo` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `pay_ta_pay` */

insert  into `pay_ta_pay`(`id`,`name`,`index`,`logo`) values (1,'支付宝','0','daily_reward_ball.png'),(2,'财付通','1','daily_reward_ball.png'),(3,'Q币','2','icon-default.png');

/*Table structure for table `pay_transaction` */

DROP TABLE IF EXISTS `pay_transaction`;

CREATE TABLE `pay_transaction` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `transaction_sn` varchar(32) NOT NULL,
  `ta_transaction_sn` varchar(64) NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `t_timestamp` timestamp NULL DEFAULT NULL,
  `ta` varchar(32) NOT NULL,
  `tr` varchar(64) NOT NULL,
  `amount` decimal(10,2) NOT NULL,
  `status` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `pay_transaction` */

insert  into `pay_transaction`(`id`,`transaction_sn`,`ta_transaction_sn`,`timestamp`,`t_timestamp`,`ta`,`tr`,`amount`,`status`) values (1,'1A2B-12101594708','1A2B-12101594708','2012-10-15 16:01:50',NULL,'1A2B','acekiller','0.00',''),(2,'1A2B-12101520043','1A2B-12101520043','2012-10-15 16:04:16',NULL,'1A2B','acekiller','0.01','');

/*Table structure for table `pay_transaction_log` */

DROP TABLE IF EXISTS `pay_transaction_log`;

CREATE TABLE `pay_transaction_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `comment` varchar(255) NOT NULL,
  `level` char(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pay_transaction_log` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
