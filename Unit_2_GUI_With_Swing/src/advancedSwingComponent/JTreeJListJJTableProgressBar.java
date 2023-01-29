package advancedSwingComponent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.SwingConstants;

import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeJListJJTableProgressBar  extends JFrame{
	
	JTree tree;
	JTable table;
	JProgressBar bar;
	JList<String> list;
	JButton btn;

	public JTreeJListJJTableProgressBar() {
		
		
		setTitle("Advanced Swing Components");
		setSize(300, 300);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		// JTree Implementation
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
		DefaultMutableTreeNode veg = new DefaultMutableTreeNode("Veg");
		DefaultMutableTreeNode fruit = new DefaultMutableTreeNode("fruit");
		
		root.add(veg);
		root.add(fruit);
		tree = new JTree(root);
		
		
		// JTable Implementation
		String[] heading = {"Name", "Address", "Contact"};
		String[][] data = {
				{"Harendra", "Kalanki", "98989"}, 
				{"Muskan", "Bhaktapur", "90902"},	
				{"Harendra", "Kalanki", "98989"}, 
				{"Muskan", "Bhaktapur", "90902"},
				{"Harendra", "Kalanki", "98989"}, 
				{"Muskan", "Bhaktapur", "90902"}
				
		};
		table = new JTable(data, heading);
		JScrollPane pane = new JScrollPane(table);
		
		
		// JProgressBar Implementation
		
		bar = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
		bar.setStringPainted(true);
		
		btn = new JButton("Bar Button");
		
		btn.addActionListener(new ActionListener() {
			
			int count = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				count +=10;
				bar.setValue(count);
				if (count == 100) {
					bar.setString("Done");
				}
				else {
					bar.setValue(count);
				}
				
			}
		});
		
		
		add(pane);
		add(tree);
		add(bar);
		add(btn);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTreeJListJJTableProgressBar();
	}
}
