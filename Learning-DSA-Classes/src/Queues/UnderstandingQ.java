package Queues;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class UnderstandingQ {
    public static void main(String[] args) {
        // Note:
        //FIFO
        // hum Que ka object isi liye create nahi kar sakte kyuki Que ek interface hai
        //Que ko Deque interface ne implement kiya
        // and Deque ko ArrayDeque class ne extend kiya
        Queue<Integer> q = new ArrayDeque<>();
        //adding values
        q.add(10);
        System.out.println(q);
        q.add(20);
        System.out.println(q);
        q.add(30);
        System.out.println(q);
        q.add(40);
        System.out.println(q);
        System.out.println();
        //remove values
//        q.remove();
//        System.out.println(q);
//        q.remove();
//        System.out.println(q);
//        q.remove();
//        System.out.println(q);


        System.out.println(q.remove()+" Remove peek value ");
        System.out.println(q);
    }
}
