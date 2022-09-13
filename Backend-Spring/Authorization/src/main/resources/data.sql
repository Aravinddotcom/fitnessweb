drop table if exists userrecord;
create table userrecord(user_id int primary key ,user_name varchar(30),user_password varchar(20));


INSERT INTO userrecord (user_id,user_name,user_password) VALUES (101,'aravind','1234');
INSERT INTO userrecord (user_id,user_name,user_password) VALUES (102,'yasin','6287');
INSERT INTO userrecord (user_id,user_name,user_password) VALUES (103,'karan','8822');
INSERT INTO userrecord (user_id,user_name,user_password) VALUES (104,'vijay','7612');


h2 database 