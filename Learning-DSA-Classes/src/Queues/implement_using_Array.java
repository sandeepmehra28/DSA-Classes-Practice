package Queues;

public class implement_using_Array {
    static class MyQueue{
        int front;
        int rear;
        int capacity;
        int size;
        int[] queue;
        MyQueue(int capacity){
            queue = new int[capacity];
            this.front = -1;
            this.rear = -1;
            this.size = 0;
            this.capacity = capacity;
        }
        boolean isEmpty(){
            return front == -1;
        }
        int size(){
            return size;
        }
        boolean isFull(){
            if(rear==capacity-1){
                return true;
            }
            return false;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return queue[front];
        }
        void enqueue(int val){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            if(isEmpty()){
                front=rear=0;
            }else{
                rear++;
            }
            size++;
            queue[rear] = val;
        }
        int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int temp = queue[front];
            if(front==rear){
                front=rear=-1;
            }else{
                front++;
            }
            size--;
            return temp;
        }
        void display(){
            for(int i = front;i<=rear;i++){
                System.out.print(queue[i]+" ");
                if(i!=rear){
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue(6);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        System.out.println(q.isEmpty());
        System.out.println(q.size()+" size");
        System.out.println(q.dequeue() +" after removing this element");
        q.display();
    }
}
