package OldSwing.Swing10_ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	private JButton button;
	
	public MainFrame() {
		this.frame = new JFrame(); // default is BorderLayout
		this.frame.setTitle("JFrame JButton");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null); // center it
		                        
		this.panel = new JPanel();
		this.label = new JLabel("Enter your name:");
		this.textField = new JTextField(20);
		this.button = new JButton("Save");
		
//		this.button.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Button clicked!");
//				
//			}
//		});
		this.button.addActionListener(this);
		
		this.panel.add(this.label);
		this.panel.add(this.textField);
		this.panel.add(this.button);
		
		this.frame.add(this.panel, BorderLayout.NORTH);
	}
			
	public void show() {
		this.frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(this.textField.getText());
	}
}
