create database controleestoquea3; 
use controleestoquea3;

create table if not exists controleestoquea3. produto(
idProduto int not null auto_increment primary key,
nome varchar(200) not null,
precoUnitario decimal(10,2) not null,
unidade varchar(20) not null,
quantidadeEstoque int not null,
quantidadeMinima int not null,
quantidadeMaxima int not null,
categoria varchar(50) not null
);

create table if not exists controleestoquea3. categoria(
idCategoria int not null auto_increment primary key,
nome varchar(100) not null,
tamanho varchar(50) not null,
embalagem varchar(50) not null
);

select * from controleestoquea3. produto;
select * from controleestoquea3. categoria;

