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

        // Get fonts installed on the system
//        String[] months = GraphicsEnvironment.getLocalGraphicsEnvironment()
//                .getAvailableFontFamilyNames();

        JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1));

        Dimension dimension = new Dimension(150, 26);
        control.setPreferredSize(dimension);

        add(control);
    }
}