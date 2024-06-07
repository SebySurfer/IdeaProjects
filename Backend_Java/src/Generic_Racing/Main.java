package Generic_Racing;


import Generic_Racing.Racecar.*;

public class Main {
    public static void main(String[] args) {

        Engine nissan = new Engine(800, 130.55);
        Engine chevi = new Engine(790, 100.2);
        Engine ferrari = new Engine(805 ,200.2);


        F1<Engine> redbull = new F1<>(nissan, "Redbull", true, true);

        F1<Engine> mercedes = new F1<>(ferrari, "Mercedes", false, false );

        RaceLasAmericas<F1> league2024 = new RaceLasAmericas<>();
        RaceLasAmericas<F1> league2023 = new RaceLasAmericas<>();
        RaceLasAmericas<F1> league2022 = new RaceLasAmericas<>();

        league2024.runningLasAmericas(redbull);
        league2023.runningLasAmericas(mercedes);
        league2022.runningLasAmericas(mercedes);


        GT3<Engine> corvette = new GT3<>(chevi, "Corvette", true, false);

        GT3<Engine> toyota = new GT3<>(nissan, "Toyota", false, true);

        RaceNascar<GT3> indie500_League = new RaceNascar<>();
        RaceNascar<GT3> daytona1_League = new RaceNascar<>();

        indie500_League.runningNascar(corvette);
        daytona1_League.runningNascar(toyota);

















    }
}
