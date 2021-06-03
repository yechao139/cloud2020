DELETE FROM emp_role;
DELETE FROM emp_user;

INSERT INTO emp_user (user_number, user_name, account, password, default_password, status, remark) VALUES('1', 'admin', 'admin1', 'e10adc3949ba59abbe56e057f20f883e', 1, 1,'FFF');
INSERT INTO emp_role (role_id, role_name, rec_flag, remark, create_date, modify_date) VALUES ('1', '超级管理员1', '1', '超级管理员不需修改', '2020-12-31 10:30:40', '2020-12-31 10:30:41');

DELETE FROM payment;
INSERT INTO payment(id, `serial`) VALUES (31, '微服务2020111');