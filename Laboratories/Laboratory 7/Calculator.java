package lab7; 

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;
public class Calculator extends JFrame  {
	
	JLabel prompt, outputTitle;
	JTextField inputArea;
	JTextField outputArea;
	JButton [] myButtons = new JButton[4];
	int num1,num2 = 0; // Nums to be used + - / *
	theHandler handler = new theHandler(); // builds an action listen object to be used below 
	
	
	
	public Calculator() {
	super("Calculator");
	setLayout(new FlowLayout());
	// Input for calculator
	outputTitle = new JLabel( "Result" );
	add( outputTitle );
	outputArea = new JTextField(8);
	add( outputArea );
	// Output by calculator
	prompt = new JLabel( "Input" );
	add( prompt );
	inputArea = new JTextField( 8 );
	inputArea.addActionListener(handler);
	add( inputArea );
	
	
	
	
	// Buttons for calculator
	for(int i = 0; i < myButtons.length; i++)
	{
		switch(i)
		{
		case 0: myButtons[i] = new JButton("+");
		myButtons[i].addActionListener(handler);
		break;
		
		case 1: myButtons[i] = new JButton("-");
		myButtons[i].addActionListener(handler);
		break;
		
		case 2: myButtons[i] = new JButton("*");
		myButtons[i].addActionListener(handler);
		break;
		
		case 3: myButtons[i] = new JButton("/"); 
		myButtons[i].addActionListener(handler);
		break; 
		}
		add(myButtons[i]); 
	}
		
	    setSize(250, 220); // setSize and setVisible may appear in constructor
	    setVisible(true);
}

	private class theHandler implements ActionListener{
		public void actionPerformed( ActionEvent event)
		{
			String inputString = "";
			String outputString = ""; 
			
			if(event.getSource() == myButtons[0])// if they click + 
			{							 
				inputString = inputArea.getText();
				num1 = Integer.parseInt(inputString); 
				num2 += num1; 
				outputString = String.valueOf(num2);
			}
			else if(event.getSource() == myButtons[1])// if they click -
			{							  
				inputString = inputArea.getText();
				num1 = Integer.parseInt(inputString); 
				num2 -= num1; 
				outputString = String.valueOf(num2);
			}
			else if(event.getSource() == myButtons[2])// if they click *
			{							 
				inputString = inputArea.getText();
				num1 = Integer.parseInt(inputString); 
				num2 *= num1; 
				outputString = String.valueOf(num2);
			}
			else if(event.getSource() == myButtons[3])// if they click /
			{							
				inputString = inputArea.getText();
				num1 = Integer.parseInt(inputString); 
				num2 /= num1; 
				outputString = String.valueOf(num2);
			}
			outputArea.setText(outputString);
			inputArea.setText("");
		}
		
	}
	
	
	
	public static void main(String args[]){
	Calculator aCalc = new Calculator();
	}
	}// end class Calculator 
