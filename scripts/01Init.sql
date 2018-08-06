create database chatroom;
use chatroom;
create table user(
	id int primary key auto_increment,
	username varchar(20),
	password varchar(20),
	type varchar(20)
);

insert into user values (null,'aaa','aaa','admin');
insert into user values (null,'bbb','bbb','user');
insert into user values (null,'ccc','ccc','admin');
insert into user values (null,'ddd','ddd','user');