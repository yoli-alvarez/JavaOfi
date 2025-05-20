import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {

        String x1 = JOptionPane.showInputDialog("Dame un número");
        String x2 = JOptionPane.showInputDialog("Dame otro número");
        String x3 = JOptionPane.showInputDialog("Dame otro número");
        float suma = Integer.parseInt(x1) + Integer.parseInt(x2) + Integer.parseInt(x3);
        System.out.println(suma/3);
    }
}