package Current.Calculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorNew implements ActionListener{
	private JFrame frame;
	private JTextField textField= new JTextField();
	private JTextField textField_1 = new JTextField();
	private JTextField textField_2 = new JTextField();
	private JButton btnNewButton = new JButton("Calculate");

	public CalculatorNew() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		frame.getContentPane().add(lblNewLabel);
		
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		frame.getContentPane().add(lblNewLabel_1);
		
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		this.btnNewButton.addActionListener(this);
		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionCommand: "+e.getActionCommand());
		if (e.getSource()==this.btnNewButton) {
			int num1=Integer.parseInt(this.textField.getText());
			int num2=Integer.parseInt(this.textField_1.getText());
			int result=num1+num2;			
			this.textField_2.setText(""+result);
		}
	}	
}