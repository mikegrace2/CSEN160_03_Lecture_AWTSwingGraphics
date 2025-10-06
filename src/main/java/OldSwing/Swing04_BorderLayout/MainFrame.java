package OldSwing.Swing04_BorderLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame {
	private JFrame frame;
	
	public MainFrame() {
		this.frame = new JFrame(); // default is BorderLayout
		this.frame.setTitle("JFrameTwo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null); // center it
		
		BorderLayout border=new BorderLayout(5,5);
		border.setHgap(10);
		border.setVgap(10);
		
		this.frame.setLayout(border);
		
		this.frame.add(new JButton("NORTH"), BorderLayout.NORTH); 	// Each one can contain only one component
		this.frame.add(new JButton("WEST"), BorderLayout.WEST);		// if more needed use JPanel
		this.frame.add(new JButton("EAST"), BorderLayout.EAST);
		this.frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		this.frame.add(new JButton("CENTER"), BorderLayout.CENTER);
	}
	
	public void show() {
		this.frame.setVisible(true);
	}
}
