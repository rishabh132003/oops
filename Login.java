
import javax.swing.*;
import java.awt.*;
public class Login extends JFrame{
    Login(){
        ImageIcon i1 = new ImageIcon("/Users/rishabhjain/Desktop/Oopsproject/Artboard 1oopsproj.png");
        JLabel image = new JLabel(i1);
        image.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
        add(image);
        setSize(1920, 1080);
        setLocation(200,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}