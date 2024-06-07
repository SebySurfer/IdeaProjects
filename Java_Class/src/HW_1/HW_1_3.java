package HW_1;

import java.util.Random;

public class HW_1_3 {

    public static void main(String[] args){

/*
Diseñe un programa que lea 2,500,000 votos otorgados a los tres candidatos a gobernador, e imprima el
número del candidato ganador y su cantidad de votos.


 */



        Random ran = new Random();

        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int vot;

        for(int i = 0; i < 2500000; i++){
            vot = ran.nextInt(0, 3);

            if(vot == 0){
                cand1++;
            } else if (vot == 1){
                cand2++;
            } else {
                cand3++;
            }

            /*
            For some reason this doesn't work:
            switch(vot){
                case 1:
                    cand1++;
                case 2:
                    cand2++;
                case 3:
                    cand3++;
                default:
                    break;
            }

            Could it be that it's the system itself ? I AM printing numbers 0 to 2, and i proved it with the 'if' statement

             */

        }

        int[] list = {cand1, cand2, cand3};


        for(int x = 0; x < 3; x++){
            System.out.println("Candidato "+(x+1)+": " +list[x] + " votos");

        }

        System.out.println(" ");
        System.out.println("*********************************************");
        System.out.print("Resultados: ");

        if( cand1 > cand2 && cand1 > cand3 ){
            System.out.print("Candidato 1 gano!!! con "+cand1+" votos");
        } else if ( cand2 > cand1 && cand2 > cand3){
            System.out.print("Candidato 2 gano!!! con "+cand2+" votos");
        } else {
            System.out.print("Candidato 3 gano!!! con "+cand3+" votos");

        }



    }

}


