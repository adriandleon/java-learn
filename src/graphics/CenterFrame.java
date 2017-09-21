package graphics;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.*;

public class CenterFrame {

	public static void main(String[] args)
	{
		CenteredFrame myFrame = new CenteredFrame();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFrame.setVisible(true);
		
		
	}
}


class CenteredFrame extends JFrame 
{
	public CenteredFrame()
	{
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		
		Dimension sizeScreen = myScreen.getScreenSize();
		
		int heightScreen = sizeScreen.height;
		int widthScreen = sizeScreen.width;
		
		setSize(widthScreen / 2, heightScreen / 2);
		
		setLocation(widthScreen / 4, heightScreen / 4);
		
		setTitle("Centered Frame");
		
		Image icon = myScreen.getImage("src/graphics/icono.png");
		
		setIconImage(icon);
		
	}
}
	