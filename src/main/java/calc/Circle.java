package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Circle extends WindowFigures{
    private double radius;
    private final double PI = 3.14;

    public Circle() {


        ImageIcon formula= new ImageIcon("src/main/java/calc/circleFromula.png");
        Image fm= formula.getImage().getScaledInstance(300,170,Image.SCALE_SMOOTH);
        formula= new ImageIcon(fm);

        ImageIcon figure = new ImageIcon("src/main/java/calc/circle.png");
        Image fig = figure.getImage().getScaledInstance(250,250,5);
        figure= new ImageIcon(fig);

        label3.setIcon(formula);
        label4.setIcon(figure);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==button){
                    Double text = Double.valueOf((String) textField.getText());
                    double ty= text*text;

                }
            }});



    }
}
