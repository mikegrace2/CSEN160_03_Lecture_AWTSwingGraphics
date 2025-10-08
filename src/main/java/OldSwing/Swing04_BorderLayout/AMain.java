package OldSwing.Swing04_BorderLayout;
import javax.swing.SwingUtilities;

public class AMain {
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
