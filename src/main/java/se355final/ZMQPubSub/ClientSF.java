package se355final.ZMQPubSub;

import org.zeromq.*;

public class ClientSF {
    public static void main(String...args) throws Exception{
     try(ZContext context = new ZContext()){
         ZMQ.Socket push = context.createSocket(SocketType.PUB);
         push.connect("tcp://localhost:5000"); // Connect to Server at port 5000
         String msg = "a";
         
             System.out.println("Message" + msg + " sent to Server.");
             push.send(msg);
             Thread.sleep(1000); // Delay to keep the client connected long enough for the server to receive the message(NOT NECESSARY IN EXAM)
     }
    }
    
}
