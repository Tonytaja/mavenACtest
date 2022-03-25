package gui;
import javax.swing.*;

public class FrameJ {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setTitle("Calculator beta");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit button is working
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("sp.png"); //create a ImageIcon
        frame.setIconImage(image.getImage());   //change icon of frame
    }




}

