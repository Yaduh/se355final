package se355final.RMIs;
import java.rmi.*;
public class MessageServiceImpl implements MessageService{

    @Override
    public String message1(String message) {
        return "Received First Message:\n" + message;
    }

    @Override
    public String message2(String message, int number) {
        return "Received Second Message:\n" + message + "\n" + number;
    }
    
}
