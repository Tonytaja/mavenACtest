package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxes extends JFrame implements ActionListener {

    JCheckBox checkBox;
    JButton button;
    ImageIcon icon = new ImageIcon("src/main/java/gui/pp.jpg");
    ImageIcon icon2 = new ImageIcon("src/main/java/gui/rp.png");

    CheckBoxes(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        checkBox = new JCheckBox();
        button = new JButton();

        button.setText("Submit");
        button.addActionListener(this);
        checkBox.setText("please check ");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.BOLD,33));
        checkBox.setIcon(icon);
        checkBox.setSelectedIcon(icon2);
        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println( checkBox.isSelected());

        }

    }
}
