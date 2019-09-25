/*
Navicat MySQL Data Transfer

Source Server         : web
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : web

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-06-11 09:56:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `classroom`
-- ----------------------------
DROP TABLE IF EXISTS `classroom`;
CREATE TABLE `classroom` (
  `ClassroomID` char(6) NOT NULL,
  `Amount` int(6) NOT NULL,
  `multimedia` char(10) NOT NULL,
  PRIMARY KEY  (`ClassroomID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classroom
-- ----------------------------
INSERT INTO `classroom` VALUES ('1101', '105', 'yes');
INSERT INTO `classroom` VALUES ('1102', '67', 'yes');
INSERT INTO `classroom` VALUES ('2204', '88', 'no');
INSERT INTO `classroom` VALUES ('3306', '109', 'yes');
INSERT INTO `classroom` VALUES ('4209', '80', 'no');
