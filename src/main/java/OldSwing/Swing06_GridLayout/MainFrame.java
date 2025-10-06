package OldSwing.Swing06_GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
	private JFrame frame;
	private JPanel panel;
	
	public MainFrame() {
		this.frame = new JFrame(); // default is BorderLayout
		this.frame.setTitle("JFrameTwo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null); // center it
		                                      // rows columns hgap vgap
		this.panel = new JPanel(new GridLayout(   4,    5,     10,  10));
		this.panel.setBackground(Color.PINK);
		
		for (int i=1;i <= 20; i++) {
			JButton temp = new JButton("Button"+i);
			this.panel.add(temp);
		}
		
		this.frame.add(this.panel);
	}
	
	public void show() {
		this.frame.setVisible(true);
	}
}
