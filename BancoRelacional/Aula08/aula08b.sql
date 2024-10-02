use FBD

-- LEFT OUTER JOIN (trás todas as relações da tabela a esquerda, retornando null se um dado não houver conexão)
select c.Nome_cliente, p.Num_pedido from cliente c left outer join pedido p on c.Cod_cliente = p.cod_cliente

-- LEFT EXCLUDING JOIN (semelhante ao anterior, porém com where)
select c.Nome_cliente, p.Num_pedido from cliente c left outer join pedido p on c.Cod_cliente = p.cod_cliente where p.cod_cliente is null

-- RIGHT OUTER JOIN (pega da tabela a direita, utilizando a mesma consulta vai trazer todos pedidos que tem um cliente)
select c.Nome_cliente, p.Num_pedido from cliente c right outer join pedido p on c.Cod_cliente = p.cod_cliente

-- FULL OUTER JOIN
select c.Nome_cliente, p.Num_pedido from cliente c full outer join pedido p on p.cod_cliente = c.Cod_cliente

-- FULL EXCLUDING JOIN
select c.Nome_cliente, p.Num_pedido from cliente c full outer join pedido p on p.cod_cliente = c.Cod_cliente
where c.Cod_cliente is null or p.cod_cliente is null

-- CROSS JOIN
select c.Nome_cliente, p.Num_pedido from cliente c cross join pedido p order by c.Nome_cliente