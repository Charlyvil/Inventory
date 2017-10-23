DROP DATABASE IF EXISTS Inventario;
CREATE DATABASE Inventario;
USE Inventario;

CREATE TABLE Estatus
(
	id_estatus INT AUTO_INCREMENT NOT NULL,
    estatus VARCHAR(20) NOT NULL,
    PRIMARY KEY(id_estatus)
);

CREATE TABLE Habilidad
(
	id_habilidad INT AUTO_INCREMENT NOT NULL,
    nombre_habilidad VARCHAR(20) NOT NULL,
    PRIMARY KEY(id_habilidad)
);

CREATE TABLE Material_apoyo
(
	id_material INT AUTO_INCREMENT NOT NULL,
    nombre_material VARCHAR(100) NOT NULL,
    PRIMARY KEY(id_material)
);

CREATE TABLE Nivel
(
	id_nivel INT AUTO_INCREMENT NOT NULL,
    nivel VARCHAR(2) NOT NULL,
    PRIMARY KEY(id_nivel)
);

CREATE TABLE Autor_actividad
(
	id_autor INT AUTO_INCREMENT NOT NULL,
	NUA INT(6) NOT NULL,
    PRIMARY KEY(id_autor)
);

CREATE TABLE Idioma
(
	id_idioma INT AUTO_INCREMENT NOT NULL,
    idioma VARCHAR(20) NOT NULL,
    PRIMARY KEY(id_idioma)
);

CREATE TABLE Rating
(
	id_rating INT AUTO_INCREMENT NOT NULL,
    rating INT(1) NOT NULL,
    PRIMARY KEY(id_rating)
);

CREATE TABLE Hojas_Trabajo
(
	id_hoja INT AUTO_INCREMENT NOT NULL,
    duracion_hoja INT NOT NULL,
    nombre_hoja VARCHAR(100) NOT NULL,
    fecha DATETIME NOT NULL,
    id_estatus INT NOT NULL,
    id_habilidad INT NOT NULL,
    id_material INT NOT NULL,
    id_nivel INT NOT NULL,
    id_autor INT NOT NULL,
    id_idioma INT NOT NULL,
    id_rating INT NOT NULL,
	PRIMARY KEY(id_hoja),
    FOREIGN KEY(id_estatus) REFERENCES Estatus(id_estatus),
    FOREIGN KEY(id_habilidad) REFERENCES Habilidad(id_habilidad),
    FOREIGN KEY(id_material) REFERENCES Material_apoyo(id_material),
    FOREIGN KEY(id_nivel) REFERENCES Nivel(id_nivel),
    FOREIGN KEY(id_autor) REFERENCES Autor_actividad(id_autor),
    FOREIGN KEY(id_idioma) REFERENCES Idioma(id_idioma),
    FOREIGN KEY(id_rating) REFERENCES Rating(id_rating)
);

CREATE TABLE Juegos
(
	id_juego INT AUTO_INCREMENT NOT NULL,
    nombre_juego VARCHAR(100) NOT NULL,
    instrucciones VARCHAR(100) NOT NULL,
    unidad INT NOT NULL,
    duracion INT(3) NOT NULL,
    fecha DATETIME NOT NULL,
    id_estatus INT NOT NULL,
    id_nivel INT NOT NULL,
    id_autor INT NOT NULL,
    id_idioma INT NOT NULL,
    id_rating INT NOT NULL,
    id_habilidad INT NOT NULL,
    PRIMARY KEY(id_juego),
    FOREIGN KEY(id_estatus) REFERENCES Estatus(id_estatus),
    FOREIGN KEY(id_habilidad) REFERENCES Habilidad(id_habilidad),
	FOREIGN KEY(id_nivel) REFERENCES Nivel(id_nivel),
    FOREIGN KEY(id_autor) REFERENCES Autor_actividad(id_autor),
    FOREIGN KEY(id_idioma) REFERENCES Idioma(id_idioma),
    FOREIGN KEY(id_rating) REFERENCES Rating(id_rating)
);

