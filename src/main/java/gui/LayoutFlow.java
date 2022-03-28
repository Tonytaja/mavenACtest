package gui;

import javax.swing.*;
import java.awt.*;

public class LayoutFlow {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setTitle("Calculator beta");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit button is working
        frame.setSize(500,500);
       // frame.setLayout(new FlowLayout()); //default in the middle
       // frame.setLayout(new FlowLayout(FlowLayout.LEADING)); //button on the left side of frame
       // frame.setLayout(new FlowLayout(FlowLayout.TRAILING));  //stick to the right side
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,11)); //set horizontal and vertical spacing

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout());


        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);

    }
}
