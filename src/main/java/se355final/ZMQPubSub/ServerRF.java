package se355final.ZMQPubSub;

import org.zeromq.*;

public class ServerRF {
    public static void main(String...args) throws Exception{
    try(ZContext context = new ZContext()){ 
        ZMQ.Socket pull = context.createSocket(SocketType.SUB); 
        pull.bind("tcp://*:5000"); // Bind to port 5000
        
        System.out.println("awdawd");
            byte [] reply = pull.recv(); // Wait for client to connect
            System.out.println("Received from Client: "+ new String(reply));
    }
}
    
}
