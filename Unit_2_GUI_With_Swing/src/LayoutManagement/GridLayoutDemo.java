package LayoutManagement;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame{
	
	JButton btn1, btn2, btn3, btn4, btn5, btn6;
	public GridLayoutDemo() {
		
		btn1 = new JButton("Button One");
		btn2 = new JButton("Button Two");
		btn3 = new JButton("Button Three");
		btn4 = new JButton("Button Four");
		btn5 = new JButton("Button Five");
		btn6 = new JButton("Button Six");
		// JFrame Configuration
		setTitle("Grid Layout");
		setSize(400, 500);
		setLayout(new GridLayout(3,2,5,5)); // rows, cols, hgap, vgap
		// Adding Components in grid
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		
		new GridLayoutDemo();
	}

}
