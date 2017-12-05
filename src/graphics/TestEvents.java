package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


class ButtonsPanel extends JPanel {

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
		
		blueButton.addActionListener(new BackgroundColor(Color.BLUE));
		yellowButton.addActionListener(new BackgroundColor(Color.YELLOW));
	    redButton.addActionListener(new BackgroundColor(Color.RED));
	}
	
	
	private class BackgroundColor implements ActionListener {
		
		private Color backgroundColor;
		
		public BackgroundColor(Color c) {
			
			backgroundColor = c;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			setBackground(backgroundColor);
		}
	}
}