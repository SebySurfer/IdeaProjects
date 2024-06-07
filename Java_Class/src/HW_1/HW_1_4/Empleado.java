package HW_1.HW_1_4;

import java.text.DecimalFormat;

public class Empleado {
     /*
        Una compañía de seguros tiene contratados a n vendedores. Cada uno hace tres ventas a la semana.
        Su política de pagos es que un vendedor recibe un sueldo base y un 10% extra por comisiones de sus ventas.
        El gerente de su compañía desea saber cuánto obtendrá en la semana cada vendedor por concepto de comisiones
        por las tres ventas realizadas, y cuánto tomando en cuenta su sueldo base y sus comisiones.

         */

    int id;
    double venta1;
    double venta2;
    double venta3;
    double comisVen;
    double comBase = 30000;
    double comisTot;


    public Empleado(int id, double venta1, double venta2, double venta3){
        this.id = id;
        this.venta1 = venta1;
        this.venta2 = venta2;
        this.venta3 = venta3;

        comisVen = (venta1 + venta2 + venta3) * 0.10;
        comisTot = comisVen + comBase;


    }

    public double getComisVen(){
        return comisVen;
    }

    public double getComisTot(){
        return comisTot;
    }



@Override
    public String toString(){
    DecimalFormat round = new DecimalFormat("#.###");
    return "Empleado ID: 000"+ id + ". Ventas: ("+ "$"+round.format(venta1 )+ ", $" + round.format(venta2) + ", $" +round.format(venta3) +"). Comision de Ventas: "+"$" + round.format(comisVen) +". Comision TOTAL con base = $" + round.format(comisTot);

    }


}
