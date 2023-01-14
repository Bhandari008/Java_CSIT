package menuComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class ToolBarDemo extends JFrame {
	
	JPanel panel;
	Action actionone, actiontwo, actionthree;
	
	public ToolBarDemo() {
		setTitle("Toolbar Frame");
		panel = new JPanel();
		// Actions Tool Button
		
		Action actionone = new AbstractAction("One", new ImageIcon(getClass().getResource("run.png"))) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.red);
				
			}
		};
		
		Action actiontwo = new AbstractAction("Two", new ImageIcon(getClass().getResource("save.png"))) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new JFileChooser().showOpenDialog(panel);
				
			}
		};
		
		
		Action actionthree = new AbstractAction("Three", new ImageIcon(getClass().getResource("open.png"))) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Color c = new JColorChooser().showDialog(panel, "SELECT", Color.white);
				panel.setBackground(c);
			}
		};
	
		
		JToolBar bar = new JToolBar();
		bar.add(actionone);
		bar.add(actiontwo);
		bar.add(actionthree);
		panel.setBackground(Color.green);
		add(bar, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ToolBarDemo();

	}

}
