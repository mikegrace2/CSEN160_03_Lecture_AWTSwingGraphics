package Current.MouseEventHandler;

import javax.swing.*;
import java.awt.*;

public class AMain {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5)); // set Layout

        JButton tempBut1=new JButton("Save");
        JButton tempBut2=new JButton("Print");
        JButton tempBut3=new JButton("Exit");
        panel.add(tempBut1);
        panel.add(tempBut2);
        panel.add(tempBut3);

        MouseEventHandler eventHandler= new MouseEventHandler();
        panel.addMouseListener(eventHandler);
        panel.addMouseMotionListener(eventHandler);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
