package NewSwing.Swing06;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		JFrame frame=new JFrame("My First");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null); // no layout manager
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(0,0,300,400);
		redPanel.setLayout(new BorderLayout());
		frame.add(redPanel);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(300,0,300,400);
		bluePanel.setLayout(null);
		frame.add(bluePanel);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setBounds(0,400,600,400);
		greenPanel.setLayout(new BorderLayout());
		frame.add(greenPanel);
		
		JLabel myLab=new JLabel("Hello");
		myLab.setBackground(Color.white);
		greenPanel.add(myLab);
	}
}