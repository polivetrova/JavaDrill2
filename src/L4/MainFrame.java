package L4;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame(){
        setTitle("Frame");
        setBounds(100,100,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        JTextField jTextF = new JTextField();
        add(jTextF);
    }
}
