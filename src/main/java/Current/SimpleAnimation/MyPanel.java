package Current.SimpleAnimation;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel implements ActionListener {
	// https://www.youtube.com/watch?v=tHNWIWxRDDA
	private static final long serialVersionUID = 3426940946811133635L;
	private final int PANEL_WIDTH= 500;
	private final int PANEL_HEIGHT = 350;
	private Image enemy;
	private Image background;
	private Timer timer;
	private int xVelocity = 2;
	private int yVelocity =1;
	private int x=0;
	private int y=0;
	
	public MyPanel() {
		this.setPreferredSize(new Dimension (this.PANEL_WIDTH, this.PANEL_HEIGHT));
		this.setBackground(Color.WHITE);
		//this.enemy = new ImageIcon("SpaceInvader.jpg").getImage();
		this.enemy = new ImageIcon("space_invader_64x64.jpg").getImage();
		this.background=new ImageIcon("Background.jpg").getImage();
		this.timer = new Timer(1, this);
		this.timer.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d=(Graphics2D)g;
		
		g2d.drawImage(this.background, 0, 0, null);
		g2d.drawImage(this.enemy, this.x, this.y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (x >= (this.PANEL_WIDTH - enemy.getWidth(null)) || x < 0) {
			this.xVelocity = this.xVelocity * -1; // change direction
		}
		this.x = this.x + this.xVelocity;
		
		if (y >= (this.PANEL_HEIGHT - enemy.getHeight(null)) || y < 0) {
			this.yVelocity = this.yVelocity * -1; // change direction
		}
		this.y = this.y + this.yVelocity;
		
		this.repaint();
	}
}
