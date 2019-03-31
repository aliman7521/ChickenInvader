package CKI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Bullet 
{
	public int x , y,width =20, length=50;
	
	public Bullet(int x , int y)
	{
		this.x = x ;
		this.y = y ;
		
	}
	
	public void draw(Graphics g)
	{
		
		
		g.setColor(Color.red);
		g.drawRect(x, y, width, length);
		
		
	}
	
//	public int getx()
//	{
//		return x;
//	}
//
//	public int gety()
//	{
//		return y;
//	}
	
}
