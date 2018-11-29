import javax.swing.*;
import java.io.EOFException;

public class CheckMail {

    public static void main(String[] args) {

        String email = JOptionPane.showInputDialog("Enter email");

        try {
            checkEmail(email);
        } catch (EOFException e) {
            System.out.println("The length of the email address is too short.");
        }

    }

    private static void checkEmail(String email) throws EOFException {
        int at = 0;
        boolean dot = false;

        if (email.length() <= 3) {
            throw new EOFException();
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