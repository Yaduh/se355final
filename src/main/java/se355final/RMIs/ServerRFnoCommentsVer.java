package se355final.RMIs;

import java.rmi.registry.*;
import java.rmi.server.*;

public class ServerRFnoCommentsVer {
    public static void main(String[] args) throws Exception {
        MessageService server = new MessageServiceImpl(); 
        MessageService stub = (MessageService) UnicastRemoteObject.exportObject(server, 0); 
        Registry registry = LocateRegistry.createRegistry(8080);
        registry.rebind("MessageService", stub);
    }
}
