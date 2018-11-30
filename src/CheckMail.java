import exceptions.EmailLengthException;

import javax.swing.*;

public class CheckMail {

    public static void main(String[] args) {

        String email = JOptionPane.showInputDialog("Enter email");

        try {
            checkEmail(email);
        } catch (EmailLengthException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void checkEmail(String email) throws EmailLengthException {
        int at = 0;
        boolean dot = false;

        if (email.length() <= 3) {
            throw new EmailLengthException("Email address is too short.");
        }

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                at++;
            }

            if (email.charAt(i) == '.') {
                dot = true;
            }
        }

        if (at == 1 && dot) {
            System.out.println("It is correct");
        } else {
            System.out.println("Invalid email address");
        }
    }
}