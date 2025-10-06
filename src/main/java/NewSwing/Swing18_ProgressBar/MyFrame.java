package NewSwing.Swing18_ProgressBar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class MyFrame extends JFrame{
	private JProgressBar progress=null;

	public MyFrame() throws HeadlessException {
		super();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);				
		this.setVisible(true);
		
		this.progress=new JProgressBar();
		this.progress.setStringPainted(true);
		this.progress.setString("Wait ...");
		this.progress.setForeground(Color.BLUE);
		this.progress.setValue(0);
		this.add(progress);
		
		this.pack();
		
		this.fill();
		this.progress.setString("Done");
	}
	
	public void fill() {
		for (int i=0;i<100;i++) {
			this.progress.setValue(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}