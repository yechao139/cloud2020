-- ----------------------------
-- Table structure for emp_role
-- ----------------------------
DROP TABLE IF EXISTS `emp_role`;
CREATE TABLE `emp_role` (
  `role_id` varchar(32)   NOT NULL COMMENT '全库唯一',
  `role_name` varchar(32)   DEFAULT NULL COMMENT '同一使用单位不允许重复',
  `rec_flag` tinyint(6)  DEFAULT NULL COMMENT '1启用0禁用',
  `remark` varchar(255)   DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `modify_date` datetime  ,
  PRIMARY KEY (`role_id`)
) ;
-- ----------------------------
-- Table structure for emp_user
-- ----------------------------
DROP TABLE IF EXISTS `emp_user`;
CREATE TABLE `emp_user` (
  `user_number` varchar(32)  NOT NULL COMMENT '用户编号，主键',
  `user_name` varchar(32)  DEFAULT NULL COMMENT '用户名称',
  `account` varchar(32)  DEFAULT NULL COMMENT '用户登录账号',
  `password` varchar(255)  DEFAULT NULL COMMENT '账号密码',
  `default_password` bit(1) DEFAULT NULL COMMENT '是否默认账户密码，0默认88888888,1用户输入密码',
  `status` bit(1) DEFAULT NULL COMMENT '状态，0不可用，1可用',
  `remark` varchar(255)  DEFAULT NULL COMMENT '备注',
  `email` varchar(32)  DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(32)  DEFAULT NULL COMMENT '手机号码',
  `avatar` varchar(255)  DEFAULT NULL COMMENT '头像照片',
  `sex` bit(1) DEFAULT NULL COMMENT '性别 0女，1男',
  `age` int(4) DEFAULT NULL COMMENT '年龄',
  `paper_type` int(2) DEFAULT NULL COMMENT '证件类型,0身份证，1护照，2其他',
  `paper_number` varchar(64)  DEFAULT NULL COMMENT '证件编号',
  `role_number` int(11) DEFAULT NULL COMMENT '角色编号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `invalid_time` datetime DEFAULT NULL COMMENT '失效时间',
  PRIMARY KEY (`user_number`)
) ;

-- ----------------------------
-- Table structure for emp_user_role
-- ----------------------------
DROP TABLE IF EXISTS `emp_user_role`;
CREATE TABLE `emp_user_role` (
  `user_number` varchar(32)  DEFAULT NULL,
  `role_number` varchar(32)  DEFAULT NULL
) ;

CREATE TABLE `payment` (
   `id` bigint(20) NOT NULL AUTO_INCREMENT,
   `serial` varchar(200) DEFAULT NULL,
   PRIMARY KEY (`id`)
) ;
