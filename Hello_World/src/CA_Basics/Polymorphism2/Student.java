package CA_Basics.Polymorphism2;

public class Student extends Person {

    int grade;
    char group;
    double averageGrade;


    public Student(String n, int ag, int grade, char group, double averageGrade){
        /*
        You can see here that by calling super(), it is already referencing the variables
        from the constructor. Its just up to us to name those variables in our own way,
        and of course, in order of how we made the constructor and the matching parameter type

        Note that its giving you the option to name them.
         */
        super(n, ag);
        this.grade = grade;
        this.group = group;
        this.averageGrade = averageGrade;


    }

    @Override
    public void introduceYourself(){
        super.introduceYourself();
        System.out.println("I'm at grade "+ this.grade + this.group);
    }







    }
