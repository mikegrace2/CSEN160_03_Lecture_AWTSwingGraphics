package NewSwing.Swing23_MouseListener;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements MouseListener{
	private JLabel label=null;
	
	public MyFrame() throws HeadlessException {
		super();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);	
		this.addMouseListener(this);
		this.setVisible(true);
		
		ImageIcon icon=new ImageIcon("rocket_ship_alpha.png");
		this.label=new JLabel();
		this.label.setIcon(icon);
		this.label.setBounds(0,0,100,100);
		this.add(this.label);
		this.getContentPane().setBackground(Color.black);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
		label.setLocation(this.label.getX()-1,  label.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
		label.setLocation(this.label.getX(),  label.getY()-1);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
		label.setLocation(this.label.getX(),  label.getY()+1);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseReleased");
		label.setLocation(this.label.getX()+1,  label.getY());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseReleased");
		label.setLocation(this.label.getX()+1,  label.getY());
	}
}