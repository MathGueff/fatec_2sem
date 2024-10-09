use FBD;

-- Mínimo e Máximo
select min(salario_fixo) as 'MENOR_SALARIO', max(salario_fixo) as 'MAIOR_SALARIO' from vendedor v

-- Somatória
select sum(quantidade) as 'Quantidade total' from item_pedido where cod_produto = 3

-- Média
select avg(salario_fixo) as 'MEDIA_SALARIO' from vendedor

-- Contagem
select count (*) from vendedor where salario_fixo > 2500.00;

-- Group By
select num_pedido, total_pedidos = count(*) from item_pedido
group by num_pedido

select num_pedido, total_produtos = count(*) from item_pedido 
where quantidade > 5 
group by num_pedido
having count(*) > 1

update produto
set Valor_unitario = Valor_unitario * 1.025
where Valor_unitario < (select avg(Valor_unitario) from produto where Unidade = 'KG') 