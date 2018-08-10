package exercises;

import javax.swing.*;
import java.awt.*;

public class DialogsFrame extends JFrame {

    private DialogsPanel typePanel;
    private DialogsPanel messageTypePanel;
    private DialogsPanel messagePanel;
    private DialogsPanel optionTypePanel;
    private DialogsPanel optionPanel;
    private DialogsPanel inputPanel;

    public DialogsFrame() {
        setTitle("Dialogs Test");
        setBounds(500, 300, 600, 450);

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(2, 3));

        typePanel = new DialogsPanel("Type", new String[]{
                "Message", "Confirm", "Option", "Input"
        });

        messageTypePanel = new DialogsPanel("Message type", new String[]{
                "ERROR_MESSAGE", "INFORMATION_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"
        });

        messagePanel = new DialogsPanel("Message", new String[]{
                "String", "Icon", "Component", "Others", "Object"
        });

        optionTypePanel = new DialogsPanel("Options type", new String[]{
                "DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION"
        });

        optionPanel = new DialogsPanel("Option", new String[]{
                "String[]", "Icon[]", "Object[]"
        });

        inputPanel = new DialogsPanel("Input", new String[]{
                "Text Field", "Combo Box"
        });

        setLayout(new BorderLayout());

        gridPanel.add(typePanel);
        gridPanel.add(messageTypePanel);
        gridPanel.add(messagePanel);
        gridPanel.add(optionTypePanel);
        gridPanel.add(optionPanel);
        gridPanel.add(inputPanel);

        // Bottom panel
        JPanel bottomPanel = new JPanel();
        JButton showButton = new JButton("Show");
        bottomPanel.add(showButton);

        add(gridPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }
}
