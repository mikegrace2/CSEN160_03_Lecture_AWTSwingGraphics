package Current.AntiAliasing;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class DrawingCanvas extends JComponent{
	private static final long serialVersionUID = 8440878784365574801L;

	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		
		RenderingHints rh = new RenderingHints(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_OFF
				);
		//g2d.setRenderingHints(rh);
		
		Rectangle2D.Double r = new Rectangle2D.Double(0,0,400,400);
		g2d.setColor(Color.BLUE);
		g2d.fill(r);
		
		Ellipse2D.Double e = new Ellipse2D.Double(200,75,100,100);
		g2d.setColor(Color.GREEN);
		g2d.fill(e);
		
		Line2D.Double line= new Line2D.Double(100,250,300,75);
		g2d.setColor(Color.MAGENTA);
		g2d.draw(line);
	}
}