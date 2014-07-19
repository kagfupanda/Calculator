package my;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;


public class CalculatorTextField extends JPanel {
	
	JTextField numField;

	public CalculatorTextField() {
		// TODO Auto-generated constructor stub
		numField = new JTextField(20); 
		numField.setEditable(false);
		
		
		this.setLayout(new GridLayout(0,1));
		
		this.add(numField);
	}

	@Override
	public Dimension getMaximumSize() {
		// TODO Auto-generated method stub
		System.out.println("in get Maximum size function");
		return new Dimension(200,200);
		// return super.getMaximumSize();
	}

	@Override
	public Dimension getMinimumSize() {
		// TODO Auto-generated method stub
		return super.getMinimumSize();
	}

	@Override
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		System.out.println("in get preffered size function");
		return new Dimension(200,200);
		//return super.getPreferredSize();
	}

}
