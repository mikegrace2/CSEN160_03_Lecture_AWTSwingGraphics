package OldSwing.Swing02_FrameYwoVersions;
import javax.swing.SwingUtilities;

public class Launcher02 {
	public static void main(String[] args) {
		// It executes your Runnable on the AWT event-dispatching thread. 
		// But why would you want to do that? Because the Swing data structures 
		// aren't thread-safe, so to provide programmers with an easily-achievable
		// way of preventing concurrent access to them, the Swing designers laid 
		// down the rule that all code that accesses them must run on the same thread.		
		SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					// negative: myFrameOne gives access to the JFrame details to everyone which is too much and not needed!
					JFrameOne myFrameOne = new JFrameOne(); 
					
					// positive: myJFrameTwo only has some members showing to everyone
					JFrameTwo myJFrameTwo = new JFrameTwo(); 
					myJFrameTwo.show();
				}
		});
	}
}
