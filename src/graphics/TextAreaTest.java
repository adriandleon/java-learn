package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaTest {

    public static void main(String[] args) {

        AreaTestFrame myFrame = new AreaTestFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}


class AreaTestFrame extends JFrame {

    private final String WRAP_TEXT_LABEL = "Set Wrap Text";
    private final String TEXT_FOR_INSERT = "A collective list of public JSON APIs for use in web development. ";
    private JPanel buttonsPanel;
    private JButton insertButton;
    private JButton wrapTextButton;
    private JTextArea textArea;
    private JScrollPane scrollPane;

    AreaTestFrame() {
        setTitle("TextArea Testing");
        setBounds(500, 300, 500, 350);
        setLayout(new BorderLayout());
        buttonsPanel = new JPanel();
        insertButton = new JButton("Insert");
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.append(TEXT_FOR_INSERT);
            }
        });
        buttonsPanel.add(insertButton);

        wrapTextButton = new JButton(WRAP_TEXT_LABEL);
        wrapTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                boolean wrapedText = !textArea.getLineWrap();
                textArea.setLineWrap(wrapedText);

                wrapTextButton.setText(wrapedText ? "Remove Line Wrap" : WRAP_TEXT_LABEL);
            }
        });
        buttonsPanel.add(wrapTextButton);

        add(buttonsPanel, BorderLayout.SOUTH);

        textArea = new JTextArea(8, 20);
        scrollPane = new JScrollPane(textArea);

        add(scrollPane, BorderLayout.CENTER);
    }
}