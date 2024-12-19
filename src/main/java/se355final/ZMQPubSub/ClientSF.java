package se355final.ZMQPubSub;

import org.zeromq.*;

public class ClientSF {
    public static void main(String...args) throws Exception{
     try(ZContext context = new ZContext()){
         ZMQ.Socket pub = context.createSocket(SocketType.PUB);
         pub.bind("tcp://localhost:5000");
         String msg = "This is a the message";
        /* a. no topic START */
        //  Thread.sleep(100); // Delay to keep the client connected long enough for the server to receive the message(NOT NECESSARY IN EXAM)
        //      System.out.println("Message " + msg + " sent to Server.");
        //      pub.send(msg);
        //     Thread.sleep(1000); // Delay to keep the client connected long enough for the server to receive the message(NOT NECESSARY IN EXAM)
        /* a. no topic END */
        // ============================================================================
        /* b. with topic START */
         Thread.sleep(100); // Delay to keep the client connected long enough for the server to receive the message(NOT NECESSARY IN EXAM)
         System.out.println("Message " + msg + " sent to Server.");
         pub.sendMore("RF");
         pub.send(msg);
         Thread.sleep(1000); // Delay to keep the client connected long enough for the server to receive the message(NOT NECESSARY IN EXAM)
        /* b. with topic END */
     }
    }
    
}
