package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;
import java.awt.Toolkit;;

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