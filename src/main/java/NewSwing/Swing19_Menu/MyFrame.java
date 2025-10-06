package NewSwing.Swing19_Menu;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener{
	private JTextField textField=null;
	private JMenuBar menu=null;
	private JMenuItem loadItem=null;
	private JMenuItem saveItem=null;
	private JMenuItem exitItem=null;

	public MyFrame() throws HeadlessException {
		super();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);				
		this.setVisible(true);

		this.menu=new JMenuBar();
		this.setJMenuBar(this.menu);
		JMenu fileMenu=new JMenu("File");
		
		this.loadItem=new JMenuItem("Load");
		this.loadItem.setMnemonic(KeyEvent.VK_L);
		this.loadItem.addActionListener(this);
		
		this.saveItem=new JMenuItem("Save");
		this.saveItem.setMnemonic(KeyEvent.VK_S);
		this.saveItem.addActionListener(this);
		
		this.exitItem=new JMenuItem("Exit");
		this.exitItem.setMnemonic(KeyEvent.VK_E);
		this.exitItem.addActionListener(this);
		
		fileMenu.add(this.loadItem);
		fileMenu.add(this.saveItem);
		fileMenu.add(this.exitItem);
		
		this.menu.add(fileMenu);
		
		this.textField=new JTextField();
		this.textField.setPreferredSize(new Dimension(250,40));
		this.add(textField);
		
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==this.loadItem) {
			System.out.println("Load");
			this.textField.setText("LOAD");
		}else if (e.getSource()==this.exitItem) {
			System.out.println("Exit");
			this.textField.setText("EXIT");
			System.exit(0);
		}else if (e.getSource()==this.saveItem) {
			System.out.println("Save");
			this.textField.setText("SAVE");
		}		
	}
}