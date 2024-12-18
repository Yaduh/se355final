# COMMAND TO CREATE THE PROTO FILES:

    protoc --java_out=\src\main\java\se355final\ProtobufRPCs\ .\src\main\java\se355final\ProtobufRPCs\MessageService.proto

    you can alternatively place a '.' if you're in the directory that you want the files to be created in
    '.' means current directory 
    and would look like this:
    protoc --java_out=. .\src\main\java\se355final\ProtobufRPCs\MessageService.proto

    template: protoc --java_out={dir1} {dir2}



    java_out= : the output java files must be created and placed in the directory that comes after the '=' sign

    dir1: the destination of the files created by protobuf

    dir2: the location of the .proto file



