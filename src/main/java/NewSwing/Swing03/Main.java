package NewSwing.Swing03;

import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrameAsExtends frameOne=new JFrameAsExtends();
				
				//frameOne. offers all JFrame properties, not really good
				JFrameAsAttribute frameTwo=new JFrameAsAttribute();
			}
		});
	}
}