package Exam_Prep;

import java.applet.Applet;
import java.awt.*;
//What is Applet? Explain Applet Life cycle in detail. Also make a demo program of Applet.
public class Applets_Q extends Applet {

// HTML Tag for applet (for browser execution)
/*
<applet code="DemoApplet.class" width="300" height="200"></applet>
*/

    String message;

    // Called once when applet is loaded
    public void init() {
        message = "Hello, Welcome to Java Applet!";
    }

    // Called when applet becomes visible
    public void start() {
        System.out.println("Applet Started");
    }

    // Draw content on screen
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString(message, 50, 100);
    }

    // Called when applet is no longer visible
    public void stop() {
        System.out.println("Applet Stopped");
    }

    // Called when applet is destroyed
    public void destroy() {
        System.out.println("Applet Destroyed");
    }
    /*
    <html>
  <body>
    <applet code="MyApplet.class" width="300" height="200"></applet>
  </body>
</html>
     */

}
