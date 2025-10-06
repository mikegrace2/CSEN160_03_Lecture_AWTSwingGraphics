package Current.Transformations;


import javax.swing.JFrame;

public class Graphics2D{
	private static final long serialVersionUID = -5061537296046948508L;
	
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		DrawingCanvas draw=new DrawingCanvas();
		frame.add(draw);
		frame.setTitle("Current/Graphics2D");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);	
		frame.setVisible(true);
	}
}