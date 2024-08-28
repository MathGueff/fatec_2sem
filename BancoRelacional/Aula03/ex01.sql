--EXERC�CIO 01 - PARA ENTREGA

create database ex01Banco;
use ex01Banco;

-- Exerc�cio 1 Tabela Professores

create table Professores(
	Id int identity(1,1) not null,
	Nome varchar(50),
	Disciplina varchar (15)
	Constraint PK_Professores Primary Key (Id)
)

-- Exerc�cio 2 Adicionando um professor

insert into Professores(Nome,Disciplina) values('Ana Oliveira', 'Portugu�s');

-- Exerc�cio 3 Atualizando o professor com ID igual a 1

update Professores set Nome = 'Ana Silva' where Id = 1;

-- Exerc�cio 4 Adicionando mais 10 registros aleat�rios

insert into Professores(Nome,Disciplina) values
('L�via Rodrigues', 'Matem�tica'),
('Lav�nia Fonseca', 'Hist�ria'),
('Lucas Mendes', 'Portugu�s'),
('Lu�s Queiroz', 'Portugu�s'),
('Paulo Vil', 'Matem�tica'),
('Luiz Fl�vio', 'Web'),
('Paula Fernada', 'Portugu�s'),
('Alberto Oliveira', 'Geografia'),
('H�lio Roberto', 'Biologia'),
('Amanda Sewaybricker', 'Artes')

-- Exerc�cio 5 Excluindo o professor com ID igual a 2 da tabela

delete from Professores where Id = 2;

-- Exerc�cio 6 Criando a tabela Turmas

create table Turmas (
	Id int identity (1,1) not null,
	Nome varchar(50),
	ProfessorResponsavel int,
	Constraint PK_Turmas Primary Key (Id),
	Constraint FK_Professor Foreign key (ProfessorResponsavel) References Professores(Id)
)

-- Exerc�cio 7 Adicionando a turma 9A

insert into Turmas (Nome, ProfessorResponsavel) values ('9A', '1');

-- Exerc�cio 8 Adicionando mais 10 registros a tabela turma

insert into Turmas (Nome, ProfessorResponsavel) values
('8B', '3'),
('7C', '8'),
('3B', '5'),
('8C', '9'),
('5D', '4'),
('6A', '3'),
('9B', '6'),
('9C', '7'),
('8D', '11'),
('9D', '10')


-- Exerc�cio 9 Criando a tabela Alunos

create table Alunos(
	Id int identity(1,1) not null,
	Nome varchar (50),
	DataNascimento date,
	TurmaID int,
	Constraint PK_Alunos Primary key (Id),
	Constraint FK_Turma Foreign key (TurmaID) references Turmas(Id)
)

-- Exerc�cio 10 Adicionando um aluno

insert into Alunos (Nome,DataNascimento, TurmaID) values ('Maria Souza', '2005-10-15', 1)

-- Exerc�cio 11 Atualizando o nome do ID 1

update Alunos set Nome = 'Maria da Silva' where Id = 1;

-- Exerc�cio 12 Adicionando mais 10 alunos

insert into Alunos(Nome,DataNascimento, TurmaID) values
('Matheus Gueff', '2005-12-23', 6),
('Matheus Augusto', '2006-12-25', 2),
('Matheus Santos', '2007-12-25', 3),
('Davy Oliveira', '2000-10-16', 5),
('Davy Ribeiro', '2001-01-01', 8),
('Fernado', '2005-09-01', 11),
('Fernando', '2001-11-01', 4),
('Fernandes', '2001-07-16', 10),
('Pietro Silva', '2004-05-21', 9),
('Luiz Fl�vio Junior', '2005-10-25', 1)

-- Exerc�cio 13 Excluindo o aluno ID 2

delete from Alunos where Id = 2;

-- Exercicio 14

-- SELECT
select * from Professores;
select * from Turmas;
select * from Alunos;