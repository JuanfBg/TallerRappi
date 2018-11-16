-- drop database peliculasRappi;
create database peliculasRappi;
use peliculasRappi;

create table USUARIOS(
id_usuario int primary key not null auto_increment,
nombre_usuario varchar(200),
fecha_creacion datetime,
fecha_modificacion datetime
);

CREATE TABLE GENEROS(
     id_generos INTEGER PRIMARY KEY AUTO_INCREMENT,
     nombre_genero VARCHAR(200),
     fecha_creacion datetime,
	 fecha_modificacion datetime,
     usuario_modificador varchar(200),
     usuario_creador varchar(200)
     );

 CREATE TABLE ELENCOS(
     id_pelicula INTEGER PRIMARY KEY AUTO_INCREMENT,
     id_elenco INTEGER NOT NULL DEFAULT 1,
     nom_actor VARCHAR(50),
     nom_papel VARCHAR(50),
     id_director INTEGER NOT NULL DEFAULT 1,
     fecha_creacion datetime,
	 fecha_modificacion datetime,
     usuario_modificador varchar(200),
     usuario_creador varchar(200)
     );
     
 CREATE TABLE DIRECTORES(
     id_director INTEGER PRIMARY KEY AUTO_INCREMENT,
     nom_director VARCHAR(50),
     fecha_creacion datetime,
	 fecha_modificacion datetime,
     usuario_modificador varchar(200),
     usuario_creador varchar(200)
     );

CREATE TABLE CLASIFICACIONES(
    id_clasificacion INTEGER PRIMARY KEY AUTO_INCREMENT,
    detalle_clasificacion VARCHAR(4000),
    id_usuario INTEGER NOT NULL DEFAULT 1,
    fecha_creacion datetime,
	fecha_modificacion datetime,
    usuario_modificador varchar(200),
    usuario_creador varchar(200)
     );

CREATE TABLE PELICULAS(
     id_pelicula INTEGER PRIMARY KEY AUTO_INCREMENT,
     id_genero INTEGER NOT NULL DEFAULT 1,
     id_director INTEGER NOT NULL DEFAULT 1,
     id_elenco INTEGER NOT NULL DEFAULT 1,
     id_clasificacion INTEGER NOT NULL DEFAULT 1,
     titulo VARCHAR (200),
     año VARCHAR (10),
     idioma VARCHAR(200),
     pais VARCHAR(200),
     duracion VARCHAR(50),
     fecha_creacion datetime,
	 fecha_modificacion datetime,
     usuario_modificador varchar(200),
     usuario_creador varchar(200)
     );
-------------------------------------------------------------------
ALTER TABLE PELICULAS  ADD CONSTRAINT FK_id_genero FOREIGN KEY (id_genero)
references GENEROS (id_generos);

ALTER TABLE PELICULAS  ADD CONSTRAINT FK_id_director FOREIGN KEY (id_director)
references DIRECTORES (id_director);

ALTER TABLE PELICULAS  ADD CONSTRAINT FK_id_clasificacion FOREIGN KEY (id_clasificacion)
references CLASIFICACIONES (id_clasificacion);


ALTER TABLE CLASIFICACIONES  ADD CONSTRAINT FK_id_usuario FOREIGN KEY (id_usuario)
references USUARIOS (id_usuario);
