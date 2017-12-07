package graphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleListeners {

    public static void main(String[] args) {

        MainFrame myFrame = new MainFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

class MainFrame extends JFrame {

    public MainFrame() {

        setTitle("Testing Multiple Listeners");
        setBounds(800, 300, 400, 300);
        MainPanel panel = new MainPanel();
        add(panel);
    }
}

class MainPanel extends JPanel {

    JButton closeButton;

    public MainPanel() {
        JButton newButton = new JButton("New");
        newButton.addActionListener(new NewListener());
        add(newButton);

        closeButton = new JButton("Close");
        add(closeButton);
    }

    private class NewListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            EmergentFrame frame = new EmergentFrame(closeButton);
            frame.setVisible(true);
        }
    }
}

class EmergentFrame extends JFrame {

    private static int counter = 0;

    public EmergentFrame(JButton buttonFromMainPanel) {
        counter++;
        setTitle("Window " + counter);
        setBounds(40 * counter, 40 * counter, 300, 200);

        buttonFromMainPanel.addActionListener(new CloseAll());
    }

    private class CloseAll implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            counter = 0;
            dispose();
        }
    }
}
