package graphics;

import javax.swing.*;
import java.awt.*;

public class WritingFrame {

	public static void main(String[] args) {
		
		FrameWithText myFrame = new FrameWithText();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class FrameWithText extends JFrame {
	
	private static final long serialVersionUID = 2894587149260059054L;

	public FrameWithText() {
		
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("First Text in Frame");
		setVisible(true);
		
		// Add panel to frame
		Panel myPanel = new Panel();
		add(myPanel);
	}
}


class Panel extends JPanel {

	private static final long serialVersionUID = 8264242919023264058L;

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("We are learning Swing!", 200, 100);
		
		g.drawLine(10, 120, 590, 120);
		
	}
	
}