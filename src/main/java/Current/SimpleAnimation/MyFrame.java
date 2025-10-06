package Current.SimpleAnimation;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private static final long serialVersionUID = 2785906920964533781L;
	private MyPanel panel;
	
	public MyFrame() {
		this.panel= new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null); // center
		this.setVisible(true);		
	}
}