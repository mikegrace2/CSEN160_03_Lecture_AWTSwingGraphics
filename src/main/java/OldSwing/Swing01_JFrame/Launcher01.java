package OldSwing.Swing01_JFrame;
import javax.swing.SwingUtilities;

public class Launcher01 {
	public static void main(String[] args) {
		MainWindow main = new MainWindow();
		main.show();
	}	
	
	public static void mainNOPE(String[] args) {
		// It executes your Runnable on the AWT event-dispatching thread. 
		// But why would you want to do that? Because the Swing data structures 
		// aren't thread-safe, so to provide programmers with an easily-achievable
		// way of preventing concurrent access to them, the Swing designers laid 
		// down the rule that all code that accesses them must run on the same thread.		
		SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					MainWindow main = new MainWindow();
					main.show();
				}
		});
	}
}