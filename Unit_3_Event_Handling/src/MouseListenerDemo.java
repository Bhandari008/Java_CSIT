import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerDemo extends JFrame implements MouseListener{

	JLabel label;
	
	public MouseListenerDemo() {
		
	
		setTitle("Mouse Event Demo");
		setSize(300, 300);
		
		
		label = new JLabel("Display");
		add(label, BorderLayout.NORTH);
		
		
		addMouseListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		new MouseListenerDemo();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		String x = String.valueOf(e.getX());
		String y = String.valueOf(e.getY());
		label.setText("Clicked at : ("+ x + "," + y + ")" );
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		String x = String.valueOf(e.getX());
		String y = String.valueOf(e.getY());
		label.setText("Pressed at : ("+ x + "," + y + ")" );
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		String x = String.valueOf(e.getX());
		String y = String.valueOf(e.getY());
		label.setText("Released at : ("+ x + "," + y + ")" );
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		String x = String.valueOf(e.getX());
		String y = String.valueOf(e.getY());
		label.setText("Entered at : ("+ x + "," + y + ")" );
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		String x = String.valueOf(e.getX());
		String y = String.valueOf(e.getY());
		label.setText("Exited from : ("+ x + "," + y + ")" );
		
	}

}
