package NewSwing.Swing01;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame frame=new JFrame("My First");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setVisible(true);
		
		ImageIcon image=new ImageIcon("Icon.jpg");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(Color.GREEN);
		frame.getContentPane().setBackground(new Color(0,255,0));
		frame.getContentPane().setBackground(new Color(0x00ff00));
		frame.getContentPane().setBackground(new Color(0xff0000));
	}
}