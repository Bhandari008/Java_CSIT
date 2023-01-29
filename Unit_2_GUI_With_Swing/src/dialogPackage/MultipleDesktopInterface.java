package dialogPackage;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class MultipleDesktopInterface extends JFrame {

	JDesktopPane pane;
	JInternalFrame frame1, frame2;

	public MultipleDesktopInterface() {
		setTitle("Desktop Pane Frame");
		setSize(500, 500);

		pane = new JDesktopPane();

		frame1 = new JInternalFrame("First Internal Frame", true, true, true, true);
		pane.add(frame1); // frame 1 added to pane
		frame1.add(new JButton("Frame1 Button"), BorderLayout.SOUTH);
		frame1.setLocation(50, 50); // JFrame or JDesktop Pane
		frame1.setSize(200, 200);
		frame1.setVisible(true);

		frame2 = new JInternalFrame("Second Internal Frame", true, true, true, true);
		pane.add(frame2); // frame 1 added to pane
		frame2.add(new JButton("Frame2 Button"), BorderLayout.NORTH);
		frame2.setLocation(100, 100); // JFrame or JDesktop Pane
		frame2.setSize(200, 200);
		frame2.setVisible(true);

		add(pane); // pane added to Jframe
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new MultipleDesktopInterface();

	}

}
