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
	
	public FrameWithText() {
		
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("First Text");
		
		// Add panel to frame
		Panel myPanel = new Panel();
		add(myPanel);
	}
}


class Panel extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("We are learning Swing!", 100, 100);
		
	}
	
}