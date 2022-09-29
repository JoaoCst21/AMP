package org.angello.com;

import org.angello.com.controller.ControllerTipoVehiculos;
import org.angello.com.view.Menu;

public class Main {
    public static void main(String[] args) {
        new ControllerTipoVehiculos().initView();

        new Menu().setVisible(true);
    }
}
