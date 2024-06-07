package Serialization_Ex.Deserialization;

import Serialization_Ex.UserAccount;

import java.io.*;

public class Main implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*
        Here we receive the incoming stream of bytes and create them back to objects
        We make a COPY of the original objects
         */

        /*
        Steps to Deserialize
        ---------------------
        1. Declare your object
        2. Implement Serializable
        3. Add import
        4. FileInputStream fileIn = new FileInputStream(file path)
        5. ObjectInputStream in = new FileInputStream(fileIn)
        6. ObjectName = (Class) in.readObject();
         */

        FileInputStream file = new FileInputStream("/Users/Sebastian 1/JetBrains/IdeaProjects/Backend_Java/ObjectsForSerializable.txt");
        ObjectInputStream  get = new ObjectInputStream(file);

        UserAccount UpdatedUser1 = (UserAccount) get.readObject();
        UserAccount UpdatedUser2 = (UserAccount) get.readObject();

        System.out.println(UpdatedUser1);
        System.out.println(UpdatedUser2);

        /*
        As you can see in the final results, we set two variables in transient:
        The Password was left to be serialized by default, which means that it couldnt be done from the program
        because it is in transient
        The Recovery was able to be serialized because we manually serialized it with the classes of the library java.io
        provided.
         */






    }
}
