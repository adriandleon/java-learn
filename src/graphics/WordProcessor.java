package graphics;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
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

    private static final String LABEL_FONT = "Font";
    private static final String LABEL_STYLE = "Style";
    private static final String LABEL_SIZE = "Size";

    private JMenu mFontMenu;
    private JMenu mStyleMenu;
    private JMenu mSizeMenu;

    PanelProcessor() {
        setLayout(new BorderLayout());

        JPanel menuPanel = new JPanel();
        JMenuBar menuBar = new JMenuBar();

        // Main Menu ************************************************************************************************ //
        mFontMenu = new JMenu(LABEL_FONT);
        mStyleMenu = new JMenu(LABEL_STYLE);
        mSizeMenu = new JMenu(LABEL_SIZE);

        // Font Sub Menu ******************************************************************************************** //
        setupMenu("Courier", LABEL_FONT, "Courier", Font.PLAIN, 12, "");
        setupMenu("Verdana", LABEL_FONT, "Verdana", Font.PLAIN, 12, "");
        setupMenu("Serif", LABEL_FONT, "Serif", Font.PLAIN, 12, "");

        // Style Sub Menu ******************************************************************************************* //
        setupMenu("Bold", LABEL_STYLE, "", Font.BOLD, 12, "bin/graphics/images/bold.png");
        setupMenu("Cursive", LABEL_STYLE, "", Font.ITALIC, 12, "bin/graphics/images/italic.png");

        // Size Sub Menu ******************************************************************************************** //
        setupMenu("12", LABEL_SIZE, "", Font.PLAIN, 12, "");
        setupMenu("16", LABEL_SIZE, "", Font.PLAIN, 16, "");
        setupMenu("20", LABEL_SIZE, "", Font.PLAIN, 20, "");
        setupMenu("24", LABEL_SIZE, "", Font.PLAIN, 24, "");

        menuBar.add(mFontMenu);
        menuBar.add(mStyleMenu);
        menuBar.add(mSizeMenu);

        menuPanel.add(menuBar);
        add(menuPanel, BorderLayout.NORTH);

        JTextPane mTextPane = new JTextPane();
        add(mTextPane, BorderLayout.CENTER);
    }

    private void setupMenu(String label, String menu, String fontType, int style, int size, String pathIcon) {

        JMenuItem menuItem = new JMenuItem(label, new ImageIcon(pathIcon));

        switch (menu) {
            case LABEL_FONT:
                mFontMenu.add(menuItem);
                menuItem.addActionListener(new StyledEditorKit.FontFamilyAction("change_fontType", fontType));
                break;
            case LABEL_STYLE:
                mStyleMenu.add(menuItem);
                menuItem.addActionListener(
                        (style == Font.BOLD) ? new StyledEditorKit.BoldAction() : new StyledEditorKit.ItalicAction());
                break;
            case LABEL_SIZE:
                mSizeMenu.add(menuItem);
                menuItem.addActionListener(new StyledEditorKit.FontSizeAction("change_size", size));
                break;
        }
    }
}