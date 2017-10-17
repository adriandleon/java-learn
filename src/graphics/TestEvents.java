package graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestEvents {

	public static void main(String[] args) {
		
		ButtonsFrame myFrame = new ButtonsFrame();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class ButtonsFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3487276481860769991L;

	public ButtonsFrame() {
		
		setTitle("Buttons and Events");
		setBounds(700, 300, 500, 300);
		ButtonsPanel myPanel = new ButtonsPanel();
		add(myPanel);
	}
}


class ButtonsPanel extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -915460853539774958L;
	
	JButton blueButton = new JButton("Blue");
	JButton yellowButton = new JButton("Yellow");
	JButton redButton = new JButton("Red");
	
	public ButtonsPanel() {
		
		add(blueButton);
		add(yellowButton);
		add(redButton);
		
		blueButton.addActionListener(this);
		yellowButton.addActionListener(this);
		redButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object buttonPressed = e.getSource();
		
		if (buttonPressed == blueButton) {
			setBackground(Color.BLUE);			
		}
		else if (buttonPressed == yellowButton) {
			setBackground(Color.YELLOW);
		}
		else if (buttonPressed == redButton){
			setBackground(Color.RED);
		}

	}
}