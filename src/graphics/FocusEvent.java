package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusListener;

public class FocusEvent {

    public static void main(String[] args) {

        FocusFrame myFrame = new FocusFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class FocusFrame extends JFrame {

    public FocusFrame() {

        setBounds(300, 300, 600, 450);
        add(new FocusPanel());
        setVisible(true);
    }
}

class FocusPanel extends JPanel {

    private JTextField box1;
    private JTextField box2;

    public FocusPanel() {
        setLayout(null);

        box1 = new JTextField();
        box2 = new JTextField();

        box1.setBounds(120,10, 150, 20);
        box2.setBounds(120,40, 150, 20);

        add(box1);
        add(box2);

        box1.addFocusListener(new TextFieldFocus());
//        box2.addFocusListener(new TextFieldFocus());
    }

    @Override
    protected void printComponent(Graphics graphics) {
        super.printComponent(graphics);
    }

    private class TextFieldFocus implements FocusListener {

        @Override
        public void focusGained(java.awt.event.FocusEvent focusEvent) {
            System.out.println("Focus gained");
        }

        @Override
        public void focusLost(java.awt.event.FocusEvent focusEvent) {
            System.out.println("Focus lost");
        }
    }
}