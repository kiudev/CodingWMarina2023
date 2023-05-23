package UF5.Dropdown;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        // Creating window
        setSize(500, 500);
        setTitle("Dropdown");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        startComponents();
    }

    private void startComponents() {
        // Creating panel
        Panel panel = new Panel();
        getContentPane().add(panel);
        panel.setLayout(null);

        // Creating dropdown of various programming languages
        String[] option = {"C", "C++", "C#", "Java", "PHP"};
        JComboBox<String> dropdown = new JComboBox<>(option);
        dropdown.setBounds(100, 100, 80, 20);
        dropdown.setFocusable(false);
        panel.add(dropdown);

        // Creating label
        JLabel label = new JLabel();
        label.setFont(new Font("poppins", Font.BOLD, 12));
        label.setBounds(100, 50, 400, 20);
        panel.add(label);

        // Creating button
        JButton button = new JButton();
        button.setText("Show");
        button.setFont(new Font("poppins", Font.BOLD, 12));
        button.setBounds(300, 100, 80, 20);
        button.setFocusable(false);
        // Adding a listener to show the text of the language selected
        button.addActionListener(e -> {
            String optionSelected = (String) dropdown.getSelectedItem();
            label.setText("Programming language selected: " + optionSelected);
        });
        panel.add(button);
    }
}
