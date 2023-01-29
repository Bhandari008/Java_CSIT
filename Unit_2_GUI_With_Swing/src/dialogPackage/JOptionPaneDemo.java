package dialogPackage;

import javax.swing.JOptionPane;

public class JOptionPaneDemo {

	public static void main(String[] args) {
		JOptionPane dialog = new JOptionPane();
		// addition of two numbers
		int num1 = Integer.parseInt(dialog.showInputDialog("Enter num1:", 0));
		int num2 = Integer.parseInt(dialog.showInputDialog("Enter num2:", 0));
		int sum = num1 + num2 ;
		
		dialog.showMessageDialog(null, sum, "Summation", JOptionPane.WARNING_MESSAGE);
		
		dialog.showConfirmDialog(null,sum, "Summation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
		
		
		
		
	}
}
