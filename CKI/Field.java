package CKI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;


import javax.swing.JPanel;
import javax.swing.Timer;

public class Field extends JPanel implements ActionListener
{
	
	Player p1 = new Player();
	Move m = new Move(this);
	Shoot shoot = new Shoot(this);
	
	ArrayList<Bullet> bullets = new ArrayList<Bullet>(); 
	
	public int x ;
	public int y ;
	
	Timer tm = new Timer(20,this); 
	
	public Field(Player p , ArrayList<Chicken> chickens)
	{
		setBackground(Color.black);
		addMouseMotionListener(m);
		addKeyListener(shoot);
//		Fire f = new Fire(x,y,x,y+50);
		tm.start();
	}

//	public void add(Player p)
	class Move implements MouseMotionListener 
	{
		public Move(Field f) 
		{
			f.addMouseMotionListener(this);
			
		}
		
		@Override
		public void mouseDragged(MouseEvent e) 
		{
			// TODO Auto-generated method stub
			p1.shuttlex = e.getXOnScreen()-15;
			p1.shuttley = e.getYOnScreen()-50;
			p1.wingLx = p1.shuttlex - p1.shuttleWidth + 2;
			p1.wingY = p1.shuttley + 40;
			p1.wingRx = p1.shuttlex + p1.shuttleWidth - 2;
			p1.wingWid = 15;
			p1.wingLen = 40;

			x = e.getXOnScreen()-15;
			y = e.getYOnScreen()-25;
			repaint();
			
			
		}

		@Override
		public void mouseMoved(MouseEvent e) 
		{
			// TODO Auto-generated method stub
			p1.shuttlex = e.getXOnScreen()-15;
			p1.shuttley = e.getYOnScreen()-50;
			p1.wingLx = p1.shuttlex - p1.shuttleWidth + 2;
			p1.wingY = p1.shuttley + 40;
			p1.wingRx = p1.shuttlex + p1.shuttleWidth - 2;
			p1.wingWid = 15;
			p1.wingLen = 40;

			x = e.getXOnScreen()-15;
			y = e.getYOnScreen()-25;
			repaint();
		}
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		p1.paintComponent(g);
		
		for(Bullet fire : bullets)
		{
			fire.draw(g);
		}
	}
	
	private void addFire(Bullet fire)
	{
		bullets.add(fire);
	}
	
	class Shoot implements KeyListener
	{
		Field field;
		 public Shoot(Field field) 
		 {
			field.addKeyListener(this);
			this.field=field;
			
		 }
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			char key = e.getKeyChar();
			if(key == ' ') 
			{
				field.addFire(new Bullet(x, y));
				
			}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		for(Bullet fire : bullets)
		{
			fire.y-=10;
			
		}
		repaint();
	}
	public void movePlayer(Player p , MouseEvent e)
	{
		p.shuttlex = e.getXOnScreen()-15;
		p.shuttley = e.getYOnScreen()-50;
		p.wingLx = p1.shuttlex - p1.shuttleWidth + 2;
		p.wingY = p1.shuttley + 40;
		p.wingRx = p1.shuttlex + p1.shuttleWidth - 2;
		p.wingWid = 15;
		p.wingLen = 40;

		x = e.getXOnScreen()-15;
		y = e.getYOnScreen()-25;
		repaint();
	}

}
