package Exam_Prep;

import java.awt.*;

public class Life_Cycle_Applet {
    // Initialization (init() method)
    public void init() {
        System.out.println("Applet initialized");
    }

    //Starting (start() method)
    public void start() {
        System.out.println("Applet started");
    }

    //Painting (paint(Graphics g) method)
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Applet running...", 20, 20);
    }

    //Stopping (stop() method)
    public void stop() {
        System.out.println("Applet stopped");
    }

    //Destruction (destroy() method)
    public void destroy() {
        System.out.println("Applet destroyed");
    }
}
