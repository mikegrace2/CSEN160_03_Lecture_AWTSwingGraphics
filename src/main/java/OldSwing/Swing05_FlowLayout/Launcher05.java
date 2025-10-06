package OldSwing.Swing05_FlowLayout;
import javax.swing.SwingUtilities;

public class Launcher05 {
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
