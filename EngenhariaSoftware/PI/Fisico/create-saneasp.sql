create database SANEASP
use SANEASP

create table Usuarios(
	id_usuario int not null identity (1,1) primary key,
	nome_usuario varchar(50) not null,
	telefone varchar(14),
	endereco_usuario varchar(200),
	email varchar(40) not null,
	senha varchar(100) not null,
	cpf char(11)
)

create table Administradores(
	id_admin int not null identity (1,1) primary key,
	id_usuario int not null,
	nivel int not null
	Constraint fk_usuario_admin foreign key (id_usuario) references Usuarios(id_usuario)
)

create table Tabela_logs(
	id_log int not null,
	operacao varchar(20) not null,
	data_log datetime not null,
	conteudo_log varchar(255) not null,
	historico char(1) not null,
	id_usuario int not null
	Constraint fk_usuario_log foreign key (id_usuario) references Usuarios(id_usuario) 
)

create table Doencas(
	id_doenca int not null identity(1,1) primary key,
	nome_doenca varchar(60) not null,
	transmissao varchar(255) not null,
	tratamento varchar(255) not null,
	id_admin int not null
	Constraint fk_admin_doenca foreign key (id_admin) references Administradores(id_admin)
) 

create table Sintomas(
	id_sintoma int not null,
	nome_sintoma varchar(50) not null
)

create table Sintomas_doenca(
	id_sintoma_doenca int not null,
	id_doenca int not null,
	id_sintoma int not null,
	Constraint fk_doenca foreign key (id_doenca) references Doencas(id_doenca)
)

create table Reclamacoes (
	id_reclamacao int not null identity(1,1) primary key,
	id_usuario int not null,
	titulo_reclamacao varchar(40) not null,
	descricao_reclamacao varchar(255) not null,
	endereco_reclamacao varchar(200) not null,
	status_reclamacao varchar(10) not null,
	data_reclamacao datetime default GETDATE() not null,
	pontuacao int not null
	Constraint fk_usuario_reclamacao foreign key (id_usuario) references Usuarios(id_usuario)
)

create table Comentarios(
	id_comentario int not null identity(1,1) primary key,
	id_admin int,
	id_usuario int,
	id_reclamacao int not null,
	descricao_comentario varchar(255) not null,
	data_comentario datetime default GETDATE() not null,
	Constraint fk_comentario_administrador foreign key (id_admin) references Administradores(id_admin)
)

create table Imagens_reclamacao(
	id_imagem_reclamacao int not null identity(1,1) primary key,
	imagem_reclamacao varchar(100) not null,
	id_reclamacao int not null
	Constraint fk_imagem_reclamacao foreign key (id_reclamacao) references Reclamacoes(id_reclamacao)
)

create table Tags(
	id_tag int not null identity(1,1) primary key,
	nome_tag varchar(50) not null
)

create table Tags_reclamacao(
	id_tag_reclamacao int not null identity(1,1) primary key,
	id_tag int not null,
	id_reclamacao int not null
	Constraint fk_tags_reclamacao_tag foreign key (id_tag) references Tags(id_tag),
	Constraint fk_tags_reclamacao_reclamacao foreign key (id_reclamacao) references Reclamacoes(id_reclamacao)
)

create table Noticias (
	id_noticia int not null identity(1,1) primary key,
	titulo_noticia varchar(40) not null,
	descricao_noticia varchar(255),
	id_admin int not null
	Constraint fk_noticia_administrador foreign key (id_admin) references Administradores(id_admin)
)

create table Imagens_noticia(
	id_imagem_noticia int not null identity(1,1) primary key,
	imagem_noticia varchar(100) not null,
	id_noticia int not null
	Constraint fk_imagem_noticia foreign key (id_noticia) references Noticias(id_noticia)
)

create table Fontes_noticia(
	id_fonte_noticia int not null identity(1,1) primary key,
	fonte_noticia varchar(255) not null,
	id_noticia int not null
	Constraint fk_fonte_noticia foreign key (id_noticia) references Noticias(id_noticia)
)

create table Tags_noticia(
	id_tag_noticia int not null identity(1,1) primary key,
	id_tag int not null,
	id_noticia int not null
	Constraint fk_tags_noticia_tag foreign key (id_tag) references Tags(id_tag),
	Constraint fk_tags_noticia_noticia foreign key (id_noticia) references Noticias(id_noticia)
)

create table Imagens_doenca(
	id_imagem_doenca int not null identity(1,1) primary key,
	imagem_doenca varchar(100) not null,
	id_doenca int not null
	Constraint fk_imagem_doenca foreign key (id_doenca) references Doencas(id_doenca)
)

create table Fontes_doenca(
	id_fonte_doenca int not null identity(1,1) primary key,
	fonte_doenca varchar(255) not null,
	id_doenca int not null
	Constraint fk_fonte_doenca foreign key (id_doenca) references Doencas(id_doenca)
)