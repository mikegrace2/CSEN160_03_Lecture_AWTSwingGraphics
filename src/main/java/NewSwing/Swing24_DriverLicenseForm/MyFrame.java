package NewSwing.Swing24_DriverLicenseForm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener {
	private static final Color NAVY = new Color(25, 55, 109);
	private static final Color GOLD = new Color(212, 160, 23);
	private static final Color LIGHT_BG = new Color(245, 247, 250);
	private static final Font LABEL_FONT = new Font("Segoe UI", Font.PLAIN, 14);
	private static final Font FIELD_FONT = new Font("Segoe UI", Font.PLAIN, 14);

	private JTextField nameField = null;
	private JTextField dobField = null;
	private JTextField addressField = null;
	private JTextField licenseNumberField = null;
	private JComboBox<String> stateCombo = null;
	private JComboBox<String> licenseClassCombo = null;
	private JRadioButton maleButton = null;
	private JRadioButton femaleButton = null;
	private JRadioButton otherButton = null;
	private JCheckBox organDonorCheck = null;
	private JButton submitButton = null;

	public MyFrame() throws HeadlessException {
		super("Driver License Application");

		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception ignored) {
			// fall back to default look and feel
		}

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setSize(520, 560);
		this.getContentPane().setBackground(LIGHT_BG);

		this.add(buildHeaderPanel(), BorderLayout.NORTH);
		this.add(buildFormPanel(), BorderLayout.CENTER);
		this.add(buildButtonPanel(), BorderLayout.SOUTH);

		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	private JPanel buildHeaderPanel() {
		JPanel headerPanel = new JPanel(new BorderLayout());
		headerPanel.setBackground(NAVY);
		headerPanel.setBorder(new EmptyBorder(16, 20, 16, 20));

		JLabel titleLabel = new JLabel("DRIVER LICENSE APPLICATION", SwingConstants.LEFT);
		titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		titleLabel.setForeground(Color.WHITE);

		JLabel subtitleLabel = new JLabel("Department of Motor Vehicles", SwingConstants.LEFT);
		subtitleLabel.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		subtitleLabel.setForeground(GOLD);

		JPanel textPanel = new JPanel(new BorderLayout());
		textPanel.setOpaque(false);
		textPanel.add(titleLabel, BorderLayout.NORTH);
		textPanel.add(subtitleLabel, BorderLayout.SOUTH);

		headerPanel.add(textPanel, BorderLayout.CENTER);
		return headerPanel;
	}

	private JPanel buildFormPanel() {
		JPanel formPanel = new JPanel(new GridBagLayout());
		formPanel.setBackground(LIGHT_BG);
		formPanel.setBorder(BorderFactory.createCompoundBorder(
				new EmptyBorder(16, 20, 16, 20),
				BorderFactory.createCompoundBorder(
						BorderFactory.createLineBorder(new Color(210, 214, 220), 1, true),
						new EmptyBorder(16, 16, 16, 16))));

		this.nameField = new JTextField();
		this.dobField = new JTextField();
		this.addressField = new JTextField();
		this.licenseNumberField = new JTextField();
		this.stateCombo = new JComboBox<String>(new String[] { "CA", "NY", "TX", "FL", "WA" });
		this.licenseClassCombo = new JComboBox<String>(new String[] { "Class A", "Class B", "Class C", "Class M" });

		ButtonGroup genderGroup = new ButtonGroup();
		this.maleButton = new JRadioButton("Male");
		this.femaleButton = new JRadioButton("Female");
		this.otherButton = new JRadioButton("Other");
		for (JRadioButton rb : new JRadioButton[] { this.maleButton, this.femaleButton, this.otherButton }) {
			rb.setFont(LABEL_FONT);
			rb.setBackground(LIGHT_BG);
			genderGroup.add(rb);
		}
		JPanel genderPanel = new JPanel();
		genderPanel.setBackground(LIGHT_BG);
		genderPanel.add(this.maleButton);
		genderPanel.add(this.femaleButton);
		genderPanel.add(this.otherButton);

		this.organDonorCheck = new JCheckBox("Register as organ donor");
		this.organDonorCheck.setFont(LABEL_FONT);
		this.organDonorCheck.setBackground(LIGHT_BG);

		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(6, 6, 6, 6);
		c.fill = GridBagConstraints.HORIZONTAL;

		addRow(formPanel, c, 0, "Full Name:", this.nameField);
		addRow(formPanel, c, 1, "Date of Birth (MM/DD/YYYY):", this.dobField);
		addRow(formPanel, c, 2, "Address:", this.addressField);
		addRow(formPanel, c, 3, "State:", this.stateCombo);
		addRow(formPanel, c, 4, "License Number:", this.licenseNumberField);
		addRow(formPanel, c, 5, "License Class:", this.licenseClassCombo);
		addRow(formPanel, c, 6, "Gender:", genderPanel);
		addRow(formPanel, c, 7, "Organ Donor:", this.organDonorCheck);

		return formPanel;
	}

	private void addRow(JPanel panel, GridBagConstraints c, int row, String labelText, java.awt.Component field) {
		JLabel label = new JLabel(labelText);
		label.setFont(LABEL_FONT);
		label.setForeground(NAVY);

		c.gridx = 0;
		c.gridy = row;
		c.weightx = 0.35;
		panel.add(label, c);

		field.setFont(FIELD_FONT);
		if (field instanceof JTextField) {
			field.setPreferredSize(new Dimension(220, 28));
		}
		c.gridx = 1;
		c.weightx = 0.65;
		panel.add(field, c);
	}

	private JPanel buildButtonPanel() {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(LIGHT_BG);
		buttonPanel.setBorder(new EmptyBorder(0, 0, 18, 0));

		this.submitButton = new JButton("Submit Application");
		this.submitButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		this.submitButton.setBackground(GOLD);
		this.submitButton.setForeground(NAVY);
		this.submitButton.setFocusPainted(false);
		this.submitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.submitButton.setBorder(BorderFactory.createEmptyBorder(10, 24, 10, 24));
		this.submitButton.addActionListener(this);

		buttonPanel.add(this.submitButton);
		return buttonPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.submitButton) {
			if (this.nameField.getText().trim().isEmpty()
					|| this.dobField.getText().trim().isEmpty()
					|| this.addressField.getText().trim().isEmpty()
					|| this.licenseNumberField.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please fill in all required fields.",
						"Incomplete Form", JOptionPane.WARNING_MESSAGE);
				return;
			}

			String gender = "Not specified";
			if (this.maleButton.isSelected())
				gender = "Male";
			else if (this.femaleButton.isSelected())
				gender = "Female";
			else if (this.otherButton.isSelected())
				gender = "Other";

			String summary = "Name: " + this.nameField.getText() + "\n"
					+ "DOB: " + this.dobField.getText() + "\n"
					+ "Address: " + this.addressField.getText() + "\n"
					+ "State: " + this.stateCombo.getSelectedItem() + "\n"
					+ "License #: " + this.licenseNumberField.getText() + "\n"
					+ "License Class: " + this.licenseClassCombo.getSelectedItem() + "\n"
					+ "Gender: " + gender + "\n"
					+ "Organ Donor: " + (this.organDonorCheck.isSelected() ? "Yes" : "No");

			System.out.println(summary);
			JOptionPane.showMessageDialog(this, summary, "Application Submitted",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
