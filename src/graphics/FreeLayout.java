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
        JLabel phoneLabel = new JLabel("Phone: ");
        JTextField firstNameTextField = new JTextField();
        JTextField lastNameTextField = new JTextField();
        JTextField phoneTextField = new JTextField();
        JButton sendButton = new JButton("Send");

        add(firstNameLabel);
        add(firstNameTextField);
        add(lastNameLabel);
        add(lastNameTextField);
        add(phoneLabel);
        add(phoneTextField);
        add(sendButton);
    }
}

class InColumns implements LayoutManager {

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

        int y = 20;
        int width = parent.getWidth();
        int x = width / 2;

        int counter = 0;
        int n = parent.getComponentCount();

        for (int i = 0; i < n; i++) {
            counter++;
            Component component = parent.getComponent(i);
            component.setBounds(x - 100, y, 100, 20);

            if (counter % 2 == 0) {
                x = width / 2;
                y += 36;
            } else {
                x += 100;
            }
        }
    }
}
