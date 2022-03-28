package calc;

import javax.swing.*;
import java.awt.*;

public class PICK {
    JFrame frame =new JFrame();

    PICK(){
        frame.setTitle("Calculator  PICK ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(620,620);
        frame.setLayout(new BorderLayout(10,10));
        Image image = Toolkit.getDefaultToolkit().getImage("src/main/java/gui/rp.png");
        frame.setIconImage(image);
        frame.setVisible(true);
    }
}
