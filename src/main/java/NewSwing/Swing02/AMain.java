package NewSwing.Swing02;

import javax.swing.SwingUtilities;

public class AMain {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Window main=new Window();
				main.show();	
			}
		});
	}
}