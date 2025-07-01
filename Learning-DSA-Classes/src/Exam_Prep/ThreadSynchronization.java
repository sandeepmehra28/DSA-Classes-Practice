package Exam_Prep;
// Q : Discuss 'Thread Synchronization' by explaining its need and
// implementation in a multithreading-based program in Java.


class Counter {
    int count = 0;

    void increment() {
        count++;
    }



 // Example With Synchronization
//    synchronized void increment(){
//        count++;
//    }
}
public class ThreadSynchronization {
    //Example Without Synchronization (Incorrect Output)
 /*   public static void main(String[] args) throws InterruptedException {
    Counter c = new Counter();

    Thread t1 = new Thread(new Runnable() {
        public void run() {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        }
    });

    Thread t2 = new Thread(new Runnable() {
        public void run() {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        }
    });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + c.count); // May print less than 2000
}
*/

//Example With Synchronization (Correct Output)
public static void main(String[] args) throws InterruptedException {
    Counter c = new Counter();

    Thread t1 = new Thread(() -> {
        for (int i = 0; i < 1000; i++) c.increment();
    });

    Thread t2 = new Thread(() -> {
        for (int i = 0; i < 1000; i++) c.increment();
    });

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println("Count: " + c.count);  // Always prints 2000
}
}
