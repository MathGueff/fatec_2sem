-- WHILE
use SUBCONSULTA

declare @Counter INT
set @Counter = 1

while @Counter <= 10
begin
	update Produto
	set Preco = Preco + 1000
	where ProdutoID = @Counter
	SET @Counter = @Counter + 1
end

select * from Produto

declare @Counters INT
set @Counters = 1

while @Counters <= (select count(*) from Produto)
BEGIN
	declare @PrecoAtual decimal(10,2)
	select @PrecoAtual = Preco from Produto where ProdutoID = @Counters

	if @PrecoAtual > 1000
	BEGIN
		update Produto
		set Preco = Preco * 1.1
		where ProdutoID = @Counters
	END

	set @Counters = @Counters + 1
END
select * from Produto

-- TRIGGER

create table LogPreco(
	ProdutoID int,
	NovoPreco decimal(10,2),
	DataAlteracao DATE
)

create trigger trg_LogPrecoAlterado
on Produto
after UPDATE
as 
begin
	insert into LogPreco(ProdutoID, NovoPreco, DataAlteracao)
	select ProdutoID, Preco, GETDATE()
	from inserted
end

update Produto set Preco = 4100 where ProdutoID = 1
update Produto set Preco = 5200 where ProdutoID = 1
select * from LogPreco

create trigger trg_LimitePreco
on Produto
instead of insert
as 
BEGIN
	if exists (select 1 from inserted where Preco > 10000)
	BEGIN
		raiserror('O preço do produto não pode exceder $10.000.', 16,1)
		rollback transaction
	END
	else
		insert into Produto(ProdutoID, NomeProduto, CategoriaID, Preco)
		select ProdutoId, NomeProduto, CategoriaID, Preco from inserted
END

update Produto
set Preco = 20000
where ProdutoID = 2

select * from Produto

insert into Produto values(14,'Ultrabook',8,10000)