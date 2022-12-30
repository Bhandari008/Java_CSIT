package LayoutManagement;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBagLayoutDemo extends JPanel {

	JButton btn1, btn2, btn3, btn4, btn5, btn6;
	GridBagConstraints gbc = new GridBagConstraints();

	public GridBagLayoutDemo() {
		setLayout(new GridBagLayout());

		btn1 = new JButton("Button One");
		btn2 = new JButton("Button Two");
		btn3 = new JButton("Button Three");
		btn4 = new JButton("Button Four");
		btn5 = new JButton("Button Five");
		btn6 = new JButton("Button Six");
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 6;
		gbc.fill = GridBagConstraints.VERTICAL;
		
		add(btn1, gbc); // btn1 added to 0,0 position of GridBagLayout
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		add(btn2, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		add(btn3, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		add(btn4, gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		add(btn5, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 4;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(btn6, gbc);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		GridBagLayoutDemo panel = new GridBagLayoutDemo();
		panel.setBackground(Color.green);
		frame.add(panel);
		frame.setSize(300, 400);
		frame.setVisible(true);
		//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
