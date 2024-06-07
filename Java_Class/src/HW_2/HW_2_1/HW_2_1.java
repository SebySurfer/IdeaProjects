package HW_2.HW_2_1;

public class HW_2_1 {

    public static void main(String[] args){

        Factura FacturaTest = new Factura("0EV-303-23R", "Pieza chida", 6, 250.50);

        FacturaTest.setDescr("De hecho es mas chida que lo que pense");

        System.out.println(FacturaTest.getDescr());

        System.out.println(FacturaTest.obtenerMontoFactura());


    }

}
