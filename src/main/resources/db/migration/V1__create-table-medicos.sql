create table topico{
    id bigint not null auto_increment, 
    titulo varchar(100) not null,  
    fecha varchar(20) not null,
    estatus varchar(80) not null, 
    autor varchar(100) not null,  
    curso varchar(100) not null,

    primary key(id)
}