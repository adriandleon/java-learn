package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ToolbarExample {

	public static void main(String[] args) {
		
		ToolsFrame myFrame = new ToolsFrame();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class ToolsFrame extends JFrame {

    private JPanel mPanel;

	ToolsFrame() {
		
		setTitle("Frame with Toolbar");
		setBounds(500, 300, 600, 450);

		mPanel = new JPanel();
		add(mPanel);

		// Setup actions
        Action blueAction = new BackgroundColor("Blue",
                new ImageIcon("src/graphics/images/blue_icon.png"), Color.BLUE);
        Action yellowAction = new BackgroundColor("Yellow",
                new ImageIcon("src/graphics/images/yellow_icon.png"), Color.YELLOW);
        Action redAction = new BackgroundColor("Red",
                new ImageIcon("src/graphics/images/red_icon.png"), Color.RED);
        Action exitAction = new AbstractAction("Exit", new ImageIcon("src/graphics/images/exit.png")) {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };

        // Setup Menu
        JMenu menu = new JMenu("Color");
        menu.add(blueAction);
        menu.add(yellowAction);
        menu.add(redAction);
        menu.addSeparator();
        menu.add(exitAction);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);

        setJMenuBar(menuBar);

        // Setup Toolbar
        JToolBar toolBar = new JToolBar();
        toolBar.add(blueAction);
        toolBar.add(yellowAction);
        toolBar.add(redAction);
        toolBar.addSeparator();
        toolBar.add(exitAction);

        add(toolBar, BorderLayout.NORTH);
	}

    private class BackgroundColor extends AbstractAction {

        BackgroundColor(String name, Icon icon, Color color) {

            putValue(Action.NAME, name);
            putValue(Action.SMALL_ICON, icon);
            putValue(Action.SHORT_DESCRIPTION, "Background color " + name);
            putValue("Color", color);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Color color = (Color) getValue("Color");
            mPanel.setBackground(color);
        }
    }
}