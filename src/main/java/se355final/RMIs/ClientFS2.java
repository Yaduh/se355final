package se355final.RMIs;
import java.rmi.*;
import java.rmi.registry.*;;
public class ClientFS2 {
    public static void main(String[] args) throws Exception{
        // Connect:
        Registry registry = LocateRegistry.getRegistry("localhost", 8080);
        System.out.println("Client connected to Registry.");
        // Access the remote object:  
        MessageService server = (MessageService) registry.lookup("MessageService");
        // Call the remote method:
        String response = server.message2("Hello from ClientFS2", 20);
        System.out.println(response);
    }
}
