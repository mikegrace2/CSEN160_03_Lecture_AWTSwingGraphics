package OldSwing.Swing02_FrameYwoVersions;
import javax.swing.JFrame;

public class JFrameTwo {
	private JFrame frame;
	
	public JFrameTwo() {
		this.frame = new JFrame();
		this.frame.setTitle("JFrameTwo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null); // center it
	}
	
	public void show() {
		this.frame.setVisible(true);
	}
}
