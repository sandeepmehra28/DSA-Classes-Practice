package Exam_Prep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Q : What is an event-driven mechanism in Java?
//public class Event_driven_mech {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Event Example");
//        JButton button = new JButton("Click Me");
//
//        // Adding an event listener to the button
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button was clicked!");
//            }
//        });
//
//        frame.setLayout(new FlowLayout());
//        frame.add(button);
//        frame.setSize(200, 100);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }


    // : Explain with an example how you can implement an
    //    event-driven mechanism in Java using ActionListener.
    public class Event_driven_mech {
        public static void main(String[] args) {
            Frame f = new Frame("Event Demo");
            Button b = new Button("Click Me");

            b.setBounds(100, 100, 80, 30);
            f.add(b);
            f.setSize(300, 200);
            f.setLayout(null);
            f.setVisible(true);

            // Event Handling (Listener)
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button clicked by user!");
                }
            });
        }
    }
//}
