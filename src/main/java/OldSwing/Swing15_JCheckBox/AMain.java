package OldSwing.Swing15_JCheckBox;
import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class AMain {
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