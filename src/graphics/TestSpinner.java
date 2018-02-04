package graphics;

import javax.swing.*;
import java.awt.*;

public class TestSpinner {

    public static void main(String[] args) {

        SpinnerFrame myFrame = new SpinnerFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}


class SpinnerFrame extends JFrame {

    SpinnerFrame() {
        setBounds(550, 350, 550, 350);
        setVisible(true);
        add(new SpinnerPanel());
    }
}


class SpinnerPanel extends JPanel {

    SpinnerPanel() {

        JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {
            @Override
            public Object getNextValue() {
                return super.getPreviousValue();
            }

            @Override
            public Object getPreviousValue() {
                return super.getNextValue();
            }
        });

        Dimension dimension = new Dimension(150, 26);
        control.setPreferredSize(dimension);

        add(control);
    }
}