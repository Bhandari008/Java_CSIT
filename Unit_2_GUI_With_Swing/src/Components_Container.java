import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Components_Container {

	public Components_Container() {
		JFrame frame = new JFrame();
		JButton button1 = new JButton("button1");
		JButton button2 = new JButton("button2");
		JButton button3 = new JButton("button3");
		JButton button4 = new JButton("button4");
		JButton button5 = new JButton("button5");
		frame.setTitle("Components and Container Frame");
		frame.setSize(300, 300); // 300 pixels
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		// frame.setResizable(false);
		frame.setVisible(true);
		frame.add(button1, BorderLayout.NORTH);
		frame.add(button2, BorderLayout.SOUTH);
		frame.add(button3, BorderLayout.EAST);
		frame.add(button4, BorderLayout.WEST);
		frame.add(button5, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		new Components_Container();

	}

}

// javax.swing
// JPanel, JButton, JLabel, JTextField, JTextArea, JPasswordField, JScrollPane,
// JList, JRadioButton, JCheckBox
// JTree, JTable, JMenu, JMenubar, JMonitor, JDialog, JOptionPan, JDesktopPan,
// JInternalFrame
// java.awt
// FlowLayout, BorderLayout, GridLayout, GridBagLayout,NoLayout = .setLayout(None), GroupLayout
