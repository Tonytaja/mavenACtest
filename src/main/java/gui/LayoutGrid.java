package gui;

import javax.swing.*;
import java.awt.*;

public class LayoutGrid {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setTitle("Calculator beta");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit button is working
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,10,10)); //set margin horizontal and vertical


        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.setVisible(true);

    }
}
