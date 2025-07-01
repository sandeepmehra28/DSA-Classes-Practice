package Exam_Prep;
// Working of Abstraction in Java
abstract class Switch {
    abstract void turnOn();
    abstract void turnOff();
}
// Concrete class implementing the abstract methods
class TVRemote extends Switch {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
public class abstract_oops {
    // Main class to demonstrate abstraction
         static void main() {
            Switch remote = new TVRemote();
            remote.turnOn();
            remote.turnOff();
        }
}
