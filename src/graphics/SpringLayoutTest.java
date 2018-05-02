package graphics;

import javax.swing.*;

public class SpringLayoutTest {

    public static void main(String[] args) {

        SpringFrame myFrame = new SpringFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class SpringFrame extends JFrame {

    SpringFrame() {

        setBounds(300, 400, 1000, 350);
        SpringPanel myPanel = new SpringPanel();
        add(myPanel);
        setVisible(true);
    }
}

class SpringPanel extends JPanel {

    SpringPanel() {

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        SpringLayout springLayout = new SpringLayout();
        setLayout(springLayout);

        add(button1);
        add(button2);
        add(button3);

        Spring spring = Spring.constant(0, 10, 100);
        springLayout.putConstraint(SpringLayout.WEST, button1, spring, SpringLayout.WEST, this);
        springLayout.putConstraint(SpringLayout.WEST, button2, spring, SpringLayout.EAST, button1);
        springLayout.putConstraint(SpringLayout.WEST, button3, spring, SpringLayout.EAST, button2);
        springLayout.putConstraint(SpringLayout.EAST, this, spring, SpringLayout.EAST, button3);
    }
}