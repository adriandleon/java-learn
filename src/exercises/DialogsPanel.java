package exercises;

import javax.swing.*;

public class DialogsPanel extends JPanel {

    private ButtonGroup group;

    public DialogsPanel(String title, String[] options) {
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), title));

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        group = new ButtonGroup();

        for (int i = 0; i < options.length; i++) {
            JRadioButton button = new JRadioButton(options[i]);
            button.setActionCommand(options[i]);
            add(button);
            group.add(button);
            button.setSelected(i == 0);
        }
    }

    public String getSelection() {
        return group.getSelection().getActionCommand();
    }
}
