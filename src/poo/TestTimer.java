package poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TestTimer {

	public static void main(String[] args) {
		
		GetTime listener = new GetTime();
		Timer myTimer = new Timer(5000, listener);
		myTimer.start();
		
		JOptionPane.showMessageDialog(null, "Press accept to stop");
		
		myTimer.stop();
		System.exit(0);
	}
}


class GetTime implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		Date now = new Date();
		System.out.println("Print time every 5 secs: " + now);
		
		Toolkit.getDefaultToolkit().beep();
	}
}