package Exam_Prep;
class myTask implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
    }
}
public class RunnableExample {
    static void main() {
        myTask mt = new myTask();
        Thread t = new Thread(mt);
        t.start();
    }
}
