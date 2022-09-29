# -------------------------------------------SAVE--------------------------------------------
# -------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_saveCliente
(IN _nombre VARCHAR(45), IN _apellido VARCHAR(45), IN _telefono INT, _email VARCHAR(45), IN _CUI BIGINT(13))
BEGIN
    START TRANSACTION ;
    INSERT INTO cliente(nombre, apellido, telefono, email, CUI) VALUES (_nombre, _apellido, _telefono, _email, _CUI);
    COMMIT;
END $$
DELIMITER ;
# -------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_saveVehiculo
(IN _marca VARCHAR(45), IN _color VARCHAR(45), IN _linea VARCHAR(45), IN __idTipoVehiculo INT, IN _placa VARCHAR(7))
BEGIN
    START TRANSACTION ;
    INSERT INTO Vehiculo (marca, color, linea, _idTipoVehiculo, placa)
    VALUES (_marca, _color, _linea, __idTipoVehiculo, _placa);
    COMMIT;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_saveTipoVehiculo
(IN _nombreTipoVehiculo VARCHAR(45))
BEGIN
    START TRANSACTION ;
    INSERT INTO tipovehiculo (nombreTipoVehiculo) VALUES (_nombreTipoVehiculo);
    COMMIT;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_saveRenta
(IN _costo DECIMAL(6, 2), IN _fechaInicio DATETIME, IN _fechaFinal DATETIME, IN __vehiculoPlaca VARCHAR(7),
 IN __clienteCUI BIGINT(13))
BEGIN
    START TRANSACTION ;
    INSERT INTO rentas (costo, fechaInicio, fechaFinal, _vehiculoPlaca, _clienteCUI)
    VALUES (_costo, _fechaInicio, _fechaFinal, __vehiculoPlaca, __clienteCUI);
    COMMIT;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
# -------------------------------------------UPDATE--------------------------------------------
# -------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_updateCliente
(IN _nombre VARCHAR(45), IN _apellido VARCHAR(45), IN _telefono INT, _email VARCHAR(45), IN _CUI BIGINT(13))
BEGIN
    START TRANSACTION ;
    UPDATE cliente
    SET cliente.nombre   = _nombre,
        cliente.apellido = _apellido,
        cliente.telefono = _telefono,
        cliente.email    = _email
    WHERE cliente.CUI = _CUI;
    COMMIT;
END $$
DELIMITER ;
# -------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_updateVehiculo
(IN _marca VARCHAR(45), IN _color VARCHAR(45), IN _linea VARCHAR(45), IN __idTipoVehiculo INT, IN _placa VARCHAR(7))
BEGIN
    START TRANSACTION ;
    UPDATE vehiculo
    SET vehiculo.marca           = _marca,
        vehiculo.color           = _color,
        vehiculo.linea           = _linea,
        vehiculo._idTipoVehiculo = __idTipoVehiculo
    WHERE vehiculo.placa = _placa;
    COMMIT;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_updateTipoVehiculo
(IN _nombreTipoVehiculo VARCHAR(45), IN _idTipoVehiculo INT)
BEGIN
    START TRANSACTION ;
    UPDATE tipovehiculo
    SET tipovehiculo.nombreTipoVehiculo = _nombreTipoVehiculo
    WHERE tipovehiculo.idTipoVehiculo = _idTipoVehiculo;
    COMMIT;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_updateRenta
(IN _costo DECIMAL(6, 2), IN _fechaInicio DATETIME, IN _fechaFinal DATETIME, IN __vehiculoPlaca VARCHAR(7),
 IN __clienteCUI BIGINT(13), IN _idRenta INT)
BEGIN
    START TRANSACTION ;
    UPDATE rentas
    SET rentas.costo          = _costo,
        rentas.fechaInicio    = _fechaInicio,
        rentas.fechaFinal     = _fechaFinal,
        rentas._vehiculoPlaca = __vehiculoPlaca,
        rentas._clienteCUI    = __clienteCUI
    WHERE rentas.idRenta = _idRenta;
    COMMIT;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
# -----------------------------------------SEARCH---------------------------------------------
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_searchCliente
(IN _CUI BIGINT(13))
BEGIN
    SELECT * FROM cliente WHERE cliente.CUI = _CUI;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_searchVehiculo
(IN _placa VARCHAR(7))
BEGIN
    SELECT * FROM vehiculo WHERE vehiculo.placa = _placa;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_searchTipoVehiculo
(IN _idTipoVehiculo INT)
BEGIN
    SELECT * FROM TipoVehiculo WHERE TipoVehiculo.idTipoVehiculo = _idTipoVehiculo;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_searchRenta
(IN _idRenta INT)
BEGIN
    SELECT * FROM rentas WHERE rentas.idRenta = _idRenta;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
# -----------------------------------------READ-ALL---------------------------------------------
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_readAllCliente
()
BEGIN
    SELECT * FROM cliente;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_readAllVehiculo
()
BEGIN
    SELECT * FROM vehiculo;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_readAllTipoVehiculo
()
BEGIN
    SELECT * FROM TipoVehiculo;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_readAllRenta
()
BEGIN
    SELECT * FROM rentas;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
# -----------------------------------------DELETE---------------------------------------------
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_deleteCliente
(IN _CUI BIGINT(13))
BEGIN
    DELETE FROM cliente WHERE cliente.CUI = _CUI;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_deleteVehiculo
(IN _placa VARCHAR(7))
BEGIN
    DELETE FROM vehiculo WHERE vehiculo.placa = _placa;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_deleteTipoVehiculo
(IN _idTipoVehiculo INT)
BEGIN
    DELETE FROM TipoVehiculo WHERE TipoVehiculo.idTipoVehiculo = _idTipoVehiculo;
END $$
DELIMITER ;
# --------------------------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_deleteRenta
(IN _idRenta INT)
BEGIN
    DELETE FROM rentas WHERE rentas.idRenta = _idRenta;
END $$
DELIMITER ;