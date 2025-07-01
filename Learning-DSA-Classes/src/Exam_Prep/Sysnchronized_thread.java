package Exam_Prep;

public class Sysnchronized_thread {
    /*
    (a) Synchronized Method

किसी method को synchronized declare करने से एक समय में केवल एक ही thread उसे access कर सकता है।

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}





(b) Synchronized Block

Method के पूरे body को synchronized करने की बजाय केवल critical section को lock किया जाता है।

class Counter {
    private int count = 0;

    public void increment() {
        synchronized(this) {
            count++;
        }
    }
}




(c) Static Synchronization

अगर method static है तो lock पूरे class पर लगता है (instance पर नहीं)।

class Shared {
    public static synchronized void display(String msg) {
        System.out.println(msg);
    }
}




2. Inter-Thread Communication in Java

1.sleep()
2.yield()
3.notify()
4.notifyAll()
5.wait()



     */
}
