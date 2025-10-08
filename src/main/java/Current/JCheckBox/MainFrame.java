package Current.JCheckBox;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

// https://www.youtube.com/watch?v=1vVJPzVzaK8&list=PL3bGLnkkGnuV699lP_f9DvxyK5lMFpq6U&index=1
public class MainFrame implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JCheckBox checkBox;
	
	public MainFrame() {
		this.frame = new JFrame(); // default is BorderLayout
		this.frame.setTitle("JFrame JButton");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null); // center it
		
		this.panel=new JPanel();
	
		Font f=new Font("Sans-serif", Font.PLAIN, 18);
		UIManager.put("CheckBox.font", f);
		
		this.checkBox=new JCheckBox();
		this.checkBox.setText("CheckBox");
		this.checkBox.setMnemonic(KeyEvent.VK_C);
		
		this.checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getID() == ActionEvent.ACTION_PERFORMED? "ACTION_PERFORMED" : e.getID());
            }
        });
		this.checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getStateChange() == ItemEvent.SELECTED? "SELECTED" : "DESELECTED");
            }
        });
		
		System.out.println(this.checkBox.getText());
		
		this.panel.add(this.checkBox);
		
		this.frame.add(this.panel);
	}
			
	public void show() {
		this.frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
	

}
