package org.angello.com.view.components;

import org.angello.com.view.forms.Form;

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
