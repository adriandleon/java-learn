package graphics;

import javax.swing.*;
import java.awt.*;

public class Layouts_I {

    public static void main(String args[]) {

        FrameLayout myFrame = new FrameLayout();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

class FrameLayout extends JFrame {

    public FrameLayout() {
        setTitle("Test Actions");
        setBounds(600, 350, 600, 300);
        PanelLayout myPanel = new PanelLayout();
        PanelLayout2 panel2 = new PanelLayout2();

        add(myPanel, BorderLayout.NORTH);
        add(panel2, BorderLayout.SOUTH);
    }
}

class PanelLayout extends JPanel {

    public PanelLayout() {

//        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 40));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Yellow"));
        add(new JButton("Red"));

    }
}

class PanelLayout2 extends JPanel {

    public PanelLayout2() {

        setLayout(new BorderLayout());
        add(new JButton("Blue"), BorderLayout.WEST);
        add(new JButton("Green"), BorderLayout.EAST);
        add(new JButton("Black"), BorderLayout.CENTER);
    }
}