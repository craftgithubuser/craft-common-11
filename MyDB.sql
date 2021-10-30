CREATE DATABASE MyDB;
use MyDB;

CREATE TABLE customers(
Cust_ID int auto_increment primary key,
Cust_Firstname varchar(100) not null,
Cust_lastname varchar(100) not null,
Cust_NickName varchar(100),
Cust_Age int,
Cust_Gender enum('Male', 'Female'),
Cust_Country varchar(100) not null,
Cust_Salary double not null
);
describe customers;