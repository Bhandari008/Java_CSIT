package LayoutManagement;

import java.awt.Color;

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
		reglbl.setBounds(150, 20, 300, 50);
		
		fnamelbl = new JLabel("First Name");
		fnamelbl.setBounds(80, 70, 150, 20);
		
		fnametxt = new JTextField();
		fnametxt.setBounds(200, 70, 200, 20);
		
		lnamelbl = new JLabel("Last Name");
		lnamelbl.setBounds(80, 100, 150, 20);
		
		lnametxt = new JTextField();
		lnametxt.setBounds(200, 100, 200, 20);
		
		
		emaillbl = new JLabel("Email");
		emaillbl.setBounds(80, 130, 150, 20);
		
		emailtxt = new JTextField();
		emailtxt.setBounds(200,130,200, 20);
		
		aboutlbl = new JLabel("About You");
		aboutlbl.setBounds(80, 175, 150, 20);
		
		abouttxt = new JTextArea();
		abouttxt.setBounds(200, 160, 200, 60);
		
		submit = new JButton("Submit");
		submit.setBounds(150, 240, 90, 25);
		
		
		add(reglbl);
		add(fnamelbl);
		add(fnametxt);
		add(lnamelbl);
		add(lnametxt);
		add(emaillbl);
		add(emailtxt);
		
		add(aboutlbl);
		add(abouttxt);
		add(submit);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		
		new NoLayoutDemo();
	}

}
