package gui;

import javax.swing.*;

public class DialogBoxes {
    public static void main(String[] args) {
      //  JOptionPane.showMessageDialog(null,"Welcome dialog box number 1","Box1",JOptionPane.PLAIN_MESSAGE);
     //   JOptionPane.showMessageDialog(null,"information","Box1",JOptionPane.INFORMATION_MESSAGE);
       // JOptionPane.showMessageDialog(null,"question","Box1",JOptionPane.QUESTION_MESSAGE);
//        while (true) {
//            JOptionPane.showMessageDialog(null, "Warning a virus", "BoxVirus", JOptionPane.WARNING_MESSAGE);
//        }
  //      JOptionPane.showMessageDialog(null,"ERROr MESSAGE","Box1",JOptionPane.ERROR_MESSAGE);

    //    System.out.println( JOptionPane.showConfirmDialog(null,"Do you want to pick a sandwich","sandwich box", JOptionPane.YES_NO_CANCEL_OPTION));
      //  int answer = JOptionPane.showConfirmDialog(null,"Do you want to pick a sandwich","sandwich box", JOptionPane.YES_NO_CANCEL_OPTION);
//        String name =JOptionPane.showInputDialog("What is your name");
//        System.out.println("Hello " + name);

        String[] responses= {"No, you are noob", "Thank You", "I hate you "};

        ImageIcon icon= new ImageIcon("src/main/java/gui/pp.jpg");
        JOptionPane.showOptionDialog(null,
                "You are noob",
                "Message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,responses,0);
    }
}
