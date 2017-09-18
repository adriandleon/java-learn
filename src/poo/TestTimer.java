package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.Date;

public class TestTimer {

	public static void main(String[] args) {
		
		GetTime listener = new GetTime();
		Timer myTimer = new Timer(5000, listener);
		myTimer.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		myTimer.stop();
		System.exit(0);
		
	}

}


class GetTime implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		Date now = new Date();
		System.out.println("Te pongo la hora cada 5 seg: " + now);
	}
}