package se355final.RMIs;
import java.rmi.*;
public interface MessageService extends Remote{
    public String message1(String message) throws RemoteException;
    public String message2(String message , int number) throws RemoteException;
}
