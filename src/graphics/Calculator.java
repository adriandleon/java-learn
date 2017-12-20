package graphics;

import javax.swing.*;
import java.awt.*;

public class Calculator {

    public static void main(String[] args) {

        CalculatorFrame myFrame = new CalculatorFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

class CalculatorFrame extends JFrame {

    CalculatorFrame() {

        setTitle("Calculator");
        setBounds(500, 300, 450, 300);
        add(new CalculatorPanel());
    }
}

class CalculatorPanel extends JPanel {

    private JPanel keypadPanel;

    CalculatorPanel() {

        setLayout(new BorderLayout());
        JButton display = new JButton("0");
        display.setEnabled(false);
        add(display, BorderLayout.NORTH);

        keypadPanel = new JPanel();
        keypadPanel.setLayout(new GridLayout(4, 4));

        // Row 1
        addButton("7");
        addButton("8");
        addButton("9");
        addButton("/");

        // Row 2
        addButton("4");
        addButton("5");
        addButton("6");
        addButton("x");

        // Row 3
        addButton("1");
        addButton("2");
        addButton("3");
        addButton("-");

        // Row 4
        addButton("0");
        addButton("AC");
        addButton("=");
        addButton("+");

        add(keypadPanel, BorderLayout.CENTER);
    }

    private void addButton(String label) {
        JButton button = new JButton(label);
        keypadPanel.add(button);
    }
}