select GETDATE();

-- DATENAME
select datename(yy,GETDATE()) as 'Ano';
select datename(MONTH,GETDATE()) as 'Mes por extenso';

-- DATEPART
select datepart(MM,GETDATE()) as 'Mês numérico';
select datepart(MONTH, GETDATE()) as 'Mês numérico';

select day(GETDATE()) as 'Dia';
select month(GETDATE()) as 'Mes';
select year(GETDATE()) as 'Ano'

-- DATEDIFF
select datediff(YY, getDATE(), GETDATE()+340)
select datediff(MM ,'23-12-2005', GETDATE())

-- DATEADD

select dateadd(yy,1,GETDATE())
select datename(MONTH, (DATEADD(MONTH, 3 , GETDATE()))) as 'Mes daqui a 3 meses'

-- ISDATE

select isdate('20-02-2023')
select isdate('30-02-2023')

-- CONVERT

select convert(char, getdate(), 103)
select convert(char, getdate(), 113)
select convert(char, getdate(), 150)

-- ROUND

select round(123.3467, 3)
select round(123.3467, 2)
select round(123.3467, 1)
select round(123.5467, 1)
select round(123,3467, 0)
select round(123,3467, -1)
select round(123,3467, -2)

-- FLOOR

select floor(123.45)
select floor(123.95)

-- POWER

select power(4,2)

-- ASCII

select ASCII('A'), ASCII('AMANDA')

-- CHAR

select char(65), char(66)

-- CHARINDEX

select CHARINDEX('Mundo', 'Ola Mundo Bonito')
select CHARINDEX('Mundo', 'Ola Mundo Bonito', 3)
select CHARINDEX('Mundo', 'Ola Mundo Bonito', 6)

-- REPLACE

select replace('abcdefghicde', 'cde', 'xxx')
use FBD
select replace(Nome,'J', 'W') from Empregado

-- STUFF(Expressão, onde começa, quantos vão trocar, oq vai ser colocado)

select stuff('abcdef', 2, 3, '_ijkmn_')

select stuff('Brincadeira de criança como é bom', charindex('quinta', 'Hoje vai ser quinta-feira'), 10, ' AU AU au ')

-- LEFT

select left('abcdefgh', 5)

-- RIGHT

select right('abcdefgh', 5)

-- REPLICATE

select REPLICATE('ABC', 3)

-- SUBSTRING

select SUBSTRING('ABCDEFGHIJ', 2, 3)

--  LEN

select len('ABCDE')
select len('ABCDE    ')
select len('    ABCDE    ')
select len('AB CDE    ')

-- REVERSE

select reverse('ABCDE')

-- LOWER

select lower('AbcdE')
select lower(PRIMEIRO_NOME) from Funcionario

-- UPPER 

select upper('abcdE')

-- LTRIM

select '_' + ltrim('      ABCDE     ') + '_'

-- RTRIM

select '_' + rtrim('      ABCDE     ') + '_'

-- TRIM

select '_' + trim('      ABCDE     ') + '_'

