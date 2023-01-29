import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionEventImplementingListener extends JFrame
implements ActionListener {
	JLabel firstlbl, secondlbl, resultlbl;
	JTextField first, second, result;
	JButton addbtn, subtractbtn;
	public ActionEventImplementingListener() {
		setTitle("Calculator");
		setSize(300, 300);
		setLayout(new GridLayout(4,2,5,5));
		
		firstlbl = new JLabel("First");
		secondlbl = new JLabel("Second");
		resultlbl = new JLabel("Result");
		
		first = new JTextField(20);
		second = new JTextField(20);
		result = new JTextField(20);
		
		addbtn = new JButton("Add");
		// addbtn.setActionCommand("+");
		
		addbtn.addActionListener(this);
		
		subtractbtn = new JButton("Subtract");
		
		subtractbtn.addActionListener(this);
		
		add(firstlbl);
		add(first);
		
		add(secondlbl);
		add(second);
		
		add(resultlbl);
		add(result);
		
		add(addbtn);
		add(subtractbtn);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ActionEventImplementingListener();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int x = Integer.parseInt(first.getText());
		int y = Integer.parseInt(second.getText());
		int res= 0;
		
		if(e.getActionCommand() == "Add") {
			res = x+y;
		}
		else {
			res = x-y;
		}
		result.setText(String.valueOf(res));
	}

}



