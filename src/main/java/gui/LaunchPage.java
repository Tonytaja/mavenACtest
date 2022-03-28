package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame= new JFrame();
    JButton myButton=new JButton("New Windnow");
    LaunchPage(){

        myButton.setBounds(100,100,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(myButton);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==myButton){
            frame.dispose();
            Window window= new Window();
        }

    }
}
