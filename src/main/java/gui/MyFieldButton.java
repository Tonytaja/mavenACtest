package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFieldButton extends JFrame implements ActionListener {

    JButton button =new JButton("Submit");
    JTextField textField = new JTextField();

    MyFieldButton(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);


        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.ITALIC,25));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.orange);
        textField.setCaretColor(Color.BLUE);
        textField.setText("username ");
       // textField.setEditable(false);

        this.add(textField);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button){
            Double text = Double.valueOf((String) textField.getText());
            double ty= text*text;
            System.out.println("Solution " + ty);

        }

    }
}