CREATE TABLE Subtitulos
(
	id_subtitulos INT AUTO_INCREMENT NOT NULL,
    idioma_subtitulos VARCHAR(20) NOT NULL,
    PRIMARY KEY(id_subtitulos)
);

CREATE TABLE Actor
(
	id_actor INT AUTO_INCREMENT NOT NULL,
    nombre_actor VARCHAR(20) NOT NULL,
    apellido_actor VARCHAR(20) NOT NULL,
    PRIMARY KEY(id_actor)
);

CREATE TABLE Genero
(
	id_genero INT AUTO_INCREMENT NOT NULL,
    genero VARCHAR(20) NOT NULL,
    PRIMARY KEY(id_genero)
);

CREATE TABLE Peliculas
(
	id_pelicula INT AUTO_INCREMENT NOT NULL,
    titulo_pelicula VARCHAR(100) NOT NULL,
    duracion_pelicula INT(3) NOT NULL,
    back_cover VARCHAR(100) NOT NULL,
    front_cover VARCHAR(100) NOT NULL,
    id_idioma INT NOT NULL,
    id_subtitulos INT NOT NULL,
    id_actor INT NOT NULL,
    id_rating INT NOT NULL,
    id_genero INT NOT NULL,
    PRIMARY KEY(id_pelicula),
    FOREIGN KEY(id_idioma) REFERENCES Idioma(id_idioma),
    FOREIGN KEY(id_subtitulos) REFERENCES Subtitulos(id_subtitulos),
    FOREIGN KEY(id_actor) REFERENCES Actor(id_actor),
    FOREIGN KEY(id_rating) REFERENCES Rating(id_rating),
    FOREIGN KEY(id_genero) REFERENCES Genero(id_genero)
);

CREATE TABLE Editorial
(
	id_editorial INT AUTO_INCREMENT NOT NULL,
    nombre_editorial VARCHAR(100) NOT NULL,
    direccion VARCHAR(100) NOT NULL,
    PRIMARY KEY(id_editorial)
);

CREATE TABLE Revistas
(
	id_revista INT AUTO_INCREMENT NOT NULL,
    titulo_revista VARCHAR(100) NOT NULL,
    nombre_revista INT(3) NOT NULL,
    fecha VARCHAR(20) NOT NULL,
    id_rating INT NOT NULL,
    id_estado VARCHAR(100) NOT NULL,
    id_editorial INT NOT NULL,
    PRIMARY KEY(id_revista),
    FOREIGN KEY(id_rating) REFERENCES Rating(id_rating),
    FOREIGN KEY(id_editorial) REFERENCES Editorial(id_editorial)
);

CREATE TABLE Autor_libros
(
	id_autorlibros INT AUTO_INCREMENT NOT NULL,
    nombre_autorlibros VARCHAR(20) NOT NULL,
    apellido_autorlibros VARCHAR(20) NOT NULL,
    PRIMARY KEY(id_autorlibros)
);

CREATE TABLE Libros
(
	id_libro INT AUTO_INCREMENT NOT NULL,
    isbn INT(13) NOT NULL,
    cantidad INT NOT NULL,
    area_libro VARCHAR(20) NOT NULL,
    año_publicacion VARCHAR(20) NOT NULL,
    titulo_libro VARCHAR(100) NOT NULL,
    tipo_libro VARCHAR(10) NOT NULL,
    audio_libro BOOLEAN NOT NULL,
    id_rating INT NOT NULL,
    id_editorial INT NOT NULL,
    id_idioma INT NOT NULL,
    id_nivel INT NOT NULL,
    id_autorlibros INT NOT NULL,
    PRIMARY KEY(id_libro),
    FOREIGN KEY(id_rating) REFERENCES Rating(id_rating),
    FOREIGN KEY(id_idioma) REFERENCES Idioma(id_idioma),
    FOREIGN KEY(id_nivel) REFERENCES Nivel(id_nivel),
    FOREIGN KEY(id_autorlibros) REFERENCES Autor_libros(id_autorlibros),
    FOREIGN KEY(id_editorial) REFERENCES Editorial(id_editorial)
);


