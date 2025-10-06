package NewSwing.Swing13_TextField;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener{
	private JButton button=null;
	private JTextField textField=null;
	
	public MyFrame() throws HeadlessException {
		super();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);				
		this.setVisible(true);
		
		this.button=new JButton("Submit");
		button.addActionListener(this);
		
		this.textField=new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		
		this.add(button);
		this.add(textField);
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==this.button) {
			System.out.println("text = "+this.textField.getText());
			this.button.setEnabled(false);
		}
	}
}