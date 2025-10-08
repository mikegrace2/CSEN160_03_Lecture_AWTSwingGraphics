package NewSwing.Swing22_Game;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements KeyListener{
	private JLabel label=null;
	
	public MyFrame() throws HeadlessException {
		super();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);	
		this.addKeyListener(this);
		this.setVisible(true);

        // IntelliJ IDEA: src/main/resources/rocket_ship_alpha.png
        ImageIcon icon = new ImageIcon(getClass().getResource("/rocket_ship_alpha.png"));
		//ImageIcon icon=new ImageIcon("rocket_ship_alpha.png");
		this.label=new JLabel();
		this.label.setIcon(icon);
		this.label.setBounds(0,0,100,100);
		this.add(this.label);
		this.getContentPane().setBackground(Color.black);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		int code=e.getKeyCode();
		System.out.println("You typed key = "+e.getKeyChar());
		System.out.println("You typed code = "+code);
		if (code == 37) {
			System.out.println("You typed IN37 code = "+code);
			label.setLocation(this.label.getX()-1,  label.getY());
		}else if (code == 38) {
			System.out.println("You typed IN38 code = "+code);
			label.setLocation(this.label.getX(),  label.getY()-1);
		}else if (code == 39) {
			System.out.println("You typed IN39 code = "+code);
			label.setLocation(this.label.getX(),  label.getY()+1);
		}else if (code == 40) {
			System.out.println("You typed IN40 code = "+code);
			label.setLocation(this.label.getX()+1,  label.getY());
		}		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("You pressed key = "+e.getKeyChar());
		System.out.println("You pressed code = "+e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int code=e.getKeyCode();
		System.out.println("You released key = "+e.getKeyChar());
		System.out.println("You released code = "+code);
		if (code == 37) { // left
			System.out.println("You typed IN37 code = "+code);
			label.setLocation(this.label.getX()-10,  label.getY());
		}else if (code == 38) { // up
			System.out.println("You typed IN38 code = "+code);
			label.setLocation(this.label.getX(),  label.getY()-10);
		}else if (code == 39) { // right
			System.out.println("You typed IN39 code = "+code);
			label.setLocation(this.label.getX()+10,  label.getY());
		}else if (code == 40) { // down
			System.out.println("You typed IN40 code = "+code);
			label.setLocation(this.label.getX(),  label.getY()+10);
		}
	}
}