package OldSwing.Swing02_FrameYwoVersions;
import javax.swing.JFrame;

public class JFrameOne extends JFrame{
	public JFrameOne() {
		this.initialize();
	}

	public void initialize() {
		this.setTitle("JFrameOne");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(500, 400);
		this.setLocationRelativeTo(null); // center it
		this.setResizable(true);
		this.setVisible(true);
	}
}