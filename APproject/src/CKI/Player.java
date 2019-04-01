package CKI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Player 
{
	public Player() 
	{
		
	}

	private int HP;
	
	public int shuttlex = 740, shuttley = 650, shuttleWidth = 15, shuttleLength = 70;

	public int wingLx = shuttlex - shuttleWidth + 2, wingY = shuttley + 40;
	public int wingRx = shuttlex + shuttleWidth - 2;

	public int wingWid = 15, wingLen = 40;

	public void paintComponent(Graphics g) 
	{
		

		g.setColor(Color.RED);
		g.fillOval(shuttlex + 2, shuttley + 60, 11, 33);
		g.setColor(Color.ORANGE);
		g.fillOval(shuttlex + 2, shuttley + 60, 11, 20);

		g.setColor(Color.BLUE);
		g.fillRoundRect(shuttlex, shuttley, shuttleWidth, shuttleLength, 30, 100);
		g.fillOval(wingLx, wingY, wingWid, wingLen);
		g.fillOval(wingRx, wingY, wingWid, wingLen);
//		g.fillRect(x, y, width, height);
		
		
	}
	public void gotDamaged(int damage)
	{
		HP-=damage;
	}
	
	public boolean isAlive()
	{
		if(HP>0)
			return true;
		
		return false;
	}
	
	
	
}
