import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TextComponent extends JFrame {
	JLabel label, ilabel, plabel;
	JTextField txt;
	JTextArea area;
	JPasswordField pwd;
	JScrollPane pane;
	
	
	public TextComponent() {
		// TODO Auto-generated constructor stub
		
		setLayout(new GridLayout());
		
		label = new JLabel();
		label.setText("Username");
		ilabel = new JLabel();
		Icon ic = new ImageIcon(getClass().getResource("icon.png"));
		ilabel.setIcon(ic);
		
		plabel = new JLabel();
		plabel.setText("Password");
		
		txt = new JTextField();
		area = new JTextArea(8, 40);
		pane = new JScrollPane(area);
		pwd = new JPasswordField();
		
		add(label);
		add(txt);
		add(pane);
		add(ilabel);
		
		add(plabel);
		add(pwd);
		
		setSize(400, 500);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextComponent();

	}

}
