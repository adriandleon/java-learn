package graphics;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class FieldPassword {

    public static void main(String[] args) {

        PasswordFrame myFrame = new PasswordFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class PasswordFrame extends JFrame {

    PasswordFrame() {
        setBounds(400, 200, 550, 400);
        PasswordPanel myPanel = new PasswordPanel();
        add(myPanel);
        setVisible(true);
    }
}


class PasswordPanel extends JPanel {

    private JTextField userField;
    private JPasswordField passField;

    PasswordPanel() {
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2, 2));
        add(topPanel, BorderLayout.NORTH);

        JLabel userLabel = new JLabel("Username");
        JLabel passLabel = new JLabel("Password");

        userField = new JTextField(15);
        passField = new JPasswordField(15);
        passField.getDocument().addDocumentListener(new CheckPassword());

        topPanel.add(userLabel);
        topPanel.add(userField);
        topPanel.add(passLabel);
        topPanel.add(passField);

        JButton loginButton = new JButton("LogIn");
        add(loginButton, BorderLayout.SOUTH);
    }

    private class CheckPassword implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            if (check(passField.getPassword())) {
                passField.setBackground(Color.RED);
            } else {
                passField.setBackground(Color.WHITE);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            if (check(passField.getPassword())) {
                passField.setBackground(Color.RED);
            } else {
                passField.setBackground(Color.WHITE);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }

        private boolean check(char[] password) {
            return password.length < 8 || password.length > 12;
        }
    }
}