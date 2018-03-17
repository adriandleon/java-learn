package graphics;

import javax.swing.*;
import java.awt.*;

public class PopupMenuExample {

    public static void main(String[] args) {
        PopupMenuFrame myFrame = new PopupMenuFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class PopupMenuFrame extends JFrame {

    PopupMenuFrame() {
        setBounds(100, 100, 300, 250);
        PopupMenuPanel myPanel = new PopupMenuPanel();
        add(myPanel);
        setVisible(true);
    }
}

class PopupMenuPanel extends JPanel {

    PopupMenuPanel() {

        setLayout(new BorderLayout());
        JPanel menuPanel = new JPanel();
        JMenuBar menuBar = new JMenuBar();

        JMenu fontMenu = new JMenu("Font");
        JMenu styleMenu = new JMenu("Style");
        JMenu sizeMenu = new JMenu("Size");

        menuBar.add(fontMenu);
        menuBar.add(styleMenu);
        menuBar.add(sizeMenu);

        menuPanel.add(menuBar);
        add(menuPanel, BorderLayout.NORTH);

        JTextPane myArea = new JTextPane();
        add(myArea, BorderLayout.CENTER);

        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem option1 = new JMenuItem("Option 1");
        JMenuItem option2 = new JMenuItem("Option 2");
        JMenuItem option3 = new JMenuItem("Option 3");
        popupMenu.add(option1);
        popupMenu.add(option2);
        popupMenu.add(option3);

        myArea.setComponentPopupMenu(popupMenu);
    }
}
