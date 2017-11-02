package graphics;

import javax.swing.*;
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
        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        add(yellowButton);
        add(blueButton);
        add(redButton);
    }
}

class ActionColor extends AbstractAction {

    @Override
    public void actionPerformed(ActionEvent e) {
         
    }
}