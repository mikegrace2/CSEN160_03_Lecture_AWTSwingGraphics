package OldSwing.Swing08_JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainFrame {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public MainFrame() {
		this.frame = new JFrame(); // default is BorderLayout
		this.frame.setTitle("JFrame JButton");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null); // center it
		                        
		this.panel = new JPanel();
		this.panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		this.panel.setBackground(Color.GRAY);
		
		this.label = new JLabel("www.Google.com");
		this.label.setForeground(Color.WHITE);
		this.label.setFont(new Font("Sans-serif", Font.BOLD, 36));
		
		ImageIcon labelIcon= new ImageIcon("google.jpg");
		this.label.setIcon(labelIcon);
		this.label.setIconTextGap(20);
		this.label.setHorizontalTextPosition(SwingConstants.CENTER);
		this.label.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		this.panel.add(this.label);
		
		this.button = new JButton("Update Label1");
		this.button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("<html>My Cool App<br>Google now!</html>");
				
			}
		});
		
		this.frame.add(this.panel, BorderLayout.NORTH);
		this.frame.add(button, BorderLayout.SOUTH);
	}
		
	public void show() {
		this.frame.setVisible(true);
	}
}
