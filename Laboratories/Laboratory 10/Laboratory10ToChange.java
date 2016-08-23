package lab10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Laboratory10ToChange  extends JFrame implements ActionListener{
	JLabel prompt, outputPrompt;
	JTextField inputArea, outputArea;
	JButton myButton;
	MyObject obj;
	public Laboratory10ToChange(){
		  super (" Laboratory 10 - EXCEPTIONS");
		  setLayout(new FlowLayout());
		  prompt = new JLabel ("Enter an Integer and Press CR");
		  add(prompt);
		  inputArea = new JTextField(15);
		  inputArea.addActionListener(this);
		  add(inputArea);
		  myButton = new JButton("Calculate Average");
		  myButton.addActionListener(this);
		  add(myButton);
		  outputPrompt = new JLabel ("The Average of the Numbers is");
		  add(outputPrompt);
		  outputArea = new JTextField(15);
		  add(outputArea);
		  obj = new MyObject(); // Creates New MyObject 
		  setSize(250, 350);
		  setVisible(true);   
	}
	public void actionPerformed( ActionEvent e ){
		
		
			if (e.getSource() == inputArea){
				try
				{
					obj.insert(Integer.parseInt(e.getActionCommand()));
					inputArea.setText("");
				}
				catch(Exception f)
				{
					System.out.println("You tried to enter in something other than a Integer");
				}
				
			}

			if (e.getSource() == myButton){
				double average = obj.calcAverage();
				outputArea.setText(Double.toString(average));
			}
		}
	
	public static void main( String args[] ){
		Laboratory10ToChange lab = new Laboratory10ToChange();
	}

}
