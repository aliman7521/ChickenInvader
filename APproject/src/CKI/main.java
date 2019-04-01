package CKI;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;

public class main extends JFrame
{
	public main()
	{
		setBackground(Color.BLACK);
		setSize(1500,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		setResizable(false);
		Field f = new Field(new Player() , new ArrayList<Chicken>());
		add(f);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		main f = new main();
		

	}

}
