package CA_Basics.Polymorphism2;

public class Teacher extends Person {

    String field;
    double salary;

    public Teacher(String name, int age, String field, double salary ){
        super(name, age);
        this.field = field;
        this.salary = salary;




    }


@Override
    public void introduceYourself(){
        super.introduceYourself();
        System.out.println("I teach the field of " + this.field);

    }



    }
