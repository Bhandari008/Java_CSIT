import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FactorialImplementation extends JFrame {

	JTextField number, factorial;
	JLabel numberlbl, factoriallbl;
	JButton findFactorial;
	
	public FactorialImplementation() {
		
		setTitle("Calculator");
		setSize(300, 300);
		setLayout(null);
		
		JTextField number = new JTextField();
		JLabel numberlbl = new JLabel("Input");
		
		JTextField factorial = new JTextField();
		JLabel resultlbl = new JLabel("Result");
		
		JButton findFactorial = new JButton("Find Factorial");
		
		add(numberlbl).setBounds(100, 100, 150, 50);;
		add(number).setBounds(150, 100 , 150 ,50);;
		
		add(resultlbl).setBounds(100, 200, 150, 50);
		
		add(factorial).setBounds(150,200, 150, 50 );
		
		add(findFactorial).setBounds(100, 300, 150, 50);
		
		// Event Handling
		
		findFactorial.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(number.getText());
				int fact = factorial(x);
				factorial.setText(String.valueOf(fact));
				
			}
		});
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	// Factorial Function
	public static int factorial(int x)
	{
		if(x == 0 || x == 1) {
			return 1;
		}
		else {
			return factorial(x-1) * x; 
		}
	}

	public static void main(String[] args) {
		new FactorialImplementation();
	}

}
