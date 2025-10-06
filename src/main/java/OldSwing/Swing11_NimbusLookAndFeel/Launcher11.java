package OldSwing.Swing11_NimbusLookAndFeel;
import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Launcher11 {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
					if ("Nimbus".equals(info.getName())){
						try {
							UIManager.setLookAndFeel(info.getClassName());
							MainFrame myMainFrame = new MainFrame();
							myMainFrame.show();	
							break;
						} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
								| UnsupportedLookAndFeelException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
	}		
}