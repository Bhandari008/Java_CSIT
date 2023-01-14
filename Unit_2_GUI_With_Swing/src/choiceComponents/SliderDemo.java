package choiceComponents;

import java.awt.Component;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo extends JPanel {

	JSlider slider;
	JTextField values;
	
	
	public SliderDemo () {
		slider = new JSlider(SwingConstants.HORIZONTAL,0, 100, 30);
		slider.setMajorTickSpacing(20); // show major and minor ticks
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setSnapToTicks(true);
		slider.setInverted(false);
		
		Dictionary<Integer, Component> labeltbl = new Hashtable<Integer, Component>();
		labeltbl.put(0, new JLabel("A"));
		labeltbl.put(20, new JLabel("B"));
		labeltbl.put(40, new JLabel("C"));
		labeltbl.put(60, new JLabel("D"));
		labeltbl.put(80, new JLabel("E"));
		labeltbl.put(100, new JLabel("F"));
		
		
		// Do the same for icon
		
		slider.setLabelTable(labeltbl);
		values = new JTextField(10);
		
		// Event Handling
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) { // event handler
				values.setText(String.valueOf(slider.getValue())); // int to string	
			}
		});
		
		add(slider);
		add(values);
	}
	
	
	public static void main(String[] args) {
		
		SliderDemo panel = new SliderDemo();
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.add(panel);
		
		frame.setVisible(true);
		
	}

}
