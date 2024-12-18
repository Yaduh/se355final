package se355final.RPCs;
import java.io.*;

public class Message implements Serializable{
    public int number;
    public String message;
    public Message(int number, String message) {
        this.number = number;
        this.message = message;
    }
}
