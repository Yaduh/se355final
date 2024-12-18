package se355final.webSockets;

import java.net.*;
import java.io.*;

public class ClientSF {
    public static void main(String[] args) throws Exception {

        // Connect to Server
        Socket client = new Socket("localhost", 5000); // Connected to Server at port 5000
        String msg = "Hello from ClientSF";
        int num = 10;
        float pi = 3.14f;
        int [] arr = {1,2,3,4,5};
        System.out.println("Connected to Server at port 5000");
        
        /* a. START  Client Sends a String to ServerRF */ 

        // First way: Use ouputStream
        // Cons: Does not support UTF-8. i.e. you can only send bytes

        // OutputStream out = client.getOutputStream();
        // out.write(msg.getBytes()); // Sends the String as bytes
        // out.flush();

        // Second way:

        // Writer out = new OutputStreamWriter(client.getOutputStream());
        // out.write(msg);
        // out.flush();
        
        // Third way: Use DataOutputStream (THIS WAS A HOMEWORK SO I THINK ITS BEST)
        // DataOutputStream out = new DataOutputStream(client.getOutputStream());
        // out.writeUTF(msg);
        // out.flush();
        /* END */
        // ==============================================================================================
        /* START b. Client Sends int to ServerRF */
        
        // First way: Use OutputStream
        // OutputStream out = client.getOutputStream();
        // out.write(num); // Sends the String as bytes
        // out.flush();
        
        // Second way: Use DataOutputStream (THIS WAS A HOMEWORK SO I THINK ITS BEST)
        // DataOutputStream out = new DataOutputStream(client.getOutputStream());
        // out.writeInt(num);
        // out.flush();

        /* END */
        
        // ==============================================================================================
        
        /* START c. Client Sends float to ServerRF */
        
        // the only way: Use DataOutputStream (THIS WAS A HOMEWORK SO I THINK ITS BEST)
        // DataOutputStream out = new DataOutputStream(client.getOutputStream());
        // out.writeFloat(pi);
        // out.flush();

        /* END */

        // ==============================================================================================

        /* START d. Client Sends java array to ServerRF */

        // Use ObjectOutputStream
        // ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
        // out.writeObject(arr);
        // out.flush();


        /* END */

    }
}
