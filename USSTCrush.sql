/*
 Navicat Premium Data Transfer

 Source Server         : carrotPeanutButter
 Source Server Type    : MySQL
 Source Server Version : 50733
 Source Host           : 127.0.0.1:3306
 Source Schema         : USSTCrush

 Target Server Type    : MySQL
 Target Server Version : 50733
 File Encoding         : 65001

 Date: 13/11/2021 15:43:04
*/

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for crush
-- ----------------------------
DROP TABLE IF EXISTS `crush`;
CREATE TABLE `crush`
(
    `uname`   varchar(255) CHARACTER SET gbk DEFAULT NULL,
    `tname`   varchar(255) CHARACTER SET gbk DEFAULT NULL,
    `checked` tinyint(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for end
-- ----------------------------
DROP TABLE IF EXISTS `end`;
CREATE TABLE `end`
(
    `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `name`  varchar(255) CHARACTER SET gbk DEFAULT NULL,
    `email` varchar(255) CHARACTER SET gbk DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SET
FOREIGN_KEY_CHECKS = 1;
