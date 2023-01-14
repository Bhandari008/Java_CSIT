package menuComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


public class MenuExample extends JFrame {
	
	JMenuBar bar;
	JMenu file, edit, view;
	JMenuItem save, open, exit, paste, copy;
	JCheckBoxMenuItem status;
	
	public MenuExample() {
		
		setTitle("Menu");
		setSize(200, 300);
		
		
		bar = new JMenuBar();
		
		file = new JMenu("FILE");
		file.setMnemonic('F');
		edit = new JMenu("EDIT");
		edit.setMnemonic('E');
		view = new JMenu("VIEW");
		view.setMnemonic('V');
		
		
		save = new JMenuItem("save");
		open = new JMenuItem("open");
		
		exit = new JMenuItem("exit", KeyEvent.VK_X);
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			System.exit(0);	
			}
		});
		
		exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
		
		
		copy = new JMenuItem("copy");
		paste = new JMenuItem("paste");
		
		status = new JCheckBoxMenuItem("Status");
		
		
		
		
		// adding menu
		bar.add(file);
		bar.add(edit);
		bar.add(view);
		
		// adding menu items
		
		file.add(save);
		file.add(open);
		file.add(exit);
		
		// adding view items
		view.add(status);
		
		// adding edit items
		edit.add(copy);
		edit.add(paste);
		
		setJMenuBar(bar);
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new MenuExample();

	}

}
