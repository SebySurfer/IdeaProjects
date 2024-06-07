package CA_Basics.Polymorphism;

public class Vehicle {

    //this is my main super class or parent class

    String name;

    int year;


    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;

    }


    public Vehicle(){}
    //default constructor

    public void engineNoise(){

        System.out.println("*Engine noises*");

    }

    private void refuel(){
        System.out.println("You have refueled");
    }


    public boolean isFast(){
        return false;
    }

    /*
    Here, we created a method called isFast. Because its not a final method, other subclasses
    can modify it, in other words, 'override' it.

    Check RaceCar to see how this is done

     */

    public final boolean hasGas(){
        return true;
    }


    /*
    Here, we created a method call where it takes in any instance of the parent or the child class

     */
    public String racer(Vehicle racer){

        return "The " + racer.name + " car  is going to race";


    }


}

