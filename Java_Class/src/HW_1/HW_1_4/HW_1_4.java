package HW_1.HW_1_4;

import java.util.Random;
import java.util.Scanner;

public class HW_1_4 {

    public static void main(String[] args){


        /*
        Una compañía de seguros tiene contratados a n vendedores. Cada uno hace tres ventas a la semana.
        Su política de pagos es que un vendedor recibe un sueldo base y un 10% extra por comisiones de sus ventas.
        El gerente de su compañía desea saber cuánto obtendrá en la semana cada vendedor por concepto de comisiones
        por las tres ventas realizadas, y cuánto tomando en cuenta su sueldo base y sus comisiones.

         */

        Scanner s = new Scanner(System.in);

        System.out.println("Cuantos empleados son ?: ");
        int num = s.nextInt();
        System.out.println("Tomamos en cuenta que el salario base es igual a $" +30000+".00 pesos");
        System.out.println("***************************************************************************************");

        Empleado[] emp_list = new Empleado[num];

        Random rand = new Random();

        double vent1 = 0;
        double vent2 = 0;
        double vent3 = 0;


        for(int i = 0; i < num; i++){
            vent1 = rand.nextDouble(50000, 150001);
            vent2 = rand.nextDouble(50000, 150001);
            vent3 = rand.nextDouble(50000, 150001);

            Empleado n = new Empleado(i+1, vent1, vent2, vent3);
            emp_list[i] = n;

        }

        for(int x = 0; x < num; x++){
            System.out.println(emp_list[x]);
            System.out.println("");

        }




    }
}
