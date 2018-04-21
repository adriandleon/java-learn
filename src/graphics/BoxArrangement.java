package graphics;

import javax.swing.*;
import java.awt.*;

public class BoxArrangement {

    public static void main(String[] args) {

        FrameBox myFrame = new FrameBox();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

class FrameBox extends JFrame {

    FrameBox() {

        setTitle("Box in the Frame");
        setBounds(600, 350, 200, 200);

        JLabel nameLabel = new JLabel("Name");
        JTextField nameTextField = new JTextField(10);
        nameTextField.setMaximumSize(nameTextField.getPreferredSize());

        Box horizontalBox1 = Box.createHorizontalBox();
        horizontalBox1.add(nameLabel);
        horizontalBox1.add(Box.createHorizontalStrut(10));
        horizontalBox1.add(nameTextField);

        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordTextField = new JPasswordField(10);
        passwordTextField.setMaximumSize(passwordTextField.getPreferredSize());

        Box horizontalBox2 = Box.createHorizontalBox();
        horizontalBox2.add(passwordLabel);
        horizontalBox2.add(Box.createHorizontalStrut(10));
        horizontalBox2.add(passwordTextField);

        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        Box horizontalBox3 = Box.createHorizontalBox();
        horizontalBox3.add(okButton);
        horizontalBox3.add(Box.createGlue());
        horizontalBox3.add(cancelButton);

        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(horizontalBox1);
        verticalBox.add(horizontalBox2);
        verticalBox.add(horizontalBox3);

        add(verticalBox, BorderLayout.CENTER);
    }
}
