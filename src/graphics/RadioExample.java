package graphics;

import javax.swing.*;
import java.awt.*;

public class RadioExample {

    public static void main(String[] args) {
        RadioFrame myFrame = new RadioFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class RadioFrame extends JFrame {

    RadioFrame() {
        setVisible(true);
        setBounds(550, 300, 500 ,350);
        RadioPanel myPanel = new RadioPanel();
        add(myPanel);
    }
}

class RadioPanel extends JPanel {

    private JLabel text;
    private ButtonGroup mGroup;
    private JPanel mOptionPanel;

    RadioPanel() {
        setLayout(new BorderLayout());
        text = new JLabel("Learning Java Programming");
        text.setFont(new Font("Sans", Font.PLAIN, 14));
        add(text, BorderLayout.CENTER);

        mOptionPanel = new JPanel();
        mGroup = new ButtonGroup();

        addButton("Small", false, 12);
        addButton("Medium", true, 14);
        addButton("Big", false, 18);
        addButton("Extra big", false, 24);

        add(mOptionPanel, BorderLayout.SOUTH);
    }

    private void addButton(String name, boolean selected, int size) {
        JRadioButton button = new JRadioButton(name, selected);
        mGroup.add(button);
        mOptionPanel.add(button);
        button.addActionListener(e -> text.setFont(new Font("Sans", Font.PLAIN, size)));
    }
}