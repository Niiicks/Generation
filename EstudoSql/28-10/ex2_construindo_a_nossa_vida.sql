create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida; 

create table tb_categoria(
	idcat BIGINT(5) auto_increment primary key not null,
    nome VARCHAR(50) not null, 
    codigo int (5) not null
    );
    
    create table tb_produto(
	id BIGINT(5) auto_increment primary key not null,
    nome VARCHAR(50) not null, 
    preco decimal (6,2) not null,
    marca VARCHAR(50),
    categoria BIGINT(5),
    
    foreign key (categoria) references tb_categoria(idcat)
    ); 
	
insert into tb_categoria(nome, codigo) values ("Ferramentas", FLOOR(RAND() * (1000 - 1 + 1)) + 1);
insert into tb_categoria(nome, codigo) values ("Pintura", FLOOR(RAND() * (1000 - 1 + 1)) + 1);
insert into tb_categoria(nome, codigo) values ("Elétrica", FLOOR(RAND() * (1000 - 1 + 1)) + 1);

insert into tb_produto(nome, preco, marca, categoria) values("Martelo", 124.20, "Tramontina", 1);
insert into tb_produto(nome, preco, marca, categoria) values("Alicate", 59.90, "Mtx", 1);
insert into tb_produto(nome, preco, marca, categoria) values("Tinta Externa Branca 18L",289.90 , "Coral", 2);
insert into tb_produto(nome, preco, marca, categoria) values("Verniz Mogno 5L",49.90 , "Suvinil", 2);
insert into tb_produto(nome, preco, marca, categoria) values("Ventilador Exaustor",149.90 , "Tron", 3);
insert into tb_produto(nome, preco, marca, categoria) values("Lâmpada Bulbo LED",9.90 , "FOXLUX", 3);

SELECT * FROM tb_produto;

SELECT * FROM tb_produto where preco > 50;

SELECT * FROM tb_produto where preco between 3 and 60;

SELECT * FROM tb_produto where nome like '%c%';

SELECT tb_produto.nome, tb_produto.preco, tb_categoria.nome
	from tb_produto
		inner join tb_categoria on tb_categoria.idcat = tb_produto.categoria;
        
        SELECT tb_produto.nome, tb_produto.preco, tb_categoria.nome
	from tb_produto
		inner join tb_categoria on tb_categoria.idcat = tb_produto.categoria
        where categoria = 1;