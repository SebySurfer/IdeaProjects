package HW_2.HW_2_2;

public class HW_2_2 {
    public static void main(String[] args){

        Empleado emp1 = new Empleado("John", "Connor", 150000);
        Empleado emp2 = new Empleado("Linda", "Marshly", 120000);

        System.out.println(emp1.getNombre()+": "+emp1.getSal_men());
        System.out.println(emp2.getNombre()+": "+emp2.getSal_men());

        emp1.setSal_men(emp1.getSal_men() * 1.10);
        emp2.setSal_men(emp2.getSal_men() * 1.10);

        System.out.println("Ya cambiado con 10% de aumento: ");

        System.out.println(emp1.getNombre()+": "+emp1.getSal_men());
        System.out.println(emp2.getNombre()+": "+emp2.getSal_men());


    }
}

