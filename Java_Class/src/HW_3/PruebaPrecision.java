package HW_3;

public class PruebaPrecision {
    public static void main(String args[]) {
        double f = 123.94536;
        String s = "Feliz Cumpleaños"; // Corrected spelling of Cumpleaños
        System.out.printf("Uso de la precisión para números de punto flotante\n");
        System.out.printf("\t%.3f\n\t%.3e\n\t%.3g\n\n", f, f, f);
        System.out.printf("Uso de la precisión para las cadenas\n");
        System.out.printf("\t%.15s\n", s); // Corrected specifier for strings
    }
}
