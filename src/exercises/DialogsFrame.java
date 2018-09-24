package exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

public class DialogsFrame extends JFrame {

    private static final String LABEL_MESSAGE = "String";
    private static final String LABEL_ICON = "Icon";
    private static final String LABEL_COMPONENT  = "Component";
    private static final String LABEL_OTHERS  = "Others";
    private static final String LABEL_OBJECT  = "Object";
    private static final String ERROR_MESSAGE = "ERROR_MESSAGE";
    private static final String INFORMATION_MESSAGE = "INFORMATION_MESSAGE";
    private static final String WARNING_MESSAGE = "WARNING_MESSAGE";
    private static final String QUESTION_MESSAGE = "QUESTION_MESSAGE";
    private static final String PLAIN_MESSAGE = "PLAIN_MESSAGE";
    private static final String DEFAULT_OPTION = "DEFAULT_OPTION";
    private static final String YES_NO_OPTION = "YES_NO_OPTION";
    private static final String YES_NO_CANCEL_OPTION = "YES_NO_CANCEL_OPTION";
    private static final String OK_CANCEL_OPTION = "OK_CANCEL_OPTION";

    private DialogsPanel typePanel;
    private DialogsPanel messageTypePanel;
    private DialogsPanel messagePanel;
    private DialogsPanel optionTypePanel;
    private DialogsPanel optionPanel;
    private DialogsPanel inputPanel;

    private String stringMessage = "A String message";
    private Icon iconMessage = new ImageIcon("src/graphics/images/icon.png");
    private Date dateMessage = new Date();
    private Component componentMessage = new ComponentPanel();

    public DialogsFrame() {
        setTitle("Dialogs Test");
        setBounds(500, 300, 600, 450);

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(2, 3));

        typePanel = new DialogsPanel("Type", new String[]{
                "Message", "Confirm", "Option", "Input"
        });

        messageTypePanel = new DialogsPanel("Message type", new String[]{
                ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE
        });

        messagePanel = new DialogsPanel("Message", new String[]{
                LABEL_MESSAGE, LABEL_ICON, LABEL_COMPONENT, LABEL_OTHERS, LABEL_OBJECT
        });

        optionTypePanel = new DialogsPanel("Options type", new String[]{
                DEFAULT_OPTION, YES_NO_OPTION, YES_NO_CANCEL_OPTION, OK_CANCEL_OPTION
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

    // Show Message
    private Object getMessage() {
        String message = messagePanel.getSelection();

        switch (message) {
            case LABEL_MESSAGE:
                return stringMessage;
            case LABEL_ICON:
                return iconMessage;
            case LABEL_COMPONENT:
                return componentMessage;
            case LABEL_OTHERS:
                return dateMessage;
            case LABEL_OBJECT:
                return new Object[] { stringMessage, iconMessage, componentMessage, dateMessage };
            default:
                return null;
        }
    }

    // Return Icon type
    private int getIconType(final String selection) {
        switch (selection) {
            case ERROR_MESSAGE:
                return JOptionPane.ERROR_MESSAGE;
            case INFORMATION_MESSAGE:
                return JOptionPane.INFORMATION_MESSAGE;
            case WARNING_MESSAGE:
                return JOptionPane.WARNING_MESSAGE;
            case QUESTION_MESSAGE:
                return JOptionPane.QUESTION_MESSAGE;
            case PLAIN_MESSAGE:
                return JOptionPane.PLAIN_MESSAGE;
            default:
                return JOptionPane.PLAIN_MESSAGE;
        }
    }

    // Return Options type
    private int getOptionsType(final String selection) {
        switch (selection) {
            case DEFAULT_OPTION:
                return JOptionPane.DEFAULT_OPTION;
            case YES_NO_OPTION:
                return JOptionPane.YES_NO_OPTION;
            case YES_NO_CANCEL_OPTION:
                return JOptionPane.YES_NO_CANCEL_OPTION;
            case OK_CANCEL_OPTION:
                return JOptionPane.OK_CANCEL_OPTION;
            default:
                return JOptionPane.DEFAULT_OPTION;
        }
    }

    private class ShowAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println(typePanel.getSelection());

            switch (typePanel.getSelection()) {
                case "Message":
                    JOptionPane.showMessageDialog(DialogsFrame.this, getMessage(),
                            "Title", getIconType(messageTypePanel.getSelection()));
                    break;
                case "Confirm":
                    JOptionPane.showConfirmDialog(DialogsFrame.this, getMessage(),
                            "Title", getOptionsType(optionTypePanel.getSelection()), getIconType(messageTypePanel.getSelection()));
                    break;
                case "Option":
                    JOptionPane.showOptionDialog(DialogsFrame.this, getMessage(),
                            "Title", JOptionPane.YES_NO_OPTION, getIconType(messageTypePanel.getSelection()),
                            null, null, null);
                    break;
                case "Input":
                    JOptionPane.showInputDialog(DialogsFrame.this, getMessage(),
                            "Title", getIconType(messageTypePanel.getSelection()));
                    break;
            }
        }
    }

    private class ComponentPanel extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g;
            Rectangle2D rectangle2D = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
            g2.setPaint(Color.YELLOW);
            g2.fill(rectangle2D);
        }
    }
}
