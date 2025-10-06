package NewSwing.Swing10_GridLayout;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener{
	public MyFrame() throws HeadlessException {
		super();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLayout(new GridLayout());
		this.setLayout(new GridLayout(3,3,10,10));// 3 rows and 3 columns, horizontal margins and vertical margins
		this.setSize(500, 500);		
		
		// Create 10 buttons
		for (int i=0;i<9;i++) {
			JButton button=new JButton("Button("+i+")");
			button.addActionListener(this);
			this.add(button);
		}
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("e="+e.toString());
	}
}