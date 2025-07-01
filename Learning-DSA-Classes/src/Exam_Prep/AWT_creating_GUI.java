package Exam_Prep;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

//: Explain UI components available in Java AWT for creating graphical user interfaces.
public class AWT_creating_GUI  {
    /*
1. Label

    Text दिखाने के लिए इस्तेमाल होता है (non-editable).

    Example:

    Label l = new Label("Enter your Name:");



2. Button

Click करने वाला बटन।

Example:

Button b = new Button("Submit");



3. TextField

Single-line text input box।

Example:

TextField tf = new TextField(20);




4. TextArea

Multi-line text input box।

Example:

TextArea ta = new TextArea(5, 30);




5. Checkbox

Option को select/deselect करने के लिए।

Example:

Checkbox cb1 = new Checkbox("Java");
Checkbox cb2 = new Checkbox("Python");




6. CheckboxGroup (Radio Buttons)

जब multiple options हों लेकिन only one select करना हो।

Example:

CheckboxGroup cbg = new CheckboxGroup();
Checkbox male = new Checkbox("Male", cbg, false);
Checkbox female = new Checkbox("Female", cbg, true);





7. Choice (Drop-down List)

Drop-down menu से option चुनने के लिए।

Example:

Choice ch = new Choice();
ch.add("Java");
ch.add("C++");
ch.add("Python");




9. Scrollbar

Horizontal या Vertical scroll bar।

Example:

Scrollbar sb = new Scrollbar();




public class AWTComponentsDemo {
    public static void main(String[] args) {
        Frame f = new Frame("AWT Components Example");

        Label l = new Label("Name:");
        l.setBounds(50, 50, 100, 30);

        TextField tf = new TextField();
        tf.setBounds(150, 50, 150, 30);

        Button b = new Button("Submit");
        b.setBounds(150, 100, 80, 30);

        Checkbox cb1 = new Checkbox("Java");
        cb1.setBounds(50, 150, 100, 30);

        Checkbox cb2 = new Checkbox("Python");
        cb2.setBounds(160, 150, 100, 30);

        Choice ch = new Choice();
        ch.add("BCA");
        ch.add("MCA");
        ch.add("B.Tech");
        ch.setBounds(50, 200, 100, 30);

        f.add(l); f.add(tf); f.add(b); f.add(cb1); f.add(cb2); f.add(ch);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}



     */
}




