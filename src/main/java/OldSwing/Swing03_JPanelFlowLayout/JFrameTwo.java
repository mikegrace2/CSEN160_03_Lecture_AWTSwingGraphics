package OldSwing.Swing03_JPanelFlowLayout;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameTwo {
	private JFrame frame;
	
	public JFrameTwo() {
		this.frame = new JFrame();
		this.frame.setTitle("JFrameTwo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null); // center it
		
		// New Create JPnale which is a container 
		JPanel panel= new JPanel(); // JPanel
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5)); // set Layout
		//FlowLayout.CENTER;
		//FlowLayout.LEFT;
		//FlowLayout.RIGHT;
		//FlowLayout.LEADING;
		//FlowLayout.TRAILING;
				
		// New Button
		Button button1=new Button("Button1");
		Button button2=new Button("Button2");
		Button button3=new Button("Button3");
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		panel.setBackground(Color.blue); // set background color
		panel.setPreferredSize(new Dimension(250,40)); // size of panel
		
		this.frame.add(panel, BorderLayout.NORTH); // Add it to our JFrame
		//BorderLayout.CENTER EAST NORTH		
	}
	
	public void show() {
		this.frame.setVisible(true);
	}
}
