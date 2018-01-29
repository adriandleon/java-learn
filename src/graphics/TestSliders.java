package graphics;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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

    private JLabel label;
    private JSlider slider;

    PanelSliders() {
        setLayout(new BorderLayout());
        label = new JLabel("Learning Java Programing!");
        add(label, BorderLayout.CENTER);

        slider = new JSlider(8, 40, 12);
        slider.setMajorTickSpacing(4);
        slider.setMinorTickSpacing(2);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setSnapToTicks(true);
        slider.setFont(new Font("Serif", Font.ITALIC, 12));
        slider.addChangeListener(new SliderEvent());

        JPanel panelSlider = new JPanel();
        panelSlider.add(slider);
        add(panelSlider, BorderLayout.NORTH);
    }

    private class SliderEvent implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            label.setFont(new Font("Serif", Font.PLAIN, slider.getValue()));
        }
    }
}
