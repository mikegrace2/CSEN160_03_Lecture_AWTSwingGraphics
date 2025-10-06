package NewSwing.Swing05;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		JFrame frame=new JFrame("My First");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1800, 500);
		//frame.setLayout(null);

		JLabel label=new JLabel("My Label");
		ImageIcon image=new ImageIcon("Eclipse.jpg");
		label.setIcon(image);
		
		frame.add(label);
		
		frame.pack();
		frame.setVisible(true);
	}
}