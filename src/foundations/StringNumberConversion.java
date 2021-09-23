package foundations;

import javax.swing.*;

public class StringNumberConversion {
    public static void main(String[] args) {
        String value1 = JOptionPane.showInputDialog(
                "Enter the first number:");
        String value2 = JOptionPane.showInputDialog(
                "Enter the second number:");

        System.out.println(value1 + value2);

        // String to Double
        double number1 = Double.parseDouble(value1);
        double number2 = Double.parseDouble(value2);

        double soma = number1 + number2;
        System.out.println("The sum is " + soma);
        System.out.println("The mean is " + soma / 2);
    }
}
