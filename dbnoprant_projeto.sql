
drop database dbnoprant;

CREATE DATABASE `DBNOPRANT` /*!40100 DEFAULT CHARACTER SET utf8 */;

SET SQL_SAFE_UPDATES=0;

CREATE SCHEMA dbnoprant_Projeto DEFAULT CHARACTER SET UTF8;

USE dbnoprant_Projeto;




show databases;

-- conta(pk), agencia, saldo
create table tabContaSaldo(
	CONTA INT UNSIGNED NOT NULL,
	AGENCIA INT UNSIGNED,
	nome varchar(40),
	SALDO DOUBLE,
	PRIMARY KEY(CONTA)
)

drop table tabContaSaldo;

show tables;


describe tabContaSaldo

insert into tabContaSaldo values(234560,4321,'Pablo',200);
insert into tabContaSaldo values(123456,4321,'Jorge',1000);
insert into tabContaSaldo values(111,111,'Luana',1000);

select * from tabContaSaldo where conta = 234560;

select * from tabContaSaldo;

SELECT * FROM tabContaSaldo WHERE conta = 111;

UPDATE tabContaSaldo SET saldo = 222 WHERE merCodigo = 123456;


UPDATE tabContaSaldo SET saldo = 500 WHERE conta = 234560; 
