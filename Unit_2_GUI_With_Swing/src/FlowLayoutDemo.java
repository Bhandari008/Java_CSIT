import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {
	public FlowLayoutDemo() {
		setTitle("Flow Layout");
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 30));
		setSize(400, 400);
		JButton button1 = new JButton("button1");
		JButton button2 = new JButton("button2");
		JButton button3 = new JButton("button3");
		JButton button4 = new JButton("button4");
		JButton button5 = new JButton("button5");
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new FlowLayoutDemo();

	}

}
