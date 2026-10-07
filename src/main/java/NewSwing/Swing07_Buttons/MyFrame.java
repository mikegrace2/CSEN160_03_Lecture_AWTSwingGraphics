package NewSwing.Swing07_Buttons;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener{
	JButton button=null;
	JLabel label=null;

	public MyFrame() throws HeadlessException {
		super();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLayout(null); // no layout manager
		this.setSize(500, 500);
			
		this.button = new JButton("Click me!!!!");
		this.button.setBounds(200, 100, 100, 50);
		this.button.setFocusable(true);
		this.button.addActionListener(this);
		//this.button.addActionListener(e -> System.out.println("Lambda Expression")); // Lambda Expression
		this.add(button);
		
		this.label=new JLabel("This is it!");
		this.add(this.label);
		
		this.setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==this.button) {
			System.out.println("Classic ActionListener!");
			this.button.setEnabled(false);
			this.label.setText("CLICKED");
		}
	}
}