package exceptions;

import javax.swing.*;

public class MultipleExceptions {

    public static void main(String[] args) {
        try {
            division();
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Type: " + e.getClass().getSimpleName());
        } catch (NumberFormatException e) {
            System.out.println("Only numbers are allowed");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Type: " + e.getClass().getSimpleName());
        }
    }

    private static void division() {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter divided"));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter divisor"));
        System.out.println("The result is " + number1 / number2);
    }
}
