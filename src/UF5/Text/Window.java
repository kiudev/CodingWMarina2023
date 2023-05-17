package UF5.Text;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        //Creating window
        setSize(600, 300);
        setTitle("Text");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        startComponents();
    }

    private void startComponents() {
        // Creating panel
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        // Creating first TextField to enter email
        JTextField textEmail = new JTextField();
        TextPrompt placeholder1 = new TextPrompt("Enter your email", textEmail);
        placeholder1.changeAlpha(0.50f);
        placeholder1.setFont(new Font("poppins", Font.ITALIC, 12));
        textEmail.setBounds(40, 40, 200, 40);
        panel.add(textEmail);

        // Creating second TextField to enter first name
        JTextField textName = new JTextField();
        TextPrompt placeholder2 = new TextPrompt("First Name", textName);
        placeholder2.changeAlpha(0.50f);
        placeholder2.setFont(new Font("poppins", Font.ITALIC, 12));
        textName.setBounds(40, 100, 200, 40);
        panel.add(textName);
    }
}
