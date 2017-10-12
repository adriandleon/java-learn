package graphics;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;

public class TestImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameImage myFrame = new FrameImage();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
	}
}


class FrameImage extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2919773971706756622L;

	public FrameImage() {
		
		setTitle("Frame with Image");
		setBounds(750, 300, 300, 200);
		
		PanelWithImage myPanel = new PanelWithImage();
		
		add(myPanel);
		
	}
	
}


class PanelWithImage extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1595413163193505701L;
	private Image image;
	
	public PanelWithImage() {
		
		try {
			image = ImageIO.read(new File("src/graphics/plus5.png"));
		}
		catch (IOException e) {
			
			System.out.println("La imagen no se encuentra.");	
		}
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int widhtImage = image.getWidth(this);
		int heightImage = image.getHeight(this);
		
		g.drawImage(image, 0, 0, null);
		
		for (int i = 0; i < 300; i += 64) {
			
			for (int j = 0; j < 200; j += 64) {
					
				g.copyArea(0, 0, widhtImage, heightImage, i, j);
				
			}			
		}
	
	}
	
}