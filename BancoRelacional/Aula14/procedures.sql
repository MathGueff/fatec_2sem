use SUBCONSULTA
-- PROCEDURES
create proc consulta_produto
as
select * from produto
where nomeproduto like '%a%'

exec consulta_produto

alter proc consulta_produto
as
select nomeproduto, preco from produto

drop proc consulta_produto

create procedure InserirNovoProduto
	@IDProd int,
	@Nome nvarchar(50),
	@CategoriaID int,
	@Preco decimal(10,2)
as
begin
	insert into Produto(ProdutoID, NomeProduto, CategoriaID, Preco)
	values(@IDProd, @Nome, @CategoriaID, @Preco)
end

exec InserirNovoProduto 13,'SmartWatch',1,2200

select * from Produto

create proc AtualizarPrecoProduto
	@ProdutoID int,
	@NovoPreco decimal(10,2)
as
begin
	update Produto
	set Preco = @NovoPreco
	where ProdutoID = @ProdutoID
end

exec AtualizarPrecoProduto 14, 2500
exec AtualizarPrecoProduto @ProdutoID = 7, @NovoPreco = 2500

select * from Produto

create proc ListarProdutosPorCategoria
	@Categoria nvarchar(50)
as
begin
	select ProdutoID, NomeProduto, Preco
	from Produto
	where CategoriaID = (select CategoriaID from Categoria where NomeCategoria = @Categoria)
end

exec ListarProdutosPorCategoria 'Roupas'