package org.chino.com;

import org.chino.com.controller.ControllerCliente;
import org.chino.com.controller.ControllerRenta;
import org.chino.com.controller.ControllerTipoVehiculos;
import org.chino.com.controller.ControllerVehiculo;
import org.chino.com.view.pages.Menu;

public class Main {
    public static void main(String[] args) {
        new ControllerTipoVehiculos().initView();
        new ControllerRenta().initView();
        new ControllerVehiculo().initView();
        new ControllerCliente().initView();

        new Menu().setVisible(true);
    }
}
