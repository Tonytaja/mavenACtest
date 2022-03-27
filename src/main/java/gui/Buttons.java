package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.image.Kernel;

public class Buttons  extends JFrame {
JButton button;
JLabel label;
    Buttons() {
        ImageIcon icon = new ImageIcon("src/main/java/gui/pp.jpg");
        Image image = icon.getImage();
        Image modifiedImage= icon.getImage().getScaledInstance(100,50,Image.SCALE_SMOOTH);
        icon= new ImageIcon(modifiedImage );

        ImageIcon icon2 = new ImageIcon("src/main/java/gui/rp.jpg");
        Image image2 = icon2.getImage();
        Image modifiedImage2= icon2.getImage().getScaledInstance(100,50,Image.SCALE_SMOOTH);
        icon2= new ImageIcon(modifiedImage2 );

        label= new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
       label.setVisible(false);

        button =new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(e -> label.setVisible(true));
        button.setText("calc");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,20));
        button.setIconTextGap(-15);
        button.setForeground(Color.blue);
        button.setBackground(Color.CYAN);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);  // disable button



        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.add(button);
        this.add(label);
        this.setVisible(true);

    }
}


