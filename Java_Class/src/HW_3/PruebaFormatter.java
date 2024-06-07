package HW_3;

import java.util.Formatter;
import javax.swing.JOptionPane;

public class PruebaFormatter {
    public static void main(String args[]) {
        Formatter formatter = new Formatter(); // Corrected parentheses
        formatter.format("%d = %#0x = %#X", 10, 10, 10); // Fixed syntax of format string
        JOptionPane.showMessageDialog(null, formatter.toString());
    }
}