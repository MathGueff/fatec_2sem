-- EXERCÍCIO 02 PARA ENTREGA
create database ex02Banco
go
use ex02Banco

-- Exercício 01 Criando a tabela Tbl_Clientes

create table Tbl_Clientes(
	Id int primary key identity (1,1) not null,
	Nome varchar(50),
	Email varchar (100),
	Telefone varchar (15)
)

-- Exercícicio 02 Adicionando novo cliente

insert into Tbl_Clientes(Nome,Email,Telefone) values
('João Silva', 'joao@email.com', '(11)1234-5678')

-- Exercícicio 03 Adicionando 10 registros a clientes

insert into Tbl_Clientes(Nome,Email,Telefone) values
('Matheus Gueff', 'matheus@gmail.com', '(15)9919-9292'),
('Lavínia Fonseca', 'lavinia@gmail.com', '(15)9117-8292'),
('Piva Pivinha', 'pivinha@gmail.com', '(15)9999-8888'),
('Lucas Felipe', 'felipe@gmail.com', '(15)1128-1233'),
('Drop Table', 'drop@gmail.com', '(15)7629-1292'),
('Luiz Flávio', 'lf@gmail.com', '(11)0821-1254'),
('Erwing Hernandes', 'erwing@gmail.com', '(15)9999-9292'),
('Xande', 'xande@gmail.com', '(15)1266-0298'),
('Yara Mendes', 'yara@gmail.com', '(15)9923-0192'),
('Nicolas Ferreira', 'nicolas@gmail.com', '(15)9926-0999')

-- Exercícicio 04 Atualizando o telefone do cliente Id 1

update Tbl_Clientes set Telefone = '(11) 8765-4321' where Id = 1;

-- Exercícicio 05 Criando tabela Tbl_Produtos

create table Tbl_Produtos(
	Id int primary key identity (1,1) not null,
	Nome varchar (50),
	Preco decimal(5,2),
	Estoque int
)

-- Exercícicio 06

insert into Tbl_Produtos(Nome,Preco,Estoque) values 
('Camiseta', 29.99, 100)

-- Exercícicio 07 Adicionando mais 10 produtos à tabela Tbl_Produtos

insert into Tbl_Produtos(Nome,Preco,Estoque) values 
('Óculos', 44.99, 2),
('Shorts', 31.99, 10),
('Prancha de Surfe', 290.99, 15),
('Mouse', 11.99, 20),
('Teclado', 20.99, 35),
('Helicóptero (de brinquedo)', 400.00, 12),
('Patins', 9.99, 7),
('Bolo de chocolate', 51.99, 4),
('Blusa de frio', 110.99, 2),
('Calça', 120.99, 1)

-- Exercícicio 08 Atualizando o preço do produto com Id = 1 para 39.99

update Tbl_Produtos set Preco = 39.99 where Id = 1;

-- Exercícicio 09 Criando tabela Tbl_Pedidos

create table Tbl_Pedidos (
	Id int primary key identity (1,1),
	ClienteId int,
	ProdutoId int,
	Quantidade int,
	DataPedido date,
	Constraint FK_PedidoCliente foreign key (ClienteId) references Tbl_Clientes (Id),
	Constraint FK_PedidoProduto foreign key (ProdutoId) references Tbl_Produtos (Id)
)

-- Exercícicio 10 Adicionando um novo pedido

insert into Tbl_Pedidos(ClienteId,ProdutoId,Quantidade,DataPedido) values
(1,1,2, '2024-09-03')

-- Exercícicio 11 Atualizando a quantidade do pedido com id 1

update Tbl_Pedidos set Quantidade = 3 where Id = 1;

-- Exercícicio 12 Adicionando mais 10 registros a tabela Tbl_Pedidos

-- Exercícicio 13

-- Exercícicio 14

-- Exercícicio 15

-- Exercícicio 16

-- Exercícicio 17

-- Exercícicio 18

-- Exercícicio 19

-- Exercícicio 20

-- SELECTS

select * from Tbl_Clientes;
select * from Tbl_Produtos;
select * from Tbl_Pedidos;

DBCC CHECKIDENT('Tbl_Produtos', RESEED, 0)