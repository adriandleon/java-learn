package exceptions;

import javax.swing.*;
import java.util.Scanner;

public class WeightArea {

    private static int figure;

    public static void main(String[] args) {

        System.out.println("Select one option: \n1. Square\n2. Rectangle\n3. Triangle\n4. Circle");

        try (Scanner input = new Scanner(System.in)) {
            figure = input.nextInt();
        } catch (Exception e) {
            System.out.println("An error has occurred. " + e.getClass().getSimpleName());
        }

        switch (figure) {
            case 1:
                int side = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the side"));
                System.out.println(Math.pow(side, 2));
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the base"));
                int height = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the height"));
                System.out.println("The area of the rectangle is " + base * height);
                break;
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the base"));
                height = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the height"));
                System.out.println("The area of the triangle is " + (base * height) / 2);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Enter the height in cm"));
                System.out.println("The are of the circle is " + Math.PI * (Math.pow(radio, 2)));
                break;
            default:
                System.out.println("Your selection is not valid");
                break;
        }

        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height in cm"));
        System.out.println("If you are a man, your ideal weight is " + (height - 110) + " kg");
        System.out.println("If you are a woman, your ideal weight is " + (height - 120) + " kg");
    }
}
