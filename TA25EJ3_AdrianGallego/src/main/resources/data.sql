DROP table IF EXISTS almacenes;
DROP table IF EXISTS cajas;

CREATE TABLE almacenes (
codigo int AUTO_INCREMENT,
lugar nvarchar(100),
capacidad int,
PRIMARY KEY (codigo)
);

INSERT INTO almacenes (lugar, capacidad) VALUES ('Almacen A', 1000);
INSERT INTO almacenes (lugar, capacidad) VALUES ('Almacen B', 1500);

CREATE TABLE cajas(
codigo int AUTO_INCREMENT,
num_referencia char(5),
contenido nvarchar(100),
valor int,
almacen int,
codigo_almacen int,
PRIMARY KEY (num_referencia),
FOREIGN KEY (codigo_almacen) REFERENCES Almacenes(codigo)
ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO cajas (num_referencia, contenido, valor, almacen, codigo_almacen) VALUES ('C001', 'Electronics', 2000, 1, 1);
INSERT INTO cajas (num_referencia, contenido, valor, almacen, codigo_almacen) VALUES ('C002', 'Clothing', 1500, 2, 2);
INSERT INTO cajas (num_referencia, contenido, valor, almacen, codigo_almacen) VALUES ('C003', 'Books', 800, 1, 1);
INSERT INTO cajas (num_referencia, contenido, valor, almacen, codigo_almacen) VALUES ('C004', 'Kitchenware', 1200, 3, 2);
