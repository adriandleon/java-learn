package poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TestTimer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clock myClock = new Clock();
		
		myClock.running(3000, true);
		
		JOptionPane.showMessageDialog(null, "Press Ok to finish");
		
		System.exit(0);
	}

}


class Clock {
	
	public void running(int interval, final boolean sound) {
		
		// Local inner class
		class GetTime2 implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				Date now = new Date();
				System.out.println("Time: " + now);
				
				if (sound)
					Toolkit.getDefaultToolkit().beep();
			}
		}
		
		ActionListener listener = new GetTime2();
		Timer myTimer = new Timer(interval, listener);
		myTimer.start();
		
	}
	
}