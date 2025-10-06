package OldSwing.Swing07_JButton;
import javax.swing.SwingUtilities;

public class Launcher07 {
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
