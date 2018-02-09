package graphics;

import javax.swing.*;
import java.awt.*;

public class WordProcessor {

    public static void main(String[] args) {
        MenuProcessor mainFrame = new MenuProcessor();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MenuProcessor extends JFrame {

    MenuProcessor() {
        setBounds(500, 300, 550, 400);
        PanelProcessor myPanel = new PanelProcessor();
        add(myPanel);
        setVisible(true);
    }
}

class PanelProcessor extends JPanel {

    PanelProcessor() {
        setLayout(new BorderLayout());

        JPanel menuPanel = new JPanel();
        JMenuBar menuBar = new JMenuBar();

        // Main Menu ************************************************************************************************ //
        JMenu fontMenu = new JMenu("Font");
        JMenu styleMenu = new JMenu("Style");
        JMenu sizeMenu = new JMenu("Size");

        // Font Menu ************************************************************************************************ //
        JMenuItem monoMenuItem = new JMenuItem("FreeMono");
        JMenuItem sansMenuItem = new JMenuItem("FreeSans");
        JMenuItem serifMenuItem = new JMenuItem("FreeSerif");
        fontMenu.add(monoMenuItem);
        fontMenu.add(sansMenuItem);
        fontMenu.add(serifMenuItem);

        // Style Menu *********************************************************************************************** //
        JMenuItem boldItemMenu = new JMenuItem("Bold");
        JMenuItem cursiveItemMenu = new JMenuItem("Cursive");
        styleMenu.add(boldItemMenu);
        styleMenu.add(cursiveItemMenu);

        // Size Menu ************************************************************************************************ //
        JMenuItem size12ItemMenu = new JMenuItem("12");
        JMenuItem size16ItemMenu = new JMenuItem("16");
        JMenuItem size20ItemMenu = new JMenuItem("20");
        JMenuItem size24ItemMenu = new JMenuItem("24");
        sizeMenu.add(size12ItemMenu);
        sizeMenu.add(size16ItemMenu);
        sizeMenu.add(size20ItemMenu);
        sizeMenu.add(size24ItemMenu);

        menuBar.add(fontMenu);
        menuBar.add(styleMenu);
        menuBar.add(sizeMenu);

        menuPanel.add(menuBar);
        add(menuPanel, BorderLayout.NORTH);
    }
}