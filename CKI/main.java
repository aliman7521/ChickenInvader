package CKI;

import java.awt.Color;

import javax.swing.JFrame;

public class main extends JFrame
{
	main()
	{
		setBackground(Color.BLACK);
		setSize(1500,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		setResizable(false);
		Field f = new Field();
		add(f);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		main f = new main();
		

	}

}
