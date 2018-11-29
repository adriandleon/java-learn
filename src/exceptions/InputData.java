package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputData {

    public static void main(String[] args) {

        System.out.println("What do you want to do?");
        System.out.println("1. Enter data");
        System.out.println("2. Exit");

        Scanner input = new Scanner(System.in);

        int selection = input.nextInt();


        if (selection == 1) {
            try {
                enterData();
            } catch (InputMismatchException e) {
                System.out.println("You have enter wrong data.");
            }

        } else {
            System.out.println("Bye");
            System.exit(0);
        }

        input.close();
    }

    private static void enterData() throws InputMismatchException {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter your name");
        String name = input.nextLine();

        System.out.println("Please, enter your age");
        int age = input.nextInt();
        input.close();
        System.out.println("Hello, " + name + ". Next year you'll be " + age + " years old.");

        System.out.println("Program exit");
    }
}
