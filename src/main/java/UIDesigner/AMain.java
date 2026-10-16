package UIDesigner;

import javax.swing.JFrame;

public class AMain {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Calculator().$$$getRootComponent$$$());
		frame.setSize(320, 420);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
