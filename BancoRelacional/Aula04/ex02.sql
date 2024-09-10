-- EXERCÍCIO 02 PARA ENTREGA
create database ex02Banco
go
use ex02Banco

-- Exercício 01 Criando a tabela Tbl_Clientes

create table Tbl_Clientes(
	Id int primary key identity (1,1) not null,
	Nome varchar(50) not null,
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
	Nome varchar (50) not null,
	Preco decimal(5,2) not null,
	Estoque int not null
)

-- Exercícicio 06 Adicionando um produto

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
	Id int primary key identity (1,1) not null,
	ClienteId int not null,
	ProdutoId int not null,
	Quantidade int not null,
	DataPedido date not null,
	Constraint FK_PedidoCliente foreign key (ClienteId) references Tbl_Clientes (Id),
	Constraint FK_PedidoProduto foreign key (ProdutoId) references Tbl_Produtos (Id)
)

-- Exercícicio 10 Adicionando um novo pedido

insert into Tbl_Pedidos(ClienteId,ProdutoId,Quantidade,DataPedido) values
(1,1,2, '2024-09-03')

-- Exercícicio 11 Atualizando a quantidade do pedido com id 1

update Tbl_Pedidos set Quantidade = 3 where Id = 1;

-- Exercícicio 12 Adicionando mais 10 registros a tabela Tbl_Pedidos

insert into Tbl_Pedidos(ClienteId, ProdutoId, Quantidade, DataPedido) values
(2,7,4,'2022-10-28'),
(6,1,10,'2021-06-09'),
(6,2,2,'2023-05-26'),
(7,5,12,'2022-01-21'),
(7,6,8,'2022-12-12'),
(7,8,2,'2022-11-09'),
(4,10,20,'2022-10-19'),
(4,9,3,'2022-08-12'),
(5,3,5,'2022-11-10'),
(5,11,7,'2022-02-20')

-- Exercícicio 13 Criando a tabela Tbl_Funcionarios
create table Tbl_Funcionarios(
	Id int Primary Key identity(1,1) not null,
	Nome varchar(50) not null,
	Cargo varchar(50) not null,
	Salario decimal not null
)

-- Exercícicio 14 Adicionando novo funcionário Maria
insert into Tbl_Funcionarios(Nome,Cargo,Salario) values
('Maria Santos', 'Gerente', 5000)

-- Exercícicio 15 Atualizando o salário do Id 1 para 6000

update Tbl_Funcionarios set Salario = 6000 where Id = 1;

-- Exercícicio 16 Adicionando mais 10 registros a Tbl_Funcionarios

insert into Tbl_Funcionarios(Nome,Cargo,Salario) values
('Davy Ribério', 'Administrador', 10),
('Matheus Gueff', 'Dono', 1000000),
('Suehtam Ffueg', 'Dono2', 1000000*2),
('Jonathan Mendes', 'Gerente', 5000),
('Zé Nínguem', 'Estagiário', 1),
('Zézinho', 'Funcionário', 10000),
('Lavínia Santos', 'Dona', 1000000*3),
('Cristiane Palomas', 'Funcionario', 20),
('Hugo Ruivo', 'Funcionario', 30),
('Enzo Ribeiro', 'Funcionario', 40)

-- Exercícicio 17 Criando a tabela Tbl_Vendas
create table Tbl_Vendas(
	Id int primary key identity(1,1) not null,
	ProdutoId int not null,
	Quantidade int not null,
	ValorTotal decimal(5,2) not null,
	DataVenda date not null,
	Constraint FK_Venda_Produto foreign Key (ProdutoId) references Tbl_Produtos (Id)
)

-- Exercícicio 18 Adicionando uma venda
insert into Tbl_Vendas(ProdutoId,Quantidade,ValorTotal,DataVenda) values
(1,2,79.98,'2024-09-10')

-- Exercícicio 19 Adicionando mais 10 registros a Tbl_Vendas

insert into Tbl_Vendas(ProdutoId,Quantidade,ValorTotal,DataVenda) values
(1,3,10.00,'2024-09-03'),
(7,4,120.00,'2022-10-28'),
(1,10,50.00,'2021-06-09'),
(2,2,80.00,'2023-05-26'),
(5,12,120.00,'2021-09-01'),
(6,8,75.00,'2019-09-14'),
(8,2,12.00,'2020-12-15'),
(10,20,90.00,'2023-10-09'),
(9,3,700.00,'2021-03-30'),
(3,5,140.00,'2020-04-19')

-- Exercícicio 20 Excluindo a venda Id 1 da tabela Tbl_Vendas

delete from Tbl_Vendas where Id = 1

-- SELECTS

select * from Tbl_Clientes;
select * from Tbl_Produtos;
select * from Tbl_Pedidos;
select * from Tbl_Funcionarios;
select * from Tbl_Vendas;