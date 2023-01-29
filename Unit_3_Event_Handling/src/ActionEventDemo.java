import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventDemo extends JFrame{
	
	JButton btn; // source JButton
	
	public ActionEventDemo() {
		setTitle("Action Event Frame");
		setSize(200, 200);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		btn = new JButton("Click Me");
		
		// Event Handling
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btn.setBackground(Color.GREEN);
				btn.setForeground(Color.WHITE);
				
			}
		});
		
		add(btn); 
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		
		new ActionEventDemo();
	}

}
