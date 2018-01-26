package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxTest {

    public static void main(String[] args) {
        ComboFrame myFrame = new ComboFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class ComboFrame extends JFrame {

    ComboFrame() {
        setVisible(true);
        setBounds(550, 300, 550, 400);
        ComboPanel myPanel = new ComboPanel();
        add(myPanel);
    }
}


class ComboPanel extends JPanel {

    private JLabel text;
    private JComboBox comboBox;

    ComboPanel() {
        setLayout(new BorderLayout());
        text = new JLabel("Learning Java Programing!");
        text.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text, BorderLayout.CENTER);

        JPanel northPanel = new JPanel();

        comboBox = new JComboBox();
        comboBox.setEditable(true);
        comboBox.addItem("Serif");
        comboBox.addItem("Sans Serif");
        comboBox.addItem("Monospaced");
        comboBox.addItem("Dialog");

        comboBox.addActionListener(new ComboEvent());

        northPanel.add(comboBox);
        add(northPanel, BorderLayout.NORTH);
    }

    private class ComboEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            text.setFont(new Font((String)comboBox.getSelectedItem(), Font.PLAIN, 18));
        }
    }
}
