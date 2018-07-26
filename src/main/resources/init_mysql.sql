create table hibernate_sequence (next_val bigint);
insert into hibernate_sequence values ( 4 );
create table calculo (id bigint not null, bruto varchar(255), clt varchar(255), pj varchar(255), primary key (id));