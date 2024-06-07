package Generic_Racing;


import Generic_Racing.Racecar.Actions;
import Generic_Racing.Racecar.GT3;

public class RaceNascar <Racecar extends GT3 & Actions>{
    //In generics, we can Upper Bound a child class, it will only allow instances of that class and its subclasses,
    // but not instances of other sibling classes (classes that share the same parent class but are not in the
    // hierarchy below the specified bound)
    public void runningNascar(GT3<? > racecar){

        //Because we already specified the upper bounds, its not necessary to use any upper or lower bounds in the
        // wildcard.

        //Actually it would've been easier to have just done "GT3<Engine>"
        // However, for practices of using the wildcard, we didn't do it in this way.
        // It's more convenient when making a printer class or other class types.



        System.out.println("Racecar " + racecar + " is going in circles ");

    }
}
