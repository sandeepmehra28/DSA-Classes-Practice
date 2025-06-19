package Collections;

import java.util.*;

public class understanding {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.sort((o1, o2) -> o2-o1);
        System.out.println(list);

        List<student> list1 = new ArrayList<>();
        list1.add(new student(101,"sandeep"));
        list1.add(new student(102,"sonu"));
        list1.add(new student(105,"chaman"));
        list1.add(new student(103,"sachin"));
        list1.sort((A, B) -> {
            int res = A.rollNumber - B.rollNumber;
                         if (res == 0)
                         {
                             return B.name.compareTo(A.name);
                         }
                         return res;
        });
        System.out.println(list1);
    }
   static class student{
        public int rollNumber;
        public String name;
        public student(int rn, String na){
            this.rollNumber = rn;
            this.name = na;
        }
        public String toString(){
            return name;
        }
    }
}