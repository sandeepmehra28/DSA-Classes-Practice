package Exam_Prep;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
// Q :  Differentiate between TCP/IP sockets and server sockets.
public class Sockets {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000); // Listen on port 5000
        System.out.println("Server is waiting for connection...");

        Socket socket = serverSocket.accept(); // Accept incoming connection
        System.out.println("Client connected.");

        // Communicate
        DataInputStream in = new DataInputStream(socket.getInputStream());
        System.out.println("Client says: " + in.readUTF());

        socket.close();
        serverSocket.close();
    }
}
