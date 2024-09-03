--EXERCÍCIO 01 - PARA ENTREGA
create database ex01Banco;
go
use ex01Banco;

-- Exercício 1 Criação da Tabela Professores

create table Professores(
	Id int Primary Key identity(1,1) not null,
	Nome varchar(50),
	Disciplina varchar (15)
)

-- Exercício 2 Adicionando um professor

insert into Professores(Nome,Disciplina) values('Ana Oliveira', 'Português');

-- Exercício 3 Atualizando o nome do professor com ID igual a 1

update Professores set Nome = 'Ana Silva' where Id = 1;

-- Exercício 4 Adicionando mais 10 registros aleatórios à tabela Professores

insert into Professores(Nome,Disciplina) values
('Lívia Rodrigues', 'Matemática'),
('Lavínia Fonseca', 'História'),
('Lucas Mendes', 'Português'),
('Luís Queiroz', 'Português'),
('Paulo Vil', 'Matemática'),
('Luiz Flávio', 'Web'),
('Paula Fernada', 'Português'),
('Alberto Oliveira', 'Geografia'),
('Hélio Roberto', 'Biologia'),
('Amanda Sewaybricker', 'Artes')

-- Exercício 5 Excluindo o professor com ID igual a 2 da tabela

delete from Professores where Id = 2;

-- Exercício 6 Criando a tabela Turmas

create table Turmas (
	Id int primary key identity (1,1) not null,
	Nome varchar(50),
	ProfessorResponsavel int,
	Constraint FK_Professor Foreign key (ProfessorResponsavel) References Professores(Id)
)

-- Exercício 7 Adicionando a turma 9A

insert into Turmas (Nome, ProfessorResponsavel) values ('9A', 1);

-- Exercício 8 Adicionando mais 10 registros a tabela turma

insert into Turmas (Nome, ProfessorResponsavel) values
('8B', 3),
('7C', 8),
('3B', 5),
('8C', 9),
('5D', 4),
('6A', 3),
('9B', 6),
('9C', 7),
('8D', 11),
('9D', 10)


-- Exercício 9 Criando a tabela Alunos

create table Alunos(
	Id int primary key identity(1,1) not null,
	Nome varchar (50),
	DataNascimento date,
	TurmaID int,
	Constraint FK_Turma Foreign key (TurmaID) references Turmas(Id)
)

-- Exercício 10 Adicionando um aluno

insert into Alunos (Nome,DataNascimento, TurmaID) values ('Maria Souza', '2005-10-15', 1)

-- Exercício 11 Atualizando o nome do ID 1

update Alunos set Nome = 'Maria da Silva' where Id = 1;

-- Exercício 12 Adicionando mais 10 alunos

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
('Luiz Flávio Junior', '2005-10-25', 1)

-- Exercício 13 Excluindo o aluno ID 2

delete from Alunos where Id = 2;

-- Exercicio 14 Tabela Notas

create table Notas(
	Id int primary key identity(1,1),
	AlunoId int,
	Disciplina varchar(15),
	Nota decimal(5,2),
	Constraint FK_Aluno Foreign Key (AlunoId) references Alunos (Id)
)

-- Exercicio 15 Adicionando uma nota ao aluno id 1

insert into Notas (AlunoId, Disciplina, Nota) values
(1, 'Matemática', 8.5);

-- Exercício 16 Atualizando a nota do aluno id 1

update Notas set Nota = 9.0 where Id = 1; 

-- Exercício 17 Adicionando mais 10 registros a tabela nota

insert into Notas(AlunoId, Disciplina, Nota) values
(3,'Matemática',2),
(3,'Português',10),
(4,'Matemática', 9.9),
(4,'Portugûes', 1.1),
(5, 'História', 5.5),
(5, 'Português', 8.7),
(6, 'Matemática', 6.0),
(6, 'Geografia', 10),
(7, 'História', 9.1),
(11, 'DSWEB', 11)

-- Exercício 18 Excluindo a nota do aluno id 1

delete from Notas where Id = 1;

-- Exerício 19 Criando a tabela matrículas

create table Matriculas(
	Id int Primary Key identity(1,1),
	AlunoId int,
	TurmaId int,
	DataMatricula date,
	Constraint FK_MatriculaAluno Foreign Key (AlunoId) references Alunos (Id),
	Constraint FK_MatriculaTurma Foreign Key (TurmaId) references Turmas (Id),
)

-- Exercício 20 Adicionando uma matrícula

insert into Matriculas(AlunoId, TurmaId, DataMatricula) values
(1, 1, '2022-02-15')


-- Exercício 21 Adicionando mais 10 registros a tabela matrícula

insert into Matriculas(AlunoId, TurmaId, DataMatricula) values
(1,3,'2020-02-01'),
(11, 11, '2008-05-20'),
(3, 3, '2024-09-03'),
(4, 4, '2020-01-10'),
(5, 5, '2014-05-30'),
(6, 6, '2020-09-15'),
(7, 7, '2019-11-15'),
(8, 8, '2018-12-23'),
(9, 9, '2021-12-21'),
(10, 10, '2023-12-21')


-- SELECT
select * from Professores;
select * from Turmas;
select * from Alunos;
select * from Notas;
select * from Matriculas;