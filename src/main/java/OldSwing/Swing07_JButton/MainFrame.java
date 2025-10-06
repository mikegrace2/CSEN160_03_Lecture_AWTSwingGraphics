package OldSwing.Swing07_JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainFrame {
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	public MainFrame() {
		this.frame = new JFrame(); // default is BorderLayout
		this.frame.setTitle("JFrame JButton");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null); // center it
		                        
		this.panel = new JPanel();
		this.panel.setBackground(Color.cyan);
		
		this.button=this.createButton();
		this.panel.add(this.button);
		
		
		this.frame.add(this.panel);
	}
	
	private JButton createButton() {
		JButton tempButton=new JButton("Print");
		tempButton.setFocusable(false);
		
		ImageIcon printIcon= new ImageIcon("printer.jpg");
		tempButton.setIcon(printIcon);
		tempButton.setIconTextGap(20);
		tempButton.setMnemonic(KeyEvent.VK_P);
		tempButton.setToolTipText("Print");
		tempButton.setFont(new Font("Arial", Font.PLAIN, 48));
		tempButton.setMargin(new Insets(10,10,10,10)); // spaces between button
		
		tempButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Pressed");
			}
		});
		
		//tempButton.setEnabled(false); // disable button
		
		tempButton.doClick(); // click by program, not user!
		tempButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		tempButton.setHorizontalTextPosition(SwingConstants.CENTER);
		
		tempButton.setVerticalTextPosition(SwingConstants.CENTER);
		tempButton.setHorizontalTextPosition(SwingConstants.LEFT);
		
		tempButton.setPreferredSize(new Dimension(200,75));
		
		return tempButton;
	}
	
	public void show() {
		this.frame.setVisible(true);
	}
}
