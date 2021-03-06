package graphics;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class WordProcessor {

    public static void main(String[] args) {
        MenuProcessor mainFrame = new MenuProcessor();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MenuProcessor extends JFrame {

    MenuProcessor() {
        setBounds(500, 260, 600, 440);
        PanelProcessor myPanel = new PanelProcessor();
        add(myPanel);
        setVisible(true);
    }
}

class PanelProcessor extends JPanel {

    private static final String LABEL_FONT = "Font";
    private static final String LABEL_STYLE = "Style";
    private static final String LABEL_SIZE = "Size";
    private static final String PATH_IMAGES = "src/graphics/images/";

    private JToolBar mToolbar;
    private JMenu mFontMenu;
    private JMenu mSizeMenu;

    PanelProcessor() {
        setLayout(new BorderLayout());

        JPanel menuPanel = new JPanel();
        JMenuBar menuBar = new JMenuBar();

        // Main Menu ************************************************************************************************ //
        mFontMenu = new JMenu(LABEL_FONT);
        JMenu mStyleMenu = new JMenu(LABEL_STYLE);
        mSizeMenu = new JMenu(LABEL_SIZE);

        // Font Sub Menu ******************************************************************************************** //
        setupMenu("Courier", LABEL_FONT, "Courier");
        setupMenu("Verdana", LABEL_FONT, "Verdana");
        setupMenu("Serif", LABEL_FONT, "Serif");

        // Style Sub Menu ******************************************************************************************* //
        JCheckBoxMenuItem boldMenu = new JCheckBoxMenuItem("Bold", new ImageIcon("bin/graphics/images/bold.png"));
        JCheckBoxMenuItem italicMenu = new JCheckBoxMenuItem("Cursive", new ImageIcon("bin/graphics/images/italic.png"));

        boldMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
        italicMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));

        boldMenu.addActionListener(new StyledEditorKit.BoldAction());
        italicMenu.addActionListener(new StyledEditorKit.ItalicAction());
        mStyleMenu.add(boldMenu);
        mStyleMenu.add(italicMenu);

        // Size Sub Menu ******************************************************************************************** //
        ButtonGroup fontSize = new ButtonGroup();
        JRadioButtonMenuItem size12 = new JRadioButtonMenuItem("12");
        JRadioButtonMenuItem size16 = new JRadioButtonMenuItem("16");
        JRadioButtonMenuItem size20 = new JRadioButtonMenuItem("20");
        JRadioButtonMenuItem size24 = new JRadioButtonMenuItem("24");

        size12.addActionListener(new StyledEditorKit.FontSizeAction("change_fontType", 12));
        size16.addActionListener(new StyledEditorKit.FontSizeAction("change_fontType", 16));
        size20.addActionListener(new StyledEditorKit.FontSizeAction("change_fontType", 20));
        size24.addActionListener(new StyledEditorKit.FontSizeAction("change_fontType", 24));

        fontSize.add(size12);
        fontSize.add(size16);
        fontSize.add(size20);
        fontSize.add(size24);

        mSizeMenu.add(size12);
        mSizeMenu.add(size16);
        mSizeMenu.add(size20);
        mSizeMenu.add(size24);

        menuBar.add(mFontMenu);
        menuBar.add(mStyleMenu);
        menuBar.add(mSizeMenu);

        menuPanel.add(menuBar);
        add(menuPanel, BorderLayout.NORTH);

        JTextPane mTextPane = new JTextPane();
        add(mTextPane, BorderLayout.CENTER);

        // Popup Menu

        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem popupBold = new JMenuItem("Bold");
        JMenuItem popupItalic = new JMenuItem("Italic");
        popupBold.addActionListener(new StyledEditorKit.BoldAction());
        popupItalic.addActionListener(new StyledEditorKit.ItalicAction());
        popupMenu.add(popupBold);
        popupMenu.add(popupItalic);

        mTextPane.setComponentPopupMenu(popupMenu);

        // Toolbar

        mToolbar = new JToolBar();
        mToolbar.setOrientation(JToolBar.VERTICAL);

        setToolbar(PATH_IMAGES + "bold.png").addActionListener(new StyledEditorKit.BoldAction());
        setToolbar(PATH_IMAGES + "italic.png").addActionListener(new StyledEditorKit.ItalicAction());
        setToolbar(PATH_IMAGES + "underline.png").addActionListener(new StyledEditorKit.UnderlineAction());
        mToolbar.addSeparator();
        setToolbar(PATH_IMAGES + "blue_icon.png").addActionListener(new StyledEditorKit.ForegroundAction("Blue", Color.BLUE));
        setToolbar(PATH_IMAGES + "yellow_icon.png").addActionListener(new StyledEditorKit.ForegroundAction("Yellow", Color.YELLOW));
        setToolbar(PATH_IMAGES + "red_icon.png").addActionListener(new StyledEditorKit.ForegroundAction("Red", Color.RED));
        mToolbar.addSeparator();
        setToolbar(PATH_IMAGES + "align_left.png").addActionListener(new StyledEditorKit.AlignmentAction("Left", 0));
        setToolbar(PATH_IMAGES + "align_right.png").addActionListener(new StyledEditorKit.AlignmentAction("Right", 2));
        setToolbar(PATH_IMAGES + "align_center.png").addActionListener(new StyledEditorKit.AlignmentAction("Center", 1));
        setToolbar(PATH_IMAGES + "align_justify.png").addActionListener(new StyledEditorKit.AlignmentAction("Justify", 3));

        add(mToolbar, BorderLayout.WEST);
    }

    private JButton setToolbar(final String iconPath) {
        JButton button = new JButton(new ImageIcon(iconPath));
        mToolbar.add(button);
        return button;
    }

    private void setupMenu(String label, final String menu, String fontType) {

        JMenuItem menuItem = new JMenuItem(label);

        switch (menu) {
            case LABEL_FONT:
                mFontMenu.add(menuItem);
                menuItem.addActionListener(new StyledEditorKit.FontFamilyAction("change_fontType", fontType));
                break;
            case LABEL_SIZE:
                mSizeMenu.add(menuItem);
                menuItem.addActionListener(new StyledEditorKit.FontSizeAction("change_size", 12));
                break;
        }
    }
}