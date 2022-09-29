package org.chino.com.view.components;

import net.miginfocom.swing.MigLayout;
import org.chino.com.view.components.PlaceholderTextField;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Form extends JPanel {
    private final String title;
    protected String[] fields;
    private JButton buttonSubmit;
    protected HashMap<String, PlaceholderTextField> inputs = new HashMap<>();

    public Form(String[] fields, String title) {
        this.fields = fields;
        this.title = title;
        init();
    }

    public void init() {
        setLayout(new MigLayout("fill", "3[]3", "3[]3"));
        add(new JLabel("<html><p style = 'font-size: 24px;'>" + title + "</p></html>"), "wrap, align 50% 50%");
        for (String text : fields) {
            inputs.put(text, new PlaceholderTextField(10, text, Color.GRAY));
            inputs.get(text).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            add(inputs.get(text), "wrap, align 50% 50%, w 80%");
        }
        buttonSubmit = new JButton("Submit");
        buttonSubmit.setForeground(Color.WHITE);
        buttonSubmit.setBackground(new Color(25, 26, 27));
        add(buttonSubmit, "w 80%, align 50% 100%");
    }

    public void validateFields() throws Exception {
        for (Map.Entry<String, PlaceholderTextField> entry : inputs.entrySet()) {
            if (entry.getValue().getText().isEmpty()) throw new Exception("Todos Los datos deben ser llenados");
        }
    }

    public ArrayList<String> getFormData() {
        ArrayList<String> formData = new ArrayList<>();
        for (String text : fields) {
            formData.add(inputs.get(text).getText());
        }
        return formData;
    }

    public void setFormData(ArrayList<String> data) {
        for (int i = 0; i < data.size(); i++) {
            String key = fields[i];
            String text = data.get(i);
            System.out.println(key);
            System.out.println(text);
            inputs.get(key).setText(text);
        }
    }

    public JButton getButtonSubmit() {
        return buttonSubmit;
    }
}
