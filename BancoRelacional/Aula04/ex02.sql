-- EXERC�CIO 02 PARA ENTREGA
create database ex02Banco
go
use ex02Banco

-- Exerc�cio 01 Criando a tabela Tbl_Clientes

create table Tbl_Clientes(
	Id int primary key identity (1,1) not null,
	Nome varchar(50),
	Email varchar (100),
	Telefone varchar (15)
)

-- Exerc�cicio 02 Adicionando novo cliente

insert into Tbl_Clientes(Nome,Email,Telefone) values
('Jo�o Silva', 'joao@email.com', '(11)1234-5678')

-- Exerc�cicio 03 Adicionando 10 registros a clientes

insert into Tbl_Clientes(Nome,Email,Telefone) values
('Matheus Gueff', 'matheus@gmail.com', '(15)9919-9292'),
('Lav�nia Fonseca', 'lavinia@gmail.com', '(15)9117-8292'),
('Piva Pivinha', 'pivinha@gmail.com', '(15)9999-8888'),
('Lucas Felipe', 'felipe@gmail.com', '(15)1128-1233'),
('Drop Table', 'drop@gmail.com', '(15)7629-1292'),
('Luiz Fl�vio', 'lf@gmail.com', '(11)0821-1254'),
('Erwing Hernandes', 'erwing@gmail.com', '(15)9999-9292'),
('Xande', 'xande@gmail.com', '(15)1266-0298'),
('Yara Mendes', 'yara@gmail.com', '(15)9923-0192'),
('Nicolas Ferreira', 'nicolas@gmail.com', '(15)9926-0999')

-- Exerc�cicio 04 Atualizando o telefone do cliente Id 1

update Tbl_Clientes set Telefone = '(11) 8765-4321' where Id = 1;

-- Exerc�cicio 05 Criando tabela Tbl_Produtos

create table Tbl_Produtos(
	Id int primary key identity (1,1) not null,
	Nome varchar (50),
	Preco decimal(5,2),
	Estoque int
)

-- Exerc�cicio 06

insert into Tbl_Produtos(Nome,Preco,Estoque) values 
('Camiseta', 29.99, 100)

-- Exerc�cicio 07 Adicionando mais 10 produtos � tabela Tbl_Produtos

insert into Tbl_Produtos(Nome,Preco,Estoque) values 
('�culos', 44.99, 2),
('Shorts', 31.99, 10),
('Prancha de Surfe', 290.99, 15),
('Mouse', 11.99, 20),
('Teclado', 20.99, 35),
('Helic�ptero (de brinquedo)', 400.00, 12),
('Patins', 9.99, 7),
('Bolo de chocolate', 51.99, 4),
('Blusa de frio', 110.99, 2),
('Cal�a', 120.99, 1)

-- Exerc�cicio 08 Atualizando o pre�o do produto com Id = 1 para 39.99

update Tbl_Produtos set Preco = 39.99 where Id = 1;

-- Exerc�cicio 09 Criando tabela Tbl_Pedidos

create table Tbl_Pedidos (
	Id int primary key identity (1,1),
	ClienteId int,
	ProdutoId int,
	Quantidade int,
	DataPedido date,
	Constraint FK_PedidoCliente foreign key (ClienteId) references Tbl_Clientes (Id),
	Constraint FK_PedidoProduto foreign key (ProdutoId) references Tbl_Produtos (Id)
)

-- Exerc�cicio 10 Adicionando um novo pedido

insert into Tbl_Pedidos(ClienteId,ProdutoId,Quantidade,DataPedido) values
(1,1,2, '2024-09-03')

-- Exerc�cicio 11 Atualizando a quantidade do pedido com id 1

update Tbl_Pedidos set Quantidade = 3 where Id = 1;

-- Exerc�cicio 12 Adicionando mais 10 registros a tabela Tbl_Pedidos

-- Exerc�cicio 13

-- Exerc�cicio 14

-- Exerc�cicio 15

-- Exerc�cicio 16

-- Exerc�cicio 17

-- Exerc�cicio 18

-- Exerc�cicio 19

-- Exerc�cicio 20

-- SELECTS

select * from Tbl_Clientes;
select * from Tbl_Produtos;
select * from Tbl_Pedidos;

DBCC CHECKIDENT('Tbl_Produtos', RESEED, 0)