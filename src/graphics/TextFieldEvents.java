package graphics;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class TextFieldEvents {

    public static void main(String[] args) {

        TestFrame myFrame = new TestFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class TestFrame extends JFrame {

    TestFrame() {

        setBounds(500, 300, 500, 350);

        TestPanel myPanel = new TestPanel();
        add(myPanel);
        setVisible(true);
    }
}


class TestPanel extends JPanel {

    TestPanel() {

        JTextField myField = new JTextField(20);

        Document myDocument = myField.getDocument();

        TextListener myListener = new TextListener();
        myDocument.addDocumentListener(myListener);

        add(myField);
    }

    private class TextListener implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Text has been inserted");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Text has been removed");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }
}