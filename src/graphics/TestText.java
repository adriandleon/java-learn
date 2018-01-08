package graphics;

import javax.swing.*;
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

    TextPanel() {

        JLabel label1 = new JLabel("Enter email address:");
        add(label1);

        mField1 = new JTextField(12);
        add(mField1);

        JButton myButton = new JButton("Check");
        GetText myEvent = new GetText();
        myButton.addActionListener(myEvent);
        add(myButton);
    }

    private class GetText implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(mField1.getText().trim());
        }
    }
}