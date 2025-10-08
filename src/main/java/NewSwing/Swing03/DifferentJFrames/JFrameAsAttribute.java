package NewSwing.Swing03.DifferentJFrames;

import javax.swing.JFrame;

public class JFrameAsAttribute {
	private JFrame frame;
	
	public JFrameAsAttribute() {
		this.initialize();
	}
	
	public void initialize() {
		this.frame = new JFrame();
		this.frame.setTitle("JFrameTwo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(500, 800);
		this.frame.setLocationRelativeTo(null);
		this.frame.setResizable(false);
		this.frame.setVisible(true);
	}
}
