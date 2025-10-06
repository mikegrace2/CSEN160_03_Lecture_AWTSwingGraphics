package NewSwing.Swing11_LayeredPane;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener{
	public MyFrame() throws HeadlessException {
		super();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);				
		this.setVisible(true);
		
		JLabel label1=new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50,50,200,200);
		
		JLabel label2=new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.green);
		label2.setBounds(100,100,200,200);

		JLabel label3=new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(150,150,200,200);

		JLayeredPane layeredPane= new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);
		
		layeredPane.add(label1, JLayeredPane.DRAG_LAYER);
		layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(label3, JLayeredPane.DRAG_LAYER);
		
		this.add(layeredPane);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("e="+e.toString());
	}
}