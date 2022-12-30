package LayoutManagement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NoLayoutDemo extends JFrame{
	JLabel reglbl, fnamelbl, lnamelbl, emaillbl, aboutlbl;
	JTextField fnametxt, lnametxt, emailtxt;
	JTextArea abouttxt;
	JButton submit;
	
	public NoLayoutDemo() {
		setTitle("Registration Form");
		setSize(400, 400);
		setLayout(null);
		reglbl = new JLabel("Registration Form");
		reglbl.setBounds(100, 20, 200, 40);
		
		fnamelbl = new JLabel("First Name");
		fnamelbl.setBounds(100, 40, 200, 40);
		
		fnametxt = new JTextField();
		fnametxt.setBounds(200, 40, 100, 40);
		
		lnamelbl = new JLabel("Last Name");
		lnamelbl.setBounds(100, 60, 200, 40);
		
		lnametxt = new JTextField();
		lnametxt.setBounds(200, 60, 100, 40);
		
		add(reglbl);
		add(fnamelbl);
		add(fnametxt);
		add(lnamelbl);
		add(lnametxt);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		
		new NoLayoutDemo();
	}

}
