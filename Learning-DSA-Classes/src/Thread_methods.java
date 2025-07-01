public class Thread_methods {
    /*
    Method	Description
start()	 Thread को start करता है। JVM के द्वारा run() method execute किया जाता है।
run()	 Thread का actual code इसमें लिखा जाता है। start() call करने से JVM इसे call करती है।
sleep(long millis)	 Thread को specified milliseconds के लिए pause करता है। CPU अन्य threads को allocate होता है।
join()	 Current thread wait करता है until another thread finish हो जाए।
yield()	 Thread voluntarily CPU relinquish करता है ताकि अन्य threads run कर सकें।
setPriority(int priority)	 Thread की priority set करता है (1–10, default 5)।
getPriority()	 Current thread की priority return करता है।
setName(String name)	 Thread का name set करता है।
getName()	 Thread का name return करता है।
isAlive()	 Check करता है कि thread alive (running or ready) है या नहीं।
interrupt()	 Thread को interrupt करता है, sleep या wait state में होने पर InterruptedException generate करता है।
isInterrupted() 	Check करता है कि thread interrupt हुआ है या नहीं।
setDaemon(boolean on)	 Thread को daemon thread बनाता है। JVM तब exit करता है जब सभी non-daemon threads finish हो जाए।
currentThread()	 Current executing thread को return करता है।

     */

    //example program
    /*
    class MyThread extends Thread {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println(getName() + " running: " + i);
            try {
            Thread.sleep(500);
            } catch(Exception e) {}
        }
    }
}

public class ThreadMethodsDemo {
    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.setPriority(Thread.MAX_PRIORITY); // priority 10
        t2.setPriority(Thread.MIN_PRIORITY); // priority 1

        t1.start(); // start thread
        t2.start();

        t1.join(); // main thread waits for t1 to finish
        t2.join();

        System.out.println("Are threads alive? " + t1.isAlive() + ", " + t2.isAlive());
    }
}


//output
Thread-1 running: 1
Thread-2 running: 1
Thread-1 running: 2
Thread-2 running: 2
...
Are threads alive? false, false
     */
}
