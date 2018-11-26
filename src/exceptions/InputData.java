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
        input.close();

        if (selection == 1) {
            enterData();
        } else {
            System.out.println("Bye");
            System.exit(0);
        }
    }

    private static void enterData() throws InputMismatchException {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Please, enter your name");
            String name = input.nextLine();

            System.out.println("Please, enter your age");
            int age = input.nextInt();
            input.close();
            System.out.println("Hello, " + name + ". Next year you'll be " + age + " years old.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program exit");
    }
}
