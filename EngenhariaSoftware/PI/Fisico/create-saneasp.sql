create database SANEASP
use SANEASP

create table Usuarios(
	id_usuario int not null identity (1,1) primary key,
	nome_usuario varchar(50) not null,
	telefone varchar(14),
	cidade varchar(30),
	bairro varchar(30),
	rua varchar(30),
	numero varchar(30),
	complemento varchar(30),
	cep char(8),
	email varchar(40) not null unique,
	senha varchar(100) not null,
	cpf char(11) unique
)

create table Administradores(
	id_admin int not null identity (1,1) primary key,
	id_usuario int not null,
	nivel int not null
	Constraint fk_usuario_admin foreign key (id_usuario) references Usuarios(id_usuario)
)

create table Tabela_logs(
	id_log int not null identity(1,1) primary key,
	operacao varchar(20) not null,
	data_log datetime not null default GETDATE(),
	conteudo_log varchar(255) not null,
	historico varchar(10) not null,
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
	id_sintoma int not null identity(1,1) primary key,
	nome_sintoma varchar(50) not null
)

create table Sintomas_doenca(
	id_sintoma_doenca int not null identity(1,1) primary key,
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

insert into Usuarios(nome_usuario, telefone, cep, cidade, bairro, complemento, rua, numero, email, senha, cpf)
values
('Davy Oliveira', '12345678910123', '18075718', 'Sorocaba','Wanel', 'Fundos', 'Alonco Muchon', '122', 'davy@gmail.com', '12345', '12345678910'),
('Adryann Theylor', '1098765432101', '57181807', 'Votorantim','Vossoroca', 'bloco A', 'Natal', '122', 'etec@etec.com', 'senhaconfiavel', '12310456789'),
('Matheus Gueff', '1076543210198', '51818077', 'Sorocaba','Jd Brasilândia', '', 'Alonco Muchon', '928', 'matheus@etec.com', 'senhanaoconfiavel', '10451236789')

-- Administrador
INSERT INTO Administradores (id_usuario, nivel)
VALUES 
(1, 2),
(2, 1);

-- Log
INSERT INTO Tabela_logs (operacao,data_log, conteudo_log, historico, id_usuario)
VALUES 
('EDIÇÃO',GETDATE(),'Achei um problema no meu encanamento, tem algumbixo la dentrueui', 'a', 1),
('EDIÇÃO',GETDATE(),'Achei um problema no meu encanamento, tem algum bixo la dentro', 'n', 1),
('ADIÇÃO',GETDATE(),'Tem um problema acontecendo aqui no meu bairro', 'n', 2);

-- Doença
INSERT INTO Doencas (nome_doenca, transmissao, tratamento, id_admin)
VALUES 
('Esquistossomose', 'Contaminção', 'Médico', 1),
('Dengue', 'Picada', 'Beber água', 2);

-- Sintomas
INSERT INTO Sintomas (nome_sintoma)
VALUES 
('Febre'),
('Tosse'),
('Dor de cabeça'),
('Nausea')

-- Sintomas_doenca
INSERT INTO Sintomas_doenca (id_doenca, id_sintoma)
VALUES 
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(2, 2)

-- Reclamacoes
INSERT INTO Reclamacoes (id_usuario, titulo_reclamacao, descricao_reclamacao, endereco_reclamacao, status_reclamacao, pontuacao)
VALUES 
(1, 'Minha rua ta ruim', 'Muitos buracos na rua', 'Rua tal 123 - Bairro tal', 'v', 5),
(2, 'Vi que tem um problema aqui perto', 'Tem um problema acontecendo aqui no meu bairro', 'Rua tal 11 - Bairro tal', 'Enviada', 4);

-- Comentários
INSERT INTO Comentarios (id_admin, id_usuario, id_reclamacao, descricao_comentario)
VALUES 
(1, 1, 1, 'Vamos tentar ajudar mas não temos certeza se conseguimos'),
(2, 2, 2, 'Que problema? Seja mais específico');

-- Imagens_reclamacao
INSERT INTO Imagens_reclamacao (imagem_reclamacao, id_reclamacao)
VALUES 
('agua.jpg', 1),
('icone_problema.png', 2);

-- Tags
INSERT INTO Tags (nome_tag)
VALUES 
('Vazamento'),
('Esgoto');

-- Tags_reclamacao
INSERT INTO Tags_reclamacao (id_tag, id_reclamacao)
VALUES 
(1, 1),
(2, 1),
(2, 2);

-- Noticia
INSERT INTO Noticias (titulo_noticia, descricao_noticia, id_admin)
VALUES 
('Corrigimos uma encanação', 'Deu tudo certo pessoal fiquem tranquilos', 1),
('Dia Mundial da Água', 'Dia mundial da água estamos distribuindo água', 1);

-- Imagem_noticia
INSERT INTO Imagens_noticia (imagem_noticia, id_noticia)
VALUES 
('encanamento.jpg', 1),
('agua_feliz.jpg', 2);

-- Fontes_noticia
INSERT INTO Fontes_noticia (fonte_noticia, id_noticia)
VALUES 
('https://cruzeiro.rs.gov.br/noticia/visualizar/id/5250/?prefeitura-resolve-problema-provocado-por-encanamento-particular.html', 1),
('https://www.peixeboi.org.br/post/dia-mundial-da-%C3%A1gua', 2);

-- Tag_noticia
INSERT INTO Tags_noticia (id_tag, id_noticia)
VALUES 
(1, 1),
(2, 2);

-- Imagens_noticia
INSERT INTO Imagens_doenca (imagem_doenca, id_doenca)
VALUES 
('esquistossomose.png', 1),
('mosquitao.jpg', 2);

-- Fontes_doenca
INSERT INTO Fontes_doenca (fonte_doenca, id_doenca)
VALUES 
('https://blog.brkambiental.com.br/doencas-de-veiculacao-hidrica/', 1),
('https://www.tuasaude.com/consequencias-de-beber-agua-contaminada/', 2);

-- Select para todas as tabelas
SELECT * FROM Usuarios;
SELECT * FROM Administradores;
SELECT * FROM Tabela_logs;
SELECT * FROM Doencas;
SELECT * FROM Sintomas;
SELECT * FROM Sintomas_doenca;
SELECT * FROM Reclamacoes;
SELECT * FROM Comentarios;
SELECT * FROM Imagens_reclamacao;
SELECT * FROM Tags;
SELECT * FROM Tags_reclamacao;
SELECT * FROM Noticias;
SELECT * FROM Imagens_noticia;
SELECT * FROM Fontes_noticia;
SELECT * FROM Tags_noticia;
SELECT * FROM Imagens_doenca;
SELECT * FROM Fontes_doenca;