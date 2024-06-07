package HW_1.HW_1_2;

import java.text.DecimalFormat;

public class Cliente {

    int peso;
    double pagar;
    boolean desc;
    double pagar_des;


    public Cliente(int peso, boolean desc){
        this.peso = peso;
        pagar = peso * 28.50;
        this.desc = desc;

        if (desc == true){
            pagar_des = pagar * 0.85;
        } else {
            pagar_des = 0;
        }


    }

    //My getter methods

    public double getPagar(){
        return pagar;
    }

    public double getPagar_des(){
        return pagar_des;

    }

    public boolean getDesc(){
        return desc;
    }



    @Override
    public String toString(){
        DecimalFormat round = new DecimalFormat("#.###");

        if(desc == true){
            return "Agarró "+ peso+"kg y hubiera pagado $"+ round.format(pagar)+ ", pero con 15% de descuento fue $"+ round.format(pagar_des)+" pesos";

        } else {
            return "Agarró "+ peso+"kg y pagó $" + round.format(pagar)+" pesos" ;

        }

    }



}
