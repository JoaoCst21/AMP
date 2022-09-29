DROP DATABASE RentaVehiculos;

CREATE DATABASE RentaVehiculos;
USE RentaVehiculos;
CREATE TABLE Cliente
(
    CUI      BIGINT(13) NOT NULL PRIMARY KEY,
    nombre   VARCHAR(45),
    apellido VARCHAR(45),
    telefono INT,
    email    VARCHAR(45)
);

# DROP TABLE tipovehiculo;
CREATE TABLE TipoVehiculo
(
    idTipoVehiculo     INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombreTipoVehiculo VARCHAR(45)
);

CREATE TABLE Vehiculo
(
    placa           VARCHAR(7) NOT NULL PRIMARY KEY,
    marca           VARCHAR(45),
    color           VARCHAR(45),
    linea           VARCHAR(45),

    _idTipoVehiculo INT REFERENCES TipoVehiculo (idTipoVehiculo)
);

CREATE TABLE Rentas
(
    idRenta        INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    costo          DECIMAL(6, 2),
    fechaInicio    DATETIME,
    fechaFinal     DATETIME,

    _vehiculoPlaca VARCHAR(7) REFERENCES Vehiculo (placa),
    _clienteCUI    BIGINT(13) REFERENCES Cliente (CUI)
);

