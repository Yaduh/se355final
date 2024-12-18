package se355final.RPCs;
import java.net.*;
import java.io.*;
public class ClientSF {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost", 5000); // Connected to Server at port 5000
        Message msg = new Message(10, "Hello from ClientSF");
            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
            out.writeObject(msg);
            out.flush();
            System.out.println("Message sent to Server.");
            Thread.sleep(1000);
        
    }
}
