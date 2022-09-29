package org.angello.com;

import org.angello.com.controller.ControllerCliente;
import org.angello.com.controller.ControllerRenta;
import org.angello.com.controller.ControllerTipoVehiculos;
import org.angello.com.controller.ControllerVehiculo;
import org.angello.com.view.Menu;

public class Main {
    public static void main(String[] args) {
        new ControllerTipoVehiculos().initView();
        new ControllerRenta().initView();
        new ControllerVehiculo().initView();
        new ControllerCliente().initView();

        new Menu().setVisible(true);
    }
}
