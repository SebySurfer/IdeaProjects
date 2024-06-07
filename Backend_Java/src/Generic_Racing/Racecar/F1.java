package Generic_Racing.Racecar;

public class F1<MyEng> extends Automobile {
    boolean drs;

    MyEng engine;
    public F1(MyEng engine, String team, boolean topSpeed,  boolean drs) {
        super(team, topSpeed);
        this.drs = drs;
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
        return "Formula 1 car team " + this.team;
    }
}
