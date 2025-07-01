//package Exam_Prep;
////Explain all the methods for managing threads in Java
//public class Exception_Handling {
//    /*
//    Thread in Java
//
//Thread = एक lightweight process, जो program के अंदर independent execution flow देता है।
//
//Java में threads create और manage करने के लिए java.lang.Thread class और Runnable interface use होती हैं।
//
//🔹 Methods for Managing Threads in Java
//1. start()
//
//Thread start करने के लिए use होती है।
//
//JVM को बताता है कि यह thread ready है और run() method execute होना चाहिए।
//
//Thread t = new Thread();
//t.start(); // calls run() internally
//
//2. run()
//
//Thread के actual code को define करता है।
//
//Directly call न करें, हमेशा start() से call करें।
//
//public void run() {
//    System.out.println("Thread is running");
//}
//
//3. sleep(long millis)
//
//Thread को specified milliseconds के लिए pause करता है।
//
//Static method है।
//
//InterruptedException throw कर सकता है।
//
//Thread.sleep(1000); // 1 second pause
//
//4. join()
//
//Current thread wait करता है until another thread finish हो जाए।
//
//t.join(); // main thread waits for t to complete
//
//5. yield()
//
//Current thread voluntarily CPU छोड़ता है ताकि same priority वाले दूसरे threads run कर सकें।
//
//Thread.yield();
//
//6. setPriority(int newPriority) & getPriority()
//
//Thread की priority set और get करने के लिए।
//
//Priority range: Thread.MIN_PRIORITY(1) → Thread.MAX_PRIORITY(10)
//
//t.setPriority(Thread.MAX_PRIORITY);
//int p = t.getPriority();
//
//7. isAlive()
//
//Check करता है कि thread abhi भी run हो रहा है या dead हो गया है।
//
//if(t.isAlive()) {
//    System.out.println("Thread is running");
//}
//
//8. interrupt()
//
//Thread को interrupt करने के लिए use होता है।
//
//Mostly thread जो sleep() या wait() में है, उसे interrupt करता है।
//
//t.interrupt();
//
//9. setName(String name) & getName()
//
//Thread का नाम set और get करने के लिए।
//
//t.setName("MyThread");
//System.out.println(t.getName());
//
//10. currentThread()
//
//वर्तमान executing thread return करता है।
//
//Thread t = Thread.currentThread();
//System.out.println(t.getName());
//
//11. stop() (Deprecated)
//
//Thread को forcibly stop करने के लिए।
//
//Unsafe है, इसलिए use न करें।
//     */
//
//
//
//    class MyThread extends Thread {
//        public void run() {
//            for(int i=1; i<=5; i++) {
//                System.out.println(i + " " + Thread.currentThread().getName());
//                try { Thread.sleep(500); } catch (InterruptedException e) {}
//            }
//        }
//    }
//
//    public class TestThread {
//        public static void main(String[] args) throws Exception {
//            MyThread t1 = new MyThread();
//            t1.setName("Thread-1");
//            t1.start();
//            t1.join(); // main thread waits
//
//            System.out.println("Main thread ends");
//        }
//    }
//
//}
