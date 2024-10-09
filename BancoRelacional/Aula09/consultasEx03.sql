use LocacaoEx;

-- Ex01 Selecionando todos os clientes
select * from CLIENTES

-- Ex02 Selecionando todos os filmes
select * from FILME

-- Ex03 Mostrando todas as categorias 
select * from CATEGORIA

-- Ex04 Mostrando todos os clientes do sexo masculino que moram em Sorocaba
select * from CLIENTES where sexo = 'M' and CIDADE = 'Sorocaba'

-- Ex05 Mostrando nome e telefone dos clientes em ordem alfabética
select NOME, TELEFONE from CLIENTES order by NOME 

-- Ex06 Mostrando a quantidade de mulheres cadastradas no sistema
select count(*) as 'Quantidade de Mulheres' from CLIENTES where sexo = 'F'

-- Ex07 Mostrando categorias mostrando o nome da categoria em ordem alfabética
select * from CATEGORIA order by NOME_CATEGORIA

-- Ex08 Todos os filmes cadastrados do Diretor “Shawn Levy” que não possuem reserva.
select * from FILME where DIRETOR = 'Shawn Levy' and RESERVADA = 'n'

-- Ex09 Mostre todos os filmes cujo valor seja superior a 5 reais e que estão reservados.
select * from FILME where VALOR_LOCACAO > 5 and RESERVADA = 's'

-- Ex10 Mostre todos os diretores cadastrados no sistema sem repetição de nomes.
select distinct DIRETOR from FILME

-- Ex11 Mostre a quantidade de filmes reservados.
select quantidade_reservada = count(*) from FILME where RESERVADA = 's'

-- Ex12 Mostre o maior valor de Locação cadastrado.
select max(VALOR_LOCACAO) as 'Maior valor de locação' from FILME

-- Ex13 Mostre todos os filmes cuja categoria seja Ação.
select * from FILME f inner join CATEGORIA c on f.COD_CATEGORIA = c.COD_CATEGORIA where c.NOME_CATEGORIA = 'Ação'

-- Ex14. Mostre todos os filmes cuja categoria seja Romance ou Aventura que já estão reservados e seu valor de locação seja menor que 5 reais.
select * from FILME f inner join CATEGORIA c on f.COD_CATEGORIA = c.COD_CATEGORIA where (c.NOME_CATEGORIA = 'Romance' or c.NOME_CATEGORIA = 'Aventura') and f.VALOR_LOCACAO < 5 and f.RESERVADA = 's'

-- Ex15. Mostre todos os filmes alugados pelo cliente Renata Cristina.
select FILME as 'Filmes alugados pela Renata Cristina' from LOCACOES l 
inner join FILME f on l.COD_FILME = f.COD_FILME 
inner join CLIENTES c on l.COD_CLIENTE = c.COD_CLIENTE where NOME = 'Renata Cristina' 

-- Ex16. Mostre todos os clientes que já alugaram mais do que 3 filmes.
select c.NOME, total_filmes = count(l.COD_CLIENTE) from LOCACOES l 
inner join CLIENTES c on l.COD_CLIENTE = c.COD_CLIENTE
group by c.NOME
having count(c.NOME) > 3

-- Ex17. Mostre quanto foi gasto pelo cliente Renata Cristina.
select SUM(f.VALOR_LOCACAO) as 'Quantidade gasta pela cliente' from LOCACOES l 
inner join CLIENTES c on l.COD_CLIENTE = c.COD_CLIENTE 
inner join FILME f on l.COD_FILME = f.COD_FILME
where c.NOME =  'Renata Cristina'

-- Ex18. Mostre a média de valor de locação da locadora.
select avg(f.VALOR_LOCACAO) from LOCACOES l
inner join FILME f on f.COD_FILME = l.COD_FILME

-- Ex19. Mostre o menor valor de locação da locadora.
select min(f.VALOR_LOCACAO) from LOCACOES l
inner join FILME f on f.COD_FILME = l.COD_FILME
group by f.COD_FILME, f.VALOR_LOCACAO

-- Ex20. Mostre a quantidade de filme que a locadora possui por categoria.
select count(*) from LOCACOES l
inner join FILME f on l.COD_FILME = f.COD_FILME
inner join CATEGORIA cat on cat.COD_CATEGORIA = f.COD_CATEGORIA
group by f.COD_CATEGORIA, l.COD_FILME