package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ActionsTest {

    public static void main(String[] args) {
        ActionFrame myFrame = new ActionFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

class ActionFrame extends JFrame {

    public ActionFrame() {
        setTitle("Actions Test");
        setBounds(600, 350, 600, 300);
        ActionPanel myPanel = new ActionPanel();
        add(myPanel);
    }
}

class ActionPanel extends JPanel {

    public ActionPanel() {

        ImageIcon img = new ImageIcon("src/graphics/yellow_icon.png");
        Image imgResized = img.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        Icon iconResized = new ImageIcon(imgResized);

        ActionColor yellowAction = new ActionColor(
                "Yellow", iconResized, Color.YELLOW);

        img = new ImageIcon("src/graphics/blue_icon.png");
        imgResized = img.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        iconResized = new ImageIcon(imgResized);

        ActionColor blueAction = new ActionColor(
                "Blue", iconResized, Color.BLUE);

        img = new ImageIcon("src/graphics/red_icon.png");
        imgResized = img.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        iconResized = new ImageIcon(imgResized);

        ActionColor redAction = new ActionColor(
                "Red", iconResized, Color.RED);

        add(new JButton(yellowAction));
        add(new JButton(blueAction));
        add(new JButton(redAction));
    }

    // Inner class
    private class ActionColor extends AbstractAction {

        private static final String TAG_BACKGROUND = "BackgroundColor";

        public ActionColor(String name, Icon icon, Color background) {
            putValue(Action.NAME, name);
            putValue(Action.SMALL_ICON, icon);
            putValue(Action.SHORT_DESCRIPTION, "Set panel to color " + name);
            putValue(TAG_BACKGROUND, background);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color color = (Color) getValue(TAG_BACKGROUND);
            setBackground(color);

            System.out.println("Name: " + getValue(Action.NAME));
            System.out.println("Description: " + getValue(Action.SHORT_DESCRIPTION));
        }
    }
}