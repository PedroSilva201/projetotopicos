use anotacao;

create table clt_cliente (
    clt_id bigint primary key auto_increment,
    clt_nome varchar(100) not null,
    clt_email varchar(100) not null unique,
    clt_telefone int not null
);
