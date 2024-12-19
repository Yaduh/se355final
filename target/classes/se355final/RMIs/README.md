
# Client: 
1. connect to registry             
    LocateRegistry.getRegistry("localhost", 8080)
2. Access the Remote Object
    registry.Lookup("MessageService")
3. Call the Remote Method
    message1()
# Server
1. Create Remote Obejct
    MessageService
2. Export Remote Object
    UnicastRemoteObject.exportObject(MessageService)

3. Create Registry
    LocateRegistry.createRegistry(8080)
4. Give access to client when they request access to the registry.
    rebind("MessageService", exportedObject)
# Definitions

SF: Send First
RF: Receive First

# IDK what else to add since this is the only thing we've done in class sorry

# The midterm question was really easy but asked to also use Java Sockets to also send the result back to the client
# which isnt possible but I think he'd still give credit if you tried your best.
# what id do is id create a method within the impl class that opens a socket that connects to the client's port
# and call it before where I'd return the value for the message() method 

