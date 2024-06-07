import java.util.ArrayList;
import java.util.LinkedList;

public class MyNumberList {

    /*
    public ArrayList<Integer> list;
    public MyNumberList (Arraylist<Integer> list){
        this.list = list;

    }


     */

    public  ArrayList<Integer> removeOdds(ArrayList<Integer> list){

        for(int i = (list.size()) - 1; i >= 0; i--) {
            if ((list.get(i)) % 2 != 0) {
                list.remove(i);

            }
        }
        return list;

    }

    public  ArrayList<Integer> removeEvens(ArrayList<Integer> list){

        for(int i = (list.size()) - 1; i >= 0; i--) {
            if ((list.get(i)) % 2 == 0) {
                list.remove(i);
            }
        }
        return list;

    }






}
