package graphics;

import javax.swing.*;
import java.awt.*;

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
        setLayout(new InColumns());

        JLabel firstNameLabel = new JLabel("First Name: ");
        JLabel lastNameLabel = new JLabel("Last Name: ");
        JTextField firstNameTextField = new JTextField();
        JTextField lastNameTextField = new JTextField();
        JButton sendButton = new JButton("Send");

//        firstNameLabel.setBounds(20, 20, 80, 14);
//        firstNameTextField.setBounds(100, 18, 130, 20);
//        lastNameLabel.setBounds(20, 60, 80, 14);
//        lastNameTextField.setBounds(100, 58, 130, 20);
//        sendButton.setBounds(100, 94, 130, 34);

        add(firstNameLabel);
        add(firstNameTextField);
        add(lastNameLabel);
        add(lastNameTextField);
        add(sendButton);
    }
}

class InColumns implements LayoutManager {

//    private int x = 20;
//    private int y = 20;

    @Override
    public void addLayoutComponent(String name, Component comp) {

    }

    @Override
    public void removeLayoutComponent(Component comp) {

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;
    }

    @Override
    public void layoutContainer(Container parent) {

        int x = 20;
        int y = 20;

        int counter = 0;
        int n = parent.getComponentCount();

        for (int i = 0; i < n; i++) {
            counter++;
            Component component = parent.getComponent(i);
            component.setBounds(x, y, 100, 20);

            if (counter % 2 == 0) {
                x = 20;
                y += 40;
            } else {
                x += 100;
            }
        }
    }
}
