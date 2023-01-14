package choiceComponents;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CheckRadioComboList extends JFrame {
	
	JCheckBox c1, c2, c3; // select multiple item
	JRadioButton r1, r2, r3; // select one item
	JComboBox<String> cb; // select single value
	JList<String> list; // select multiple value
	JLabel printlbl;
	ButtonGroup bg;
	
	public CheckRadioComboList() {
		setTitle("Choice Frame");
		setSize(500, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 5));
		setResizable(false);
		// Check Box
		c1 = new JCheckBox("BSc.CSIT");
		c2 = new JCheckBox("BCA");
		c3 = new JCheckBox("BIT");
		
		printlbl = new JLabel();
		
		
		// Radio Button
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		r3 = new JRadioButton("Not Specified");
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		// Combination Box
		String[] country = {"Nepal", "Pakistan", "India"};
		cb = new JComboBox<String>(country);
		
		cb.addItem("Argentina");
		cb.removeItem("Pakistan");
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String item = cb.getSelectedItem().toString();
				printlbl.setText(item);
				
				
			}
		});
		

		
		// List
		
		list = new JList<String>(country);
		
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				printlbl.setText(list.getSelectedValuesList().toString());
				
			}
		});
		
		add(c1);
		add(c2);
		add(c3);
		
		add(r1);
		add(r2);
		add(r3);
		
		add(cb);
		add(list);
		
		add(printlbl);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new CheckRadioComboList();

	}

}
