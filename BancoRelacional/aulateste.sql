--create database nomeBanco
use NomeDoBanco;

Create table Cliente
(
	Cod_Cli int not null,
	Nome_Cli varchar(40) not null,
	End_Cli varchar(30) not null,
	Bai_Cli varchar(20) not null,
	Cid_Cli varchar(20) not null,
	Uf_Cli char(3) not null,
	Tel_Cli varchar(15) null,
	Constraint PK_Cliente Primary Key(Cod_Cli)
)
