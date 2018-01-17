package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxTest {

    public static void main(String[] args) {
        CheckFrame myFrame = new CheckFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

class CheckFrame extends JFrame {

    CheckFrame() {

        setBounds(550, 300, 550, 350);
        CheckPanel myPanel = new CheckPanel();
        add(myPanel);
    }
}

class CheckPanel extends JPanel {

    private JLabel text;
    private JCheckBox boldCheck, italicCheck;

    CheckPanel() {
        setLayout(new BorderLayout());
        Font myFont = new Font("Serif", Font.PLAIN, 24);
        text = new JLabel("Some example text");
        text.setFont(myFont);

        JPanel textPanel = new JPanel();
        textPanel.add(text);

        add(textPanel, BorderLayout.CENTER);

        boldCheck = new JCheckBox("Bold");
        boldCheck.addActionListener(new CheckListener());
        italicCheck = new JCheckBox("Cursive");
        italicCheck.addActionListener(new CheckListener());

        JPanel checksPanel = new JPanel();
        checksPanel.add(boldCheck);
        checksPanel.add(italicCheck);

        add(checksPanel, BorderLayout.SOUTH);
    }

    private class CheckListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int textFormat = 0;

            if (boldCheck.isSelected()) textFormat += Font.BOLD;
            if (italicCheck.isSelected()) textFormat += Font.ITALIC;

            text.setFont(new Font("Serif", textFormat, 24));
        }
    }
}
