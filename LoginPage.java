import javax.swing.*;

import myusepack.*;

import java.awt.*;
import java.awt.event.*;

/*abstract class Password{
    abstract void getPassword();
}*/

/*class Admin extends Password{
    public void getPassword(){
         
    }
}*/

/*class Student extends Password{
    public void getPassword(){

    }
}*/

public class LoginPage extends JFrame {
    LoginPage(String usertype){
        String usert = usertype;
        getContentPane().setBackground(Color.WHITE);

        // Create a layered pane to handle layering of components
        JLayeredPane layeredPane = getLayeredPane();

        // Load the image
        ImageIcon i1 = new ImageIcon("/Users/rishabhjain/Desktop/Oopsproject/Artboard 1oopsproj.png");
        JLabel image = new JLabel(i1);

        JLabel designation = new JLabel(usertype);
        designation.setFont(new Font("Gabarito", Font.PLAIN, 20));
        designation.setBounds(50, 50, 300, 25);

        JLabel username = new JLabel("Username");
        username.setFont(new Font("Gabarito", Font.PLAIN, 20));
        username.setBounds(582, 370, 300, 25);

        JLabel password = new JLabel("Password");
        password.setFont(new Font("Gabarito", Font.PLAIN, 20));
        password.setBounds(582, 470, 300, 25);

        //for username
        JTextField textField3;
        textField3 = new JTextField("",20);
        textField3.setBounds(580, 400, 300, 40);
        textField3.setBackground(new Color(196, 148, 192));
        //textField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4));
        textField3.setFont(new Font("Gabarito", Font.PLAIN, 30));
        textField3.setForeground(Color.BLACK);


        //for password
        JPasswordField adminPass = new JPasswordField("",20);  
        adminPass.setBounds(580, 500, 300, 40);
        adminPass.setBackground(new Color(196, 148, 192));
        //textField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4));
        adminPass.setFont(new Font("Gabarito", Font.PLAIN, 30));
        adminPass.setForeground(Color.BLACK);

        // Create a JButton for "Create Quiz"
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(590, 550, 120, 45);
        loginButton.setBackground(new Color(196, 148, 192));
        loginButton.setFont(new Font("Gabarito", Font.PLAIN, 15));
        loginButton.setForeground(Color.BLACK);

        JButton closeWindowButton = new JButton("Close");
        closeWindowButton.setBounds(745, 550, 120, 45);
        closeWindowButton.setBackground(new Color(196, 148, 192));
        closeWindowButton.setFont(new Font("Gabarito", Font.PLAIN, 15));
        closeWindowButton.setForeground(Color.BLACK);

        // Set the bounds of the image label
        image.setBounds(0, -150, 1500, 1080);

        // Add the image, "Create Quiz" button, and "Give Quiz" button to the layered pane
        layeredPane.add(image, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(loginButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(closeWindowButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(adminPass, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(textField3, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(username, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(password, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(designation, JLayeredPane.PALETTE_LAYER);

        // Add action listeners for the buttons
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle "Create Quiz" button action here
                //JOptionPane.showMessageDialog(null, "Create Quiz button clicked");
                
                //new Admin().userData(textField3.getText(),"h");
                UserrData a1 = new UserrData();
                
                int f = a1.checkData(textField3.getText(),adminPass.getText(),usert);
                //int f = a1.userData(textField3.getText(),adminPass.getText(),usertype);
                if(f==1){
                    JOptionPane.showMessageDialog(null, "correct");
                }else if(f==0){
                    new CreateQuizHome();
                }else{
                    JOptionPane.showMessageDialog(null, "Username or Password is incorrect");
                }
                setVisible(false);
                               
            }
        });

        closeWindowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle "Create Quiz" button action here
                //JOptionPane.showMessageDialog(null, "Create Quiz button clicked");
                setVisible(false);
                new Login2().setVisible(true);
            }
        });


        setSize(1920, 1080);
        setLocation(0, 0);
        setVisible(true);
    }
    public static void main(String[] args) {
        new LoginPage("");
    }
}
