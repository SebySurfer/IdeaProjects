public class Printer extends MyThread {

    private int num;
    private String text;

    private boolean blackInk = true;

    public Printer(int num, String text, boolean blackInk ){
        this.num = num;
        this.text = text;
        this.blackInk = blackInk;
    }

    //Here we are assigning all the tasks that we've chosen to run in our program and take priority on the ones that
    // print first

    @Override
    public void run(){
        processing();

    }

    public void processing(){
        if(this.blackInk == false){
            System.out.println("Well how the hell do i need to print it");
        } else if (this.blackInk == true){
            printText();
        }
    }

    public void printText(){

        for(int i = 0; i < this.num; i++){

            System.out.println(this.text);
        }

        message();



    }


    public String message(){
        return "You have printed everything btch";

    }



}
