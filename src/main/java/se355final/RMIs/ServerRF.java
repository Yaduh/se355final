package se355final.RMIs;

import java.rmi.registry.*;
import java.rmi.server.*;

public class ServerRF {
    public static void main(String[] args) throws Exception {
        // Create the remote object:
        MessageService server = new MessageServiceImpl(); 
        // Export the remote object:
        MessageService stub = (MessageService) UnicastRemoteObject.exportObject(server, 0); 
        System.out.println("Remote object exported.");
        // The stub connects to a random port on the network

        // Stub definition: a stub is a piece of code that replaces the normal implementation 
        // of a function or a component. 
        // In this case, the stub is a proxy for the remote object
        // The proxy exposes the object to the network
        // Object + Proxy = Remote Object
        // Object -> Proxy -> Network
        // Basically the Remote Object is accessible by the network via. the Proxy

        // Create the registry:
        Registry registry = LocateRegistry.createRegistry(8080); // Registry is listening infinitely on port 8080
                        System.out.println("Registry created.");
        // when a client connects to the registry using the name "MessageService", they will be able to access the remote object
        registry.rebind("MessageService", stub);
                        System.out.println("Remote object registered. Waiting for connection...");

        // When a client connects to the registry using the name "MessageService", they will be able to access the remote object

        // The client will send a message requesting the method from the remote object
        // The remote object will respond to the client
        // The client will send a message requesting the method from the remote object
        // The remote object will respond with what the method returns
    }
}
