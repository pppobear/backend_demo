/*
Navicat MySQL Data Transfer

Source Server         : mysql1
Source Server Version : 50636
Source Host           : 127.0.0.1:3306
Source Database       : crm_test

Target Server Type    : MYSQL
Target Server Version : 50636
File Encoding         : 65001

Date: 2018-10-20 15:43:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `admin` bit(1) DEFAULT NULL,
  `dept_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', 'admin', 'c4ca4238a0b923820dcc509a6f75849b', 'admin@abc.com', '20', '', '7');
INSERT INTO `employee` VALUES ('2', '赵总', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '35', '\0', '1');
INSERT INTO `employee` VALUES ('3', '赵一明', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '25', '\0', '1');
INSERT INTO `employee` VALUES ('4', '钱总', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '35', '\0', '2');
INSERT INTO `employee` VALUES ('5', '钱二明', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '25', '\0', '2');
INSERT INTO `employee` VALUES ('6', '孙总', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '35', '\0', '3');
INSERT INTO `employee` VALUES ('7', '孙三明', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '25', '\0', '3');
INSERT INTO `employee` VALUES ('8', '李总', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '35', '\0', '4');
INSERT INTO `employee` VALUES ('9', '李四明', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '25', '\0', '4');
INSERT INTO `employee` VALUES ('10', '周总', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '35', '\0', '5');
INSERT INTO `employee` VALUES ('11', '周五明', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '25', '\0', '5');
INSERT INTO `employee` VALUES ('12', '吴总', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '35', '\0', '6');
INSERT INTO `employee` VALUES ('13', '吴六明', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '25', '\0', '6');
INSERT INTO `employee` VALUES ('14', '郑总', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '35', '\0', '7');
INSERT INTO `employee` VALUES ('15', '郑七明', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '25', '\0', '7');
INSERT INTO `employee` VALUES ('16', '孙四明', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '25', '\0', '3');
INSERT INTO `employee` VALUES ('17', '孙五明', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '25', '\0', '3');
INSERT INTO `employee` VALUES ('18', '李五明', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '25', '\0', '4');
INSERT INTO `employee` VALUES ('19', '李六明', 'c4ca4238a0b923820dcc509a6f75849b', 'xx@xx.com', '25', '\0', '4');
