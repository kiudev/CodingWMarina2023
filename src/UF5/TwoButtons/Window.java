package UF5.TwoButtons;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        // Creating window
        setSize(500, 500);
        setTitle("Two Buttons");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        startComponents();
    }

    private void startComponents() {
        // Creating panel
        Panel panel = new Panel();
        getContentPane().add(panel);
        panel.setLayout(null);

        // Creating first button
        JButton button1 = new JButton();
        button1.setText("Click");
        button1.setBounds(170, 100, 140, 40);
        button1.setFont(new Font("poppins", Font.BOLD, 20));
        button1.setForeground(Color.blue);
        button1.setFocusable(false);
        panel.add(button1);

        // Creating second button
        JButton button2 = new JButton();
        ImageIcon image = new ImageIcon("C:\\Users\\USUARIO\\Desktop\\M3\\CodingWMarina2023\\src\\UF5\\TwoButtons\\img\\boton-clic-aqui-2.png");
        button2.setIcon(new ImageIcon(image.getImage().getScaledInstance(150, 50, Image.SCALE_SMOOTH)));
        button2.setBounds(170, 150, 140, 40);
        button2.setFocusable(false);
        panel.add(button2);
    }
}
