package graphics;

import javax.swing.*;

public class CreatingFrames {

	public static void main(String[] args) {
		
		MyFrame frame1 = new MyFrame();
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MyFrame extends JFrame {
	
	MyFrame() {
		
//		setSize(500, 380);
//		setLocation(500, 300);
		setBounds(500, 300, 550, 400);
//		setResizable(false);
//		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("My new window");
	}
}