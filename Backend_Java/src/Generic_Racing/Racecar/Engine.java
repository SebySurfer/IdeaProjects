package Generic_Racing.Racecar;

public class Engine {
    int hp;
    double weightKg;



    public Engine( int hp,  double weightKg){
        this.hp = hp;
        this.weightKg = weightKg;

    }


    public String toString(){
        return "Engine running";
    }
}
