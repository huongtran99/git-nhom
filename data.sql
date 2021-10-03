CREATE DATABASE qlbh;

USE qlbh;

create table users
(
    user_id         int auto_increment primary key,
    user_name       varchar(50)  not null,
    password        varchar(50)  not null,
    password_retype varchar(50)  not null,
    email           varchar(50)  not null,
    create_date     varchar(50)  not null,
    role            varchar(50)  not null,
    avatar          varchar(150),
    gender          varchar(50)  not null,
    phone           varchar(50)  not null,
    about          varchar(50)
);

create table user_role
(
    user_role_id         int primary key auto_increment,
    name_role            varchar(50) not null ,
    user_id int,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

insert into users values(1,'Admin', '123', '123', 'admin@abc.com', '2/10/2021', 'Admin', '', 'Nam', '0123456789', 'Đẹp trai có quyền');
insert into users values(2,'Customer', '123', '123', 'customer@abc.com', '2/10/2021', 'Customer', '', 'Nam', '0123456789', 'Chỉ có quyền mua bán thôi');

insert into user_role values(1,'Admin', 1);
insert into user_role values(2,'Customer', 2);
