/*
Navicat MySQL Data Transfer

Source Server         : web
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : web

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-06-11 09:57:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `TeacherID` char(6) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `TeacherName` varchar(10) NOT NULL,
  `department` varchar(20) NOT NULL,
  PRIMARY KEY  (`TeacherID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '124', '张蓓', '信息系');
INSERT INTO `teacher` VALUES ('2', '123', '阿济格', '信息系');
INSERT INTO `teacher` VALUES ('3', '123', 'asjdg', '文法系');
INSERT INTO `teacher` VALUES ('4', '134', '阿松把那', '经管系');
