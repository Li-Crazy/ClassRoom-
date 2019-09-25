/*
Navicat MySQL Data Transfer

Source Server         : web
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : web

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-06-11 09:57:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `schedule`
-- ----------------------------
DROP TABLE IF EXISTS `schedule`;
CREATE TABLE `schedule` (
  `ScheduleID` int(6) NOT NULL,
  `CourseID` char(6) NOT NULL,
  `ClassroomID` char(6) NOT NULL,
  `ClassID` char(6) NOT NULL,
  `TeacherID` char(6) NOT NULL,
  `SchoolTime` timestamp NOT NULL,
  PRIMARY KEY  (`ScheduleID`),
  KEY `CourseID` (`CourseID`),
  KEY `ClassroomID` (`ClassroomID`),
  KEY `ClassID` (`ClassID`),
  KEY `TeacherID` (`TeacherID`),
  CONSTRAINT `TeacherID` FOREIGN KEY (`TeacherID`) REFERENCES `teacher` (`TeacherID`),
  CONSTRAINT `ClassID` FOREIGN KEY (`ClassID`) REFERENCES `class` (`ClassID`),
  CONSTRAINT `ClassroomID` FOREIGN KEY (`ClassroomID`) REFERENCES `classroom` (`ClassroomID`),
  CONSTRAINT `CourseID` FOREIGN KEY (`CourseID`) REFERENCES `course` (`CourseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of schedule
-- ----------------------------
INSERT INTO `schedule` VALUES ('1', '001', '1101', 'fx171', '1', '2019-07-10 08:00:00');
INSERT INTO `schedule` VALUES ('2', '002', '1102', 'kj191', '2', '2019-07-10 10:00:00');
INSERT INTO `schedule` VALUES ('3', '003', '2204', 'xg162', '3', '2019-07-10 14:00:00');
INSERT INTO `schedule` VALUES ('4', '004', '3306', 'xgc161', '4', '2019-07-10 16:00:00');
