create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
	idcat BIGINT(5) auto_increment primary key,
    nome VARCHAR(50),
    fornecedor VARCHAR(50)
    );

create table tb_produto(
	id BIGINT(5) not null auto_increment primary key,
    nome VARCHAR(50) not null,
    preco decimal(5,2),
    totalkg decimal(5,2),
    codigo int(11),
    categoria BIGINT(5),
    
    foreign key (categoria) references tb_categoria(idcat)
    );

insert into tb_categoria(nome, fornecedor) values ("Bovinos", "BRF");
insert into tb_categoria(nome, fornecedor) values ("Diversos", "Dois Irmãos LTDA");
insert into tb_categoria(nome, fornecedor) values ("Aves", "Sadia");
insert into tb_categoria(nome, fornecedor) values ("Suinos", "Aurora");
insert into tb_categoria(nome, fornecedor) values ("Acompanhamentos", "Pereiras ME");    

insert into tb_produto(nome, preco, totalkg, codigo, categoria) values ("Contra Filé", 29.99, 493,FLOOR(RAND() * (1000 - 1 + 1)) + 1, 1); 
insert into tb_produto(nome, preco, totalkg, codigo, categoria) values ("Picanha", 49.99, 122,FLOOR(RAND() * (1000 - 1 + 1)) + 1, 1); 
insert into tb_produto(nome, preco, totalkg, codigo, categoria) values ("Carvão", 9.99, 980,FLOOR(RAND() * (1000 - 1 + 1)) + 1, 2); 
insert into tb_produto(nome, preco, totalkg, codigo, categoria) values ("Acendedor", 2.19, 3,FLOOR(RAND() * (1000 - 1 + 1)) + 1, 2); 
insert into tb_produto(nome, preco, totalkg, codigo, categoria) values ("Tulipa de Frango", 19.99, 304,FLOOR(RAND() * (1000 - 1 + 1)) + 1, 3); 
insert into tb_produto(nome, preco, totalkg, codigo, categoria) values ("Farofa de Goiás", 9.99, 110,FLOOR(RAND() * (1000 - 1 + 1)) + 1, 5); 
insert into tb_produto(nome, preco, totalkg, codigo, categoria) values ("Panceta", 17.99, 43,FLOOR(RAND() * (1000 - 1 + 1)) + 1, 4);
insert into tb_produto(nome, preco, totalkg, codigo, categoria) values ("Coração de Galinha", 22.69, 133,FLOOR(RAND() * (1000 - 1 + 1)) + 1, 3);
insert into tb_produto(nome, preco, totalkg, codigo, categoria) values ("Linguiça Toscana", 12.99, 443,FLOOR(RAND() * (1000 - 1 + 1)) + 1, 4);
insert into tb_produto(nome, preco, totalkg, codigo, categoria) values ("Pão de Alho", 9.99, 45,FLOOR(RAND() * (1000 - 1 + 1)) + 1, 5); 

UPDATE tb_produto
SET preco = 69.90
WHERE id = 3;

UPDATE tb_produto
SET nome = "Bife de Ancho"
WHERE id = 3;

UPDATE tb_produto
SET totalkg = 63.4
WHERE id = 3;

select * from tb_produto;

select * from tb_produto where preco > 40; 
-- preço maior que 40 

select * from tb_produto where preco between 3 and 60; 
--  select trazendo  os Produtos com valor entre 3 e 60 reais.
 
select * from tb_produto where nome like '%co%' ;
--  select  utilizando LIKE buscando os Produtos com as letras CO.

select tb_produto.nome, tb_produto.preco, tb_categoria.nome
	from tb_produto
		inner join tb_categoria on tb_categoria.idcat = tb_produto.categoria;
-- Faça um um select com Inner join entre  tabela categoria e produto

select tb_produto.nome, tb_produto.preco, tb_categoria.nome
	from tb_produto
		inner join tb_categoria on tb_categoria.idcat = tb_produto.categoria
			where tb_categoria.nome = "Bovinos"
-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são cosméticos)