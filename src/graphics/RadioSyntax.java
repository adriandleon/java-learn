package graphics;

import javax.swing.*;

public class RadioSyntax {

    public static void main(String[] args) {

        RadioSyntaxFrame myFrame = new RadioSyntaxFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class RadioSyntaxFrame extends JFrame {

    RadioSyntaxFrame() {
        setVisible(true);
        setBounds(550, 300, 500, 300);
        RadioSyntaxPanel myPanel = new RadioSyntaxPanel();
        add(myPanel);
    }
}

class RadioSyntaxPanel extends JPanel {

    RadioSyntaxPanel() {
        ButtonGroup colorsGroup = new ButtonGroup();
        ButtonGroup genreGroup = new ButtonGroup();

        JRadioButton blueRadioButton = new JRadioButton("Blue", false);
        JRadioButton redRadioButton = new JRadioButton("Red", true);
        JRadioButton greenRadioButton = new JRadioButton("Green", false);

        JRadioButton maleRadioButton = new JRadioButton("Male", false);
        JRadioButton femaleRadioButton = new JRadioButton("Female", false);

        colorsGroup.add(blueRadioButton);
        colorsGroup.add(redRadioButton);
        colorsGroup.add(greenRadioButton);

        genreGroup.add(maleRadioButton);
        genreGroup.add(femaleRadioButton);

        add(blueRadioButton);
        add(redRadioButton);
        add(greenRadioButton);

        add(maleRadioButton);
        add(femaleRadioButton);
    }
}