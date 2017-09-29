package graphics;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class TestGraphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameWithGraphics myFrame = new FrameWithGraphics();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);	
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
		
		myPanel.setBackground(SystemColor.window);
	}
	
}


class PanelWithGraphics extends JPanel {
	
	private static final long serialVersionUID = -7599367787304366174L;

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
//		g.drawRect(50, 50, 200, 200);
//		
//		g.drawLine(100, 100, 300, 200);		
//		
//		g.drawArc(50, 100, 100, 200, 120, 154);
		
		// Draw rectangle
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangle = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.setPaint(Color.WHITE);
		g2.draw(rectangle);
		
		g2.setPaint(Color.RED);
		g2.fill(rectangle);
		
		// Draw ellipse
		Ellipse2D ellipse = new Ellipse2D.Double();
		
		ellipse.setFrame(rectangle);
		
		Color myColor = new Color(125, 189, 200);
		
//		g2.setPaint(new Color(109, 172, 59).brighter());
		
		g2.setPaint(myColor);
		
		g2.fill(ellipse);
		
		// Draw line
//		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		// Draw circle
//		double centerX = rectangle.getCenterX();
//		double centerY = rectangle.getCenterY();
//		double radio = 150;
//		
//		Ellipse2D circle = new Ellipse2D.Double();
//		
//		circle.setFrameFromCenter(centerX, centerY, centerX + radio, centerY + radio);
//		
//		g2.draw(circle);
		
	}
}