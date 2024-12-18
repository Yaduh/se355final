package se355final.ProtobufRPCs;

import java.io.*;
import java.net.*;

import se355final.ProtobufRPCs.MessageService.Message;

public class ServerRF {
    public static void main(String...args) throws Exception{
     ServerSocket server = new ServerSocket(5000); // Server at port 5000
     System.out.println("Server started at port 5000. Waiting for connection...");
     Socket client = server.accept(); // Wait for client to connect
     System.out.println("Client connected.");
    
    ObjectInputStream in = new ObjectInputStream(client.getInputStream()); // Get input from client
         Message msg = Message.parseDelimitedFrom(in);  // Read message from client
         System.out.println("Received from client: " + msg.getNumber() + " " + msg.getMessage());
    }
}
