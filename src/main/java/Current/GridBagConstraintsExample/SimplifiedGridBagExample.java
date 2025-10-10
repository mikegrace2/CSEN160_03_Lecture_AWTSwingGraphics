package Current.GridBagConstraintsExample;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SimplifiedGridBagExample {
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Simple GridBag Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        // Use weightx and weighty to control how extra space is distributed.
        // The default weight is 0.0, meaning the component doesn't get extra space.
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH; // Make all components fill their available space

        // Component 1 (0,0)
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JButton("Button 1 (0,0)"), gbc);

        // Component 2 (1,0)
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(new JButton("Button 2 (1,0)"), gbc);

        // Component 3 (0,1)
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new JButton("Button 3 (0,1)"), gbc);

        // Component 4 (1,1)
        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(new JButton("Button 4 (1,1)"), gbc);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
