package se355final.RPCs;
import java.io.*;

public class MessageB implements Serializable{
    public int number;
    public String message;
    public MessageB(int number, String message) {
        this.number = number;
        this.message = message;
    }
}
