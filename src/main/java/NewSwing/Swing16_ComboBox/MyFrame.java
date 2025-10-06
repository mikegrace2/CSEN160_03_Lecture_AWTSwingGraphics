package NewSwing.Swing16_ComboBox;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener{
	private JComboBox<String> combo=null;
	private JTextField textField=null;
	
	public MyFrame() throws HeadlessException {
		super();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);				
		this.setVisible(true);
		
		String[] animals = {"dog", "cat", "bird"};
		
		this.combo=new JComboBox<String>(animals);
		this.combo.addActionListener(this);
		this.add(this.combo);
		
		this.textField=new JTextField();
		this.textField.setPreferredSize(new Dimension(250,40));
		this.add(textField);
		
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==this.combo) {
			System.out.println(this.combo.getSelectedItem());
			this.textField.setText(this.combo.getSelectedItem().toString());
			this.combo.addItem("Horse");
			this.pack();
		}
	}
}