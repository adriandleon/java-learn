package exceptions;

import javax.swing.*;

public class TestException {

    public static void main(String[] args) {

        int[] matrix = new int[5];

        matrix[0] = 5;
        matrix[1] = 38;
        matrix[2] = -15;
        matrix[3] = 92;
        matrix[4] = 71;

        try {
            for (int i = 0; i <= matrix.length; i++) {
                System.out.println("Position " + i + " = " + matrix[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        // Ask for personal data
        String name = JOptionPane.showInputDialog("Enter your name:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));

        System.out.println("Hello, " + name + ". You are " + age + " years old. The program has finished.");
    }
}
