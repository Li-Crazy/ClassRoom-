/*
Navicat MySQL Data Transfer

Source Server         : web
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : web

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-06-11 09:57:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `StudentID` char(6) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `StudentName` varchar(10) NOT NULL,
  `department` varchar(20) NOT NULL,
  `ClassID` char(6) NOT NULL,
  PRIMARY KEY  (`StudentID`)
  KEY `Class ID` (`ClassID`),
  CONSTRAINT `Class ID` FOREIGN KEY (`ClassID`) REFERENCES `class` (`ClassID`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('014736', '4353', '孙子辈', '经管系','kj191');
INSERT INTO `student` VALUES ('016113', '123', '张强', '信息系','xg162');
INSERT INTO `student` VALUES ('017123', '132', '李敏', '信息系','xg161');
INSERT INTO `student` VALUES ('019127', '89756', '张无忌', '文法系','fx171');
