package Exam_Prep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

// Q :  What is the purpose of the URL class in Java? Explain its primary functionalities.
public class URL_class {
    public static void main(String[] args) throws Exception {
        try {
            URL url = new URL("https://www.google.com/devInternationalCollege");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort()); // -1 if not explicitly given
            System.out.println("File: " + url.getFile());
        } catch (Exception e) {
            System.out.println("Invalid URL: " + e);
        }
    }
}
