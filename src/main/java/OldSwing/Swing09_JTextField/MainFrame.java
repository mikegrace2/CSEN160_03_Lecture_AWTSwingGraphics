package OldSwing.Swing09_JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	
	public MainFrame() {
		this.frame = new JFrame(); // default is BorderLayout
		this.frame.setTitle("JFrame JButton");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null); // center it
		                        
		this.panel = new JPanel();
		this.panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		this.panel.setBackground(Color.GRAY);
		
		// New
		this.textField= this.createJTextField();
		this.panel.add(this.textField);
		
		this.label= new JLabel("Text");
		this.panel.add(this.label);		
		
		this.frame.add(this.panel, BorderLayout.NORTH);
	}
	
	public JTextField createJTextField() {
		JTextField jtex=new JTextField(10);
		jtex.setFont(new Font("Arial", Font.BOLD, 38));
		jtex.setForeground(Color.blue);
		jtex.setBackground(Color.YELLOW);
		jtex.setToolTipText("Enter text! :(");
		jtex.setMargin(new Insets(10,10,10,10));
		
		jtex.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textField.getText());
				textField.setText("Enter some more text: ");
			}
		});
		
		return jtex;
	}
		
	public void show() {
		this.frame.setVisible(true);
	}
}
