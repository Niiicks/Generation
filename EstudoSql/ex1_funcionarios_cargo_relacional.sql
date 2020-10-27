create database db_rh2;

use db_rh2;

create table tb_cargo(
idcargo bigint(5) auto_increment primary key,
cargo varchar(30) not null,
area varchar(30),
gestor varchar(30)
);

create table tb_funcionario(
	id bigint(5) auto_increment primary key, 
	nome varchar(30) not null,
	rg int,
	salario float (10, 2),	
   	cargo bigint,
	foreign key (cargo) references tb_cargo(idcargo)
);
    

    
    insert into tb_cargo (cargo, area, gestor) values ("Analista de teste", "T.I", "Klebson");
    insert into tb_cargo (cargo, area, gestor) values ("Diretora de Vendas", "Comercial", "Ramona");
    insert into tb_cargo (cargo, area, gestor) values ("Headhunter", "R.H", "Joelson");
    insert into tb_cargo (cargo, area, gestor) values ("Auditora Interna", "Qualidade", "Fabricia");
    insert into tb_cargo (cargo, area, gestor) values ("Advogado", "Jurídico", "Jackson");
    
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Joana", 2387227, 1524.10, 1);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Augusto", 7647231, 2387.00, 2);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Kleber", 12837812, 2387.60,3);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Joaquim", 12876312, 9128.00, 4);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Felipe", 7126371, 1278.20, 5);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Roseane", 394283, 9284.64, 1);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Victoria", 129839, 5611.12, 2);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Nelson", 12837812, 9981.00, 3);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Fabiana", 23232837, 912.22, 4);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Grazielle", 29387287, 1662.00, 5);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Leticio", 2837282, 9471.00, 1);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Rubens", 9918212, 8271.00, 2);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Isadoro", 8172631, 2731.55, 3);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Fabia", 8127361, 1765.20, 4);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Cleber", 9912731, 1244.11, 5);
    insert into tb_funcionario(nome, rg, salario, cargo) values ("Phillip", 1239712, 4111.10, 1);
    
    select * from tb_funcionario where salario > 2000;
    select * from tb_funcionario where salario between 1000 and 2000;
    select * from tb_funcionario where nome like 'c%';