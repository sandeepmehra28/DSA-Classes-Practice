package Recursion.Easy;

public class UnderStandingFunctionCall {
    public static void main(String[] args) {
        printHelloWorld();//print 5 times
        printCounting();
    }
    static void printHelloWorld(){
        System.out.println("hello world");
        printHelloWorld1();
    }
    static void printHelloWorld1(){
        System.out.println("hello world");
        printHelloWorld2();
    }
    static void printHelloWorld2(){
        System.out.println("hello world");
        printHelloWorld3();
    }
    static void printHelloWorld3(){
        System.out.println("hello world");
        printHelloWorld4();
    }
    static void printHelloWorld4(){
        System.out.println("hello world");
    }
    static void printCounting(){
        System.out.println("1");
        printCounting1();
    }
    static void printCounting1(){
        System.out.println("2");
        printCounting2();
    }
    static void printCounting2(){
        System.out.println("3");
        printCounting3();
    }
    static void printCounting3(){
        System.out.println("4");
    }
}
