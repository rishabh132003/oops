import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateQuizHome extends JFrame {
    public static int open = 0;
    CreateQuizHome() {
        inComponents();
    }

    private void Open(){
        if(open==0){
            new AddnewQuestion().setVisible(true);
            open = 1;
        }else{
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is Already open");
        }
    }


    private void inComponents(){
        getContentPane().setBackground(Color.WHITE);

        // Create a layered pane to handle layering of components
        JLayeredPane layeredPane = getLayeredPane();

        // Load the image
        //ImageIcon i1 = new ImageIcon("/Users/rishabhjain/Desktop/Oopsproject/Artboard 1oopsproj.png");
        //JLabel image = new JLabel(i1);

        // Create a JButton for "Create Quiz"
        JButton addNewButton = new JButton("Add Question");
        addNewButton.setBounds(50, 100, 200, 60);
        addNewButton.setBackground(new Color(196, 148, 192));
        addNewButton.setFont(new Font("Gabarito", Font.PLAIN, 15));
        addNewButton.setForeground(Color.BLACK);

        // Create a JButton for "Give Quiz"
        JButton updateQuestiButton = new JButton("Update Question");
        updateQuestiButton.setBounds(250, 100, 200, 60);
        updateQuestiButton.setBackground(new Color(196, 148, 192));
        updateQuestiButton.setFont(new Font("Gabarito", Font.PLAIN, 15));
        updateQuestiButton.setForeground(Color.BLACK);

        JButton showAllQuesButton = new JButton("All Questions");
        showAllQuesButton.setBounds(450, 100, 200, 60);
        showAllQuesButton.setBackground(new Color(196, 148, 192));
        showAllQuesButton.setFont(new Font("Gabarito", Font.PLAIN, 15));
        showAllQuesButton.setForeground(Color.BLACK);

        JButton deleteQuestiButton = new JButton("Delete Question");
        deleteQuestiButton.setBounds(650, 100, 200, 60);
        deleteQuestiButton.setBackground(new Color(196, 148, 192));
        deleteQuestiButton.setFont(new Font("Gabarito", Font.PLAIN, 15));
        deleteQuestiButton.setForeground(Color.BLACK);

        JButton studentResulButton = new JButton("Student Result");
        studentResulButton.setBounds(850, 100, 200, 60);
        studentResulButton.setBackground(new Color(196, 148, 192));
        studentResulButton.setFont(new Font("Gabarito", Font.PLAIN, 15));
        studentResulButton.setForeground(Color.BLACK);

        JButton closeWindowButton = new JButton("Close");
        closeWindowButton.setBounds(1050, 100, 200, 60);
        closeWindowButton.setBackground(new Color(196, 148, 192));
        closeWindowButton.setFont(new Font("Gabarito", Font.PLAIN, 15));
        closeWindowButton.setForeground(Color.BLACK);

        // Set the bounds of the image label
        //image.setBounds(0, -150, 1500, 1080);

        // Add the image, "Create Quiz" button, and "Give Quiz" button to the layered pane
        //layeredPane.add(image, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(deleteQuestiButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(showAllQuesButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(studentResulButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(closeWindowButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(updateQuestiButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(addNewButton, JLayeredPane.PALETTE_LAYER);

        // Add action listeners for the buttons
        addNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle "Create Quiz" button action here
                //JOptionPane.showMessageDialog(null, "Create Quiz button clicked");
                if(open==0){
                    new AddnewQuestion().setVisible(true);
                    open=1;
                }
                else{
                    JFrame jf = new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf , "One form is already open");
                }
            }
        });

        updateQuestiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle "Give Quiz" button action here
                //JOptionPane.showMessageDialog(null, "Give Quiz button clicked");
               
            }
        });

        closeWindowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                int a = JOptionPane.showOptionDialog(jf, "Do you really want to close", "Select", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (a == JOptionPane.YES_OPTION) {
                    // User clicked "Yes," so close the frame
                    
                    dispose();
                }
            }
        });

        /*closeWindowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle "Create Quiz" button action here
                //JOptionPane.showMessageDialog(null, "Create Quiz button clicked");
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                int a = JOptionPane.showOptionDialog(jf,"Do you really want to close","Select",JOptionPane.YES_NO_OPTION);
                setVisible(false);
            }
        });*/


        setSize(1920, 1080);
        setLocation(0, 0);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CreateQuizHome();
    }
}