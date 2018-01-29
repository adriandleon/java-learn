package graphics;

import javax.swing.*;
import java.awt.*;

public class TestSliders {

    public static void main(String[] args) {
        FrameSliders myFrame = new FrameSliders();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class FrameSliders extends JFrame {

    FrameSliders() {
        setBounds(550, 400, 550, 350);
        PanelSliders myPanel = new PanelSliders();
        add(myPanel);
        setVisible(true);
    }
}

class PanelSliders extends JPanel {

    PanelSliders() {
        JSlider slider = new JSlider(0, 150, 50);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(25);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setFont(new Font("Serif", Font.ITALIC, 12));
        slider.setSnapToTicks(true);
        add(slider);
    }
}
