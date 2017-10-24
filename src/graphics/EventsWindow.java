package graphics;

import java.awt.event.*;
import javax.swing.*;

public class EventsWindow {

	public static void main(String[] args) {
		
		WindowFrame myFrame1 = new WindowFrame();
		myFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		WindowFrame myFrame2 = new WindowFrame();
		myFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		myFrame1.setTitle("My Window 1");
		myFrame1.setBounds(300, 300, 500, 350);
		myFrame2.setTitle("My Window 2");
		myFrame2.setBounds(900, 300, 500, 350);

	}
}


class WindowFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2895909609539366214L;

	public WindowFrame() {
		
//		setTitle("Window Events");
//		setBounds(300, 300, 500, 350);
		setVisible(true);
		
		addWindowListener(new MWindow());
	}
}


class MWindow extends WindowAdapter {

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("Window minimized");
	}
}