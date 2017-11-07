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

        ActionColor yellowAction = new ActionColor(
                "Yellow", new ImageIcon("src/graphics/yellow_icon.png"), Color.YELLOW);

        ActionColor blueAction = new ActionColor(
                "Blue", new ImageIcon("src/graphics/yellow_icon.png"), Color.BLUE);

        ActionColor redAction = new ActionColor(
                "Red", new ImageIcon("src/graphics/red_icon.png"), Color.RED);

//        JButton yellowButton = new JButton("Yellow");
//        JButton blueButton = new JButton("Blue");
//        JButton redButton = new JButton("Red");
//
//        add(yellowButton);
//        add(blueButton);
//        add(redButton);
    }
}

class ActionColor extends AbstractAction {

    public ActionColor(String name, Icon icon, Color background) {
        putValue(Action.NAME, name);
        putValue(Action.SMALL_ICON, icon);
        putValue(Action.SHORT_DESCRIPTION, "Set panel to color " + name);
        putValue("BackgroundColor", background);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         
    }
}