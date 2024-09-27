create database ex03Banco;
use ex03Banco;

-- Ex01 Criando tabela Setor 
create table Setor(
	COD_SETOR int primary key identity(1,1) not null,
	NOME_SETOR varchar(30) not null
)

-- Ex02 Criando tabela Funcionario
create table Funcionario(
	NRMATRICULA int primary key identity(1,1) not null,
	PRIMEIRO_NOME varchar(20) not null,
	ULTIMO_NOME varchar(50) not null,
	EMAIL varchar(200) not null,
	TELEFONE varchar(20) not null,
	DATA_ADMISSAO datetime not null,
	SALARIO float not null,
	COD_SETOR int not null,
	Constraint FK_SETOR_FUNCIONARIO foreign key (COD_SETOR) references Setor(COD_SETOR)
)

-- Ex03 Adicionando chave primária e estrangeira (já feito nos ex 01 e 02)

-- Ex04 Adicionando 5 registros para a tabela Setor
insert into Setor(NOME_SETOR) values 
('TI'),
('SE'),
('TheOffice'),
('LO'),
('RH')

-- Ex05 Adicionando 5 registros para a tabela Funcionario
insert into Funcionario(PRIMEIRO_NOME,ULTIMO_NOME,EMAIL,TELEFONE,DATA_ADMISSAO,SALARIO,COD_SETOR)
values
('Matheus','Gueff','gueff@gmail.com','(15)98822-2222','10/02/1900',4500,1),
('Robson','Rodrigues','robison@gmail.com','(50)91283-2187','22/01/2000',2000,1),
('Pedro','Pedro','pedro@gmail.com','(15)99992-1234','01/05/2024',9999,2),
('Sérgio','Aviões','foguetes@gmail.com','(15)12345-1234','30/12/2020',7354,3),
('Fiapo','Manga','fiapo@gmail.com','(15)11123-3435','10/08/2019',4500,4),
('Rodrigo','Rodrigues','rr@gmail.com','(15)34553-9281','29/05/2010',1200,5),
('Henrique','Juliano','hj@gmail.com','(15)02938-1234','23/09/2013',1000,5),
('Nicolas','Lauis','lauis@gmail.com','(15)12983-3213','30/04/2015',20000,2),
('Henrika','Henrique','hh@gmail.com','(15)12143-1454','28/12/2010',1242,4),
('Julius','Juliano','jj@gmail.com','(15)31414-4444','12/10/2009',2390,5),
('Gamer','Games','gamer@gmail.com','(15)12389-1124','09/01/2011',1092,1)

-- Ex06a Exibindo os códigos dos setores exclusivos da tabela Funcionario

select distinct COD_SETOR from Funcionario

-- Ex06b Concatenando sobrenome com o código do setor

select ULTIMO_NOME + ', ' + CONVERT(VARCHAR, COD_SETOR) AS 'Empregado e Setor' from Funcionario

-- Ex07 Exibindo nome, sobrenome, e de funcionarios que recebem mais que 2500

select PRIMEIRO_NOME, ULTIMO_NOME, SALARIO from Funcionario where SALARIO > 2500

-- Ex08 Exibindo o nome, sobrenome e código do departamento para o número de matrícula 5 

select PRIMEIRO_NOME, ULTIMO_NOME, SALARIO from Funcionario where NRMATRICULA = 5

-- Ex09 Exibindo nome, sobrenome e o salario de funcionarios que não recebem entre 1500 e 3000

select PRIMEIRO_NOME, ULTIMO_NOME, SALARIO from Funcionario where SALARIO NOT BETWEEN 1500 AND 3000

-- Ex10 Exibir o nome, sobrenome, código do setor e data de admissão dos funcionários admitidos desde de 2009. Ordene pela data de admissão. 

select PRIMEIRO_NOME, ULTIMO_NOME, COD_SETOR, DATA_ADMISSAO from Funcionario where DATA_ADMISSAO > '2009' order by DATA_ADMISSAO

-- Ex11 Exibindo funcionários que pertençam ao departamento de RH e TI por ordem numérica

select * from Funcionario where COD_SETOR = (select COD_SETOR from Setor where NOME_SETOR = 'TI') or COD_SETOR = (select COD_SETOR from Setor where NOME_SETOR = 'RH') order by COD_SETOR

-- Ex12 Exibindo nome de funcionarios que tenham 'a' como segunda letra do nome

select * from Funcionario where PRIMEIRO_NOME like '_[a]%'

-- Ex13 Nome de funcionarios que tenham uma letra a e uma letra e no nome

select * from Funcionario where PRIMEIRO_NOME like '%a%' and PRIMEIRO_NOME like '%e%'

-- Ex14 Exibindo funcionários que pertençam ao setor 2 por ordem de nome

select * from Funcionario where COD_SETOR = 2 order by PRIMEIRO_NOME

-- Ex15 Exibindo funcionários que pertençam ao setor 2 e 5

select * from Funcionario where COD_SETOR in(2,5)

-- Ex16 Exibindo funcionários que tenham salario maior que 2300 e pertençam ao setor 3

select * from Funcionario where SALARIO > 2300 and COD_SETOR = 3
