package OldSwing.Swing09_JTextField;
import javax.swing.SwingUtilities;

public class Launcher09 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					MainFrame myMainFrame = new MainFrame();
					myMainFrame.show();
				}
		});
	}
}
