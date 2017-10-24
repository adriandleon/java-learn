package graphics;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;

public class ChangeState {

	public static void main(String[] args) {
		
		FrameState myFrame = new FrameState();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}


class FrameState extends JFrame {
	
	private static final long serialVersionUID = 2240782175662554468L;

	public FrameState() {
		
		setVisible(true);
		setBounds(300, 300, 500, 350);
		
		addWindowStateListener(new StateChanged());
	}
}


class StateChanged implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {
		
//		System.out.println("The window has changed state");
		
		if (e.getNewState() == Frame.MAXIMIZED_BOTH) {
			System.out.println("Window has been maximixed");
		}
		else if (e.getNewState() == Frame.NORMAL) {
			System.out.println("Window is normal");
		}
		else if (e.getNewState() == Frame.ICONIFIED) {
			System.out.println("Window has been minimized");
		}
	}
}
