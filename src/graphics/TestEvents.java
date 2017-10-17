package graphics;

import java.awt.*;
import javax.swing.*;

public class TestEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	
}