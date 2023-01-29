package dialogPackage;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Modal extends JDialog{
	
	public Modal(JFrame parent){
		super(parent, "Dialog Box", true);
		setSize(200, 200);
		
		add(new JLabel("<html><h2>Harendra</h2></html>"));
		add(new JLabel("<html><h2>Raj</h2></html>"));
		add(new JLabel("<html><h2>Bist</h2></html>"));
		
		setLayout(new FlowLayout());
		setVisible(true);
		
	}
	

}
public class JDialogDemo extends JFrame {
	JButton click;
	
	public JDialogDemo() {
		setTitle("Dialog Frame");
		setLayout(new FlowLayout());
		setSize(400, 400);
		click = new JButton("Display My Name");
		
		
		click.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Modal(JDialogDemo.this);
				
			}
		});
		add(click);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
	}

	public static void main(String[] args) {
		new JDialogDemo();

	}

}
