/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50549
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50549
 File Encoding         : 65001

 Date: 14/04/2019 19:21:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence`  (
  `next_val` bigint(20) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES (2);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `age` int(11) NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `UK_lqjrcobrh9jc8wpcar64q1bfh`(`user_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (9, 888, '888', '女', '888');
INSERT INTO `user` VALUES (10, 999, '999', '女', '999');
INSERT INTO `user` VALUES (11, 42423, '4234', '女', '4342');
INSERT INTO `user` VALUES (12, 31231, '24141', '女', '4412');
INSERT INTO `user` VALUES (13, 1414241, '1414', '女', '341414');
INSERT INTO `user` VALUES (14, 3213, '3123123', '女', 'g3213');
INSERT INTO `user` VALUES (15, 12, '3213', '女', 'eqweq');
INSERT INTO `user` VALUES (16, 31231, '32123123', '女', 'vvv');
INSERT INTO `user` VALUES (17, 123123, '13213', '女', 'vvvv');
INSERT INTO `user` VALUES (19, 78, 'sada21312', '女', 'jjlk');

SET FOREIGN_KEY_CHECKS = 1;
