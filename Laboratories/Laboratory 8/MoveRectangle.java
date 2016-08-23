package lab8;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

public class MoveRectangle extends JFrame{
	Rectangle myRectangle; 
	
	public MoveRectangle()
	{
		super("Showing Rectangle"); 
		
		
		
		myRectangle = new Rectangle(); 
		setSize(500,500); 
		setVisible(true); 
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
//		myRectangle.showRectangle(g); 
	}
	
	
}
