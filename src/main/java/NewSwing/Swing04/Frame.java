package NewSwing.Swing04;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {
	private JFrame frame;
	
	public Frame() {
		this.initialize();
	}
	
	public void initialize() {
		this.frame = new JFrame();
		this.frame.setTitle("JFrame");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(500, 500);
		this.frame.setLocationRelativeTo(null);
		this.frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
		
		this.frame.add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.RED);
		
		Button button1=new Button("Button1");
		panel.add(button1,FlowLayout.LEFT);
		
		Button button2=new Button("Button2");
		panel.add(button2,FlowLayout.LEFT);
		
		Button button3=new Button("Button3");
		panel.add(button3,FlowLayout.CENTER);
		
		this.frame.setVisible(true);
	}
}
