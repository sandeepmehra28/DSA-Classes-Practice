package LinkedList;

import javax.management.ValueExp;
import java.util.*;

public class understanding_using_generics {
   static class Node<T>{
        T data;
        Node next;
        Node(){
            this.next = null;
        }
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    static class MyLinkedList{
       Node<Integer> head;

    }
    public static void main(String[] args) {

    }

}
