package se355final.ZMQPubSub;

import org.zeromq.*;

public class ServerRF2 {
    public static void main(String...args) throws Exception{
    try(ZContext context = new ZContext()){ 
        ZMQ.Socket sub = context.createSocket(SocketType.SUB); 
        sub.connect("tcp://*:5000"); // Connect to port 5000

        /* a. no topic START  */
        // sub.subscribe("");
        // System.out.println("awdawd");
        //     byte [] reply = sub.recv(); // Wait for client to connect
        //     System.out.println("Received from Client: "+ new String(reply));
        /* a. no topic END */
            
        // =============================================================================

        /* b. with topic START  */
        sub.subscribe("RF2");
        System.out.println("awdawd");
            String topic = sub.recvStr(); 
            byte [] reply = sub.recv(); // Wait for client to connect
            System.out.println("Received at Server" + topic + ": "+ new String(reply));
        /* b. with topic END */
    }
}
}
