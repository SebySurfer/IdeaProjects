public class MyLittleStore {
    public String name;
    public int yearOpened;
    public double rent;

    public MyLittleStore(String name, int yearOpened, double rent){
        this.name = name;
        this.yearOpened = yearOpened;
        this.rent = rent;



    }

    @Override
    //Need to create a system override to print out the objects correctly
    public String toString(){
        return "My store name is " + name + ", opened in year " + yearOpened + ", paying $" + rent + " rent.";
    }
}
