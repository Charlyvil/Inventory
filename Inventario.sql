DROP DATABASE IF EXISTS Inventario;
create database inventario;
use inventario;

create table estatus
(
	id_estatus int auto_increment not null,
    estatus varchar(20) not null,
    primary key(id_estatus)
);

create table habilidad
(
	id_habilidad int auto_increment not null,
    nombre_habilidad varchar(20) not null,
    primary key(id_habilidad)
);

create table material_apoyo
(
	id_material int auto_increment not null,
    nombre_material varchar(100) not null,
    primary key(id_material)
);

create table nivel
(
	id_nivel int auto_increment not null,
    nivel varchar(2) not null,
    primary key(id_nivel)
);

create table autor_actividad
(
	id_autor int auto_increment not null,
	nua int(6) not null,
    primary key(id_autor)
);

create table idioma
(
	id_idioma int auto_increment not null,
    idioma varchar(20) not null,
    primary key(id_idioma)
);

create table rating
(
	id_rating int auto_increment not null,
    rating int(1) not null,
    primary key(id_rating)
);

create table hojas_trabajo
(
	id_hoja int auto_increment not null,
    duracion_hoja int not null,
    nombre_hoja varchar(100) not null,
    fecha datetime not null,
    id_estatus int not null,
    id_habilidad int not null,
    id_material int not null,
    id_nivel int not null,
    id_autor int not null,
    id_idioma int not null,
    id_rating int not null,
	primary key(id_hoja),
    foreign key(id_estatus) references estatus(id_estatus),
    foreign key(id_habilidad) references habilidad(id_habilidad),
    foreign key(id_material) references material_apoyo(id_material),
    foreign key(id_nivel) references nivel(id_nivel),
    foreign key(id_autor) references autor_actividad(id_autor),
    foreign key(id_idioma) references idioma(id_idioma),
    foreign key(id_rating) references rating(id_rating)
);

create table juegos
(
	id_juego int auto_increment not null,
    nombre_juego varchar(100) not null,
    instrucciones varchar(100) not null,
    unidad int not null,
    duracion int(3) not null,
    fecha datetime not null,
    id_estatus int not null,
    id_nivel int not null,
    id_autor int not null,
    id_idioma int not null,
    id_rating int not null,
    id_habilidad int not null,
    primary key(id_juego),
    foreign key(id_estatus) references estatus(id_estatus),
    foreign key(id_habilidad) references habilidad(id_habilidad),
	foreign key(id_nivel) references nivel(id_nivel),
    foreign key(id_autor) references autor_actividad(id_autor),
    foreign key(id_idioma) references idioma(id_idioma),
    foreign key(id_rating) references rating(id_rating)
);

create table subtitulos
(
	id_subtitulos int auto_increment not null,
    idioma_subtitulos varchar(20) not null,
    primary key(id_subtitulos)
);

create table actor
(
	id_actor int auto_increment not null,
    nombre_actor varchar(20) not null,
    apellido_actor varchar(20) not null,
    primary key(id_actor)
);

create table genero
(
	id_genero int auto_increment not null,
    genero varchar(20) not null,
    primary key(id_genero)
);

create table peliculas
(
	id_pelicula int auto_increment not null,
    titulo_pelicula varchar(100) not null,
    duracion_pelicula int(3) not null,
    back_cover varchar(100) not null,
    front_cover varchar(100) not null,
    id_idioma int not null,
    id_subtitulos int not null,
    id_actor int not null,
    id_rating int not null,
    id_genero int not null,
    primary key(id_pelicula),
    foreign key(id_idioma) references idioma(id_idioma),
    foreign key(id_subtitulos) references subtitulos(id_subtitulos),
    foreign key(id_actor) references actor(id_actor),
    foreign key(id_rating) references rating(id_rating),
    foreign key(id_genero) references genero(id_genero)
);

create table editorial
(
	id_editorial int auto_increment not null,
    nombre_editorial varchar(100) not null,
    direccion varchar(100) not null,
    primary key(id_editorial)
);

create table revistas
(
	id_revista int auto_increment not null,
    titulo_revista varchar(100) not null,
    nombre_revista int(3) not null,
    fecha varchar(20) not null,
    id_rating int not null,
    id_estado varchar(100) not null,
    id_editorial int not null,
    primary key(id_revista),
    foreign key(id_rating) references rating(id_rating),
    foreign key(id_editorial) references editorial(id_editorial)
);

create table autor_libros
(
	id_autorlibros int auto_increment not null,
    nombre_autorlibros varchar(20) not null,
    apellido_autorlibros varchar(20) not null,
    primary key(id_autorlibros)
);

create table libros
(
	id_libro int auto_increment not null,
    isbn int(13) not null,
    cantidad int not null,
    area_libro varchar(20) not null,
    año_publicacion varchar(20) not null,
    titulo_libro varchar(100) not null,
    tipo_libro varchar(10) not null,
    audio_libro boolean not null,
    id_rating int not null,
    id_editorial int not null,
    id_idioma int not null,
    id_nivel int not null,
    id_autorlibros int not null,
    primary key(id_libro),
    foreign key(id_rating) references rating(id_rating),
    foreign key(id_idioma) references idioma(id_idioma),
    foreign key(id_nivel) references nivel(id_nivel),
    foreign key(id_autorlibros) references autor_libros(id_autorlibros),
    foreign key(id_editorial) references editorial(id_editorial)
);


