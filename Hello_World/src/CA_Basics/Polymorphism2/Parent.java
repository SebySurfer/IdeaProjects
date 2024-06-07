package CA_Basics.Polymorphism2;

public class Parent extends Person {

    String email;
    String phone_num;

    public Parent(String name, int age, String email, String phone_num){
        super(name, age);
        this.email = email;
        this.phone_num = phone_num;

    }

@Override
    public void introduceYourself(){

        super.introduceYourself();
        System.out.println("If anything happens, just call me. I want my little baby to be safe");

    }




    }
