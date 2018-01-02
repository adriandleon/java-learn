package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton display;

    CalculatorPanel() {

        setLayout(new BorderLayout());
        display = new JButton("0");
        display.setEnabled(false);
        add(display, BorderLayout.NORTH);

        keypadPanel = new JPanel();
        keypadPanel.setLayout(new GridLayout(4, 4));

        ActionListener insertNumber = new InsertNumber();

        // Row 1
        addButton("7", insertNumber);
        addButton("8", insertNumber);
        addButton("9", insertNumber);
        addButton("/", null);

        // Row 2
        addButton("4", insertNumber);
        addButton("5", insertNumber);
        addButton("6", insertNumber);
        addButton("x", null);

        // Row 3
        addButton("1", insertNumber);
        addButton("2", insertNumber);
        addButton("3", insertNumber);
        addButton("-", null);

        // Row 4
        addButton("0", insertNumber);
        addButton("AC", null);
        addButton("=", null);
        addButton("+", null);

        add(keypadPanel, BorderLayout.CENTER);
    }

    private void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        keypadPanel.add(button);
    }

    private class InsertNumber implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String input = e.getActionCommand();

            if (display.getText() == "0") {
                display.setText(input);
            } else {
                display.setText(display.getText() + input);
            }
        }
    }
}