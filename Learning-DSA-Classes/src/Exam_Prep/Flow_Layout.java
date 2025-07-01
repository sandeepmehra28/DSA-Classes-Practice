package Exam_Prep;
import java.awt.*;
//: Describe the two layout managers available in Java AWT for designing GUIs.
public class Flow_Layout {
    static void main() {
        //flow layout
        Frame f = new Frame("FlowLayout Example");
        f.setLayout(new FlowLayout());

        f.add(new Button("Button 1"));
        f.add(new Button("Button 2"));
        f.add(new Button("Button 3"));

        f.setSize(300, 200);
        f.setVisible(true);

    // border layout
        Frame fr = new Frame("BorderLayout Example");
        fr.setLayout(new BorderLayout());

        fr.add(new Button("North"), BorderLayout.NORTH);
        fr.add(new Button("South"), BorderLayout.SOUTH);
        fr.add(new Button("East"), BorderLayout.EAST);
        fr.add(new Button("West"), BorderLayout.WEST);
        fr.add(new Button("Center"), BorderLayout.CENTER);

        fr.setSize(300, 200);
        fr.setVisible(true);


    }
}
