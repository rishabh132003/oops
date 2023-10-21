import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class AddnewQuestion extends JFrame {
    JLabel questionIdJLabel;
    AddnewQuestion(){
        inComponents();
        try {
            Connection con = ConnectionProvider.getCon();
            if (con != null) {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("Select count(id) from question");
                if (rs.first()) {
                    int id = rs.getInt(1);
                    id = id + 1;
                    String str = String.valueOf(id);
                    questionIdJLabel.setText(str);
                } else {
                    questionIdJLabel.setText("1");
                }
            } else {
                System.err.println("Connection is null.");
            }
        } catch (Exception e) {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
            e.printStackTrace(); // Print the exception for debugging
        }
    }

    private void inComponents(){
        getContentPane().setBackground(Color.WHITE);

        // Create a layered pane to handle layering of components
        JLayeredPane layeredPane = getLayeredPane();

        // Load the image
        //ImageIcon i1 = new ImageIcon("/Users/rishabhjain/Desktop/Oopsproject/Artboard 1oopsproj.png");
        //JLabel image = new JLabel(i1);
        
        questionIdJLabel = new JLabel("00");
        questionIdJLabel.setFont(new Font("Gabarito", Font.PLAIN, 20));
        questionIdJLabel.setBounds(200, 150, 300, 25);

        JLabel questionJLabel = new JLabel("Question :");
        questionJLabel.setFont(new Font("Gabarito", Font.PLAIN, 20));
        questionJLabel.setBounds(200, 200, 300, 25);

        JTextField questionField;
        questionField = new JTextField("",200);
        questionField.setBounds(300, 200, 800, 25);
        questionField.setBackground(new Color(196, 148, 192));
        //textField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4));
        questionField.setFont(new Font("Gabarito", Font.PLAIN, 15));
        questionField.setForeground(Color.BLACK);

        JLabel option1JLabel = new JLabel("Option 1 :");
        option1JLabel.setFont(new Font("Gabarito", Font.PLAIN, 20));
        option1JLabel.setBounds(200, 250, 300, 25);

        JTextField option1Field;
        option1Field = new JTextField("",200);
        option1Field.setBounds(300, 250, 800, 25);
        option1Field.setBackground(new Color(196, 148, 192));
        //textField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4));
        option1Field.setFont(new Font("Gabarito", Font.PLAIN, 15));
        option1Field.setForeground(Color.BLACK);

        JLabel option2JLabel = new JLabel("Option 2 :");
        option2JLabel.setFont(new Font("Gabarito", Font.PLAIN, 20));
        option2JLabel.setBounds(200, 300, 300, 25);

        JTextField option2Field;
        option2Field = new JTextField("",200);
        option2Field.setBounds(300, 300, 800, 25);
        option2Field.setBackground(new Color(196, 148, 192));
        //textField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4));
        option2Field.setFont(new Font("Gabarito", Font.PLAIN, 15));
        option2Field.setForeground(Color.BLACK);

        JLabel option3JLabel = new JLabel("Option 3 :");
        option3JLabel.setFont(new Font("Gabarito", Font.PLAIN, 20));
        option3JLabel.setBounds(200, 350, 300, 25);

        JTextField option3Field;
        option3Field = new JTextField("",200);
        option3Field.setBounds(300, 350, 800, 25);
        option3Field.setBackground(new Color(196, 148, 192));
        //textField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4));
        option3Field.setFont(new Font("Gabarito", Font.PLAIN, 15));
        option3Field.setForeground(Color.BLACK);

        JLabel option4JLabel = new JLabel("Option 4 :");
        option4JLabel.setFont(new Font("Gabarito", Font.PLAIN, 20));
        option4JLabel.setBounds(200, 400, 300, 25);

        JTextField option4Field;
        option4Field = new JTextField("",200);
        option4Field.setBounds(300, 400, 800, 25);
        option4Field.setBackground(new Color(196, 148, 192));
        //textField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4));
        option4Field.setFont(new Font("Gabarito", Font.PLAIN, 15));
        option4Field.setForeground(Color.BLACK);

        JLabel answerLabel = new JLabel("Answer :");
        answerLabel.setFont(new Font("Gabarito", Font.PLAIN, 20));
        answerLabel.setBounds(200, 450, 300, 25);

        JTextField answerField;
        answerField = new JTextField("",200);
        answerField.setBounds(300, 450, 100, 25);
        answerField.setBackground(new Color(196, 148, 192));
        //textField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4));
        answerField.setFont(new Font("Gabarito", Font.PLAIN, 15));
        answerField.setForeground(Color.BLACK);

        // Create a JButton for "Create Quiz"
        JButton saveButton = new JButton("Save");
        saveButton.setBounds(450, 550, 120, 45);
        saveButton.setBackground(new Color(196, 148, 192));
        saveButton.setFont(new Font("Gabarito", Font.PLAIN, 15));
        saveButton.setForeground(Color.BLACK);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(590, 550, 120, 45);
        clearButton.setBackground(new Color(196, 148, 192));
        clearButton.setFont(new Font("Gabarito", Font.PLAIN, 15));
        clearButton.setForeground(Color.BLACK);

        JButton closeWindowButton = new JButton("Close");
        closeWindowButton.setBounds(745, 550, 120, 45);
        closeWindowButton.setBackground(new Color(196, 148, 192));
        closeWindowButton.setFont(new Font("Gabarito", Font.PLAIN, 15));
        closeWindowButton.setForeground(Color.BLACK);

        // Set the bounds of the image label
        //image.setBounds(0, -150, 1500, 1080);

        // Add the image, "Create Quiz" button, and "Give Quiz" button to the layered pane
        //layeredPane.add(image, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(questionJLabel, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(option1JLabel, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(option2JLabel, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(option3JLabel, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(option4JLabel, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(answerLabel, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(questionField, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(option1Field, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(option2Field, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(option3Field, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(option4Field, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(answerField, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(clearButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(saveButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(closeWindowButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(questionIdJLabel, JLayeredPane.PALETTE_LAYER);

        // Add action listeners for the buttons
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle "Create Quiz" button action here
                //JOptionPane.showMessageDialog(null, "Create Quiz button clicked");
                String id = questionIdJLabel.getText();
                String name = questionField.getText();
                String opt1 = option1Field.getText();
                String opt2 = option2Field.getText();
                String opt3 = option3Field.getText();
                String opt4 = option4Field.getText();
                String answer = answerField.getText();
                try{
                    Connection con = ConnectionProvider.getCon();
                    PreparedStatement ps = con.prepareStatement("insert into question values(?,?,?,?,?,?,?)");
                    ps.setString(1,id);
                    ps.setString(2,name);
                    ps.setString(3,opt1);
                    ps.setString(4,opt2);
                    ps.setString(5,opt3);
                    ps.setString(6,opt4);
                    ps.setString(7,answer);
                    ps.executeUpdate();
                    JFrame jf = new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf,"Successfully Updated");
                    setVisible(false);
                    new AddnewQuestion().setVisible(true);
                }
                catch(Exception f){
                    JFrame jf = new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf,f);
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle "Create Quiz" button action here
                //JOptionPane.showMessageDialog(null, "Create Quiz button clicked");
                
                //new Admin().userData(textField3.getText(),"h");
                questionField.setText("");
                option1Field.setText("");
                option2Field.setText("");
                option3Field.setText("");
                option4Field.setText("");
                answerField.setText("");
            
            }
        });


        closeWindowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle "Create Quiz" button action here
                //JOptionPane.showMessageDialog(null, "Create Quiz button clicked");
                CreateQuizHome.open=0;
                setVisible(false);
            }
        });


        setSize(1920, 1080);
        setLocation(0, 0);
        setVisible(true);
    }
    public static void main(String[] args) {
        new AddnewQuestion();
    }
}


