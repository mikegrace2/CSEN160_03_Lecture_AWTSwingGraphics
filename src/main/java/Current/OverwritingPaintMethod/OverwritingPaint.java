package Current.OverwritingPaintMethod;


import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OverwritingPaint extends Frame{
	private static final long serialVersionUID = 2208634355295252142L;
	
	public OverwritingPaint() {
		setSize(800, 500);
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		for (int i=0;i<100;i=i+20)
			g.drawString("Hello World!", 600, 200+i);
		
		g.setColor(Color.CYAN);
		for (int i=0;i<100;i=i+4)
			g.drawRect(50+i, 50+i, 100, 200);
		
		g.setColor(Color.ORANGE);
		for (int i=0;i<100;i=i+4)
			g.drawOval(260+i, 160, 100, 100);		
	}
}