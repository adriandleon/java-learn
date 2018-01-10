package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText {

    public static void main(String[] args) {

        TextFrame myFrame = new TextFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class TextFrame extends JFrame {

    TextFrame() {

        setBounds(600, 300, 600, 350);
        TextPanel myPanel = new TextPanel();
        add(myPanel);
        setVisible(true);
    }
}


class TextPanel extends JPanel {

    private JTextField mField1;
    private JLabel mResultLabel;

    TextPanel() {

        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Enter email address:");
        topPanel.add(label1);

        mField1 = new JTextField(12);
        topPanel.add(mField1);

        JButton myButton = new JButton("Check");
        GetText myEvent = new GetText();
        myButton.addActionListener(myEvent);
        topPanel.add(myButton);

        mResultLabel = new JLabel("", SwingConstants.CENTER);
        add(mResultLabel, BorderLayout.CENTER);

        add(topPanel, BorderLayout.NORTH);
    }

    private class GetText implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            boolean valid = checkEmail(mField1.getText().trim());

            if (valid)
                mResultLabel.setText("Correct");
            else
                mResultLabel.setText("Incorrect");
        }

        private boolean checkEmail(String email) {

            int correct = 0;

            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') correct++;
            }

            return correct == 1;
        }
    }
}