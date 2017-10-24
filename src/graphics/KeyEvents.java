package graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class KeyEvents {

	public static void main(String[] args) {
		
		FrameWithKeys myFrame = new FrameWithKeys();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class FrameWithKeys extends JFrame {
	
	private static final long serialVersionUID = 4844109515147735605L;

	public FrameWithKeys() {
		setVisible(true);
		setBounds(700, 300, 600, 450);
		
		addKeyListener(new KeyboardEvent());
	}
}


class KeyboardEvent implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(Integer.toString(e.getKeyCode()));		
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {
		char keyPressed = e.getKeyChar();
		System.out.println("The key pressed is: " + keyPressed);
	}
}