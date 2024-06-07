package Generic_Racing.Racecar;

public class GT3<MyEng> extends Automobile{
    MyEng engine;
    boolean drifting;
    public GT3(MyEng engine, String team, boolean topSpeed, boolean drifting) {
        super(team, topSpeed);
        this.drifting = drifting;
        this.engine = engine;
    }

    @Override
    public void run() {
        System.out.println(this.engine);

    }

    @Override
    public Boolean topSpeedInKmPHour() {
        return this.topSpeed;
    }

    @Override
    public String toString() {
        return "Nascar car from team " + this.team;
    }
}
