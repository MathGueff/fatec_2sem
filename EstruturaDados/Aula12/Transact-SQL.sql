use SUBCONSULTA;

-- VIEW (TABELA TEMPOR�RIA)
create view ProdutosCaros as (select NomeProduto, Preco from Produto where Preco > 1000)
select * from ProdutosCaros

create view ProdutosMaisCarosPorCategoria as 
select cat.NomeCategoria, p.NomeProduto, p.Preco 
from Categoria cat
inner join Produto p on cat.CategoriaID = p.CategoriaID
where P.Preco = (select max(Preco) from Produto as P where P.CategoriaID = cat.CategoriaID) -- A subquery � feita para conseguir o maior valor de produto de cada categoria

select * from ProdutosMaisCarosPorCategoria

-- VARI�VEIS

DECLARE @MinPreco Decimal(10,2);
SET @MinPreco = 50 -- Atribuindo o valor
select NomeProduto, Preco from Produto where Preco >= @MinPreco;

declare @TotalPedidos INT
select  @TotalPedidos = COUNT(*) -- Atribuindo o valor da contagem de todos os pedidos � vari�vel TotalPedidos por meio de select
from Pedido
print 'O total de pedidos � ' + CAST(@TotalPedidos as NVARCHAR(10)) -- Utilizando print para printar no console


declare @MediaPreco decimal(10,2)
set @MediaPreco = ( -- Atrav�s de SET
	select AVG(Preco) from Produto
	where CategoriaID = 1
)
print 'A m�dia de pre�o na categoria Eletr�nicos �: ' + cast(@MediaPreco as NVARCHAR(10));

-- TOP 

select TOP 5 NomeProduto, Preco 
from Produto
order by Preco DESC

-- BEGIN TRANSACTION COMMIT e ROLLBACK

begin transaction -- come�a
update Produto
set Preco = Preco * 1;
commit -- fecha

begin transaction;
update Produto SET CategoriaID = 100 where ProdutoID = 3
if @@ERROR = 0
	commit
else
	rollback -- detectou um erro
	print 'Atualiza��o na Tabela Produto foi cancelada'

-- PROCEDURE 

-- TRIGGER

