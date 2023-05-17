package UF5.RadioButton;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        //Creating window
        setSize(300, 300);
        setTitle("Radio Button");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        startComponents();
    }

    private void startComponents() {
        // Creating panel
        Panel panel = new Panel();
        getContentPane().add(panel);
        panel.setLayout(null);

        // Creating label
        JLabel label = new JLabel();
        label.setText("Languages:");
        label.setBounds(20, 30, 200, 30);
        label.setForeground(Color.black);
        label.setFont(new Font("poppins", Font.PLAIN,14));
        label.setOpaque(true);
        panel.add(label);

        //Creating options
        //First option
        JRadioButton option1 = new JRadioButton();
        option1.setText("Java");
        option1.setFont(new Font("poppins", Font.PLAIN, 12));
        option1.setBounds(20, 60, 90, 40);
        option1.setFocusable(false);
        panel.add(option1);

        //Second option
        JRadioButton option2 = new JRadioButton();
        option2.setText("PHP");
        option2.setFont(new Font("poppins", Font.PLAIN, 12));
        option2.setBounds(20, 90, 90, 40);
        option2.setFocusable(false);
        panel.add(option2);

        //Third option
        JRadioButton option3 = new JRadioButton();
        option3.setText("C++");
        option3.setFont(new Font("poppins", Font.PLAIN, 12));
        option3.setBounds(20, 120, 90, 40);
        option3.setFocusable(false);
        panel.add(option3);

        // Creating button to validate options
        JButton button = new JButton();
        button.setText("Validate");
        button.setFont(new Font("poppins", Font.PLAIN, 12));
        button.setBounds(20, 160, 85, 20);
        button.setBackground(Color.WHITE);
        button.setFocusable(false);
        panel.add(button);
    }
}
