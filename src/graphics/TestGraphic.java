package graphics;

import java.awt.*;
import javax.swing.*;

public class TestGraphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameWithGraphics myFrame = new FrameWithGraphics();
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class FrameWithGraphics extends JFrame {
	
	private static final long serialVersionUID = 6694068772506148456L;

	public FrameWithGraphics() {
		
		setTitle("Testing Graphics");
		setSize(400, 400);
		
		// Add PanelWithGraphics
		PanelWithGraphics myPanel = new PanelWithGraphics();
		add(myPanel);
	}
	
}


class PanelWithGraphics extends JPanel {
	
	private static final long serialVersionUID = -7599367787304366174L;

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawRect(50, 50, 200, 200);
		
		g.drawLine(100, 100, 300, 200);		
		
		g.drawArc(50, 100, 100, 200, 120, 154);
	}
}