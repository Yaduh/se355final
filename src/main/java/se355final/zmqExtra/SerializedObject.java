package se355final.zmqExtra;
import java.io.*;

public class SerializedObject implements Serializable{
    public byte[] serializedObject;
    public int lamportTime;
    public SerializedObject(byte[] serializedObject, int lamportTime) {
        this.serializedObject = serializedObject;
        this.lamportTime = lamportTime;
    }
    public static byte[] serialize(SerializedObject serializedObject) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(serializedObject);
            return baos.toByteArray();
        }
    }
    public static SerializedObject deserializeserializedObject(byte[] data) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
                ObjectInputStream ois = new ObjectInputStream(bais)) {
            return (SerializedObject) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization error: " + e.getMessage());
            return null;
        }
}
}