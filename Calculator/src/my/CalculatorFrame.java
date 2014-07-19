package my;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class CalculatorFrame extends JFrame{

	JPanel opNumPanel;
	NumberPanel np;
	OperationPanel op;
	CalculatorTextField ctf;
	public CalculatorFrame() {
		// TODO Auto-generated constructor stub
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		opNumPanel = new JPanel();
		np = new NumberPanel();
		op = new OperationPanel();
		ctf = new CalculatorTextField();
		
		//this.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
		this.getContentPane().setLayout(new GridLayout(2,1));
		
		opNumPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		opNumPanel.add(np);
		opNumPanel.add(op);
		
		
		this.getContentPane().add(ctf);
		this.getContentPane().add(opNumPanel);
		//this.add(np);
		//this.add(op);
		
		pack();
		setVisible(true);
	}

}
