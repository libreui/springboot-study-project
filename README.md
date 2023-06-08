## 前后端分离项目模版

包含基本的登录、注册、密码重置登登功能，可以二次开发编写具体场景下的应用程序。

* 登录功能（支持用户名、邮箱登录）
* 注册用户（通过邮箱注册）
* 重置密码（通过邮箱重置密码）


## 数据库创建语句

```mysql
/*
 Navicat Premium Data Transfer

 Source Server         : Docker
 Source Server Type    : MySQL
 Source Server Version : 80018 (8.0.18)
 Source Host           : localhost:3306
 Source Schema         : study

 Target Server Type    : MySQL
 Target Server Version : 80018 (8.0.18)
 File Encoding         : 65001

 Date: 08/06/2023 16:45:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for db_account
-- ----------------------------
DROP TABLE IF EXISTS `db_account`;
CREATE TABLE `db_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `username` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_name` (`username`),
  UNIQUE KEY `unique_email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for persistent_logins
-- ----------------------------
DROP TABLE IF EXISTS `persistent_logins`;
CREATE TABLE `persistent_logins` (
  `username` varchar(64) COLLATE utf8mb4_general_ci NOT NULL,
  `series` varchar(64) COLLATE utf8mb4_general_ci NOT NULL,
  `token` varchar(64) COLLATE utf8mb4_general_ci NOT NULL,
  `last_used` timestamp NOT NULL,
  PRIMARY KEY (`series`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

SET FOREIGN_KEY_CHECKS = 1;
```