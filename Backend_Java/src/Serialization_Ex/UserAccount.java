package Serialization_Ex;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UserAccount implements Serializable {
    private static final long serialVersionUID = 1;

    //Here we are setting its unique id key
    private String name;
    private int phoneNum;
    transient private String password;

    transient private int recovery_code;

    public UserAccount(String name, int phoneNum, String password , int recovery_code){
        this.name = name;
        this.phoneNum = phoneNum;
        this.password = password;
        this.recovery_code = recovery_code;

    }

    //Here we display how we can manually serialize a variable if it can't be done by default

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();  // Serialize the default fields (non-transient fields)
        stream.writeInt(this.recovery_code);
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();  // Deserialize the default fields (non-transient fields)
        this.recovery_code = stream.readInt();
    }



    @Override
    public String toString(){
        return String.format("Name: %s, Phone Number: %d, Password: %s, Rec: %d", this.name, this.phoneNum, this.password, this.recovery_code);

    }
}
