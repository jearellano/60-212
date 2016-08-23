package assignment7;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FinalUserFrame extends JFrame{
	private JLabel enterCountry; 
	private JTextField inputArea; 
	private JTextArea outputArea; 
	private JButton [] myButtons = new JButton[3]; 
	private University u1; 
	//handler myhandler = new handler(); 
	public FinalUserFrame(University ourUniversity)
	{
		super("Input Frame"); 
		setLayout(new FlowLayout()); 
		u1 = ourUniversity; 
		enterCountry = new JLabel("Enter name of Country"); 
		add(enterCountry); 
		
		inputArea = new JTextField("Enter name Country",20); 
		inputArea.addActionListener(new ActionListener() {
			String inputString = ""; 
			@Override
			public void actionPerformed(ActionEvent e) {
				inputString = String.valueOf(u1.numberOfStudents(inputArea.getText()));
				outputArea.setText("Number of Students from " + inputArea.getText() + " is " + inputString);
				inputArea.setText("");
			}
		});
		add(inputArea); 
		
		outputArea = new JTextArea(20,50); 
		add(outputArea); 
		
		// Buttons for calculator
		for(int i = 0; i < myButtons.length; i++)
		{
			switch(i)
			{
			case 0: myButtons[i] = new JButton("Show Students");
			myButtons[i].addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					outputArea.setText(u1.toString());
				}
			});
			break;
			
			case 1: myButtons[i] = new JButton("Show Students sorted(ascending)");
			myButtons[i].addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					OutputFrame newFrame = new OutputFrame("Sorted List(ascending) of Students");
					u1.sortStudents(); 
					newFrame.displayMessage(u1.toString());
				}
			});
			break;
			
			case 2: myButtons[i] = new JButton("Show Students sorted(descending)");
			myButtons[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					OutputFrame newFrame = new OutputFrame("Sorted List(descending) of Students");
					u1.sortStudentsInReverse();
					newFrame.displayMessage(u1.toString());
				}
			}); 
			break;
			
			}
			add(myButtons[i]); 
		}
		
		
		setSize(600,500); 
		setVisible(true); 
		
	}
}
