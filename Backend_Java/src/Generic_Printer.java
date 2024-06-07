//Here you first declare the name of the variable in between <>

/*

IMPORTANT NOTE:
Do NOT confuse this with Lists along the lesson.
This is a way to take in any kind of class and have undefined variables, NOT a way to hold LISTS !!!


 */
public class Generic_Printer <VariableType1, Integer extends Number> { //Using "extends" is what is called "Upper Bounds"
    //Using upper bounds has certain rules, such as first mentioning the inherited class, then the interface
    //You implement both the class and interfaces by adding them with a "&" keyword.


    //Then you use it as a 'variable type' when using it
    VariableType1 thingToPrint;
    Integer numOfRep;


    public Generic_Printer(VariableType1 thingToPrint, Integer numOfRep){
        this.thingToPrint = thingToPrint;
        this.numOfRep = numOfRep;

    }
    public void Print(){

        //This is how to obtain variables from Wrapper classes properly by making a casting
        // We suppose to make a casting because we are comparing a Wrapper type variable from a normal type


        int counter = (int) this.numOfRep;

        for(int i = 0; i < counter; i++){
            System.out.println(thingToPrint);
        }



    }

    //Here is implementing a generic method, and it can run independently without the class being generic
    public <T> String addExclamation(T x){
        return x+"!";

    }

    //Other example

    public <T> void printNew(T x){

        System.out.println(x);
    }


}


/*
Generics allows us to avoid repeating any code if we want to input different variable types

Generics prevented from having to do all this for all type of variables:

--> For String:
public class Generic_Printer {
    String thingToPrint ;
    public Generic_Printer(String thingToPrint){
        this.thingToPrint = thingToPrint;

    }
    public void Print(){
        System.out.println(thingToPrint);
    }
}

--> For int:
public class Generic_Printer {
    int thingToPrint ;
    public Generic_Printer(int thingToPrint){
        this.thingToPrint = thingToPrint;

    }
    public void Print(){
        System.out.println(thingToPrint);
    }
}

--> For double:
public class Generic_Printer {
    double thingToPrint ;
    public Generic_Printer(double thingToPrint){
        this.thingToPrint = thingToPrint;

    }
    public void Print(){
        System.out.println(thingToPrint);
    }
}

--> For boolean:
public class Generic_Printer {
    boolean thingToPrint ;
    public Generic_Printer(boolean thingToPrint){
        this.thingToPrint = thingToPrint;

    }
    public void Print(){
        System.out.println(thingToPrint);
    }
}

    ETC ...

 */