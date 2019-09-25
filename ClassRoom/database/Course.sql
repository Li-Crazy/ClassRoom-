/*
Navicat MySQL Data Transfer

Source Server         : web
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : web

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-06-11 09:57:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `CourseID` char(6) NOT NULL,
  `CourseName` varchar(10) NOT NULL,
  `TeacherID` char(6) NOT NULL,
  PRIMARY KEY  (`CourseID`),
  KEY `TeachersID` (`TeacherID`),
  KEY `CourseID` (`CourseID`,`CourseName`,`TeacherID`),
  KEY `CourseID_2` (`CourseID`,`CourseName`),
  CONSTRAINT `TeachersID` FOREIGN KEY (`TeacherID`) REFERENCES `teacher` (`TeacherID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('001', '软件工程', '1');
INSERT INTO `course` VALUES ('002', '数据库原理', '2');
INSERT INTO `course` VALUES ('003', '法学', '3');
INSERT INTO `course` VALUES ('004', '会计学', '4');
