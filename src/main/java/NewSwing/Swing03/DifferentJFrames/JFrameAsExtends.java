package NewSwing.Swing03.DifferentJFrames;

import javax.swing.JFrame;

public class JFrameAsExtends extends JFrame {
	public JFrameAsExtends() {
		initialize();
	}
	
	public void initialize() {
		this.setTitle("JFrameOne");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(500, 800);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
}