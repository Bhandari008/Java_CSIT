import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowEventDemo extends JFrame {

	
	public WindowEventDemo() {
		setTitle("WindowEvent Demo");
		setSize(300, 300);
		
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				JOptionPane.showMessageDialog(WindowEventDemo.this, "Welcome");
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				JOptionPane.showMessageDialog(WindowEventDemo.this, "See you later");
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				JOptionPane.showMessageDialog(WindowEventDemo.this, "Welcome Back");
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("Deactivated");
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				
//				JOptionPane.showMessageDialog(WindowEventDemo.this, "Bye Bye");
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				JOptionPane.showMessageDialog(WindowEventDemo.this, "Bye Bye");
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("Activated");
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new WindowEventDemo();
		
		
		// Focus Event
	}

}
