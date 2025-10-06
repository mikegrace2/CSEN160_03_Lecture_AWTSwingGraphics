package NewSwing.Swing15_RadioButtons;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	private JRadioButton pizzaButton = null;
	private JRadioButton hamburgerButton = null;
	private JRadioButton hotDogButton = null;
	private JTextField textField=null;
	
	public MyFrame() throws HeadlessException {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);				
		this.setVisible(true);
		
		ButtonGroup group=new ButtonGroup();
		this.pizzaButton = new JRadioButton("Pizza");
		this.pizzaButton.addActionListener(this);
		this.hamburgerButton = new JRadioButton("Hamburger");
		this.hamburgerButton.addActionListener(this);
		this.hotDogButton = new JRadioButton("Hot Dog");
		this.hotDogButton.addActionListener(this);
		
		group.add(this.pizzaButton);
		group.add(this.hamburgerButton);
		group.add(this.hotDogButton);
		
		this.add(this.pizzaButton);
		this.add(this.hamburgerButton);
		this.add(this.hotDogButton);
		
		this.textField=new JTextField();
		this.textField.setPreferredSize(new Dimension(250,40));
		this.add(textField);
		
		this.pack();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==this.pizzaButton)
			this.textField.setText("Pizza");
		else if (e.getSource()==this.hamburgerButton)
			this.textField.setText("Hamburger");
		else if (e.getSource()==this.hotDogButton)
			this.textField.setText("Hot Dog");
	}
}