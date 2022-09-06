--create the table
DROP TABLE IF EXISTS jugador;
CREATE TABLE jugador (
    jugador_id INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    equipo VARCHAR(50) NOT NULL,
    nacionalidad VARCHAR(50) NOT NULL,
    estatura DOUBLE NOT NULL
);


INSERT INTO jugador (jugador_id, nombre, equipo, nacionalidad, estatura) VALUES (1, 'Pablo Velilla', 'Barcelona FC', 'Colombia', 1.83);
INSERT INTO jugador (jugador_id, nombre, equipo, nacionalidad, estatura) VALUES (2, 'Jorge Candela', 'Real Madrid FC', 'Mexico', 1.98);
INSERT INTO jugador (jugador_id, nombre, equipo, nacionalidad, estatura) VALUES (3, 'Estefany Lopez', 'Boca Junior', 'Argentina', 2.02);