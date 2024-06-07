package HW_1.HW_1_2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class HW_1_2 {

    public static void main(String[] args){

        /*

        Al cerrar un expendio de naranjas, 15 clientes que no han pagado recibirán 15% de descuento si compran
        más de 10 kg. Determinar cuánto pagará cada cliente y cuánto percibirá la tienda por esas compras.


         */

        ArrayList<Cliente> mylist = new ArrayList<>();

        Random ran = new Random();



        int num_pes;
        boolean disc = false;
        // It IS possible to assign the same names when creating objects `!!!

        for(int i = 0; i < 15; i++){
            num_pes = ran.nextInt(1, 26);

            if(num_pes > 10){
                disc = true;
            } else {
                disc = false;
            }

            Cliente n = new Cliente(num_pes, disc);
            mylist.add(n);

        }

        double count = 0;

        for(int x = 0; x < 15; x++){
            System.out.print("Cliente "+(x+1)+": "+ mylist.get(x));

            if(mylist.get(x).getDesc() == true){
                count += mylist.get(x).getPagar_des();
            } else {
                count += mylist.get(x).getPagar();
            }

            System.out.println("");

        }
        DecimalFormat round = new DecimalFormat("#.###");

        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("");
        System.out.println("En total la tienda gano $" +  round.format(count) + " pesos");



    }
}
