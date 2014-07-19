package my;
import javax.swing.JButton;

import java.awt.GridLayout;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationPanel extends JPanel {

	final int MAX_BUTTONS = 5;
	JButton[] operations = new JButton[MAX_BUTTONS];
	String[] opStr = {"+", "-", "*", "/", "+/-"};
	public OperationPanel() {
		// TODO Auto-generated constructor stub
		//operations[0] = new JButton("+");
		//operations[1] = new JButton("-");
		//operations[2] = new JButton("*");
		//operations[3] = new JButton("/");
		//operations[4] = new JButton("+/-");
		
		for(int i = 0; i < MAX_BUTTONS; i++) {
			operations[i] = new JButton(opStr[i]);
		}
		for(int i = 0; i < MAX_BUTTONS; i++) {
			operations[i].addActionListener(new CommonButtonActionListener());
		}
		this.setLayout(new GridLayout(5,0));
		
		for(int i = 0; i < MAX_BUTTONS; i++) {
			this.add(operations[i]);
		}
	}
	
	public class CommonButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
