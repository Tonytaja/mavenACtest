package gui;

import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {

        ImageIcon icon= new ImageIcon("src/main/java/gui/rp.png");
        JLabel label = new JLabel();
        label.setText("Hi!!!!!!!!!!!!!!!!!!!");
        label.setVerticalAlignment(JLabel.BOTTOM);

        JLabel labelImage = new JLabel();
        labelImage.setIcon(icon);

       JPanel redPanel = new JPanel();
       redPanel.setBackground(new Color(150,25,66));
       redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(new BorderLayout());  //place all component to the left

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);


        JFrame frame =  new JFrame();
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit button is working
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        redPanel.add(label);
        frame.add(redPanel);
        bluePanel.add(labelImage);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
