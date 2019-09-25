/*
Navicat MySQL Data Transfer

Source Server         : web
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : web

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-06-11 09:53:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `AdminID` char(6) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `AdminName` varchar(10) NOT NULL,
  PRIMARY KEY  (`AdminID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('001', '123', '李强');
INSERT INTO `admin` VALUES ('002', '112', '张敏');
INSERT INTO `admin` VALUES ('003', '142', '张民');
