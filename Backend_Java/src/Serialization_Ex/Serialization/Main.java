package Serialization_Ex.Serialization;

import Serialization_Ex.UserAccount;

import java.io.*;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException {

        /*
        Here we send our objects by turning them into a stream of bytes
        We create our original objects

         */

        /*
        Steps to Serialize
        -------------------
        1. Your object class should implement Serializable
        2. Add import
        3. FileOutputStream fileOut = new FileOutputStream(file path)
        4. ObjectOutputStream out = new ObjectOutputStream(fileOut)
        5. out.writeObject(objectName)
        6. out.close(); fileOut.close();
         */

        FileOutputStream file = new FileOutputStream("ObjectsForSerializable.txt");
        ObjectOutputStream send = new ObjectOutputStream(file);

        UserAccount client1 = new UserAccount("Aliz", 21124411, "2fdww2r2", 99442);
        UserAccount client2 = new UserAccount("Lorenzo", 149491883, "12fwfjeq3", 39432);

        send.writeObject(client1);
        send.writeObject(client2);



        file.close();
        send.close();

        System.out.println("Changes saved");




    }
}
