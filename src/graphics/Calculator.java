package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

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
    private boolean clearDisplay;
    private double result;
    private String lastOperation;
    private DecimalFormat format;

    CalculatorPanel() {

        setLayout(new BorderLayout());
        display = new JButton("0");
        display.setEnabled(false);
        add(display, BorderLayout.NORTH);

        format = new DecimalFormat("#,###.#");

        keypadPanel = new JPanel();
        keypadPanel.setLayout(new GridLayout(4, 4));

        ActionListener insertNumber = new InsertNumber();
        ActionListener actionOrder = new ActionOrder();

        // Row 1
        addButton("7", insertNumber);
        addButton("8", insertNumber);
        addButton("9", insertNumber);
        addButton("/", actionOrder);

        // Row 2
        addButton("4", insertNumber);
        addButton("5", insertNumber);
        addButton("6", insertNumber);
        addButton("x", actionOrder);

        // Row 3
        addButton("1", insertNumber);
        addButton("2", insertNumber);
        addButton("3", insertNumber);
        addButton("-", actionOrder);

        // Row 4
        addButton("0", insertNumber);
        addButton("AC", actionOrder);
        addButton("=", actionOrder);
        addButton("+", actionOrder);

        add(keypadPanel, BorderLayout.CENTER);
        reset();
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

            if (clearDisplay) {
                display.setText("0");
                clearDisplay = false;
            }

            if (display.getText().equals("0")) {
                display.setText(input);
            } else {
                display.setText(display.getText() + input);
            }
        }
    }

    private class ActionOrder implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equals("AC")) {
                reset();
                return;
            }

            calculate(Double.parseDouble(display.getText()));

            lastOperation = e.getActionCommand();

            clearDisplay = true;
        }

        private void calculate(double value) {

            switch (lastOperation) {
                case "+":
                    result += value;
                    break;

                case "-":
                    result -= value;
                    break;

                case "*":
                    result *= value;
                    break;

                case "/":
                    result /= value;
                    break;

                case "=":
                    result = value;
                    break;

                default:
                    break;
            }

            display.setText(format.format(result));
        }
    }

    private void reset() {
        result = 0.0;
        lastOperation = "=";
        display.setText("0");
    }
}