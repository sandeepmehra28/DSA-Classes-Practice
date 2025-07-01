package Exam_Prep;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Q : Describe the "Delegation Event Model" by providing a suitable example.
public class DelegationEventModel extends Frame implements ActionListener {

    Button b;

    DelegationEventModel() {
        // Create button
        b = new Button("Click Me");
        b.setBounds(100, 100, 80, 30);

        // Register listener
        b.addActionListener(this); // 'this' is the listener

        // Add button to frame
        add(b);

        // Set frame properties
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    // Event handling method
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button was clicked!");
    }

    public static void main(String[] args) {
        new DelegationEventModel(); // Create the GUI
    }
}
