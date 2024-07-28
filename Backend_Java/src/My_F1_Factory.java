public class My_F1_Factory {

    public static String engine = "v10";
    public static int NumOfCarsProduced;

    public String brand;

    public My_F1_Factory(String brand){
        this.brand = brand;

        //This will create a counter for every time a new car is produced
        NumOfCarsProduced++;



    }

    public void CarInfo(){
        System.out.println("The "+this.brand+" has just been produced");
    }

    public static void CarCount(){
        /*Here, you cannot reference non-static variables. It will produce an error because you expect an instance of
        a class when in reality you're just referrencing the main class.
         */

        System.out.println("The total amount of cars produced are: "+NumOfCarsProduced);
    }





}
