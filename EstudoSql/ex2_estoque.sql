create database db_comercio;
use db_comercio;

create table tb_produtos(
id bigint(5) auto_increment,
produto varchar(60) not null,
quantidade bigint,
cor varchar(15),
preco decimal(5, 2),

primary key(id)
);

insert into tb_produtos (produto, quantidade, cor, preco) values ("Camiseta", 4, "verde", 34.99);
insert into tb_produtos (produto, quantidade, cor, preco) values ("Camiseta", 23, "branca", 14.99);
insert into tb_produtos (produto, quantidade, cor, preco) values ("Calça",100, "azul", 74.99);
insert into tb_produtos (produto, quantidade, cor, preco) values ("Boné", 1, "roxo", 68.99);
insert into tb_produtos (produto, quantidade, cor, preco) values ("Meia", 99, "preta", 4.99);
insert into tb_produtos (produto, quantidade, cor, preco) values ("Calça",12, "amarela", 84.99);
insert into tb_produtos (produto, quantidade, cor, preco) values ("Camisa", 46, "azul", 54.99);
insert into tb_produtos (produto, quantidade, cor, preco) values ("Bermuda", 12, "rosa", 54.99);
insert into tb_produtos (produto, quantidade, cor, preco) values ("Sunga", 2, "preta", 994.99);

select * from tb_produtos;
select * from tb_produtos where preco > 500;

select * from tb_produtos where preco < 500;

update tb_produtos set preco = 999.23 where id = 5;