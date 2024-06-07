package Main;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.println("Give me a char: ");
        char g = s.next().charAt(0);

        System.out.println("Give me a byte: ");
        byte a = s.nextByte();

        System.out.println("Give me a short: ");
        short b = s.nextShort();

        System.out.println("Give me an int: ");
        int c = s.nextInt();

        System.out.println("Give me a long: ");
        long d = s.nextLong();

        System.out.println("Give me a float: ");
        float e = s.nextFloat();

        System.out.println("Give me a double: ");
        double f = s.nextDouble();

        System.out.println("Give me a boolean: ");
        boolean h = s.nextBoolean();

    }
}

