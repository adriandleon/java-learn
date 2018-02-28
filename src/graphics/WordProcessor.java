package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    private JTextPane mTextPane;
    private JMenu mFontMenu;
    private JMenu mStyleMenu;
    private JMenu mSizeMenu;
    private Font mFont;

    PanelProcessor() {
        setLayout(new BorderLayout());

        JPanel menuPanel = new JPanel();
        JMenuBar menuBar = new JMenuBar();

        // Main Menu ************************************************************************************************ //
        mFontMenu = new JMenu(LABEL_FONT);
        mStyleMenu = new JMenu(LABEL_STYLE);
        mSizeMenu = new JMenu(LABEL_SIZE);

        // Font Sub Menu ******************************************************************************************** //
        setupMenu("Courier", LABEL_FONT, "Courier", Font.PLAIN, 12);
        setupMenu("Verdana", LABEL_FONT, "Verdana", Font.PLAIN, 12);
        setupMenu("Serif", LABEL_FONT, "Serif", Font.PLAIN, 12);

        // Style Sub Menu ******************************************************************************************* //
        setupMenu("Bold", LABEL_STYLE, "", Font.BOLD, 12);
        setupMenu("Cursive", LABEL_STYLE, "", Font.ITALIC, 12);

        // Size Sub Menu ******************************************************************************************** //
        setupMenu("12", LABEL_SIZE, "", Font.PLAIN, 12);
        setupMenu("16", LABEL_SIZE, "", Font.PLAIN, 16);
        setupMenu("20", LABEL_SIZE, "", Font.PLAIN, 20);
        setupMenu("24", LABEL_SIZE, "", Font.PLAIN, 24);

        menuBar.add(mFontMenu);
        menuBar.add(mStyleMenu);
        menuBar.add(mSizeMenu);

        menuPanel.add(menuBar);
        add(menuPanel, BorderLayout.NORTH);

        mTextPane = new JTextPane();
        add(mTextPane, BorderLayout.CENTER);
    }

    private void setupMenu(String label, String menu, String fontType, int style, int size) {
        JMenuItem menuItem = new JMenuItem(label);

        switch (menu) {
            case LABEL_FONT:
                mFontMenu.add(menuItem);
                break;
            case LABEL_STYLE:
                mStyleMenu.add(menuItem);
                break;
            case LABEL_SIZE:
                mSizeMenu.add(menuItem);
                break;
        }

        menuItem.addActionListener(new HandleEvents(label, fontType, style, size));
    }

    private class HandleEvents implements ActionListener {

        private String option;
        private String textType;
        private int fontStyle;
        private int fontSize;

        HandleEvents(String option, String textType, int fontStyle, int fontSize) {
            this.option = option;
            this.textType = textType;
            this.fontStyle = fontStyle;
            this.fontSize = fontSize;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            mTextPane.setFont(new Font(textType, fontStyle, fontSize));
        }
    }
}