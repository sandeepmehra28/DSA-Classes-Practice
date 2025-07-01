package Exam_Prep;

import javax.swing.*;
import java.awt.*;
// Q :  What is the difference between the Java AWT and Java Swing packages? Examples of both
public class Swing_and_awt {
    // awt
  //  public static void main(String[] args) {
//        Frame frame = new Frame("AWT");
//        Button btn = new Button("Click");
//        btn.setBounds(50, 100, 80, 30);
//        frame.add(btn);
//        frame.setSize(300, 200);
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }

    //swing
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing");
        JButton btn = new JButton("Click");
        btn.setBounds(50, 100, 80, 30);
        frame.add(btn);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
