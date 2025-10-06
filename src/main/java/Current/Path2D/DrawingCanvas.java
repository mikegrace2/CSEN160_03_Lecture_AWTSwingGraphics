package Current.Path2D;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class DrawingCanvas extends JComponent{
	private static final long serialVersionUID = 8484012127228034166L;
		
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		
		RenderingHints rh = new RenderingHints(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON
				);
		g2d.setRenderingHints(rh);

		g2d.setColor(Color.BLACK);
		Path2D.Double p = new Path2D.Double();
		p.moveTo(100, 300);
		p.lineTo(150, 200);
		p.lineTo(400, 500);
		p.lineTo(50, 50);
		p.closePath();
		g2d.fill(p);   // draw and fill
		//g2d.draw(p); // only draw
		
		g2d.setColor(Color.RED);
		Path2D.Double curve= new Path2D.Double();
		curve.moveTo(250, 400);
		curve.curveTo(350,300,500,300,600,400);
		//g2d.draw(curve);
		g2d.fill(curve);
	}
}