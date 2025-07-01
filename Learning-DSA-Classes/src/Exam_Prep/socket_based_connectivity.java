package Exam_Prep;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
// Q : What is socket-based connectivity in Java?
public class socket_based_connectivity {
    /*j
 Server Code
    public static void main(String[] args) {
        ServerSocket ss = new ServerSocket(6666); // port number
        Socket s = ss.accept(); // waiting for client
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String message = dis.readUTF();
        System.out.println("Client says: " + message);
        ss.close();
        }
    }
    -------------
 client code
    public static void main(String[] args) {
         Socket s = new Socket("localhost", 6666);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF("Namaste Server!");
        dos.flush();
        dos.close();
        s.close();
        }
    }
*/

}
