package OldSwing.Swing05_FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

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
		
		this.panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
		this.panel.setBackground(Color.PINK);
		
		for (int i=1;i <= 5; i++) {
			JButton temp = new JButton("Button"+i);
			this.panel.add(temp);
		}

        this.frame.add(this.panel);
		//this.frame.add(this.panel, BorderLayout.NORTH);
	}
	
	public void show() {
		this.frame.setVisible(true);
	}
}
