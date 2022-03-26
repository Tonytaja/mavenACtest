package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("src/main/sp.jpg");
        Border border= BorderFactory.createLineBorder(Color.blue);
        JLabel label = new JLabel();
        label.setText("Figures ");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);  // set text Left, Center, Right of image icon
        label.setVerticalTextPosition(JLabel.TOP);  // set text top. bottom of image icon
        label.setForeground(Color.GREEN);
        label.setFont(new Font("MV Boli", Font.BOLD,20));
        label.setIconTextGap(50);
        label.setBackground(new Color(12,50,60));
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP); //set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER);
       // label.setBounds(0,0,250,250); //set bounds of label  x,y position within frame


        JFrame frame =  new JFrame();
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit button is working

        frame.setSize(500,500);
        Image image = Toolkit.getDefaultToolkit().getImage("src/main/java/gui/rp.png");
        frame.setIconImage(image);
       // frame.setLayout(null); //set bounds for label
        frame.setVisible(true);
        frame.add(label);

     //   frame.pack(); // size of the frame will resize to the component within the label (always after iniciate the frame)

    }
}
