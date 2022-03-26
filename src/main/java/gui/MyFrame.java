package gui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("Calculator beta");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit button is working
        this.setResizable(false);
        this.setSize(500,500);
        this.setVisible(true);

        Image image = Toolkit.getDefaultToolkit().getImage("src/main/java/gui/rp.png");
         this.setIconImage(image);



    //    this.getContentPane().setBackground(new Color( 55,12,120)); //change background color
    }
}
