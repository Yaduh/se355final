package se355final.ProtobufRPCs;
import java.io.*;
import java.net.*;

import se355final.ProtobufRPCs.MessageService.Message;

public class ClientSF {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost", 5000); // Connected to Server at port 5000
        Message msg = Message.newBuilder()
                .setNumber(10)
                .setMessage("Hello from ClientSF")
                .build();

        ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
        // For writing only one protobuf object(Send one object then close the connection):
        msg.writeTo(out); // UNIQUE TO PROTOBUF OBJECTS
        // This doesnt work for me but delimited does idk why.
        out.flush();
        System.out.println("Message sent to Server.");

    // =============================================================================================

    // For writing multiple protobuf objects(Loops or sending two different objects per connection):
        // msg.writeDelimitedTo(out); // UNIQUE TO PROTOBUF OBJECTS
        // out.flush();
        // System.out.println("Message sent to Server.");

    }
    
}
