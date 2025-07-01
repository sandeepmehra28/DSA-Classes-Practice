package Exam_Prep;

import javax.swing.*;
import java.awt.*;
import java.sql.Time;

// Q : Discuss the 'Layout Managers' and their role in the GUI-based programs
public class LayoutManager {

     //FlowLayout
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("FlowLayout Example");
//        frame.setSize(300, 200);
//        frame.setLayout(new FlowLayout());  // Set layout manager
//
//        // Add components
//        frame.add(new JButton("Button 1"));
//        frame.add(new JButton("Button 2"));
//        frame.add(new JButton("Button 3"));
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }

  //BorderLayout
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("BorderLayout Example");
//        frame.setSize(400, 300);
//        frame.setLayout(new BorderLayout()); // Set layout manager
//
//        frame.add(new JButton("North"), BorderLayout.NORTH);
//        frame.add(new JButton("South"), BorderLayout.SOUTH);
//        frame.add(new JButton("East"), BorderLayout.EAST);
//        frame.add(new JButton("West"), BorderLayout.WEST);
//        frame.add(new JButton("Center"), BorderLayout.CENTER);
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }




 /*
   //GridLayout – Uniform Grid
    public static void main(String[] args) {
        Frame f = new Frame("GridLayout Example");
        f.setLayout(new GridLayout(2, 2)); // 2 rows, 2 columns

        f.add(new Button("1"));
        f.add(new Button("2"));
        f.add(new Button("3"));
        f.add(new Button("4"));

        f.setSize(200, 200);
        f.setVisible(true);
    }
*/


    /*
    BoxLayout – Vertical/Horizontal Box
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Example");
        Box box = javax.swing.Box.createVerticalBox();

        box.add(new JButton("Button 1"));
        box.add(new JButton("Button 2"));
        box.add(new JButton("Button 3"));

        frame.add(box);
        frame.setSize(200, 150);
        frame.setVisible(true);
    }
     */



    /*CardLayout – One Component at a Time
    public static void main(String[] args) {
        Frame f = new Frame("CardLayout Example");
        CardLayout card = new CardLayout();
        f.setLayout(card);

        Button b1 = new Button("Card 1");
        Button b2 = new Button("Card 2");
        Button b3 = new Button("Card 3");

        f.add("First", b1);
        f.add("Second", b2);
        f.add("Third", b3);

        f.setSize(300, 200);
        f.setVisible(true);

        b1.addActionListener(e -> card.next(f));
        b2.addActionListener(e -> card.next(f));
        b3.addActionListener(e -> card.first(f));
    }

     */
}
