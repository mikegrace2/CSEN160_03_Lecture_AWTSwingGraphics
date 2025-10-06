package NewSwing.Swing17_JSlider;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ChangeListener{
	private JTextField textField=null;
	private JSlider slider=null;

	public MyFrame() throws HeadlessException {
		super();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);				
		this.setVisible(true);
		
		this.slider=new JSlider(0, 100, 25);
		this.slider.setPaintTicks(true);
		this.slider.setMinorTickSpacing(10);
		this.slider.setMajorTickSpacing(25);
		this.slider.setPaintLabels(true);
		this.slider.addChangeListener(this);
		this.slider.setOrientation(SwingConstants.VERTICAL);
		this.add(this.slider);
		
		this.textField=new JTextField();
		this.textField.setPreferredSize(new Dimension(250,40));
		this.add(textField);
		
		this.pack();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource()==this.slider) {
			System.out.println(this.slider.getValue());
			this.textField.setText("Value = "+this.slider.getValue());
		}
	}
}