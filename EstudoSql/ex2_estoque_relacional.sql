CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_categoria(
idcat BIGINT AUTO_INCREMENT PRIMARY KEY,
categoria VARCHAR(20),
setor VARCHAR(20));

CREATE TABLE tb_produto(
idprod BIGINT AUTO_INCREMENT PRIMARY KEY,
produto VARCHAR(20),
cor VARCHAR(20),
preco FLOAT,
quantidade INT,
FOREIGN KEY (quantidade) references tb_categoria(idcat)
);

INSERT INTO tb_categoria(categoria, setor) VALUES ("Camisetas", "Vestuário Masculino");
INSERT INTO tb_categoria(categoria, setor) VALUES ("Calças", "Vestuário Feminino");
INSERT INTO tb_categoria(categoria, setor) VALUES ("Bermudas", "Vestuário Infantil");
INSERT INTO tb_categoria(categoria, setor) VALUES ("Perfumes", "Cosméticos");
INSERT INTO tb_categoria(categoria, setor) VALUES ("Maquiagem", "Cosméticos");

INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("Cam Homem-Aranha", "Rosa", 17.99, 1);
INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("Camiseta Abstrata", "Abstrata", 99.69, 1);
INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("Bermuda Conceitual", "Azul", 123.45, 3);
INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("Perfume Celebridade", "Undefined", 917.99, 4);
INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("Calça Caqui", "Caqui", 57.19, 2);
INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("Cilios Postiços", "Rosa", 87.99, 5);
INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("Cam Tio Patinhas", "Azul", 999.99, 1);
INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("Bermuda Pescador", "Verde", 27.99, 3);
INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("Rímel", "Preto", 17.99, 5);
INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("Esmalte ", "Roxo-Obsessão", 10.99, 5);
INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("One-Million", "Dourado", 1.99, 4);
INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("Cam 'Seja Menas'", "Preta",57.99, 1);
INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("Malbec", "Marrom", 87.99, 4);
INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("Esmalte", "Ele não te merece", 37.99, 5);
INSERT INTO tb_produto(produto, cor, preco, categoria) VALUES ("Blush", "Rosa", 17.99, 5);

SELECT * FROM tb_produto WHERE preco > 20; 

SELECT * FROM tb_produto WHERE preco between 10 and 20; 

SELECT * FROM tb_produto WHERE produto LIKE 'c%'; 