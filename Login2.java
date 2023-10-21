

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login2 extends JFrame {
    Login2() {
        getContentPane().setBackground(Color.WHITE);

        // Create a layered pane to handle layering of components
        JLayeredPane layeredPane = getLayeredPane();

        // Load the image
        ImageIcon i1 = new ImageIcon("/Users/rishabhjain/Desktop/Oopsproject/Artboard 1oopsproj.png");
        JLabel image = new JLabel(i1);

        // Create a JButton for "Create Quiz"
        JButton createQuizButton = new JButton("Admin");
        createQuizButton.setBounds(690, 470, 120, 45);
        createQuizButton.setBackground(new Color(196, 148, 192));
        createQuizButton.setFont(new Font("Gabarito", Font.PLAIN, 15));
        createQuizButton.setForeground(Color.BLACK);

        // Create a JButton for "Give Quiz"
        JButton giveQuizButton = new JButton("Student");
        giveQuizButton.setBounds(630, 380, 250, 70);
        giveQuizButton.setBackground(new Color(196, 148, 192));
        giveQuizButton.setFont(new Font("Gabarito", Font.PLAIN, 30));
        giveQuizButton.setForeground(Color.BLACK);

        JButton closeWindowButton = new JButton("Close");
        closeWindowButton.setBounds(1250, 700, 120, 45);
        closeWindowButton.setBackground(new Color(196, 148, 192));
        closeWindowButton.setFont(new Font("Gabarito", Font.PLAIN, 15));
        closeWindowButton.setForeground(Color.BLACK);

        // Set the bounds of the image label
        image.setBounds(0, -150, 1500, 1080);

        // Add the image, "Create Quiz" button, and "Give Quiz" button to the layered pane
        layeredPane.add(image, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(createQuizButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(giveQuizButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(closeWindowButton, JLayeredPane.PALETTE_LAYER);

        // Add action listeners for the buttons
        createQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle "Create Quiz" button action here
                //JOptionPane.showMessageDialog(null, "Create Quiz button clicked");
                new LoginPage("Admin");
            }
        });

        giveQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle "Give Quiz" button action here
                //JOptionPane.showMessageDialog(null, "Give Quiz button clicked");
                new LoginPage("Student");
            }
        });

        closeWindowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle "Create Quiz" button action here
                //JOptionPane.showMessageDialog(null, "Create Quiz button clicked");
                setVisible(false);
            }
        });


        setSize(1920, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login2();
    }
}
