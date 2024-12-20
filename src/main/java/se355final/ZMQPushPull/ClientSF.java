package se355final.ZMQPushPull;

import org.zeromq.*;

public class ClientSF {
    public static void main(String...args) throws Exception{
     try(ZContext context = new ZContext()){
         ZMQ.Socket push = context.createSocket(SocketType.PUSH);
         push.connect("tcp://localhost:5000"); // Connect to Server at port 5000
         String msg = "This is a message";
         
             System.out.println("Message" + msg + " sent to Server.");
             push.send(msg);
             Thread.sleep(1000); // Delay to keep the client connected long enough for the server to receive the message(NOT NECESSARY IN EXAM)
     }
    }
    
}
