import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyEventClass extends JFrame  {
	
	JLabel firstlbl, secondlbl, inputlbl, resultlbl;
	JTextField first, second, input, result;
	
	
	public KeyEventClass() {
		setTitle("Calculator");
		setSize(300, 300);
		setLayout(new GridLayout(4,2,5,5));
		
		firstlbl = new JLabel("First");
		secondlbl = new JLabel("Second");
		inputlbl = new JLabel("Input");
		resultlbl = new JLabel("Result");
		
		first = new JTextField(20);
		second = new JTextField(20);
		
		
		
		input = new JTextField(20);
		
		KeyAdapter listener = new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				int x = Integer.parseInt(first.getText());
				int y = Integer.parseInt(second.getText());
				int res= 0;
				
				switch(e.getKeyChar()) {
				case 'a':
					res = x+y;
					break;
				case 's':
					res = x-y;
					break;
				case 'd':
					res = x / y;
					break;
				case 'm':
					res = x * y;
					break;
				case 'r':
					res = x % y;
					break;
				default:
					res = 0;
				}
				result.setText(String.valueOf(res));
				
			}
		};
		
		input.addKeyListener(listener);
		
		
		
		result = new JTextField(20);
		
		
		add(firstlbl);
		add(first);
		
		add(secondlbl);
		add(second);
		
		add(inputlbl);
		add(input);
		
		add(resultlbl);
		add(result);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		
		new KeyEventClass();
	}

}
