/*
Navicat MySQL Data Transfer

Source Server         : web
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : web

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-06-11 09:56:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `application`
-- ----------------------------
DROP TABLE IF EXISTS `application`;
CREATE TABLE `application` (
  `TeacherID` char(6) NOT NULL,
  `CourseID` char(6) NOT NULL,
  `ClassroomID` char(6) NOT NULL,
  `NewClassroomID` char(6) NOT NULL,
  `SchoolTime` timestamp NOT NULL,
  `NewSchoolTime` timestamp NOT NULL,
  KEY `Teacher ID` (`TeacherID`),
  KEY `Course ID` (`CourseID`),
  KEY `Classroom ID` (`ClassroomID`),
  KEY `NewClassroom ID` (`NewClassroomID`),
  CONSTRAINT `NewClassroom ID` FOREIGN KEY (`NewClassroomID`) REFERENCES `classroom` (`ClassroomID`),
  CONSTRAINT `Classroom ID` FOREIGN KEY (`ClassroomID`) REFERENCES `classroom` (`ClassroomID`),
  CONSTRAINT `Course ID` FOREIGN KEY (`CourseID`) REFERENCES `course` (`CourseID`),
  CONSTRAINT `Teacher ID` FOREIGN KEY (`TeacherID`) REFERENCES `teacher` (`TeacherID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of application
-- ----------------------------
INSERT INTO `application` VALUES ('1', '001', '1101', '1102', '2019-07-10 08:00:00','2019-07-10 10:00:00');
INSERT INTO `application` VALUES ('2', '002', '1102', '1101', '2019-07-08 14:00:00','2019-07-10 10:00:00');
