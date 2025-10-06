package OldSwing.Swing06_GridLayout;
import javax.swing.SwingUtilities;

public class Launcher06 {
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
