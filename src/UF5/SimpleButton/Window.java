package UF5.SimpleButton;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        // Creating Window
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Simple Button");
        setLocationRelativeTo(null);

        startComponents();
    }
    private void startComponents() {
        // Creating panel
        Panel panel = new Panel();
        getContentPane().add(panel);
        panel.setLayout(null);

        // Creating button
        JButton button = new JButton();
        button.setText("Click");
        button.setBounds(170, 100, 100, 40);
        button.setFont(new Font("poppins", Font.PLAIN, 20));
        button.setForeground(Color.black);
        button.setFocusable(false);
        panel.add(button);
    }
}
