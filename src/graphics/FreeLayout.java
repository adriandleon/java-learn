package graphics;

import javax.swing.*;

public class FreeLayout {

    public static void main(String[] args) {

        FreeFrame freeFrame = new FreeFrame();
        freeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class FreeFrame extends JFrame {

    FreeFrame() {
        setBounds(450, 350, 300, 200);
        FreePanel freePanel = new FreePanel();
        add(freePanel);
        setVisible(true);
    }
}

class FreePanel extends JPanel {

    FreePanel() {
        setLayout(null);

        JLabel firstNameLabel = new JLabel("First Name: ");
        JLabel lastNameLabel = new JLabel("Last Name: ");
        JTextField firstNameTextField = new JTextField();
        JTextField lastNameTextField = new JTextField();
        JButton sendButton = new JButton("Send");

        firstNameLabel.setBounds(20, 20, 80, 14);
        firstNameTextField.setBounds(100, 18, 130, 20);
        lastNameLabel.setBounds(20, 60, 80, 14);
        lastNameTextField.setBounds(100, 58, 130, 20);
        sendButton.setBounds(100, 94, 130, 34);

        add(firstNameLabel);
        add(lastNameLabel);
        add(firstNameTextField);
        add(lastNameTextField);
        add(sendButton);
    }
}
