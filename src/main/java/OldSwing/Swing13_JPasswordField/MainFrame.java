package OldSwing.Swing13_JPasswordField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class MainFrame{
	private JFrame frame;
	private JLabel label;
	private JPasswordField passwordField;
	private JButton button;
	
	public MainFrame() {
		this.frame = new JFrame(); // default is BorderLayout
		this.frame.setTitle("JFrame JButton");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null); // center it
		
		// New
		FlowLayout layout = new FlowLayout();
		layout.setAlignment(FlowLayout.LEFT);
		layout.setHgap(10);
		layout.setVgap(10);
		
		this.frame.setLayout(layout);
		
		this.label = new JLabel("Enter Password:");
		this.passwordField=new JPasswordField(10); 
		this.passwordField.setText("Default");
		this.passwordField.setEchoChar('-');
		this.button=new JButton("Check");

		this.button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				char[] pf = passwordField.getPassword();
				String value=new String(pf);
				System.out.println("Password: "+ value);
			}
		});

		this.frame.add(this.label);
		this.frame.add(this.passwordField);
		this.frame.add(this.button);
	}
			
	public void show() {
		this.frame.setVisible(true);
	}
}
