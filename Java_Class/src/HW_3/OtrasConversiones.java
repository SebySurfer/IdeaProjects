package HW_3;

public class OtrasConversiones {
    public static void main(String args[]) {
        Object prueba = null;
        System.out.printf("true: %b\n", true); // Fixed printf syntax
        System.out.printf("%s\n", "Prueba");
        System.out.printf("%B\n", prueba);
        System.out.printf("El código hash de \"hola\" es %h\n", "hola");
        System.out.printf("El código hash de \"Hola\" es %h\n", "Hola");
        System.out.printf("El código hash de null es %H\n", prueba);
        System.out.printf("Impresión de un %% en una cadena de formato\n");
        System.out.printf("Impresión de una nueva línea%nla siguiente línea empieza aquí\n"); // Fixed newline specifier
    }


}
