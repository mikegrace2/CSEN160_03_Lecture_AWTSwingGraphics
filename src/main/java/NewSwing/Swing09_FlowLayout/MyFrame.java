package NewSwing.Swing09_FlowLayout;

import java.awt.FlowLayout;
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
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setSize(500, 500);		
		
		// Create 10 buttons
		for (int i=0;i<10;i++) {
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