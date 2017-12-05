package graphics;

import javax.swing.*;
import java.awt.*;

public class WorkingWithFonts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameWithFonts myFrame = new FrameWithFonts();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFrame.setVisible(true);
	}

}


class FrameWithFonts extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1322968533623728472L;

	public FrameWithFonts() {
		
		setTitle("Test with Fonts");
		setSize(400, 400);
		
		PanelWithFonts myPanel = new PanelWithFonts();
		
		myPanel.setForeground(Color.ORANGE);
		add(myPanel);
	}
}


class PanelWithFonts extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4977722874423469564L;

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Font myFont = new Font("Courier", Font.BOLD, 26);
		
		g2.setFont(myFont);
		
//		g2.setColor(Color.BLUE);
		
		g2.drawString("Adrian De Leon", 100, 100);
		
		g2.setFont(new Font("Tahoma", Font.ITALIC, 20));
		
//		g2.setColor(new Color(123, 90, 50).brighter());
		
		g2.drawString("Samuel Adrian", 100, 200);
	}
}