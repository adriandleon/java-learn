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

//        FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
        myPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        add(myPanel);
    }
}

class PanelLayout extends JPanel {

    public PanelLayout() {

        add(new JButton("Yellow"));
        add(new JButton("Red"));
        add(new JButton("Blue"));
    }
}