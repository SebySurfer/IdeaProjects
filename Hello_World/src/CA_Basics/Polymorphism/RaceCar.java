package CA_Basics.Polymorphism;

public class RaceCar extends Vehicle {

    //this is a subclass, being that RaceCar "is a" Vehicle

    double MAX_speed;

    double tireFric;

    double breakDist;

    public RaceCar(String name, int year, double MAX_speed, double tireFric, double breakDist){
        super(name, year);

        this.MAX_speed = MAX_speed;
        this.tireFric = tireFric;
        this.breakDist = breakDist;

    }

    public void switchTires(){
        System.out.println("You just switched tires");
        super.engineNoise();
    }

    @Override
    public boolean isFast(){
        return true;

    }


    /*
    Whenever you modify a method, you are 'overriding' it

    However, we cant do an override for the method hasGas() because it has the final keyword. If we tried to modify it, it will create an error.

    Try adding this code and see what kind of error appears:

    public boolean hasGas(){
        return false;
    }


     */


    @Override
    public String toString(){
        return this.name;
    }







}
