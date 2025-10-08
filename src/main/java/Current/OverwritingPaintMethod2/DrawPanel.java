package Current.OverwritingPaintMethod2;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	private static final long serialVersionUID = -5061537296046948508L;
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponents(g);
		
		for (int i=0;i<400;i=i+10)
			g.drawLine(110+i, 110, 200, 50);
	}
	

}