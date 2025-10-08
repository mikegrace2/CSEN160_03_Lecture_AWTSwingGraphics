package NewSwing.Swing12_JOptionPane;

import javax.swing.JOptionPane;

public class AMain {
	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "Plain Message", "title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Information Message", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Question Message", "title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Warning Message", "title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Error Message", "title", JOptionPane.ERROR_MESSAGE);
		
		int answer = JOptionPane.showConfirmDialog(null, "Code now?", "My title", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println("answer="+answer);
		
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("name="+name);
	}
}