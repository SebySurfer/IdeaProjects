package Generic_Racing;


import Generic_Racing.Racecar.F1;
import Generic_Racing.Racecar.Actions;


public class RaceLasAmericas <Racecar extends F1 & Actions> {

    public void runningLasAmericas(F1<?> racecar){
        System.out.println("F1 car  " +racecar + " is driving by the Americas");


    }
}
