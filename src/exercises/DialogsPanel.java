package exercises;

import javax.swing.*;

public class DialogsPanel extends JPanel {

    public DialogsPanel(String title, String[] options) {
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), title));

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        ButtonGroup group = new ButtonGroup();

        for (int i = 0; i < options.length; i++) {
            JRadioButton button = new JRadioButton(options[i]);
            add(button);
            group.add(button);
            button.setSelected(i == 0);
        }
    }
}
