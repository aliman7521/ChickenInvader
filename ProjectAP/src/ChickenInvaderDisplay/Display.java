package ChickenInvaderDisplay;

import java.awt.Canvas;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Display implements KeyListener	
{
	private JFrame frame ;
	private Canvas canvas;
	
	
	
	public Display() 
	{
		frame = new JFrame();
		canvas = new Canvas();
		
		String st ;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);

		frame.add(canvas);
		frame.addKeyListener(this);
		
		frame.setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int close = e.getKeyCode();
		if(close == KeyEvent.VK_ESCAPE)
		{
//			System.out.println("key　pressed!");
			System.exit(1);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
}
