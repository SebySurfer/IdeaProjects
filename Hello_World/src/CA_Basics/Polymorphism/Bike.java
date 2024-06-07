package CA_Basics.Polymorphism;

import CA_Basics.Polymorphism.Vehicle;

public class Bike extends Vehicle {

    //This is a subclass, being that Bike "is a" Vehicle

    int weight;

    int numOfPass;

    public Bike(String my_name, int my_year, int weight, int numOfPass){
        super(my_name, my_year);
        /*Note: the names within the parenthesis are in order of the variables in the super class's constructor. The name you give in for the subtopic
        within the constructor doesn't matter, only the order.

        If you try to change the order, it will provide you an error for not matching the variable type

         */

        this.weight = weight;
        this.numOfPass = numOfPass;

    }


    public void makeNoise(){
        System.out.println("Broom-broom");
        super.engineNoise();
    }

    @Override
    public String toString(){
        return this.name;
    }


}
