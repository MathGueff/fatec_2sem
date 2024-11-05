use SUBCONSULTA

select * from Produto

-- ALL (preço maior do que todos os produtos da subconsulta)

select NomeProduto from Produto where Preco > all (select Preco from Produto where NomeProduto = 'Chapéu')

select NomeProduto from Produto where Preco > all (select Preco from Produto where CategoriaID  = (select CategoriaID from Categoria where NomeCategoria = 'Eletrônicos'))

-- ANY (menor do que pelo menos um produto da subconsulta)

select NomeProduto from Produto where Preco < any (select Preco from Produto where CategoriaID = 1)
select NomeProduto from Produto where Preco < some (select Preco from Produto where CategoriaID = 1)

-- EXISTS

select NomeProduto from Produto where EXISTS (select * from Pedido where Pedido.ProdutoID = Produto.ProdutoID);

-- IN

select NomeProduto from Produto where ProdutoID IN (select ProdutoID from pedido where PedidoID in (1,3))
select NomeProduto from Produto where ProdutoID IN (select ProdutoID from pedido where PedidoID in (1,3))

-- EXEMPLOS

select NomeProduto from Produto where ProdutoID in (
select ProdutoID from Pedido where year(DataPedido) = 2023 and month(DataPedido) = 1)

select NomeCategoria from Categoria where CategoriaID in (select CategoriaID from Produto where Preco > 100)

-- UNION

select NomeCategoria from Categoria where CategoriaID in (select CategoriaID from Produto where Preco > 1000) 
union
select NomeCategoria from Categoria where CategoriaID in (select Produto.CategoriaID from Produto join pedido on Produto.ProdutoID = Pedido.ProdutoID)

select NomeProduto from Produto where Preco < 100 union all select NomeProduto from Produto where Preco > 1000
select NomeProduto from Produto where Preco < 100 union select NomeProduto from Produto where Preco > 1000