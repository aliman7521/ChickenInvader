package ChickenInvaderMain;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import ChickenInvaderDisplay.Display;

public class Game implements Runnable
{

	private Display display;
	
	private BufferStrategy bs;
	private Graphics g ;
	
	private boolean running = false;
	public Thread thread;
	
	public Game()
	{
		
	}
	
	private void init() 
	{
		// TODO Auto-generated method stub
		display = new Display();
		
	}
	
	private void update()
	{
		
	}
	
	private void render()
	{
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null)
		{
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		
		g.clearRect(0, 0, 2000,2000);
		
		
		//
			g.fillRect(0, 0, 300, 200);
		//
		
		bs.show();
		g.dispose();
	}
	
	public void run() {
		
		init();
		
		while (running)
		{
			update();
			render();
		}
		stop();
	}

	
	public synchronized void start()
	{
		if (running)
			return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop()
	{
		// TODO Auto-generated method stub
		if(!running)
			return;
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
