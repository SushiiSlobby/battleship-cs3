package battleship;

import java.awt.*;
import javax.swing.*;

public class runner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	
	public runner()
	{
		super("Animation Runner");

		setSize(WIDTH,HEIGHT);
				
		scene scene = new scene( );		       
		add( scene );	       	
      	setBackground(Color.blue.darker());
		setVisible(true);	

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		runner run = new runner();
	}
}
	