package NewSwing.Swing20_FileSelector;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener{
	private JTextField textField=null;
	private JButton button=null;

	public MyFrame() throws HeadlessException {
		super();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);				
		this.setVisible(true);

		this.button=new JButton("Select File");
		this.button.addActionListener(this);
		this.add(button);
		
		this.textField=new JTextField();
		this.textField.setPreferredSize(new Dimension(250,40));
		this.add(textField);
		
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==this.button) {
			System.out.println("CLICK");
			this.textField.setText("CLICK");
			JFileChooser filo=new JFileChooser();
			filo.setCurrentDirectory(new File("C:\\Users\\mschi\\Documents\\JPegDecode"));
			int ret=filo.showOpenDialog(null);
			System.out.println("FileChooser int="+ret);
			
			if (ret == 0) {
				System.out.println(filo.getSelectedFile().getAbsolutePath());
			}
		}		
	}
}