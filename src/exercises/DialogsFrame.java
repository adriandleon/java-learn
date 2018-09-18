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
                "ERROR_MESSAGE", "INFORMATION_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"
        });

        messagePanel = new DialogsPanel("Message", new String[]{
                LABEL_MESSAGE, LABEL_ICON, LABEL_COMPONENT, LABEL_OTHERS, LABEL_OBJECT
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

    // Show Message
    public Object getMessage() {
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

    private class ShowAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println(typePanel.getSelection());

            switch (typePanel.getSelection()) {
                case "Message":
                    JOptionPane.showMessageDialog(DialogsFrame.this, getMessage(),
                            "Title", JOptionPane.ERROR_MESSAGE);
                    break;
                case "Confirm":
                    JOptionPane.showConfirmDialog(DialogsFrame.this, getMessage(),
                            "Title", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                    break;
                case "Option":
                    JOptionPane.showOptionDialog(DialogsFrame.this, getMessage(),
                            "Title", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
                    break;
                case "Input":
                    JOptionPane.showInputDialog(DialogsFrame.this, getMessage(),
                            "Title", JOptionPane.ERROR_MESSAGE);
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
