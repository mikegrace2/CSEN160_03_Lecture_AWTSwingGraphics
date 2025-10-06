package OldSwing.Swing14_JMenu;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class MainFrame implements ActionListener{
	private JFrame frame;
	private JMenuBar  menuBar;
	private JMenu     fileMenu;
	private JMenuItem newMenuItem;
	private JMenuItem saveMenuItem;
	private JMenuItem exitMenuItem;
	
	public MainFrame() {
		this.frame = new JFrame(); // default is BorderLayout
		this.frame.setTitle("JFrame JButton");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null); // center it
	
		Font f=new Font("Sans-serif", Font.PLAIN, 18);
		UIManager.put("Menu.font", f);
		UIManager.put("MenuItem.font", f);
		UIManager.put("CheckBoxMenuItem.font", f);
		UIManager.put("RadioButtonMenuItem", f);
		
		this.menuBar=new JMenuBar();
		this.fileMenu = new JMenu("File");
		this.fileMenu.setMnemonic(KeyEvent.VK_F); // ALT + F
		
		this.fileMenu.add(new JRadioButtonMenuItem("RadioButton"));
		this.fileMenu.add(new JCheckBoxMenuItem("CheckBox"));
		this.fileMenu.add(new JMenu("Sub Menu"));
		this.fileMenu.addSeparator();
		
		this.newMenuItem = new JMenuItem("New");
		ImageIcon icon=new ImageIcon("new.jpg");
		this.newMenuItem.setIcon(icon);
		this.newMenuItem.setIconTextGap(10);
		this.newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		this.newMenuItem.addActionListener(this);
		
		this.saveMenuItem= new JMenuItem("Save");
		this.saveMenuItem.addActionListener(this);
		this.saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		
		this.exitMenuItem= new JMenuItem("Exit");
		this.exitMenuItem.addActionListener(this);
		this.exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		
		this.fileMenu.add(this.newMenuItem);
		this.fileMenu.add(this.saveMenuItem);
		this.fileMenu.add(this.exitMenuItem);
		
		this.menuBar.add(this.fileMenu);
		this.frame.setJMenuBar(this.menuBar);
	}
			
	public void show() {
		this.frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JMenuItem) {
			JMenuItem item = (JMenuItem)e.getSource();
			String text=item.getText();
			System.out.println(text);
		}
	}
}
