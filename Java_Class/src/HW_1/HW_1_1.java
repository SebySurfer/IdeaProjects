package HW_1;

import java.lang.*;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
import java.math.*;


public class HW_1_1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


    /*
Una persona debe realizar un muestreo con 50 personas para determinar el promedio de peso de los niños, jóvenes,
adultos y adultos mayores que existen en su zona habitacional. Se determinan las categorías con base en la
siguiente tabla:


El programa deberá solicitar la edad de la persona y su peso actual, al finalizar el programa mostrará la cantidad
de personas por cada categoría, así como el peso promedio de cada una de ellas. Y una tabla de frecuencias de la
cantidad de personas por categoría.


     */


        /*
        {var_counter, weight1, ... weight50, sum }

         */

        /*
        Calculating average per age group:
         */
        double[] nin = new double[52];
        double[] jov = new double[52];
        double[] ad_j = new double[52];
        double[] ad_m = new double[52];



        Random ran = new Random();

        int age = 0;
        double weight = 0.0;

        for (int i = 0; i < 50; i++) {
            age = ran.nextInt(0, 100);


            if ( 0 <= age &&  13 > age ) {
                weight = ran.nextDouble(1, 45);
                nin[0] ++;
                nin[i+1] = weight;

            } else if (age >= 13 &&  age < 30){
                weight = ran.nextDouble(45, 100);
                jov[0] ++;
                jov[i+1] = weight;

            } else if (age >= 30 && age < 60){
                weight = ran.nextDouble(45, 100);
                ad_j[0] ++;
                ad_j[i+1] = weight;

            } else {
                weight = ran.nextDouble(45, 80);
                ad_m[0] ++;
                ad_m[i+1] = weight;

            }

            age = 0;

        }

        /*
        [row][column]
         */
        double[][] list = {nin, jov, ad_j, ad_m};

        double sum = 0;

        //Summed all the weight values and stored it in the last cell of every list
        for(int i = 0; i < 4; i++){
            for(int x = 0; x < 50; x++){
                sum += list[i][x+1];
            }
            list[i][51] = sum;
            sum = 0;
        }

        String[][] tabla = {{"Categoria      ", "Edad       ", "Cantidad", "Promedio"},
                            {"Niños          ", "0 - 12     ", "", ""},
                            {"Jovenes        ", "13-29      ", "", ""},
                            {"Adultos        ", "30-59      ", "", ""},
                            {"Adultos mayores", "60 y mas   ", "", ""}};

        //rounds to 3 decimals
        DecimalFormat round = new DecimalFormat("#.###");

        //Added our data to the table
        int integ = 0;
        for(int i = 0; i < 4; i++){

                integ = (int) list[i][0];
                tabla[i+1][2] = Integer.toString(integ);
                tabla[i+1][3] = Double.toString(Double.parseDouble(round.format(list[i][51]/list[i][0])));
                integ = 0;
        }


        System.out.println("Resultados: ");


        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 4; y++){
                System.out.print(tabla[x][y] + "                      ");

            }

            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Tabla de Frecuencias: ");

        for(int i = 0; i < 4; i++){
            System.out.print(tabla[i+1][0] + ": ");

            for(int x = 0; x < 100; x++){

                if ((int) list[i][0] == x){
                    break;
                }

                System.out.print("*");

            }
            System.out.print(" (" + Math.round(((list[i][0])/50.0)*100) + "%)");
            System.out.println(" ");
        }


    }
}
