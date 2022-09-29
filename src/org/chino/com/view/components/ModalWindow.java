package org.chino.com.view.components;

import javax.swing.JFrame;

public class ModalWindow extends JFrame {
    private final Form form;

    public ModalWindow(Form form) {
        this.form = form;
        add(form);
    }

    public Form getForm() {
        return form;
    }
}
