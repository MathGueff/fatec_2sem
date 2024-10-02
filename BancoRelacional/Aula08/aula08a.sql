-- UTILIZANDO SELECT EM MAIS DE UMA TABELA
use ex03Banco;

-- PRODUTO CARTESIANO (Usado para verificar combinações)
select Funcionario.PRIMEIRO_NOME, Funcionario.SALARIO, Setor.NOME_SETOR from Funcionario, Setor

-- CONSULTA CORRIGIDA (SETOR AO QUAL O FUNCIONARIO PERTENCE)
select Funcionario.PRIMEIRO_NOME, Funcionario.SALARIO, Setor.NOME_SETOR from Funcionario, Setor 
where Funcionario.COD_SETOR = Setor.COD_SETOR

-- UTILIZANDO O ALIAS (Funcionario f)_
select f.PRIMEIRO_NOME, f.SALARIO, s.NOME_SETOR from Funcionario f, Setor s where f.COD_SETOR = s.COD_SETOR

-- INNER JOIN (Cria uma conexão entre atributos semelhantes entre as tabelas)
select * from Funcionario f inner join Setor s on f.COD_SETOR = s.COD_SETOR

-- CONTINUA NO AULA08b...

-- RIGHT OUTER JOIN
select f.PRIMEIRO_NOME, s.NOME_SETOR from Funcionario f right join Setor s on f.COD_SETOR = s.COD_SETOR
insert into Setor (NOME_SETOR) values ('Marketing')

-- RIGHT EXCLUDING JOIN
select f.PRIMEIRO_NOME, s.NOME_SETOR from Funcionario f right outer join Setor s on f.COD_SETOR = s.COD_SETOR where f.COD_SETOR is null

-- FULL OUTER JOIN 
select f.PRIMEIRO_NOME, s.NOME_SETOR from Funcionario f full join Setor s on s.COD_SETOR = f.COD_SETOR

-- FULL EXCLUDING JOIN
select f.PRIMEIRO_NOME, s.NOME_SETOR from Funcionario f full outer join Setor s on s.COD_SETOR = f.COD_SETOR 
where f.COD_SETOR is null or s.COD_SETOR is null

-- CROSS JOIN (faz o produto cartesiano)
select f.PRIMEIRO_NOME, s.NOME_SETOR from Funcionario f cross join Setor s order by f.PRIMEIRO_NOME