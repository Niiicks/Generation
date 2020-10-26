create database db_rh;

use db_rh;

create table funcionarios(
id bigint(5) auto_increment,
nome varchar(30) not null,
rg int,
salario decimal (10, 2),
ativo boolean,

primary key (id))

insert into funcionarios (nome, rg, salario, ativo) values ("Joao", 8723478, 4974.00, true) 

select * from funcionarios;

insert into funcionarios (nome, rg, salario, ativo) values ("Gabriela", 8722344, 8034.00, true) ;
insert into funcionarios (nome, rg, salario, ativo) values ("Felipe", 2823423, 1038.00, true) ;
insert into funcionarios (nome, rg, salario, ativo) values ("Joseane", 3738473, 2068.00, true) ;
insert into funcionarios (nome, rg, salario, ativo) values ("Jholenno", 11998376, 1120.00, true) ;
insert into funcionarios (nome, rg, salario, ativo) values ("Klebson", 2987732, 3034.00, true) ;

select * from funcionarios where salario > 2000;

select * from funcionarios where salario < 2000;

update funcionarios set salario = 15000 where id = 3;
