package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;
import java.awt.Toolkit;;

public class TestTimer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clock myClock = new Clock(3000, true);
		myClock.running();
		
		JOptionPane.showMessageDialog(null, "Press Ok to finish");
		
		System.exit(0);
	}

}


class Clock {
	
	private int interval;
	private boolean sound;
	
	public Clock(int interval, boolean sound) {
		this.interval = interval;
		this.sound = sound;
	}
	
	public void running() {
		ActionListener listener = new GetTime2();
		Timer myTimer = new Timer(interval, listener);
		myTimer.start();
	}
	
	// Inner class
	private class GetTime2 implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			Date now = new Date();
			System.out.println("Time: " + now);
			
			if (sound)
				Toolkit.getDefaultToolkit().beep();
		}
	}
}