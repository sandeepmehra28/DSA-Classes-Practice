package Stack;

public class Stack_Implementation_using_Array {
    private static class Stack{

        private static int[] arr =new int[5];
        private int idx = 0;
        //add the value in the array using push method
        void push(int val){
            if(isFull()){
                System.out.println("Stack overflow !");
                return;
            }
                arr[idx] = val;
                idx++;


        }
        //they return top element in the stack
        int peek(){
          if(idx==0){//if stack is empty they return -1
              System.out.println("Stack is empty!");
              return -1;
          }
          return arr[idx-1];
        }

        //they return and remove top of the element in the stack
        int pop(){
            if(idx==0){//if stack is empty they not return any value
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = arr[idx-1];//assign the top element
            arr[idx-1] = 0;//reassign the index of 0
            idx--;
            return top;
        }
        //this method use for display the stack
       void display(){
            for(int i = 0;i< arr.length;i++){
                System.out.print(arr[i]+" ");
            }
          System.out.println();
      }

        //this method return size of stack
       int size(){
            return idx;
      }

      //if stack is empty they return true and is not then they return false
       boolean isEmpty(){
            if(size()==0){
                return true;
            }else {
                return false;
            }
      }

        //if our stack is full they return true otherwise false
      boolean isFull(){
            if(idx==arr.length){
                return true;
            }else {
                return false;
            }
      }
      //actual length of array
      int capacity(){
            return arr.length;
      }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

//        System.out.println( st.pop());
        System.out.println(st.peek());
        st.display();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.push(6);
        st.push(5);
    }
}
