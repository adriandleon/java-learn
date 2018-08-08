package exercises;

import javax.swing.*;
import java.awt.*;

public class DialogsFrame extends JFrame {

    private DialogsPanel typePanel;

    public DialogsFrame() {
        setTitle("Dialogs Test");
        setBounds(500, 300, 600, 450);

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(2, 3));

        String typeOptions[] = {"Message", "Confirm", "Option", "Input"};

        typePanel = new DialogsPanel("Type", typeOptions);

        gridPanel.add(typePanel);
        add(gridPanel);
    }
}
