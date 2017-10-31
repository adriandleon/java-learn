package graphics;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class FocusWindow extends JFrame implements WindowFocusListener {

    private FocusWindow frame1;
    private FocusWindow frame2;

    public static void main(String[] args) {

        FocusWindow myWindow = new FocusWindow();
        myWindow.start();
    }

    private void start() {
        frame1 = new FocusWindow();
        frame2 = new FocusWindow();

        frame1.setVisible(true);
        frame2.setVisible(true);

        frame1.setBounds(100, 100, 600, 350);
        frame2.setBounds(1200, 100, 600, 350);

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.addWindowFocusListener(this);
        frame2.addWindowFocusListener(this);
    }

    @Override
    public void windowGainedFocus(WindowEvent windowEvent) {
        if (windowEvent.getSource() == frame1) {
            frame1.setTitle("I am on focus");
        } else {
            frame2.setTitle("I am on focus");
        }
    }

    @Override
    public void windowLostFocus(WindowEvent windowEvent) {
        if (windowEvent.getSource() == frame1) {
            frame1.setTitle("");
        } else {
            frame2.setTitle("");
        }
    }
}
