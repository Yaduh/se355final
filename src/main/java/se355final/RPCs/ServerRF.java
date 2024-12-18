package se355final.RPCs;
import java.net.*;
import java.io.*;
public class ServerRF {
    public static void main(String...args) throws Exception{
     ServerSocket server = new ServerSocket(5000); // Server at port 5000
     System.out.println("Server started at port 5000. Waiting for connection...");
     Socket client = server.accept(); // Wait for client to connect
     System.out.println("Client connected.");
    
    /* a. START Receive custom Java object from clientSF */ 
         ObjectInputStream in = new ObjectInputStream(client.getInputStream()); // Get input from client
         Message msg = (Message) in.readObject(); // Read message from client
         System.out.println("Received from client: " + msg.number + " " + msg.message);
    /* END Receive custom Java object from clientSF */
    //
    // =============================================================================
    /* b. START Receive custom Java object from clientSF but check type */
    //  ObjectInputStream in = new ObjectInputStream(client.getInputStream()); // Get input from client
    //  Object msg = in.readObject(); // Instantiate 'Object' to read the object
    //  if(msg instanceof Message){ // Check instance type
    //      Message msgA = (Message) in.readObject(); // Read message from client
    //      System.out.println("Received from client: " + msgA.number + " " + msgA.message);
    //     }
    //  if(msg instanceof MessageB){ // Check instance type
    //      MessageB msgB = (MessageB) in.readObject();
    //      System.out.println("Received from client: " + msgB.number + " " + msgB.message);
    //  }
    //
    /* END Receive custom Java object from clientSF but check type */
    }
    
}
