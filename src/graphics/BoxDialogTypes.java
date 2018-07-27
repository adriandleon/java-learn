package graphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoxDialogTypes {

    public static void main(String[] args) {

        BoxDialogFrame myFrame = new BoxDialogFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

class BoxDialogFrame extends JFrame {

    BoxDialogFrame() {
        setBounds(500, 300, 600, 250);
        add(new BoxDialogPanel());
    }
}

class BoxDialogPanel extends JPanel {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    BoxDialogPanel() {

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");

        button1.addActionListener(new ButtonActions());
        button2.addActionListener(new ButtonActions());
        button3.addActionListener(new ButtonActions());
        button4.addActionListener(new ButtonActions());

        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }

    private class ButtonActions implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == button1) {
                // Pressed button 1
//                JOptionPane.showMessageDialog(BoxDialogPanel.this, "You have pressed button 1");
                JOptionPane.showMessageDialog(BoxDialogPanel.this,
                        "Test message", "Message Dialog", JOptionPane.WARNING_MESSAGE);

            } else if (e.getSource() == button2) {
                // Pressed button 2
                JOptionPane.showInputDialog(BoxDialogPanel.this,
                        "Enter your name", "Input Dialog", JOptionPane.PLAIN_MESSAGE);

            } else if (e.getSource() == button3) {
                // Pressed button 3
                JOptionPane.showConfirmDialog(BoxDialogPanel.this, "Confirm Dialog",
                        "Confirm", JOptionPane.YES_NO_OPTION);

            } else if (e.getSource() == button4) {
                // Pressed button 4
                JOptionPane.showOptionDialog(BoxDialogPanel.this, "Choose", "Option Dialog",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
            }
        }
    }
}
