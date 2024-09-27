use FBD;

-- CRIAÇÃO DAS TABELAS CIDADE E EMPREGADO

create table Cidade(
	Codcidade int identity (1,1) not null primary key,
	Nomecidade varchar(40),
	cdestado varchar(2)
)

create table Empregado(
	Nrmatricula int identity (1,1) primary key,
	Nome varchar(50),
	Data_admissao datetime,
	Salario float
)

-- INSERT NAS DUAS TABELAS

insert into Cidade(Nomecidade, cdestado) values
('Sorocaba', 'SP'),
('Votorantim', 'SP'),
('Pitanguinha', 'MG'),
('Vissi', 'BH'),
('Riozin', 'RS')

insert into Empregado(Nome, Data_admissao, Salario) values
('Davy','11/02/24',200.00),
('Ribeiro','29/01/18',120.00),
('Paulo','11/12/21',1000.00),
('Iara','23/11/23',300.00),
('Jones','07/10/21',750.00)

-- RETORNANDO CADA ESTADO EM UMA LINHA (DISTINCT)
select distinct cdestado from Cidade 

select distinct unidade from produto;

select cdestado, Nomecidade from Cidade;

-- Fica ao lado de cada linha
select 'Código do Cliente', Cod_cliente,  'Nome do Cliente', Nome_cliente from cliente

-- Fica ao topo (substitui nome da coluna)
select Cod_cliente as 'Código do Cliente', Nome_cliente as 'Nome do Cliente' from cliente

-- Expressão e apelido
select Nome, Salario, Salario + 1800 'Aumento do salario', (Salario -2000) / 2 'Salário real' from Empregado

-- Concatenação 
select 'Funcionário: '+nome+' Salario: '+CONVERT(VARCHAR, Salario) as 'Informações do Funcionário', salario, nome from Empregado;

-- CONDIÇÕES

-- WHERE
select num_pedido as 'Numero do pedido', cod_produto as 'Código do Produto', quantidade as 'Quantidade do pedido' 
from item_pedido 
where quantidade = 120;

select Nome, Salario from Empregado where Salario < 1500;

select Nome, Salario from Empregado where Salario between 1500 and 2000;

select cod_produto, descricao from produto where Valor_unitario between 0.32 and 2.00;

-- LIKE

select Nome, Salario from Empregado where Nome like 'D%'

select cod_produto, descricao, unidade from produto where unidade like 'K%'

select * from produto where cod_produto > 8 and cod_produto like '1%'

-- IN E NOT IN

select * from vendedor where faixa_comissao in ('A','B');

select * from vendedor where faixa_comissao not in ('A','B');

-- IS NULL

select * from cliente where IE is null;

select * from cliente where IE is not null;

-- AND

select * from Empregado where Salario > 100 and Nrmatricula >= 3;

-- OR

select * from Empregado where Salario > 800 or Nrmatricula = 4

-- REVISAO AND

select * from produto where Unidade = 'M' and Valor_unitario = 1.05

select * from produto where Unidade = 'UN' and Valor_unitario = 4

-- ORDER BY (ASC)

select nome_vendedor,salario_fixo from vendedor order by nome_vendedor

select nome_vendedor, salario_fixo from vendedor order by nome_vendedor, salario_fixo

-- ORDER BY (DESC)

select nome_vendedor,salario_fixo from vendedor order by nome_vendedor DESC

-- INSERT USANDO A TABELA

create table Pessoa(
	id_pessoa int primary key identity(1,1) not null,
	nome varchar(20),
	cpf varchar(14)
)

create table Pessoa_fisica(
	id_pessoa int primary key identity(1,1) not null,
	nome varchar(20),
	cpf varchar(14)
)

insert into Pessoa values
('João', '11111111111'),
('Miguel', '21111111111')

insert into Pessoa_fisica (nome,cpf) select nome,cpf from Pessoa

select * from Pessoa
select * from Pessoa_fisica
