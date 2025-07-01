package Exam_Prep;
import java.applet.Applet;
import java.applet.Applet;
import java.awt.*;
//Q: : What is an applet in Java? example
public class appletsExample extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, World!", 20, 20);
    }
}

/*
 and in the html
<html>
 <title> applet example</title>
<applet code="HelloWorldApplet.class" width="300" height="100">
</applet>
</html>
*/
