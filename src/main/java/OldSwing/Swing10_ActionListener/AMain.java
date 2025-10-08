package OldSwing.Swing10_ActionListener;
import javax.swing.SwingUtilities;

public class AMain {
	public static void main10(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					MainFrame myMainFrame = new MainFrame();
					myMainFrame.show();
				}
		});
	}
	
	public static void main(String[] args) {
		MainFrame myMainFrame = new MainFrame();
		myMainFrame.show();
	}
}
