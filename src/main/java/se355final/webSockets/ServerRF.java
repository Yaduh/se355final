package se355final.webSockets;
import java.net.*;
import java.util.Arrays;
import java.io.*;
public class ServerRF {
    public static void main(String...args) throws Exception{
    // Start Server
    ServerSocket server = new ServerSocket(5000);
    System.out.println("Server started at port 5000. Waiting for connection...");
    // Connect to clientSF
    Socket client = server.accept(); 
    System.out.println("Client connected.");

    /* a. START Receive String from client */

    // First way: Use InputStream
    // Cons: Does not support UTF-8. i.e. you can only receive bytes (DONT USE THIS FOR STRING)
    // InputStream in = client.getInputStream();
    // byte[] buffer = new byte[1024];
    // int bytesRead = in.read(buffer);
    // String msg = new String(buffer, 0, bytesRead);
    // System.out.println("Received from client: " + msg);

    // Second way: Use InputStreamReader
    // Cons: Does not support UTF-8. i.e. you can only receive bytes (DONT USE THIS FOR STRING)
    // InputStreamReader in = new InputStreamReader(client.getInputStream());
    // char[] buffer = new char[1024];
    // int bytesRead = in.read(buffer);
    // String msg = new String(buffer, 0, bytesRead);
    // System.out.println("Received from client: " + msg);
    
    // Third way: Use BufferedReader
    // BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
    // String msg = in.readLine();
    // System.out.println("Received from client: " + msg);

    // Fourth way: Use DataInputStream (THIS WAS A HOME WORK SO I THINK THIS IS BEST)
    // DataInputStream in = new DataInputStream(client.getInputStream());
    // String msg = in.readUTF();
    // System.out.println("Received from client: " + msg);
    
    /* END a. Receive String from client */

    //==============================================================================================

    /* a2. START Receive int as String from client */

    // First way: Use InputStream
    // InputStream in = client.getInputStream();    
    // String num = Integer.toString(in.read());
    // System.out.println(num);
    
    // Second way: Use DataInputStream (THIS WAS A HOME WORK SO I THINK THIS IS BEST)
    // DataInputStream in = new DataInputStream(client.getInputStream());
    // String num = Integer.toString(in.readInt());
    // System.out.println(num);

    /* END a2. Receive int as String from client */

    //==============================================================================================

    /* START b. Receive int from client */

    // First way: Use InputStream
    // You can only receive bytes. so dont mix and match with DataOutputstream
    // InputStream in = client.getInputStream();    
    // int num = in.read();
    // System.out.println(num);

    // Second way: Use DataInputStream (THIS WAS A HOME WORK SO I THINK THIS IS BEST)
    // DataInputStream in = new DataInputStream(client.getInputStream());
    // int num = in.readInt();
    // System.out.println(num);
    
    /* END b. Receive int from client */
    
    //==============================================================================================

    /* START c. Receive float/int as float from client */
    
    // First way: Use InputStream
    // You can only receive bytes. so dont mix and match with DataOutputstream
    // InputStream in = client.getInputStream();    
    // Float num = (float) in.read();
    // System.out.println(num);
    
    // Second way: Use DataInputStream (THIS WAS A HOME WORK SO I THINK THIS IS BEST)
    // DataInputStream in = new DataInputStream(client.getInputStream());
    // Float num = (float)in.readInt();
    // System.out.println(num);

    /* END c. Receive int as float from client */

    //==============================================================================================

    /* START d. Receive int array from client */

    // Only way: use ObjectInputStream

    // ObjectInputStream in = new ObjectInputStream(client.getInputStream());
    // int[] arr = (int[]) in.readObject();
    // System.out.println(Arrays.toString(arr));

    }
    
}
