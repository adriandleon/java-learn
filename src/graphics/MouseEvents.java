package graphics;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class MouseEvents {

	public static void main(String[] args) {
		
		MouseFrame myFrame = new MouseFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class MouseFrame extends JFrame {

	private static final long serialVersionUID = -1187462931533931822L;
	
	public MouseFrame() {
		
		setBounds(700, 300, 600, 450);
		setVisible(true);
		
		addMouseListener(new MouseActions());
	}
}


class MouseActions implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("Mouse clicked");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("Mouse has entered");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Mouse has exit");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Mouse has been pressed");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Mouse has been released");
	}	
}