create table address(
addressid int not null primary key  auto_increment ,
addressinfo varchar(255) default ''
);

create table user(
userid int not null primary key  auto_increment ,
name varchar(20) default '',
password varchar(12) 
);
