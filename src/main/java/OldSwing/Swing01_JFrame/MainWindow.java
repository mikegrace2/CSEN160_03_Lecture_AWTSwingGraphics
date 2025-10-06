package OldSwing.Swing01_JFrame;
import javax.swing.JFrame;

public class MainWindow {
	private JFrame frame;
	
	public MainWindow() {
		this.frame = new JFrame();
		this.frame.setTitle("Hello World!");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null); // center it
	}
	
	public void show() {
		this.frame.setVisible(true);
	}
}
