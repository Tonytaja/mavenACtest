package gui;

import javax.swing.*;
import java.awt.*;

public class Window {

    JFrame frame= new JFrame();
    JLabel label =new JLabel("Hello");
    Window(){

        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
