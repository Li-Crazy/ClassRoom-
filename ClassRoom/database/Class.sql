/*
Navicat MySQL Data Transfer

Source Server         : web
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : web

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-06-11 09:56:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `class`
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `ClassID` char(6) NOT NULL,
  `ClassName` varchar(20) NOT NULL,
  `Amount` int(6) NOT NULL,
  `major` varchar(20) NOT NULL,
  `department` varchar(20) NOT NULL,
  PRIMARY KEY  (`ClassID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('fx171', '法学17-1', '33', '法学', '文法系');
INSERT INTO `class` VALUES ('kj191', '会计19-1', '41', '会计', '经管系');
INSERT INTO `class` VALUES ('xg162', '信息管理16-2', '39', '信息管理', '信息系');
INSERT INTO `class` VALUES ('xgc161', '信息工程16-1', '42', '信息工程', '信息系');
