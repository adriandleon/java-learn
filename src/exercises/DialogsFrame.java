package exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DialogsFrame extends JFrame {

    private DialogsPanel typePanel;
    private DialogsPanel messageTypePanel;
    private DialogsPanel messagePanel;
    private DialogsPanel optionTypePanel;
    private DialogsPanel optionPanel;
    private DialogsPanel inputPanel;

    private String stringMessage = "A String message";
    private Icon iconMessage = new ImageIcon("src/graphics/images/icon.png");
    private Date dateMessage = new Date();
    private Component componentMessage = new JPanel();

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
        showButton.addActionListener(new ShowAction());
        bottomPanel.add(showButton);

        add(gridPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private class ShowAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println(typePanel.getSelection());

            switch (typePanel.getSelection()) {
                case "Message":
                    JOptionPane.showMessageDialog(DialogsFrame.this, "Message", "Title", 0);
                    break;
                case "Confirm":
                    JOptionPane.showConfirmDialog(DialogsFrame.this, "Message", "Title", 0, 0);
                    break;
                case "Option":
                    JOptionPane.showOptionDialog(DialogsFrame.this, "Message", "Title", 0, 0, null, null, null);
                    break;
                case "Input":
                    JOptionPane.showInputDialog(DialogsFrame.this, "Message", "Title", 0);
                    break;
            }
        }
    }
}
