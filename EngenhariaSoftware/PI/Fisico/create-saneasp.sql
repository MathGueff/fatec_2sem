create database SANEASP
use SANEASP

create table Usuario(
	id_usuario int not null identity (1,1) primary key,
	nome_usuario varchar(50) not null,
	telefone varchar(14),
	endereco_usuario varchar(200),
	email varchar(40) not null,
	senha varchar(100) not null,
	cpf char(11)
)

create table Administrador(
	id_admin int not null identity (1,1) primary key,
	id_usuario int not null,
	nivel int not null
	Constraint fk_usuario_admin foreign key (id_usuario) references Usuario(id_usuario)
)

create table Tabela_log(
	id_log int not null,
	operacao varchar(20) not null,
	data_log datetime not null,
	conteudo_log varchar(255) not null,
	historico char(1) not null,
	id_usuario int not null
	Constraint fk_usuario_log foreign key (id_usuario) references Usuario(id_usuario) 
)

create table Doenca(
	id_doenca int not null identity(1,1) primary key,
	nome_doenca varchar(60) not null,
	transmissao varchar(255) not null,
	tratamento varchar(255) not null,
	id_admin int not null
	Constraint fk_admin_doenca foreign key (id_admin) references Administrador(id_admin)
) 

create table Sintoma(
	id_sintoma int not null,
	nome_sintoma varchar(50) not null
)

create table Sintoma_doenca(
	id_sintoma_doenca int not null,
	id_doenca int not null,
	id_sintoma int not null,
	Constraint fk_doenca foreign key (id_doenca) references Doenca(id_doenca)
)

create table Reclamacao (
	id_reclamacao int not null identity(1,1) primary key,
	id_usuario int not null,
	titulo_reclamacao varchar(40) not null,
	descricao_reclamacao varchar(255) not null,
	endereco_reclamacao varchar(200) not null,
	status_reclamacao varchar(10) not null,
	data_reclamacao datetime default GETDATE()
	Constraint fk_usuario_reclamacao foreign key (id_usuario) references Usuario(id_usuario)
)