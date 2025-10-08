package NewSwing.Swing02.DIfferentStartup;

import javax.swing.JFrame;

public class Window {
	private JFrame window;
	
	public Window() {
		window = new JFrame();
		window.setTitle("Hello Class");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(800, 500);
		window.setLocationRelativeTo(null);
	}
	
	public void show() {
		window.setVisible(true);
	}
}
