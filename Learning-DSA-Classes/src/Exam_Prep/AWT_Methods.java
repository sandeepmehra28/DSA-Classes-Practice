package Exam_Prep;
//What is AWT? Explain any four AWT Components in detail.
public class AWT_Methods {
    /*
    1. Button

    Purpose: User interaction के लिए clickable button

Class: java.awt.Button

Example:

import java.awt.*;
import java.awt.event.*;

public class ButtonExample extends Frame {
    Button b;

    ButtonExample() {
        b = new Button("Click Me");
        b.setBounds(50, 100, 80, 30);
        add(b);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonExample();
    }
}
     */


    /*
    2. Label

Purpose: Display text or information (non-editable)

Class: java.awt.Label

Example:

Label l = new Label("Username:");
l.setBounds(50, 50, 100, 30);
add(l);
     */


    /*
    3. TextField

Purpose: User से single-line input लेने के लिए

Class: java.awt.TextField

Example:

TextField tf = new TextField();
tf.setBounds(150, 50, 150, 30);
add(tf);
     */


    /*
    4. Checkbox

Purpose: User से choice select करने के लिए (multiple selection allowed)

Class: java.awt.Checkbox

Example:

Checkbox c1 = new Checkbox("Java");
c1.setBounds(50, 100, 50, 30);
add(c1);
     */
}
