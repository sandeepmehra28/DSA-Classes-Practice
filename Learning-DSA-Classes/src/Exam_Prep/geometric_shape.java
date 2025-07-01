package Exam_Prep;

import javax.swing.*;
import java.awt.*;
public class geometric_shape extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Line
        g.drawLine(20, 20, 120, 20);

        // Rectangle & Square
        g.drawRect(150, 20, 100, 60);
        g.fillRect(270, 20, 60, 60);

        // Oval & Circle
        g.drawOval(20, 100, 100, 100);
        g.fillOval(150, 100, 120, 80);

        // Arc
        g.drawArc(300, 100, 100, 100, 0, 180);

        // Polygon (triangle)
        int x[] = {50, 100, 150};
        int y[] = {250, 180, 250};
        g.drawPolygon(x, y, 3);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes Demo");
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new geometric_shape());
        frame.setVisible(true);
    }
}
