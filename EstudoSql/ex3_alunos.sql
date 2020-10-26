create database db_escola;

use db_escola;

create table tb_alunes(
id bigint, 
nome varchar(50),
idade int(2),
ano int(2),
nota decimal,

primary key(id));

insert into tb_alunes (nome, idade, ano, nota) values ("Zezinho", 4, 1, 6.50);
insert into tb_alunes (nome, idade, ano, nota) values ("Gabriela", 14, 9, 3.20);
insert into tb_alunes (nome, idade, ano, nota) values ("Fabricia", 12, 6, 9.20);
insert into tb_alunes (nome, idade, ano, nota) values ("Fernando", 7, 2, 7.80);
insert into tb_alunes (nome, idade, ano, nota) values ("Paola", 10, 6, 100);
insert into tb_alunes (nome, idade, ano, nota) values ("Benicio", 8, 4, 50);
insert into tb_alunes (nome, idade, ano, nota) values ("Gabriel", 11, 7, 8.50);
insert into tb_alunes (nome, idade, ano, nota) values ("Joaquim", 6, 8, 9.70);

select * from tb_alunes;


ALTER TABLE tb_alunes
MODIFY COLUMN nota float;

update tb_alunes set nota = 7.4 where id = 1;
update tb_alunes set nota = 7.4 where id = 2;
update tb_alunes set nota = 3.2 where id = 3;
update tb_alunes set nota = 9.6 where id = 4;
update tb_alunes set nota = 8 where id = 5;
update tb_alunes set nota = 10 where id = 6;
update tb_alunes set nota = 5.4 where id = 7;
update tb_alunes set nota = 2.4 where id = 8;

select * from tb_alunes where nota > 7;

select * from tb_alunes where nota < 7;

update tb_alunes set idade = 13 where id = 3;

select * from tb_alunes