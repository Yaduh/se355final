package se355final.RMIs;
import java.rmi.*;
import java.rmi.registry.*;
public class ClientFS {
    public static void main(String[] args) throws Exception{
        Registry registry = LocateRegistry.getRegistry("localhost", 8080); // Connect to registry at port 8080
        MessageService server = (MessageService) registry.lookup("MessageService"); // Lookup the remote object

        String response = server.message1("Hello from ClientFS"); // Call the remote method on the remote object
        System.out.println(response);
    }
}
