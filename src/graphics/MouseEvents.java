package graphics;

import java.awt.event.*;
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
		
		setBounds(400, 300, 600, 450);
		setVisible(true);
		
		addMouseListener(new MouseActions());
		addMouseMotionListener(new MouseMotion());
	}
}


class MouseActions extends MouseAdapter {

//	@Override
//	public void mouseClicked(MouseEvent e) {
//		System.out.println("Coordinates: (" + e.getX() + ", " + e.getY() + ")");
//
//      System.out.println(e.getClickCount());
//	}

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        super.mousePressed(mouseEvent);

        if (mouseEvent.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            System.out.println("You pressed the left button");
        }
        else if (mouseEvent.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
            System.out.println("You pressed the mouse wheel");
        }
        else if (mouseEvent.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
            System.out.println("You pressed the right button");
        }
    }
}

class MouseMotion implements MouseMotionListener {

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        System.out.println("Mouse dragging");
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        System.out.println("Mouse moving");
    }
}