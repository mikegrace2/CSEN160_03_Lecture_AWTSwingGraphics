package NewSwing.Swing04;

import javax.swing.SwingUtilities;

public class AMain {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Frame main=new Frame();	
			}
		});
	}
}