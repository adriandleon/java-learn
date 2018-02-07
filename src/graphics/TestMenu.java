package graphics;

import javax.swing.*;

public class TestMenu {

    public static void main(String[] args) {
        MenuFrame myFrame = new MenuFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MenuFrame extends JFrame {

    MenuFrame() {
        setBounds(500, 300, 550, 400);
        MenuPanel myPanel = new MenuPanel();
        add(myPanel);
        setVisible(true);
    }
}

class MenuPanel extends JPanel {

    MenuPanel() {

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem saveAsMenuItem = new JMenuItem("Save As");
        fileMenu.add(saveMenuItem);
        fileMenu.add(saveAsMenuItem);

        JMenu editMenu = new JMenu("Edit");
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        JMenu optionsMenu = new JMenu("Options");
        JMenuItem option1MenuItem = new JMenuItem("Option 1");
        JMenuItem option2MenuItem = new JMenuItem("Option 2");
        optionsMenu.add(option1MenuItem);
        optionsMenu.add(option2MenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(pasteMenuItem);
        editMenu.addSeparator();
        editMenu.add(optionsMenu);

        JMenu toolsMenu = new JMenu("Tools");
        JMenuItem generalsMenuItem = new JMenuItem("Generals");
        toolsMenu.add(generalsMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(toolsMenu);

        add(menuBar);
    }
}
