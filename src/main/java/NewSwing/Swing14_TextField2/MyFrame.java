package NewSwing.Swing14_TextField2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener{
	private JButton button=null;
	private JTextField textField=null;
	private JCheckBox checkbox=null;
	
	public MyFrame() throws HeadlessException {
		super();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);				
		this.setVisible(true);
		
		this.checkbox=new JCheckBox();
		this.checkbox.setText("Test");
		this.checkbox.addActionListener(this);
		
		this.button=new JButton("Submit");
		this.button.addActionListener(this);
		
		this.textField=new JTextField();
		this.textField.setPreferredSize(new Dimension(250,40));
		
		this.add(button);
		this.add(textField);
		this.add(checkbox);
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==this.button) {
			System.out.println("Button checkbox = "+this.checkbox.isSelected());
			this.button.setEnabled(false);
			this.textField.setText("Clicked");
		}
		
		if (e.getSource()==this.checkbox) {
			System.out.println("Checkbox = "+this.checkbox.isSelected());
			this.button.setEnabled(true);
			this.textField.setText("Selected");
		}
	}
}