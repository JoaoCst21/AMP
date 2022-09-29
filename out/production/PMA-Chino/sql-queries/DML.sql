# --------------------------------------------------------------------------------------------
# -----------------------------------------CLIENTE---------------------------------------------
# --------------------------------------------------------------------------------------------
CALL sp_saveCliente('Angel', 'Castellanos', 23145678, 'angel@gmail.com', 1465789123457);
CALL sp_saveCliente('Darwin', 'Hernandez', 264895317, 'darwin@gmail.com', 7856483512488);
CALL sp_saveCliente('Kevin', 'Perez', 74185264, 'kevin@gmail.com', 5578964321456);
CALL sp_saveCliente('Andres', 'Linux', 42654319, 'andres@gmail.com', 2089642537957);
CALL sp_saveCliente('Javier', 'Pastor', 73915542, 'javier@gmail.com', 1456873224985);
CALL sp_saveCliente('Braulio', 'Lopez', 14361598, 'braulio@gmail.com', 7956321479554);
CALL sp_saveCliente('Jessica', 'Urriola', 55786314, 'jessica@gmail.com', 7894351648354);
CALL sp_saveCliente('Anneliese', 'Gonzalez', 23459122, 'anneliese@gmail.com', 4689753124965);
CALL sp_saveCliente('Gladys', 'Hernandez', 49325788, 'gladys@gmail.com', 4568431256487);
CALL sp_saveCliente('Victoria', 'Texajun', 33481726, 'victoria@gmail.com', 4935114752557);
# --------------------------------------------------------------------------------------------
# --------------------------------------TIPO-VEHICULO------------------------------------------
# --------------------------------------------------------------------------------------------
CALL sp_saveTipoVehiculo('Carro');
CALL sp_saveTipoVehiculo('Moto');
CALL sp_saveTipoVehiculo('Camionetas');
CALL sp_saveTipoVehiculo('Pick Up');
# --------------------------------------------------------------------------------------------
# ----------------------------------------VEHICULO--------------------------------------------
# --------------------------------------------------------------------------------------------
CALL sp_saveVehiculo('Honda', 'Negro', 'Civic', 1, 'c475jdp');
CALL sp_saveVehiculo('Mazda', 'Rojo', 'Mazda3', 1, 'c786kas');
CALL sp_saveVehiculo('Bronco', 'Blanco', 'Ford', 1, 'c364sld');
CALL sp_saveVehiculo('Yamaha', 'Azul', 'YZF-R1', 2, 'm127nqs');
CALL sp_saveVehiculo('Suzuki', 'Negro', 'V Strom 650 XT', 2, 'm297zxi');
CALL sp_saveVehiculo('Honda', 'Blanco', 'Africa Twin', 2, 'm824wld');
CALL sp_saveVehiculo('Mercedes', 'Plateado', 'Citaro', 3, 'p579lqw');
CALL sp_saveVehiculo('Nissan', 'Rojo', 'Datsun', 3, 'p178mcd');
CALL sp_saveVehiculo('Chevrolet', 'Amarillo', 'Silverado', 3, 'p573xmo');
CALL sp_saveVehiculo('Toyota', 'Amarillo', 'Land Cruiser', 4, 't731lsq');
# --------------------------------------------------------------------------------------------
# -----------------------------------------RENTAS---------------------------------------------
# --------------------------------------------------------------------------------------------
CALL sp_saveRenta(7500, '2022-06-12', '2022-09-20', 'c364sld', 4689753124965);
CALL sp_saveRenta(2500, '2022-09-04', '2022-10-27', 'c786kas', 2089642537957);
CALL sp_saveRenta(1000, '2022-10-12', '2022-10-30', 'm297zxi', 1465789123457);
CALL sp_saveRenta(1200, '2022-07-03', '2022-09-11', 'm824wld', 1456873224985);
CALL sp_saveRenta(900, '2022-10-06', '2022-11-06', 'm127nqs', 4935114752557);

CALL sp_saveRenta(3750, '2022-07-02', '2022-08-14', 't731lsq', 7856483512488);
CALL sp_saveRenta(2200, '2022-04-13', '2022-05-21', 'p178mcd', 7956321479554);
CALL sp_saveRenta(700, '2022-07-04', '2022-07-29', 'c475jdp', 4568431256487);
CALL sp_saveRenta(3400, '2022-10-12', '2022-11-19', 'p579lqw', 5578964321456);
CALL sp_saveRenta(8700, '2022-08-17', '2022-10-21', 't731lsq', 7894351648354);

CALL sp_saveRenta(1800, '2022-02-02', '2022-04-13', 'm127nqs', 1456873224985);
CALL sp_saveRenta(1200, '2022-09-06', '2022-10-12', 'c475jdp', 4568431256487);
CALL sp_saveRenta(2200, '2022-06-15', '2022-08-23', 'c786kas', 5578964321456);
CALL sp_saveRenta(7230, '2022-07-06', '2022-09-22', 'c364sld', 1465789123457);
CALL sp_saveRenta(4200, '2022-10-01', '2022-11-25', 't731lsq', 4689753124965);

CALL sp_saveRenta(1400, '2022-11-12', '2022-12-21', 'p178mcd', 7894351648354);
CALL sp_saveRenta(700, '2022-08-07', '2022-09-20', 'm127nqs', 7956321479554);
CALL sp_saveRenta(1800, '2022-07-23', '2022-08-30', 'p579lqw', 2089642537957);
CALL sp_saveRenta(1000, '2022-05-02', '2022-06-24', 'c475jdp', 4935114752557);
CALL sp_saveRenta(4000, '2022-02-16', '2022-05-29', 'm824wld', 1465789123457);
