/**
 * 
 */
package my;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Siddharth
 *
 */
public class NumberPanel extends JPanel {
	final int MAX_BUTTONS = 12;
	JButton [] number = new JButton[12];
	String[] intnum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "0", "="};

	/**
	 * 
	 */
	public NumberPanel() {
		// TODO Auto-generated constructor stub
		
		//number[0] = new JButton("1");
		//number[1] = new JButton("2");
		//number[2] = new JButton("3");
		//number[3] = new JButton("4");
		//number[4] = new JButton("5");
		//number[5] = new JButton("6");
		//number[6] = new JButton("7");
		//number[7] = new JButton("8");
		//number[8] = new JButton("9");
		//number[9] = new JButton(".");
		//number[10] = new JButton("0");
		//number[11] = new JButton("=");
		for(int i = 0; i < 12; i++) {
			number[i] = new JButton(intnum[i]);
		}
		for(int i = 0; i < 12; i++) {
			number[i].addActionListener(new NumberButtonActionListener());
		}
		
		this.setLayout(new GridLayout(4,3));
		
		for(int i = 0; i < 12; i++) {
			this.add(number[i]);
		}
		//this.add(number[0]);
		//this.add(number[1]);
		//this.add(number[2]);
		//this.add(number[3]);
		//this.add(number[4]);
		//this.add(number[5]);
		//this.add(number[6]);
		//this.add(number[7]);
		//this.add(number[8]);
		//this.add(number[9]);
		//this.add(number[10]);
		//this.add(number[11]);
		
	}
	public class NumberButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
