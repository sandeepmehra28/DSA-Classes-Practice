package Exam_Prep;

import javax.swing.*;
import java.awt.*;

//what is AWT and swings
public class awt {
    static void main() {
        Frame f = new Frame("awt demo");
        Button b = new Button("click me");
        b.setBounds(100,100,80,30);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(false);

        // swing
        JFrame frame = new JFrame("Swing Demo");
        JButton button = new JButton("Click Me");

        button.setBounds(100, 100, 100, 40);

        frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
