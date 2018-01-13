package graphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest {

    public static void main(String[] args) {

        AreaFrame myFrame = new AreaFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class AreaFrame extends JFrame {

    AreaFrame() {

        setBounds(500, 300, 500, 350);
        AreaPanel myPanel = new AreaPanel();
        add(myPanel);
        setVisible(true);


    }
}


class AreaPanel extends JPanel {

    private JTextArea myTextArea;

    AreaPanel() {

        myTextArea = new JTextArea(8, 20);
        JScrollPane myScrollPane = new JScrollPane(myTextArea);
        myTextArea.setLineWrap(true);
        add(myScrollPane);

        JButton myButton = new JButton("Click Me");
        myButton.addActionListener(new HandleArea());
        add(myButton);
    }

    private class HandleArea implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println(myTextArea.getText());
        }
    }
}